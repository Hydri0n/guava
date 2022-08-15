package xyz.hplus.guava.pojo.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_poi_tag
 * @author 
 */
@Data
public class PoiTagEntity implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 是否为预设1是0否
     */
    private Byte isDefault;

    /**
     * 标签名
     */
    private String tagName;

    /**
     * 标签颜色
     */
    private String color;

    /**
     * 用户id
     */
    private Integer userId;

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