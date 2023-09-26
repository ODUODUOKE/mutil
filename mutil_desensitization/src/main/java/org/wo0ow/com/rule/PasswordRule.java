package org.wo0ow.com.rule;

public class PasswordRule extends BaseRule {
    /**
     * 全部隐藏
     */
    @Override
    public String apply(String str) {
        return "******";
    }

    @Override
    void initRule() {

    }
}
