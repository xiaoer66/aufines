package com.aufine.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * tyre_info
 * @author 
 */
public class TyreInfo implements Serializable {
    /**
     * 轮胎主键ID
     */
    private Integer tyreid;

    /**
     * 品牌信息ID
     */
    private Integer brandid;

    /**
     * 工厂信息ID
     */
    private Integer factoryid;

    /**
     * 轮位信息ID
     */
    private Integer axlepositionid;

    /**
     * 轮胎名称
     */
    private String tyrename;

    /**
     * 轮胎尺寸
     */
    private String tyresize;

    /**
     * PR(层级)通用字段ID
     */
    private Integer prcodeid;

    /**
     * 轮胎简介
     */
    private String tyrenote;

    /**
     * LR(负荷等级)通用字段ID
     */
    private Integer lrcodeid;

    /**
     * LI(负重指数)通用字段ID
     */
    private Integer licodeid;

    /**
     * SS(速度级别)通用字段ID
     */
    private Integer sscodeid;

    /**
     * 轮胎质量标记通用字段ID
     */
    private String markingscodeid;

    /**
     * 最大速度(英里/每小时)
     */
    private String maxspeedmph;

    /**
     * 断面宽度(mm)
     */
    private String sectionwidth;

    /**
     * 胎面宽度(mm)
     */
    private String treadwidth;

    /**
     * 轮胎重量(kg)
     */
    private String weight;

    /**
     * 轮胎外直径(mm)
     */
    private String overalldiameter;

    /**
     * 胎纹深度(mm)
     */
    private String treaddepth;

    /**
     * 标准轮辋(Std.Rim)
     */
    private String standardrim;

    /**
     * 单胎最大负荷(kg)
     */
    private String maxtyreloadsingle;

    /**
     * 双胎最大负荷(kg)
     */
    private String maxtyreloaddual;

    /**
     * 燃料效率等级通用字段ID
     */
    private Integer fuelefficiencycodeid;

    /**
     * 抗湿滑性能等级通用字段ID
     */
    private Integer wetgripcodeid;

    /**
     * 室外噪声等级通用字段ID
     */
    private Integer exteriornoisecodeid;

    /**
     * 适应路面通用字段ID
     */
    private Integer adaptroadcodeid;

    /**
     * 轮胎展示图片
     */
    private Integer tyreshowpics;

    /**
     * 轮胎使用图片
     */
    private Integer tyreusepics;

    /**
     * 轮胎产品视频
     */
    private Integer tyrevideoid;

    /**
     * 轮胎产品宣传海报图
     */
    private Integer tyrepostersid;

    /**
     * 轮胎认证信息
     */
    private String tyreauthinfo;

    /**
     * 轮胎认证有效期
     */
    private String tyreauthvalidity;

    /**
     * 创建人ID
     */
    private Integer createid;

    /**
     * 创建人
     */
    private String createname;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 修改人ID
     */
    private Integer updateid;

    /**
     * 修改人
     */
    private String updatename;

    /**
     * 修改时间
     */
    private Date updatetime;

    /**
     * 删除标志
     */
    private Short delflag;

    private static final long serialVersionUID = 1L;

    public Integer getTyreid() {
        return tyreid;
    }

    public void setTyreid(Integer tyreid) {
        this.tyreid = tyreid;
    }

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public Integer getFactoryid() {
        return factoryid;
    }

    public void setFactoryid(Integer factoryid) {
        this.factoryid = factoryid;
    }

    public Integer getAxlepositionid() {
        return axlepositionid;
    }

    public void setAxlepositionid(Integer axlepositionid) {
        this.axlepositionid = axlepositionid;
    }

    public String getTyrename() {
        return tyrename;
    }

    public void setTyrename(String tyrename) {
        this.tyrename = tyrename;
    }

    public String getTyresize() {
        return tyresize;
    }

    public void setTyresize(String tyresize) {
        this.tyresize = tyresize;
    }

    public Integer getPrcodeid() {
        return prcodeid;
    }

