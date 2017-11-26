package com.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
/**
 * 
* @ClassName: HotDeployApplication 
* @Description: TODO() 
* @author zhangxueqing
* @date 2017年11月26日 下午8:15:50 
*
 */
@SpringBootApplication
public class HotDeployApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(HotDeployApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(HotDeployApplication.class, args);
	}
}
