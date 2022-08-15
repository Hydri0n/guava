package xyz.hplus.guava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.hplus.guava.pojo.qo.PlanCreateQo;
import xyz.hplus.guava.pojo.vo.Result;
import xyz.hplus.guava.pojo.vo.TagVo;
import xyz.hplus.guava.service.TagService;
import xyz.hplus.web.support.AppContext;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author xiehongsong
 * @Date 2022/8/15
 */
@RestController
@RequestMapping("/tag")
public class TagController extends BaseController {

    @Autowired
    TagService tagService;

    @GetMapping("")
    public Result<List<TagVo>> getTags() {
        Integer userId = getUserId();
        return new Result<>(tagService.listTagByUserId(userId));
    }

}
