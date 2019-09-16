package xr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: kxr
 * @Date: 2019/9/14
 * @Description
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DashBoardApp {

    public static void main(String[] args){
        SpringApplication.run(DashBoardApp.class);
    }
}
