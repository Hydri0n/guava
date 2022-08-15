package xyz.hplus.guava.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import xyz.hplus.guava.dao.UserDao;
import xyz.hplus.guava.pojo.entity.UserEntity;
import xyz.hplus.guava.support.MyUser;

import java.util.Collections;
import java.util.Objects;

/**
 * @Author xiehongsong
 * @Date 2022/8/15
 */
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userDao.getByAccount(username);
        if (Objects.isNull(user)) {
            throw new UsernameNotFoundException("用户不存在");
        }
        return new MyUser(user.getAccount(), "{bcrypt}" + user.getPassword(), Collections.emptyList(), user.getId());
    }
}
