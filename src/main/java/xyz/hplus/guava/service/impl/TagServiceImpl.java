package xyz.hplus.guava.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.hplus.guava.dao.PoiTagDao;
import xyz.hplus.guava.pojo.entity.PoiTagEntity;
import xyz.hplus.guava.pojo.vo.TagVo;
import xyz.hplus.guava.service.TagService;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author xiehongsong
 * @Date 2022/8/15
 */
@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private PoiTagDao poiTagDao;

    @Override
    public List<TagVo> listTagByUserId(Integer userId) {
        return poiTagDao.listByUserId(userId).stream().map(this::convertToTagVo).collect(Collectors.toList());
    }

    private TagVo convertToTagVo(PoiTagEntity poiTagEntity) {
        TagVo vo = new TagVo();
        vo.setTagId(poiTagEntity.getId());
        vo.setTagName(poiTagEntity.getTagName());
        vo.setTagColor(poiTagEntity.getColor());

        return vo;
    }
}
