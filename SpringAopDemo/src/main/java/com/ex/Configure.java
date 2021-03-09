package com.ex;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure {

	@Bean
	public Account getAccount() {
		return new Account();
	}

	@Bean
	public AuthenticationAspect getAuthentication() {
		return new AuthenticationAspect();
	}

	@Bean
	public LoggingAspect getLogging() {
		return new LoggingAspect();
	}

	@Bean
	public ProxyFactoryBean getProxy() throws ClassNotFoundException {
		ProxyFactoryBean pfb = new ProxyFactoryBean();

		pfb.setProxyInterfaces(new Class[] { HdfcBank.class });

		// pfb.setInterfaces(HdfcBank.class);
		pfb.setInterceptorNames("getAuthentication", "getLogging");
		pfb.setTargetName("getAccount");
		// pfb.setTarget(new Account());
		return pfb;

	}
}
