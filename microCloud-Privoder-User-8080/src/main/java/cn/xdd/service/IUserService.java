package cn.xdd.service;

import cn.xdd.pojo.User;

import java.util.List;

/**
 * @author XDD
 * @project microCloud
 * @date 2020/3/1
 * @description Good Good Study,Day Day Up.
 */
public interface IUserService {

    User findById(int id);

    List<User> findAll();

    int save(User user);

}
