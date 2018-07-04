package com.ms.eureka.ribbon.consumer.ribbonconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Sherlock
 * @Description:
 * @Date: Created in 15:44 2018/7/4
 * @Modified By:
 */

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String helloConsumer() {

        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
    }
}
