package xyz.hplus.guava.pojo.qo;

import lombok.Data;

/**
 * @Author xiehongsong
 * @Date 2022/8/15
 */
@Data
public class InBoxQo {
    private String poiId;
    private String poiName;
    private Integer tagId;
    private Integer rate;
    private Integer estimatedCost;
    private String remark;
}
