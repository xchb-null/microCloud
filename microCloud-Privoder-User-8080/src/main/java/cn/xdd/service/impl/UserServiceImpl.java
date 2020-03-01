package cn.xdd.service.impl;

import cn.xdd.dao.UserMapper;
import cn.xdd.pojo.User;
import cn.xdd.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XDD
 * @project microCloud
 * @date 2020/3/1
 * @description Good Good Study,Day Day Up.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public int save(User user) {
        return userMapper.save(user);
    }
}
