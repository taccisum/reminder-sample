package com.github.taccisum.reminder.sample.springboot;

import com.github.taccisum.reminder.sample.springboot.component.RemindingServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author tac
 * @since 25/10/2018
 */
@Component
public class FooRunner implements ApplicationRunner {
    @Autowired
    private RemindingServiceFacade facade;

    public void run(ApplicationArguments applicationArguments) throws Exception {
        facade.foo(1L, 2L, 3L);
    }
}
