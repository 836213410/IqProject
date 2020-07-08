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
public class Dictionary extends Model<Dictionary> {

    private static final long serialVersionUID = 1L;

    /**
     * 字典项id
     */
    @TableId(value = "dictionaryid", type = IdType.AUTO)
    private Integer dictionaryid;

    /**
     * 字典项名称
     */
    private String dictionaryname;

    /**
     * 创建时间
     */
    private Date createdate;

    /**
     * 排序
     */
    private Integer sort;

    public Integer getDictionaryid() {
        return dictionaryid;
    }

    public void setDictionaryid(Integer dictionaryid) {
        this.dictionaryid = dictionaryid;
    }
    public String getDictionaryname() {
        return dictionaryname;
    }

    public void setDictionaryname(String dictionaryname) {
        this.dictionaryname = dictionaryname;
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

    @Override
    protected Serializable pkVal() {
        return this.dictionaryid;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
        "dictionaryid=" + dictionaryid +
        ", dictionaryname=" + dictionaryname +
        ", createdate=" + createdate +
        ", sort=" + sort +
        "}";
    }
}
