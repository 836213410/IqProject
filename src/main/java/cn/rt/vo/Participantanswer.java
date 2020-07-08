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
public class Participantanswer extends Model<Participantanswer> {

    private static final long serialVersionUID = 1L;

    /**
     * 参与者id
     */
    private Integer participantid;

    /**
     * 问题id
     */
    private Integer questionid;

    /**
     * 问题选项id
     */
    private Integer optionid;

    public Integer getParticipantid() {
        return participantid;
    }

    public void setParticipantid(Integer participantid) {
        this.participantid = participantid;
    }
    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }
    public Integer getOptionid() {
        return optionid;
    }

    public void setOptionid(Integer optionid) {
        this.optionid = optionid;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "Participantanswer{" +
        "participantid=" + participantid +
        ", questionid=" + questionid +
        ", optionid=" + optionid +
        "}";
    }
}
