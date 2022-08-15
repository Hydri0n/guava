package xyz.hplus.guava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.hplus.guava.pojo.qo.InBoxQo;
import xyz.hplus.guava.pojo.qo.PlanCreateQo;
import xyz.hplus.guava.pojo.vo.Result;

import java.util.List;

/**
 * @Author xiehongsong
 * @Date 2022/8/15
 */
@RestController
@RequestMapping("/plan")
public class PlanController {
    @GetMapping("/{planId}/inbox")
    public Result<List<InBoxQo>> getInbox(@PathVariable String planId) {
        return null;
    }

    @PostMapping("/")
    public Result<Void> createPlan(@RequestBody PlanCreateQo qo) {
        return Result.success();
    }
}
