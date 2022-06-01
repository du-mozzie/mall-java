package com.du.common.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

/**
 * [一句话描述该类的功能]
 *
 * @author : HuangZhengJie (1275996533@qq.com)
 * @version : [v1.0]
 * @date : [2022/4/7 0:59]
 */
public class ListValueConstraintValidatorForInteger implements ConstraintValidator<ListValue, Integer> {

    private final Set<Integer> listValue = new HashSet<>();

    @Override
    public void initialize(ListValue constraintAnnotation) {
        int[] vales = constraintAnnotation.vales();
        for (int vale : vales) {
            listValue.add(vale);
        }
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return listValue.contains(value);
    }

}
