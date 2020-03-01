package cn.xdd.dao;

import cn.xdd.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @org.junit.jupiter.api.Test
    public void findById() {
        User user = userMapper.findById(1);
        System.out.println(user);
    }

    @org.junit.jupiter.api.Test
    public void findAll() {
    }

    @org.junit.jupiter.api.Test
    public void save() {
    }
}