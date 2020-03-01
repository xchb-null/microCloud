package cn.xdd.dao;

import cn.xdd.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author XDD
 * @project microCloud
 * @date 2020/3/1
 * @description Good Good Study,Day Day Up.
 */
@Mapper
public interface UserMapper {

    User findById(int id);

    List<User> findAll();

    int save(User user);

}
