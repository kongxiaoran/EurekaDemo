package xr.controller;

import xr.entity.User;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kxr
 * @Date: 2019/9/11
 * @Description
 */

@RestController
public class UserController {

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping(value = "/user/{id}")
    public User getUser(@PathVariable("id") Long id){
        return new User(id);
    }

    @GetMapping("einfo")
    public String info(){
        InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("PROVIDER-USER",false);
        return instanceInfo.getHomePageUrl();
    }

    @GetMapping("/getUser")
    public User getUser(User user){
        return user;
    }
}
