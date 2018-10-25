package com.github.taccisum.reminder.sample.channel;

import com.github.taccisum.reminder.api.Channel;
import com.github.taccisum.reminder.api.Message;
import com.github.taccisum.reminder.api.Target;

/**
 * @author tac
 * @since 24/10/2018
 */
public class PushChannel implements Channel {
    public static final String CODE = "PUSH";

    public String code() {
        return CODE;
    }

    public String name() {
        return "push channel";
    }

    public void send(Target target, Message message, Object[] objects) {
        System.out.println(String.format("send message \"%s\" via push channel", message.getBody()));
    }
}
