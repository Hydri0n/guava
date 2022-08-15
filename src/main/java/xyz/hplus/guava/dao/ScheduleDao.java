package xyz.hplus.guava.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.hplus.guava.pojo.entity.ScheduleEntity;

@Mapper
public interface ScheduleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ScheduleEntity record);

    int insertSelective(ScheduleEntity record);

    ScheduleEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ScheduleEntity record);

    int updateByPrimaryKey(ScheduleEntity record);
}
