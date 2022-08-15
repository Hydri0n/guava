package xyz.hplus.guava.pojo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * t_poi
 * @author 
 */
@Data
public class PoiEntity implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * poi名称
     */
    private String poiName;

    /**
     * 第三方地图对应的id
     */
    private String externalId;

    /**
     * 经度
     */
    private BigDecimal lng;

    /**
     * 纬度
     */
    private BigDecimal lat;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新时间
     */
    private Date updatedTime;

    private static final long serialVersionUID = 1L;
}