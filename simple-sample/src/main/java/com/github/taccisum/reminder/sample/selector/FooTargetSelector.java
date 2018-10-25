package com.github.taccisum.reminder.sample.selector;

import com.github.taccisum.reminder.api.Target;
import com.github.taccisum.reminder.api.TargetSelector;
import com.github.taccisum.reminder.sample.UserTarget;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tac
 * @since 24/10/2018
 */
public class FooTargetSelector implements TargetSelector {
    public List<Target> select(Object... objects) {
        List<Long> ids = (List<Long>) objects[0];
        ArrayList<Target> targets = new ArrayList<Target>();
        for (Long id : ids) {
            targets.add(new UserTarget(id));
        }
        return targets;
    }
}
