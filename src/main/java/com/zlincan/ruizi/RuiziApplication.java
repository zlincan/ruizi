package com.zlincan.ruizi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement
@EnableCaching // Spring Cache
public class RuiziApplication {

    public static void main(String[] args) {
        SpringApplication.run(RuiziApplication.class, args);
        log.info("项目启动成功...");
    }
}
