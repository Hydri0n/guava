package xyz.hplus.guava.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.hplus.guava.pojo.entity.UserEntity;

@Mapper
public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);

    UserEntity getByAccount(String account);
}
