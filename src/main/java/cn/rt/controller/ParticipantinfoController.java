package cn.rt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.rt.req.ParticipantinfoReq;
import cn.rt.service.IParticipantinfoService;
import cn.rt.vo.Participantinfo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author redsun
 * @since 2020-07-08
 */
@Controller
@RequestMapping("/participantinfo")
public class ParticipantinfoController {

	@Autowired
	private IParticipantinfoService participantinfoService;

	/**
	 * 问卷首页获取问卷人信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping("/getIndexParticipantinfo")
	@ResponseBody
	public Map<String, Object> getIndexParticipantinfo(ParticipantinfoReq req) {
		Map<String, Object> result = new HashMap<>();

		if (req.getAgegroup() == null || req.getEducationallevel() == null ||  req.getResearcharea() == null) {
			result.put("res", "no");
			result.put("msg", "参数不正确");
			return result;
		}

		Participantinfo participantinfo = new Participantinfo();
		participantinfo.setAgegroup(req.getAgegroup());
		participantinfo.setCratedate(new Date());
		participantinfo.setEducationallevel(req.getEducationallevel());
		participantinfo.setGrossscore(0);
		participantinfo.setResearcharea(req.getResearcharea());
		participantinfoService.save(participantinfo);
		Integer insertParticipantid = participantinfo.getParticipantid();
		result.put("res", "yes");
		result.put("msg", "调查用户信息初始化插入成功");
		result.put("participantId", insertParticipantid);
		return result;
	}
	
	
	

}
