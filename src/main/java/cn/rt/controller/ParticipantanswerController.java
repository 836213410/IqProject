package cn.rt.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.rt.req.ParticipantanswerReq;
import cn.rt.req.ParticipantanswerWrapperReq;
import cn.rt.service.IParticipantanswerService;
import cn.rt.service.IQuestionsService;
import cn.rt.vo.Participantanswer;
import cn.rt.vo.Questions;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author redsun
 * @since 2020-07-08
 */
@Controller
@RequestMapping("/participantanswer")
public class ParticipantanswerController {

	@Autowired
	private IParticipantanswerService participantanswerService;
	
	@Autowired
	private IQuestionsService questionsService;
	/**
	 * 计算总分数
	 * @param req
	 * @return
	 */
	@RequestMapping("/calcScore")
	@ResponseBody
	public Map<String, Object> calcScore(@RequestBody ParticipantanswerReq req) {
		Map<String, Object> result = new HashMap<>();
		List<Participantanswer> list = req.getList();
		if (list == null || list.size() == 0) {
			result.put("res", "no");
			result.put("msg", "所传参数有误");
			return result;
		}
		
		//缓存正确答案
		HashMap<Integer, Integer> questionMap = new HashMap<>();
		//获取题目的正确答案
		List<Questions> questionLst = questionsService.list();
		for (Questions questions : questionLst) {
			questionMap.put(questions.getQuestionid(), questions.getCorrectanswerid());
		}
		int totalScore = 0;
		//计算分数并将用户答题数据保存到数据库
		for (Participantanswer participantanswer : list) {
			Integer questionid = participantanswer.getQuestionid();
			Integer optionid = participantanswer.getOptionid();
			if (optionid == questionMap.get(questionid)) {
				totalScore += 2;
			}
			participantanswerService.save(participantanswer);
		}
		
	
		result.put("res", "ok");
		result.put("msg", "回答问题流程成功");
		result.put("totalScore", totalScore);
		return result;
	}
}
