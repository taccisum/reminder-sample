package com.github.taccisum.reminder.sample.channel;

import com.github.taccisum.reminder.api.Channel;
import com.github.taccisum.reminder.api.Message;
import com.github.taccisum.reminder.api.Target;

/**
 * @author tac
 * @since 24/10/2018
 */
public class DBChannel implements Channel {
    public static final String CODE = "DB";

    public String code() {
        return CODE;
    }

    public String name() {
        return "db channel";
    }

    public void receive(Target target, Message message, Object[] objects) {
        System.out.println(String.format("send message \"%s\" via db channel", message.getBody()));
    }
}
