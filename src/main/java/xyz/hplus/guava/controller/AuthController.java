package xyz.hplus.guava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.hplus.guava.dao.UserDao;
import xyz.hplus.guava.pojo.entity.UserEntity;
import xyz.hplus.guava.pojo.qo.UserCreateQo;
import xyz.hplus.guava.pojo.vo.Result;

/**
 * @Author xiehongsong
 * @Date 2022/8/15
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Autowired
    private UserDao userDao;

    @PostMapping("/user")
    public Result<Void> createUser(@RequestBody UserCreateQo qo) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(qo.getAccount());
        userEntity.setAccount(qo.getAccount());
        userEntity.setPassword(passwordEncoder.encode(qo.getPassword()));
        userDao.insertSelective(userEntity);

        return Result.success();
    }
}
