package xyz.hplus.guava.pojo.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_inbox
 * @author
 */
@Data
public class InboxEntity implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 计划id
     */
    private Integer planId;

    /**
     * poi  id
     */
    private Integer poiId;

    /**
     * 评分（1-5）
     */
    private Byte rate;

    /**
     * 标签id
     */
    private Integer tagId;

    /**
     * 预估时间（分）
     */
    private Integer estimatedCost;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新时间
     */
    private Date updatedTime;

    private static final long serialVersionUID = 1L;

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
        InboxEntity other = (InboxEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPlanId() == null ? other.getPlanId() == null : this.getPlanId().equals(other.getPlanId()))
            && (this.getPoiId() == null ? other.getPoiId() == null : this.getPoiId().equals(other.getPoiId()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getTagId() == null ? other.getTagId() == null : this.getTagId().equals(other.getTagId()))
            && (this.getEstimatedCost() == null ? other.getEstimatedCost() == null : this.getEstimatedCost().equals(other.getEstimatedCost()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPlanId() == null) ? 0 : getPlanId().hashCode());
        result = prime * result + ((getPoiId() == null) ? 0 : getPoiId().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getTagId() == null) ? 0 : getTagId().hashCode());
        result = prime * result + ((getEstimatedCost() == null) ? 0 : getEstimatedCost().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", planId=").append(planId);
        sb.append(", poiId=").append(poiId);
        sb.append(", rate=").append(rate);
        sb.append(", tagId=").append(tagId);
        sb.append(", estimatedCost=").append(estimatedCost);
        sb.append(", remark=").append(remark);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
