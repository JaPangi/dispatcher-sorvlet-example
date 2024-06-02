package io.wwan13.dispatchersorvletexample.config;

import io.wwan13.dispatchersorvlet.configuration.EnableSocketServer;
import io.wwan13.dispatchersorvlet.configuration.SocketServerConfigurer;
import io.wwan13.dispatchersorvlet.configuration.support.SocketServerPropertiesRegistry;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableSocketServer
public class ApplicationConfig implements SocketServerConfigurer {

    @Override
    public void setup(SocketServerPropertiesRegistry registry) {
        registry
                .scanBasePackage("io/wwan13/dispatchersorvletexample")
                .port(8070);
    }
}
