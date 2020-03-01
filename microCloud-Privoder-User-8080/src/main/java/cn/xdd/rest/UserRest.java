package cn.xdd.rest;

import cn.xdd.pojo.User;
import cn.xdd.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author XDD
 * @project microCloud
 * @date 2020/3/1
 * @description Good Good Study,Day Day Up.
 */
@RestController
@RequestMapping("/privoder/user/")
public class UserRest {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/sessionId")
    public Object sessionId(HttpServletRequest request){
        return request.getSession().getId();
    }

    @RequestMapping("/{id}")
    public Object findOne(@PathVariable("id")Integer id){
        return iUserService.findById(id);
    }

    @RequestMapping("/list")
    public Object findAll(){
        return iUserService.findAll();
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public boolean save(User user){
        return iUserService.save(user)>0;
    }

}
