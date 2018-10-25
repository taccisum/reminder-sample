package com.github.taccisum.reminder.sample.springboot.component.channel;

import com.github.taccisum.reminder.api.Channel;
import com.github.taccisum.reminder.api.Message;
import com.github.taccisum.reminder.api.Target;
import org.springframework.stereotype.Component;

/**
 * @author tac
 * @since 25/10/2018
 */
@Component
public class DBChannel implements Channel {
    public String code() {
        return "DB";
    }

    public String name() {
        return "db channel";
    }

    public void send(Target target, Message message, Object[] objects) {
        System.out.println(String.format("send message \"%s\" via db channel", message.getBody()));
    }
}
