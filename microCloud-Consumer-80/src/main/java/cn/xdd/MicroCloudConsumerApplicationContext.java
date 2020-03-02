package cn.xdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author XDD
 * @project microCloud
 * @date 2020/3/1
 * @description Good Good Study,Day Day Up.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MicroCloudConsumerApplicationContext {

    public static void main(String[] args) {
        SpringApplication.run(MicroCloudConsumerApplicationContext.class,args);
    }
}
