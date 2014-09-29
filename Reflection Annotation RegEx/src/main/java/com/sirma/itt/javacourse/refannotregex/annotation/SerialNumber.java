package com.sirma.itt.javacourse.refannotregex.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation has one attribute - value. It contains a numeric value of type int. In this classes
 * succession of the parent class will be ordered.
 * 
 * @author Malvina Makarieva
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
public @interface SerialNumber {
	int value();
}
