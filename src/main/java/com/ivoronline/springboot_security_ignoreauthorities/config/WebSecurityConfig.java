package com.ivoronline.springboot_security_ignoreauthorities.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  //====================================================================
  // CONFIGURE
  //====================================================================
  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {

    //ADD AUTHORITIES TO ENDPOINTS
    httpSecurity.authorizeRequests()
      .antMatchers("/EndPoint2").permitAll()      //Anonymous     access (no   Login needed, default)
      .antMatchers("/EndPoint3").authenticated()  //Authenticated access (only Login needed)
      .antMatchers("/EndPoint4").denyAll();       //No            access (even after Login)

    //REDIRECT TO LOGIN FORM
    httpSecurity.formLogin();

  }

}


