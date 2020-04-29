package com.tips.springcloud.server.api;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author xhm
 * @Description:
 * @date 2020/4/22 15:01
 */
@SpringCloudApplication
public class SpringCloudAPi {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringCloudAPi.class);
        application.run(args);
    }
}
