package com.yh.annoations;

import java.lang.annotation.*;

/**
 * 注解用于加在方法的入参上，给入参上的某个属性赋值
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PropAnnoation {

    String createUser() default "system";

    int isDelete() default 0;
}
