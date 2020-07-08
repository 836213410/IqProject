package cn.rt.req;

import java.time.LocalDateTime;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class ParticipantinfoReq {


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


}
