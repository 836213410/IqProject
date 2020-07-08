package cn.rt.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author redsun
 * @since 2020-07-08
 */
public class Questions extends Model<Questions> {

    private static final long serialVersionUID = 1L;

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
    private Date createdate;

    /**
     * 问题排序
     */
    private Integer sort;

    /**
     * 归属模块id
     */
    private Integer module;

    /**
     * 正确答案id
     */
    private Integer correctanswerid;

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
    public Integer getCorrectanswerid() {
        return correctanswerid;
    }

    public void setCorrectanswerid(Integer correctanswerid) {
        this.correctanswerid = correctanswerid;
    }

    @Override
    protected Serializable pkVal() {
        return this.questionid;
    }

    @Override
    public String toString() {
        return "Questions{" +
        "questionid=" + questionid +
        ", questioncontext=" + questioncontext +
        ", createdate=" + createdate +
        ", sort=" + sort +
        ", module=" + module +
        ", correctanswerid=" + correctanswerid +
        "}";
    }
}
