package cn.rt.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author redsun
 * @since 2020-07-08
 */
public class Dictionaryitem extends Model<Dictionaryitem> {

    private static final long serialVersionUID = 1L;

    /**
     * 字典项明细id
     */
    @TableId(value = "itemid", type = IdType.AUTO)
    private Integer itemid;

    /**
     * 字典项id
     */
    private Integer dictionaryid;

    /**
     * 明细内容
     */
    private String itemname;

    /**
     * 排序
     */
    private Integer sort;

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }
    public Integer getDictionaryid() {
        return dictionaryid;
    }

    public void setDictionaryid(Integer dictionaryid) {
        this.dictionaryid = dictionaryid;
    }
    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    protected Serializable pkVal() {
        return this.itemid;
    }

    @Override
    public String toString() {
        return "Dictionaryitem{" +
        "itemid=" + itemid +
        ", dictionaryid=" + dictionaryid +
        ", itemname=" + itemname +
        ", sort=" + sort +
        "}";
    }
}
