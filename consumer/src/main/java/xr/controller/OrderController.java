package xr.controller;

import xr.entity.User;
import xr.feign.MyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.*;


/**
 * @Author: kxr
 * @Date: 2019/9/11
 * @Description
 */
@RestController
public class OrderController {

    @Autowired
    private MyFeignClient myFeignClient;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping(value = "/order/{id}")
    public User getOrder(@PathVariable("id") Long id){
        //访问提供者,获取数据
//        User u = this.myFeignClient.getOrder(id);
//        return u;

        User u = null;
        for(int i=0;i<20;i++){
            ServiceInstance serviceInstance1 = loadBalancerClient.choose("PROVIDER");
            System.out.println(serviceInstance1.getServiceId()+serviceInstance1.getHost()+":"+serviceInstance1.getPort());
            u = this.myFeignClient.getOrder(id);
        }
        return u;
    }

    @RequestMapping(value = "/getUser",method = RequestMethod.POST)
    public User getUser(User user){
        return this.myFeignClient.getUser(user);
    }


}
