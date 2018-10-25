package com.github.taccisum.reminder.sample;

import com.github.taccisum.reminder.Reminder;

import java.util.Arrays;

/**
 * @author tac
 * @since 24/10/2018
 */
public class RemindingServiceFacade {
    private Reminder reminder;

    public RemindingServiceFacade(Reminder reminder) {
        this.reminder = reminder;
    }

    public void foo(Long... targetIds) {
        reminder.remind(RemindCode.FOO, 1L, "PUSH, DB", Arrays.asList(targetIds));
    }
}
