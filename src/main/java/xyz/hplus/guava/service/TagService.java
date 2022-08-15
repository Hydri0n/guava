package xyz.hplus.guava.service;

import xyz.hplus.guava.pojo.vo.TagVo;

import java.util.List;

/**
 * @Author xiehongsong
 * @Date 2022/8/15
 */
public interface TagService {
    List<TagVo> listTagByUserId(Integer userId);
}
