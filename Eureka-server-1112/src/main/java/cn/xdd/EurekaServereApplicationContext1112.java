package cn.xdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author XDD
 * @project microCloud
 * @date 2020/3/3
 * @description Good Good Study,Day Day Up.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServereApplicationContext1112 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServereApplicationContext1112.class,args);
    }
}
