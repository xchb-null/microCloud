package cn.xdd.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.Base64;

/**
 * @author XDD
 * @project microCloud
 * @date 2020/3/1
 * @description Good Good Study,Day Day Up.
 */
@Configuration
public class RestConfig {
    @Bean
    @LoadBalanced //开启客户端负载均衡
   public RestTemplate restTemplate(){
       return new RestTemplate();
    }

    @Bean
    public HttpHeaders httpHeaders(){
        HttpHeaders httpHeaders = new HttpHeaders();
        String authorInfo = "xdd:12345";
        byte[] authorInofBytes = Base64.getEncoder()
                .encode(authorInfo.getBytes(Charset.forName("US-ASCII")));
        String autorHeader = "Basic "+ new String(authorInofBytes);
        httpHeaders.add("Authorization",autorHeader);
        return httpHeaders;
    }

    public static void main(String[] args) {
        String authorInfo = "xdd:12345";
        byte[] authorInofBytes = Base64.getEncoder()
                .encode(authorInfo.getBytes(Charset.forName("US-ASCII")));
        String autorHeader = "Basic "+ new String(authorInofBytes);
        System.out.println(autorHeader);
    }

}
