package xyz.hplus.guava.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.hplus.guava.pojo.entity.PoiTagEntity;

import java.util.List;

@Mapper
public interface PoiTagDao {
    int deleteByPrimaryKey(Integer id);

    int insert(PoiTagEntity record);

    int insertSelective(PoiTagEntity record);

    PoiTagEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PoiTagEntity record);

    int updateByPrimaryKey(PoiTagEntity record);

    List<PoiTagEntity> listByUserId(Integer userId);

}
