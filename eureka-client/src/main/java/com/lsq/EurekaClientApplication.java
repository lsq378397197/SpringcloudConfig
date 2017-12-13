package com.lsq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liushangqing
 */
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
@RestController
public class EurekaClientApplication {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private DiscoveryClient client;


    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        ServiceInstance instance = client.getLocalServiceInstance();
        log.info("/hello,host={},service_id:{}", instance.getHost(), instance.getServiceId());
        return "hi " + name + ",i am from port:" + port;
    }
}