    public void setPrcodeid(Integer prcodeid) {
        this.prcodeid = prcodeid;
    }

    public String getTyrenote() {
        return tyrenote;
    }

    public void setTyrenote(String tyrenote) {
        this.tyrenote = tyrenote;
    }

    public Integer getLrcodeid() {
        return lrcodeid;
    }

    public void setLrcodeid(Integer lrcodeid) {
        this.lrcodeid = lrcodeid;
    }

    public Integer getLicodeid() {
        return licodeid;
    }

    public void setLicodeid(Integer licodeid) {
        this.licodeid = licodeid;
    }

    public Integer getSscodeid() {
        return sscodeid;
    }

    public void setSscodeid(Integer sscodeid) {
        this.sscodeid = sscodeid;
    }

    public String getMarkingscodeid() {
        return markingscodeid;
    }

    public void setMarkingscodeid(String markingscodeid) {
        this.markingscodeid = markingscodeid;
    }

    public String getMaxspeedmph() {
        return maxspeedmph;
    }

    public void setMaxspeedmph(String maxspeedmph) {
        this.maxspeedmph = maxspeedmph;
    }

    public String getSectionwidth() {
        return sectionwidth;
    }

    public void setSectionwidth(String sectionwidth) {
        this.sectionwidth = sectionwidth;
    }

    public String getTreadwidth() {
        return treadwidth;
    }

