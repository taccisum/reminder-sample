package com.github.taccisum.reminder.sample;

import com.github.taccisum.reminder.api.Target;

/**
 * @author tac
 * @since 24/10/2018
 */
public class UserTarget implements Target {
    private Long id;

    public UserTarget(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
