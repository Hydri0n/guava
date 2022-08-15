package xyz.hplus.guava.pojo.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_schedule
 * @author 
 */
@Data
public class ScheduleEntity implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 所属计划id
     */
    private Integer planId;

    /**
     * 天数序号
     */
    private Integer day;

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