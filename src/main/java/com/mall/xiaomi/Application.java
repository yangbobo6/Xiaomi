package com.mall.xiaomi;

import com.mall.xiaomi.util.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Auther: wdd
 * @Date: 2020-03-19 15:43
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.mall.xiaomi.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public IdWorker getIdWork() {
        return new IdWorker();
    }
}
