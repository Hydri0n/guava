package xyz.hplus.guava.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.hplus.guava.pojo.entity.PlanEntity;

@Mapper
public interface PlanDao {
    int deleteByPrimaryKey(Integer id);

    int insert(PlanEntity record);

    int insertSelective(PlanEntity record);

    PlanEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PlanEntity record);

    int updateByPrimaryKey(PlanEntity record);
}
