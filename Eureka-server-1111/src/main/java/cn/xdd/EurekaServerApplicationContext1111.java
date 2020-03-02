package cn.xdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @author XDD
 * @project microCloud
 * @date 2020/3/2
 * @description Eureka服务端（注册中心）
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplicationContext1111 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplicationContext1111.class,args);
        /*new SpringApplicationBuilder(EurekaServerApplicationContext.class)
                .web(WebApplicationType.SERVLET).run(args);*/
    }
}
