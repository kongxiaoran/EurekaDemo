package config;

import feign.Contract;
import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: kxr
 * @Date: 2019/9/14
 * @Description
 */
@Configuration
public class FeignClientConfig {

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }

    /**
     * 用于创建用户名和密码的对象
     * @return
     */
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor(){
        return new BasicAuthRequestInterceptor("user","123");
    }

    /**
     * 配置要输出的日志是哪些，必须在debug 模式下才可以输出
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
