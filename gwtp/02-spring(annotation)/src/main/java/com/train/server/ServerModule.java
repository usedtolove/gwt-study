/**
 * Copyright 2011 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.train.server;

import com.gwtplatform.dispatch.server.actionvalidator.ActionValidator;
import com.gwtplatform.dispatch.server.spring.HandlerModule;
import com.gwtplatform.dispatch.server.spring.LoggerFactoryBean;
import com.gwtplatform.dispatch.server.spring.actionvalidator.DefaultActionValidator;
import com.gwtplatform.dispatch.server.spring.configuration.DefaultModule;
import com.train.shared.SendTextToServerAction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Module which binds the handlers and configurations.
 */
@Configuration
@Import(DefaultModule.class)
@ComponentScan(basePackages = "com.gwtplatform.dispatch.server.spring")
public class ServerModule extends HandlerModule {
    public ServerModule() {
    }

    @Bean
    public SendTextToServerHandler getSendTextToServerHandler() {
        return new SendTextToServerHandler(SendTextToServerAction.class);
    }

    @Bean
    public ActionValidator getDefaultActionValidator() {
        return new DefaultActionValidator();
    }

    @Bean
    public LoggerFactoryBean getLogger() {
        Logger logger = Logger.getAnonymousLogger();
        logger.setLevel(Level.FINEST);
        return new LoggerFactoryBean(logger);
    }

    protected void configureHandlers() {
        bindHandler(SendTextToServerAction.class, SendTextToServerHandler.class);
    }
}
