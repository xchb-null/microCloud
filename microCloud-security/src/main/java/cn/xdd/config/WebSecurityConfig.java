package cn.xdd.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.Resource;

/**
 * @author XDD
 * @project microCloud
 * @date 2020/3/1
 * @description Good Good Study,Day Day Up.
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    public void configGlobal(AuthenticationManagerBuilder auth)throws Exception{
        auth.inMemoryAuthentication().passwordEncoder(new MyPasswordHandel())
                .withUser("xdd").password("12345").roles("user")
                .and().withUser("xchb").password("12345").roles("admin");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //所有请求都要进过认证之后才能正常执行
        http.httpBasic().and().authorizeRequests().anyRequest().fullyAuthenticated();
        //session设置为无状态，以此来提升操作效率
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }
}

class MyPasswordHandel implements PasswordEncoder{
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }
    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}
