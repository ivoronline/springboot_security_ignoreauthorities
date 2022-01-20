package com.ivoronline.springboot_security_ignoreauthorities.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  //=================================================================
  // CONFIGURE
  //=================================================================
  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {

    //ADD AUTHORITIES TO ENDPOINTS
    httpSecurity.authorizeRequests()
      .antMatchers("/EndPoint1").denyAll()              //No            access (even after Login)
      .antMatchers("/EndPoint2").permitAll()            //Anonymous     access (no Login needed)
      .antMatchers("/EndPoint3").authenticated();       //Authenticated access (ignores Roles & Authorities)

    //REDIRECT TO LOGIN FORM
    httpSecurity.formLogin();

  }

}
