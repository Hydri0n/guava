package xyz.hplus.guava.support;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import xyz.hplus.guava.pojo.entity.UserEntity;

import java.util.Collection;

/**
 * @Author xiehongsong
 * @Date 2022/8/15
 */
public class MyUser extends User {

    private final Integer userId;

    public MyUser(String username, String password, Collection<? extends GrantedAuthority> authorities, Integer userId) {
        super(username, password, authorities);
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }
}
