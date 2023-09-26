package org.wo0ow.com.rule.ruleitem;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RuleItem {

    /**
     * 正则
     */
    private String regex;

    /**
     * 格式化显示
     */
    private String format;

}
