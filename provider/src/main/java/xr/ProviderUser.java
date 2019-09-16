package xr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableEurekaClient         //启动eureka 客户端
public class ProviderUser
{
    public static void main( String[] args )
    {
        SpringApplication.run(ProviderUser.class);
    }
}
