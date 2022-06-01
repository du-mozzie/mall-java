package com.du.common.validator;

import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * [一句话描述该类的功能]
 *
 * @author : HuangZhengJie (1275996533@qq.com)
 * @version : [v1.0]
 * @date : [2022/4/7 0:55]
 */
@Documented
@Constraint(validatedBy = { ListValueConstraintValidatorForInteger.class })
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
public @interface ListValue {

    String message() default "参数不符合指定的值";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int[] vales() default {};

}
