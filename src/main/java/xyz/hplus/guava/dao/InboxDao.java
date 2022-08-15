package xyz.hplus.guava.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.hplus.guava.pojo.entity.InboxEntity;

@Mapper
public interface InboxDao {
    int deleteByPrimaryKey(Integer id);

    int insert(InboxEntity record);

    int insertSelective(InboxEntity record);

    InboxEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InboxEntity record);

    int updateByPrimaryKey(InboxEntity record);
}
