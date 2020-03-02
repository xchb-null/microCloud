package cn.xdd.controller;

import cn.xdd.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author XDD
 * @project microCloud
 * @date 2020/3/1
 * @description Good Good Study,Day Day Up.
 */
@RestController
@RequestMapping("/consumer/user")
public class UserController {

    /*private static final String REST_FIND_ONE_URL = "http://xdd.com:8080/microCloud/privoder/user/";
    private static final String REST_FIND_ALL_URL = "http://xdd.com:8080/microCloud/privoder/user/list";
    private static final String REST_INSERT_ONE_URL = "http://xdd.com:8080/microCloud/privoder/user/save";*/
    private static final String EUREKA_SERVER_NAME = "http://USER-SERVICE-PRIVODER-8080/";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HttpHeaders httpHeaders;

    @RequestMapping("/{id}")
    public Object findOne(@PathVariable("id") Integer id){
        User user =  this.restTemplate.exchange(EUREKA_SERVER_NAME+"/privoder/user/"+id, HttpMethod.GET
                ,new HttpEntity<Object>(this.httpHeaders),User.class).getBody();
        return user;
    }

    @RequestMapping("/list")
    public List<Object> findAll(){
        return restTemplate.exchange(EUREKA_SERVER_NAME+"/privoder/user/list",HttpMethod.GET,new HttpEntity<>(httpHeaders),List.class).getBody();
    }

    @RequestMapping("/save")
    public Object save(User user){
        Boolean flag =  restTemplate.exchange(EUREKA_SERVER_NAME+"/privoder/user/save",HttpMethod.POST
                ,new HttpEntity<Object>(user, httpHeaders),Boolean.class).getBody();
        return flag;
    }

}
