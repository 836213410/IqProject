package cn.rt.vo;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author redsun
 * @since 2020-07-08
 */
public class Answeroptions extends Model<Answeroptions> {

    private static final long serialVersionUID = 1L;

    /**
     * 问题选项id
     */
    private Integer optionid;

    /**
     * 问题id
     */
    private Integer questionid;

    /**
     * 选项文本
     */
    private String optionidcontext;

    /**
     * 排序
     */
    private Integer sort;

    public Integer getOptionid() {
        return optionid;
    }

    public void setOptionid(Integer optionid) {
        this.optionid = optionid;
    }
    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }
    public String getOptionidcontext() {
        return optionidcontext;
    }

    public void setOptionidcontext(String optionidcontext) {
        this.optionidcontext = optionidcontext;
    }
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    protected Serializable pkVal() {
        return this.optionid;
    }

    @Override
    public String toString() {
        return "Answeroptions{" +
        "optionid=" + optionid +
        ", questionid=" + questionid +
        ", optionidcontext=" + optionidcontext +
        ", sort=" + sort +
        "}";
    }
}
