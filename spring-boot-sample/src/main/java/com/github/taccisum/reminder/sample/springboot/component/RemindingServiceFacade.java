package com.github.taccisum.reminder.sample.springboot.component;

import com.github.taccisum.reminder.Reminder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @author tac
 * @since 25/10/2018
 */
@Service
public class RemindingServiceFacade {
    @Autowired
    private Reminder reminder;

    public void foo(Long... targetIds) {
        reminder.remind(RemindCode.FOO, 1L, "PUSH, DB", Arrays.asList(targetIds));
    }
}
