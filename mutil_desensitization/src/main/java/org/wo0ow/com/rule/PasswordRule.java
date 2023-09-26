package org.wo0ow.com.rule;

import org.wo0ow.com.rule.baserule.BaseRule;

public class PasswordRule extends BaseRule {
    /**
     * 全部隐藏
     */
    @Override
    public String apply(String str) {
        return "******";
    }

    @Override
    public void initRule() {

    }
}
