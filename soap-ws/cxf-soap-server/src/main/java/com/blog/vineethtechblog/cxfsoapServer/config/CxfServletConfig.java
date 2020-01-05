package com.blog.vineethtechblog.cxfsoapServer.config;

import com.blog.vineethtechblog.cxfsoapServer.serviceimpl.DisplayServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class CxfServletConfig {

    @Bean(name= Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        SpringBus springBus = new SpringBus();
        return springBus;
    }

    @Bean
    public Endpoint displayServiceEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), new DisplayServiceImpl());
        endpoint.publish("/displayService");
        return endpoint;
    }
}

