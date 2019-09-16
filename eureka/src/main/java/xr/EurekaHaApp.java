package xr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: kxr
 * @Date: 2019/9/12
 * @Description
 */

@SpringBootApplication
@EnableEurekaServer             //将当前项目标记为eurekaserver项目
public class EurekaHaApp {

    public static void main(String[] args){
        SpringApplication.run(EurekaHaApp.class);
    }

}
