package cn.rt.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import cn.rt.dto.QuestionDTO;
import cn.rt.service.IAnsweroptionsService;
import cn.rt.service.IDictionaryitemService;
import cn.rt.service.IQuestionsService;
import cn.rt.vo.Answeroptions;
import cn.rt.vo.Dictionaryitem;
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
@RequestMapping("/questions")
public class QuestionsController {

	@Autowired
	private IQuestionsService questionsService;

	@Autowired
	private IAnsweroptionsService answeroptionsService;

	@Autowired
	private IDictionaryitemService dictionaryitemService;

	/**
	 * 获取问题信息根据问题排序号
	 * 
	 * @param questionSort
	 * @return
	 */
	@RequestMapping("getQuesttionBySort")
	@ResponseBody
	public Map<String, Object> getQuesttionBySort(int questionSort) {
		Map<String, Object> result = new HashMap<>();
		if (questionSort <= 0) {
			result.put("res", "error");
			result.put("msg", "题号id不能小于等于0");
			return result;
		}

		// 获取问题基本信息
		QueryWrapper<Questions> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("sort", questionSort);
		Questions question = questionsService.getOne(queryWrapper);
		if (question == null) {
			result.put("res", "error");
			result.put("msg", "根据sort编号查询不到此问题");
			return result;
		}
		System.out.println(question.getCreatedate()+"======");
		// 获取此问题的答案列表
		Map<String, Object> condition = new HashMap<>();
		condition.put("questionid", question.getQuestionid());
		Collection<Answeroptions> answeroptions = answeroptionsService.listByMap(condition);

		// 获取所属字典明细模块id号
		Integer module = question.getModule();
		Dictionaryitem dictionaryitem = dictionaryitemService.getById(module);

		// 组装返回的DTO
		QuestionDTO questionDTO = new QuestionDTO();
		questionDTO.setModule(question.getModule());
		questionDTO.setQuestioncontext(question.getQuestioncontext());
		questionDTO.setQuestionid(question.getQuestionid());
		questionDTO.setSort(question.getSort());
		questionDTO.setCreatedate(question.getCreatedate());
		if (dictionaryitem != null) {
			questionDTO.setItemname(dictionaryitem.getItemname());
		} else {
			questionDTO.setItemname("error");
		}

		result.put("res", "yes");
		result.put("msg", "根据sort编号获取id成功");
		result.put("questionData", questionDTO);
		result.put("answeroptions", answeroptions);
		return result;
	}
}
