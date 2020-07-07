package cn.rt.vo;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author redsun
 * @since 2020-07-07
 */
public class Bigdata extends Model<Bigdata> {

    private static final long serialVersionUID = 1L;

    private String warehouseid;

    private String commodityid;

    private String comodityname;

    private String color;

    private Integer size;

    private Integer number;

    private Integer chima;

    public String getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(String warehouseid) {
        this.warehouseid = warehouseid;
    }
    public String getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(String commodityid) {
        this.commodityid = commodityid;
    }
    public String getComodityname() {
        return comodityname;
    }

    public void setComodityname(String comodityname) {
        this.comodityname = comodityname;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    public Integer getChima() {
        return chima;
    }

    public void setChima(Integer chima) {
        this.chima = chima;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "Bigdata{" +
        "warehouseid=" + warehouseid +
        ", commodityid=" + commodityid +
        ", comodityname=" + comodityname +
        ", color=" + color +
        ", size=" + size +
        ", number=" + number +
        ", chima=" + chima +
        "}";
    }
}
