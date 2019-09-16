package xr.feign;

import xr.entity.User;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: kxr
 * @Date: 2019/9/14
 * @Description
 */
@Component
public class FeignHystrix implements MyFeignClient{


    @Override
    public User getOrder(Long id) {
        User user = new User();
        user.setId(-2l);
        user.setDate(new Date());
        return user;
    }

    @Override
    public User getUser(User user) {
        return null;
    }
}
