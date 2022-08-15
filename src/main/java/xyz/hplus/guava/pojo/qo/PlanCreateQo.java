package xyz.hplus.guava.pojo.qo;

import lombok.Data;

import java.util.List;

/**
 * @Author xiehongsong
 * @Date 2022/8/15
 */
@Data
public class PlanCreateQo {
    private String planName;
    private List<InBoxQo> inbox;
}
