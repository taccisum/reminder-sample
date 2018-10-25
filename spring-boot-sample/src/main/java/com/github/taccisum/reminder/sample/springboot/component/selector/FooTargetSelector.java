package com.github.taccisum.reminder.sample.springboot.component.selector;

import com.github.taccisum.reminder.api.Target;
import com.github.taccisum.reminder.api.TargetSelector;
import com.github.taccisum.reminder.sample.springboot.component.RemindCode;
import com.github.taccisum.reminder.sample.springboot.component.UserTarget;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tac
 * @since 25/10/2018
 */
@Component
public class FooTargetSelector implements TargetSelector {
    public String code() {
        return RemindCode.FOO;
    }

    public List<Target> select(Object... objects) {
        List<Long> ids = (List<Long>) objects[0];
        ArrayList<Target> targets = new ArrayList<Target>();
        for (Long id : ids) {
            targets.add(new UserTarget(id));
        }
        return targets;
    }
}
