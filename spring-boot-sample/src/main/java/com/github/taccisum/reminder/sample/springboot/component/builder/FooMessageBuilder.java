package com.github.taccisum.reminder.sample.springboot.component.builder;

import com.github.taccisum.reminder.api.*;
import com.github.taccisum.reminder.builder.TemaplteMessageBuilder;
import com.github.taccisum.reminder.message.SimpleMessage;
import com.github.taccisum.reminder.sample.springboot.component.RemindCode;
import org.springframework.stereotype.Component;

/**
 * @author tac
 * @since 25/10/2018
 */
@Component
public class FooMessageBuilder extends TemaplteMessageBuilder {
    public FooMessageBuilder(Metadata metadata) {
        super(metadata);
    }

    @SuppressWarnings("Duplicates")
    public Message build(Target target, Subject subject, Object... objects) {
        MessageTemplate template = getTemplate();
        SimpleMessage message = new SimpleMessage();
        String body = template.getBody();
        body = body.replace("{id}", target.getId().toString());
        body = body.replace("{subject}", subject.serialized());

        message.setTopic(template.getTopic());
        message.setBody(body);

        return message;
    }

    public String code() {
        return RemindCode.FOO;
    }
}
