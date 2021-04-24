package com.ivoronline.springboot_security_ignoreauthorities.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
  @RequestMapping("/EndPoint1") public String endPoint1() { return "Hello from EndPoint1"; }
  @RequestMapping("/EndPoint2") public String endPoint2() { return "Hello from EndPoint2"; }
  @RequestMapping("/EndPoint3") public String endPoint3() { return "Hello from EndPoint3"; }
}
