package org.wo0ow.com.rule;

import org.wo0ow.com.rule.ruleitem.RuleItem;

public class IdCardRule extends BaseRule {

    /**
     * 仅显示前6位和后4位
     */
    @Override
    void initRule() {
        setRule(new RuleItem()
                .setRegex("(\\d{6})\\d*(\\w{4})")
                .setFormat("$1********$2"));
    }
}
