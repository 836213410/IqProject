package cn.rt.dto;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;

public class QuestionDTO {

	private String itemname;

	/**
	 * 问题id
	 */
	@TableId(value = "questionid", type = IdType.AUTO)
	private Integer questionid;

	/**
	 * 问题内容
	 */
	private String questioncontext;

	/**
	 * 问题创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createdate;

	/**
	 * 问题排序
	 */
	private Integer sort;

	/**
	 * 归属模块id
	 */
	private Integer module;

	public Integer getQuestionid() {
		return questionid;
	}

	public void setQuestionid(Integer questionid) {
		this.questionid = questionid;
	}

	public String getQuestioncontext() {
		return questioncontext;
	}

	public void setQuestioncontext(String questioncontext) {
		this.questioncontext = questioncontext;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getModule() {
		return module;
	}

	public void setModule(Integer module) {
		this.module = module;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

}
