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
public class Participantinfo extends Model<Participantinfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 参与者id
     */
    @TableId(value = "participantid", type = IdType.AUTO)
    private Integer participantid;

    /**
     * 年龄阶段
     */
    private Integer agegroup;

    /**
     * 教育水平
     */
    private Integer educationallevel;

    /**
     * 研究领域
     */
    private Integer researcharea;

    /**
     * 创建时间
     */
    private Date cratedate;

    /**
     * 总数分
     */
    private Integer grossscore;

    public Integer getParticipantid() {
        return participantid;
    }

    public void setParticipantid(Integer participantid) {
        this.participantid = participantid;
    }
    public Integer getAgegroup() {
        return agegroup;
    }

    public void setAgegroup(Integer agegroup) {
        this.agegroup = agegroup;
    }
    public Integer getEducationallevel() {
        return educationallevel;
    }

    public void setEducationallevel(Integer educationallevel) {
        this.educationallevel = educationallevel;
    }
    public Integer getResearcharea() {
        return researcharea;
    }

    public void setResearcharea(Integer researcharea) {
        this.researcharea = researcharea;
    }
    public Date getCratedate() {
        return cratedate;
    }

    public void setCratedate(Date cratedate) {
        this.cratedate = cratedate;
    }
    public Integer getGrossscore() {
        return grossscore;
    }

    public void setGrossscore(Integer grossscore) {
        this.grossscore = grossscore;
    }

    @Override
    protected Serializable pkVal() {
        return this.participantid;
    }

    @Override
    public String toString() {
        return "Participantinfo{" +
        "participantid=" + participantid +
        ", agegroup=" + agegroup +
        ", educationallevel=" + educationallevel +
        ", researcharea=" + researcharea +
        ", cratedate=" + cratedate +
        ", grossscore=" + grossscore +
        "}";
    }
}
