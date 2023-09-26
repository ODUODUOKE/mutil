package org.wo0ow.com.annotation;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.wo0ow.com.JsonSerializer.MyJsonSerializer;
import org.wo0ow.com.rule.baserule.BaseRule;
import org.wo0ow.com.rule.DefaultRule;

import java.lang.annotation.*;

@JacksonAnnotationsInside
@JsonSerialize(using = MyJsonSerializer.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface CustomSerializer {

    /**
     * 脱敏规则处理类
     * @return
     */
    Class<? extends BaseRule> value() default DefaultRule.class;

    /**
     * 正则，pattern和format必需同时有值。如果都有值时，优先使用正则进行规则替换
     * @return
     */
    String pattern() default "";

    String format() default "";

}
