package xr.feign;

import xr.entity.User;
import config.FeignClientConfig;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @Author: kxr
 * @Date: 2019/9/14
 * @Description
 */

@FeignClient(name = "provider",configuration = FeignClientConfig.class,fallback = FeignHystrix.class)
public interface MyFeignClient {

//    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
//    @GetMapping("/user/{id}")
//    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
//    public User getOrder(@RequestParam(value = "id") Long id);

//    @RequestMapping(value="/user/{id}", method=RequestMethod.GET)
    @RequestLine("GET /user/{id}")
    public User getOrder(@Param("id") Long id);         //注意使用@RequestLine注解时必须使用 param 注解

//    @RequestMapping(value = "/getUser",method = RequestMethod.POST)
    @RequestLine("POST /getUser")
    public User getUser(User user);

}
