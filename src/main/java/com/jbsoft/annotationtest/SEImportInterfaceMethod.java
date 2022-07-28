package com.jbsoft.annotationtest;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SEImportInterfaceMethod {
	public String name();
}
