package org.wo0ow.com.rule;

import org.wo0ow.com.rule.baserule.BaseRule;
import org.wo0ow.com.rule.ruleitem.RuleItem;

public class PhoneRule extends BaseRule {

    /**
     * 仅显示前3位和后4位
     */
    @Override
    public void initRule() {
        setRule(new RuleItem()
                .setRegex("(\\d{3})\\d*(\\d{4})")
                .setFormat("$1****$2"));
    }

}
