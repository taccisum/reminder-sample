package com.github.taccisum.reminder.sample;

import com.github.taccisum.reminder.Reminder;
import com.github.taccisum.reminder.api.Metadata;
import com.github.taccisum.reminder.builder.MessageBuilderFactory;
import com.github.taccisum.reminder.channel.ChannelFactory;
import com.github.taccisum.reminder.dispatcher.DefaultDispatcher;
import com.github.taccisum.reminder.metadata.IniMetadata;
import com.github.taccisum.reminder.sample.selector.FooTargetSelector;
import com.github.taccisum.reminder.sample.builder.FooMessageBuilder;
import com.github.taccisum.reminder.sample.channel.DBChannel;
import com.github.taccisum.reminder.sample.channel.PushChannel;
import com.github.taccisum.reminder.selector.TargetSelectorFactory;
import com.github.taccisum.reminder.sender.DefaultSender;

/**
 * @author tac
 * @since 24/10/2018
 */
public class Sample {
    public static void main(String[] args) {
        Metadata metadata = new IniMetadata("classpath:sample.ini");
        ChannelFactory.put(PushChannel.CODE, new PushChannel());
        ChannelFactory.put(DBChannel.CODE, new DBChannel());
        TargetSelectorFactory.put(RemindCode.FOO, new FooTargetSelector());
        MessageBuilderFactory.put(RemindCode.FOO, new FooMessageBuilder(RemindCode.FOO, metadata));

        DefaultDispatcher dispatcher = new DefaultDispatcher();
        DefaultSender sender = new DefaultSender();
        dispatcher.setSender(sender);

        Reminder reminder = new Reminder();
        reminder.setDispatcher(dispatcher);
        RemindingServiceFacade facade = new RemindingServiceFacade(reminder);
        facade.foo(1L, 2L, 3L);
    }
}
