package org.wo0ow.com.rule;

import org.wo0ow.com.rule.baserule.BaseRule;
import org.wo0ow.com.rule.ruleitem.RuleItem;

public class UserNameRule extends BaseRule {

    /**
     * 仅显示最后一个汉字
     */
    @Override
    public void initRule() {
        setRule(new RuleItem()
                .setRegex("\\S*(\\S)")
                .setFormat("**$1"));
    }

}
