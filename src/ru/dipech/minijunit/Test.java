package ru.dipech.minijunit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
    Class<? extends Throwable> expected() default Test.None.class;

    public static class None extends Throwable {
        private None() {
        }
    }
}