    public void setTreadwidth(String treadwidth) {
        this.treadwidth = treadwidth;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getOveralldiameter() {
        return overalldiameter;
    }

    public void setOveralldiameter(String overalldiameter) {
        this.overalldiameter = overalldiameter;
    }

    public String getTreaddepth() {
        return treaddepth;
    }

    public void setTreaddepth(String treaddepth) {
        this.treaddepth = treaddepth;
    }

    public String getStandardrim() {
        return standardrim;
    }

    public void setStandardrim(String standardrim) {
        this.standardrim = standardrim;
    }

    public String getMaxtyreloadsingle() {
        return maxtyreloadsingle;
    }

    public void setMaxtyreloadsingle(String maxtyreloadsingle) {
        this.maxtyreloadsingle = maxtyreloadsingle;
    }

    public String getMaxtyreloaddual() {
        return maxtyreloaddual;
    }

    public void setMaxtyreloaddual(String maxtyreloaddual) {
        this.maxtyreloaddual = maxtyreloaddual;
    }

    public Integer getFuelefficiencycodeid() {
        return fuelefficiencycodeid;
    }

    public void setFuelefficiencycodeid(Integer fuelefficiencycodeid) {
        this.fuelefficiencycodeid = fuelefficiencycodeid;
    }

    public Integer getWetgripcodeid() {
        return wetgripcodeid;
    }

    public void setWetgripcodeid(Integer wetgripcodeid) {
        this.wetgripcodeid = wetgripcodeid;
    }

    public Integer getExteriornoisecodeid() {
        return exteriornoisecodeid;
    }

    public void setExteriornoisecodeid(Integer exteriornoisecodeid) {
        this.exteriornoisecodeid = exteriornoisecodeid;
    }

    public Integer getAdaptroadcodeid() {
        return adaptroadcodeid;
    }

    public void setAdaptroadcodeid(Integer adaptroadcodeid) {
        this.adaptroadcodeid = adaptroadcodeid;
    }

    public Integer getTyreshowpics() {
        return tyreshowpics;
    }

    public void setTyreshowpics(Integer tyreshowpics) {
        this.tyreshowpics = tyreshowpics;
    }

    public Integer getTyreusepics() {
        return tyreusepics;
    }

    public void setTyreusepics(Integer tyreusepics) {
        this.tyreusepics = tyreusepics;
    }

    public Integer getTyrevideoid() {
        return tyrevideoid;
    }

    public void setTyrevideoid(Integer tyrevideoid) {
        this.tyrevideoid = tyrevideoid;
    }

    public Integer getTyrepostersid() {
        return tyrepostersid;
    }

    public void setTyrepostersid(Integer tyrepostersid) {
        this.tyrepostersid = tyrepostersid;
    }

    public String getTyreauthinfo() {
        return tyreauthinfo;
    }

    public void setTyreauthinfo(String tyreauthinfo) {
        this.tyreauthinfo = tyreauthinfo;
    }

    public String getTyreauthvalidity() {
        return tyreauthvalidity;
    }

    public void setTyreauthvalidity(String tyreauthvalidity) {
        this.tyreauthvalidity = tyreauthvalidity;
    }

    public Integer getCreateid() {
        return createid;
    }

    public void setCreateid(Integer createid) {
        this.createid = createid;
    }

    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getUpdateid() {
        return updateid;
    }

    public void setUpdateid(Integer updateid) {
        this.updateid = updateid;
    }

    public String getUpdatename() {
        return updatename;
    }

    public void setUpdatename(String updatename) {
        this.updatename = updatename;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Short getDelflag() {
        return delflag;
    }

    public void setDelflag(Short delflag) {
        this.delflag = delflag;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TyreInfo other = (TyreInfo) that;
        return (this.getTyreid() == null ? other.getTyreid() == null : this.getTyreid().equals(other.getTyreid()))
            && (this.getBrandid() == null ? other.getBrandid() == null : this.getBrandid().equals(other.getBrandid()))
            && (this.getFactoryid() == null ? other.getFactoryid() == null : this.getFactoryid().equals(other.getFactoryid()))
            && (this.getAxlepositionid() == null ? other.getAxlepositionid() == null : this.getAxlepositionid().equals(other.getAxlepositionid()))
            && (this.getTyrename() == null ? other.getTyrename() == null : this.getTyrename().equals(other.getTyrename()))
            && (this.getTyresize() == null ? other.getTyresize() == null : this.getTyresize().equals(other.getTyresize()))
            && (this.getPrcodeid() == null ? other.getPrcodeid() == null : this.getPrcodeid().equals(other.getPrcodeid()))
            && (this.getTyrenote() == null ? other.getTyrenote() == null : this.getTyrenote().equals(other.getTyrenote()))
            && (this.getLrcodeid() == null ? other.getLrcodeid() == null : this.getLrcodeid().equals(other.getLrcodeid()))
            && (this.getLicodeid() == null ? other.getLicodeid() == null : this.getLicodeid().equals(other.getLicodeid()))
            && (this.getSscodeid() == null ? other.getSscodeid() == null : this.getSscodeid().equals(other.getSscodeid()))
            && (this.getMarkingscodeid() == null ? other.getMarkingscodeid() == null : this.getMarkingscodeid().equals(other.getMarkingscodeid()))
            && (this.getMaxspeedmph() == null ? other.getMaxspeedmph() == null : this.getMaxspeedmph().equals(other.getMaxspeedmph()))
            && (this.getSectionwidth() == null ? other.getSectionwidth() == null : this.getSectionwidth().equals(other.getSectionwidth()))
            && (this.getTreadwidth() == null ? other.getTreadwidth() == null : this.getTreadwidth().equals(other.getTreadwidth()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getOveralldiameter() == null ? other.getOveralldiameter() == null : this.getOveralldiameter().equals(other.getOveralldiameter()))
            && (this.getTreaddepth() == null ? other.getTreaddepth() == null : this.getTreaddepth().equals(other.getTreaddepth()))
            && (this.getStandardrim() == null ? other.getStandardrim() == null : this.getStandardrim().equals(other.getStandardrim()))
            && (this.getMaxtyreloadsingle() == null ? other.getMaxtyreloadsingle() == null : this.getMaxtyreloadsingle().equals(other.getMaxtyreloadsingle()))
            && (this.getMaxtyreloaddual() == null ? other.getMaxtyreloaddual() == null : this.getMaxtyreloaddual().equals(other.getMaxtyreloaddual()))
            && (this.getFuelefficiencycodeid() == null ? other.getFuelefficiencycodeid() == null : this.getFuelefficiencycodeid().equals(other.getFuelefficiencycodeid()))
            && (this.getWetgripcodeid() == null ? other.getWetgripcodeid() == null : this.getWetgripcodeid().equals(other.getWetgripcodeid()))
            && (this.getExteriornoisecodeid() == null ? other.getExteriornoisecodeid() == null : this.getExteriornoisecodeid().equals(other.getExteriornoisecodeid()))
            && (this.getAdaptroadcodeid() == null ? other.getAdaptroadcodeid() == null : this.getAdaptroadcodeid().equals(other.getAdaptroadcodeid()))
            && (this.getTyreshowpics() == null ? other.getTyreshowpics() == null : this.getTyreshowpics().equals(other.getTyreshowpics()))
            && (this.getTyreusepics() == null ? other.getTyreusepics() == null : this.getTyreusepics().equals(other.getTyreusepics()))
            && (this.getTyrevideoid() == null ? other.getTyrevideoid() == null : this.getTyrevideoid().equals(other.getTyrevideoid()))
            && (this.getTyrepostersid() == null ? other.getTyrepostersid() == null : this.getTyrepostersid().equals(other.getTyrepostersid()))
            && (this.getTyreauthinfo() == null ? other.getTyreauthinfo() == null : this.getTyreauthinfo().equals(other.getTyreauthinfo()))
            && (this.getTyreauthvalidity() == null ? other.getTyreauthvalidity() == null : this.getTyreauthvalidity().equals(other.getTyreauthvalidity()))
            && (this.getCreateid() == null ? other.getCreateid() == null : this.getCreateid().equals(other.getCreateid()))
            && (this.getCreatename() == null ? other.getCreatename() == null : this.getCreatename().equals(other.getCreatename()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdateid() == null ? other.getUpdateid() == null : this.getUpdateid().equals(other.getUpdateid()))
            && (this.getUpdatename() == null ? other.getUpdatename() == null : this.getUpdatename().equals(other.getUpdatename()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getDelflag() == null ? other.getDelflag() == null : this.getDelflag().equals(other.getDelflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTyreid() == null) ? 0 : getTyreid().hashCode());
        result = prime * result + ((getBrandid() == null) ? 0 : getBrandid().hashCode());
        result = prime * result + ((getFactoryid() == null) ? 0 : getFactoryid().hashCode());
        result = prime * result + ((getAxlepositionid() == null) ? 0 : getAxlepositionid().hashCode());
        result = prime * result + ((getTyrename() == null) ? 0 : getTyrename().hashCode());
        result = prime * result + ((getTyresize() == null) ? 0 : getTyresize().hashCode());
        result = prime * result + ((getPrcodeid() == null) ? 0 : getPrcodeid().hashCode());
        result = prime * result + ((getTyrenote() == null) ? 0 : getTyrenote().hashCode());
        result = prime * result + ((getLrcodeid() == null) ? 0 : getLrcodeid().hashCode());
        result = prime * result + ((getLicodeid() == null) ? 0 : getLicodeid().hashCode());
        result = prime * result + ((getSscodeid() == null) ? 0 : getSscodeid().hashCode());
        result = prime * result + ((getMarkingscodeid() == null) ? 0 : getMarkingscodeid().hashCode());
        result = prime * result + ((getMaxspeedmph() == null) ? 0 : getMaxspeedmph().hashCode());
        result = prime * result + ((getSectionwidth() == null) ? 0 : getSectionwidth().hashCode());
        result = prime * result + ((getTreadwidth() == null) ? 0 : getTreadwidth().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getOveralldiameter() == null) ? 0 : getOveralldiameter().hashCode());
        result = prime * result + ((getTreaddepth() == null) ? 0 : getTreaddepth().hashCode());
        result = prime * result + ((getStandardrim() == null) ? 0 : getStandardrim().hashCode());
        result = prime * result + ((getMaxtyreloadsingle() == null) ? 0 : getMaxtyreloadsingle().hashCode());
        result = prime * result + ((getMaxtyreloaddual() == null) ? 0 : getMaxtyreloaddual().hashCode());
        result = prime * result + ((getFuelefficiencycodeid() == null) ? 0 : getFuelefficiencycodeid().hashCode());
        result = prime * result + ((getWetgripcodeid() == null) ? 0 : getWetgripcodeid().hashCode());
        result = prime * result + ((getExteriornoisecodeid() == null) ? 0 : getExteriornoisecodeid().hashCode());
        result = prime * result + ((getAdaptroadcodeid() == null) ? 0 : getAdaptroadcodeid().hashCode());
        result = prime * result + ((getTyreshowpics() == null) ? 0 : getTyreshowpics().hashCode());
        result = prime * result + ((getTyreusepics() == null) ? 0 : getTyreusepics().hashCode());
        result = prime * result + ((getTyrevideoid() == null) ? 0 : getTyrevideoid().hashCode());
        result = prime * result + ((getTyrepostersid() == null) ? 0 : getTyrepostersid().hashCode());
        result = prime * result + ((getTyreauthinfo() == null) ? 0 : getTyreauthinfo().hashCode());
        result = prime * result + ((getTyreauthvalidity() == null) ? 0 : getTyreauthvalidity().hashCode());
        result = prime * result + ((getCreateid() == null) ? 0 : getCreateid().hashCode());
        result = prime * result + ((getCreatename() == null) ? 0 : getCreatename().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdateid() == null) ? 0 : getUpdateid().hashCode());
        result = prime * result + ((getUpdatename() == null) ? 0 : getUpdatename().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getDelflag() == null) ? 0 : getDelflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tyreid=").append(tyreid);
        sb.append(", brandid=").append(brandid);
        sb.append(", factoryid=").append(factoryid);
        sb.append(", axlepositionid=").append(axlepositionid);
        sb.append(", tyrename=").append(tyrename);
        sb.append(", tyresize=").append(tyresize);
        sb.append(", prcodeid=").append(prcodeid);
        sb.append(", tyrenote=").append(tyrenote);
        sb.append(", lrcodeid=").append(lrcodeid);
        sb.append(", licodeid=").append(licodeid);
        sb.append(", sscodeid=").append(sscodeid);
        sb.append(", markingscodeid=").append(markingscodeid);
        sb.append(", maxspeedmph=").append(maxspeedmph);
        sb.append(", sectionwidth=").append(sectionwidth);
        sb.append(", treadwidth=").append(treadwidth);
        sb.append(", weight=").append(weight);
        sb.append(", overalldiameter=").append(overalldiameter);
        sb.append(", treaddepth=").append(treaddepth);
        sb.append(", standardrim=").append(standardrim);
        sb.append(", maxtyreloadsingle=").append(maxtyreloadsingle);
        sb.append(", maxtyreloaddual=").append(maxtyreloaddual);
        sb.append(", fuelefficiencycodeid=").append(fuelefficiencycodeid);
        sb.append(", wetgripcodeid=").append(wetgripcodeid);
        sb.append(", exteriornoisecodeid=").append(exteriornoisecodeid);
        sb.append(", adaptroadcodeid=").append(adaptroadcodeid);
        sb.append(", tyreshowpics=").append(tyreshowpics);
        sb.append(", tyreusepics=").append(tyreusepics);
        sb.append(", tyrevideoid=").append(tyrevideoid);
        sb.append(", tyrepostersid=").append(tyrepostersid);
        sb.append(", tyreauthinfo=").append(tyreauthinfo);
        sb.append(", tyreauthvalidity=").append(tyreauthvalidity);
        sb.append(", createid=").append(createid);
        sb.append(", createname=").append(createname);
        sb.append(", createtime=").append(createtime);
        sb.append(", updateid=").append(updateid);
        sb.append(", updatename=").append(updatename);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", delflag=").append(delflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}