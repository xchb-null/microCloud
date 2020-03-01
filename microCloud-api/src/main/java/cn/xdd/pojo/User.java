package cn.xdd.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author XDD
 * @project microCloud
 * @date 2020/3/1
 * @description Good Good Study,Day Day Up.
 */
@Data
public class User implements Serializable {

    private Integer id;

    private String username;

    private String password;

}
