package org.wo0ow.com.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.wo0ow.com.annotation.CustomSerializer;
import org.wo0ow.com.rule.IdCardRule;
import org.wo0ow.com.rule.PasswordRule;
import org.wo0ow.com.rule.PhoneRule;
import org.wo0ow.com.rule.UserNameRule;

import java.io.Serializable;

@NoArgsConstructor
@Data
@Accessors(chain = true)
public class DemoRespDTO implements Serializable {

    private static final long serialVersionUID = 8233309325750255070L;

    @CustomSerializer(UserNameRule.class)
    private String userName;

    @CustomSerializer(PhoneRule.class)
    private String phone;

    @CustomSerializer(IdCardRule.class)
    private String idCard;

    @CustomSerializer(PasswordRule.class)
    private String password;

    /**
     * 隐藏前面10个字符
     */
    @CustomSerializer(pattern = "\\S{10}(\\S*)", format = "**********$1")
    private String customValue;

}
