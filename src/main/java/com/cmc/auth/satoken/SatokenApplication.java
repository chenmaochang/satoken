package com.cmc.auth.satoken;

import cn.dev33.satoken.SaTokenManager;
import cn.dev33.satoken.spring.SaTokenSetup;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 陈茂昌
 */
@SpringBootApplication
@SaTokenSetup
public class SatokenApplication {

    public static void main(String[] args) {
        SpringApplication.run(SatokenApplication.class, args);
		System.out.println("启动成功：sa-token配置如下：" + SaTokenManager.getConfig());
    }

}
