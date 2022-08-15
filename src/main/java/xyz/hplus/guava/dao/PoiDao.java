package xyz.hplus.guava.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.hplus.guava.pojo.entity.PoiEntity;

@Mapper
public interface PoiDao {
    int deleteByPrimaryKey(Integer id);

    int insert(PoiEntity record);

    int insertSelective(PoiEntity record);

    PoiEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PoiEntity record);

    int updateByPrimaryKey(PoiEntity record);
}
