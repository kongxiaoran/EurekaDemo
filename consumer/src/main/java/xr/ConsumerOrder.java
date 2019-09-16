package xr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: kxr
 * @Date: 2019/9/11
 * @Description
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RibbonClient(value = "PROVIDER")
@EnableCircuitBreaker       //启用熔断
public class ConsumerOrder {

    public static void main(String[] args){
        SpringApplication.run(ConsumerOrder.class);
    }
}
