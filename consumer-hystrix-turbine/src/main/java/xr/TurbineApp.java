package xr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;


/**
 * @Author: kxr
 * @Date: 2019/9/11
 * @Description
 */

@SpringBootApplication
@EnableEurekaClient
@EnableTurbine
public class TurbineApp {

    public static void main(String[] args){
        SpringApplication.run(TurbineApp.class);
    }
}
