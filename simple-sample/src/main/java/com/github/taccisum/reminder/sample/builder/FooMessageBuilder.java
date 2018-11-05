package com.github.taccisum.reminder.sample.builder;

import com.github.taccisum.reminder.api.*;
import com.github.taccisum.reminder.builder.TemplateMessageBuilder;
import com.github.taccisum.reminder.message.SimpleMessage;
import com.github.taccisum.reminder.sample.RemindCode;

/**
 * @author tac
 * @since 24/10/2018
 */
public class FooMessageBuilder extends TemplateMessageBuilder {
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
