package com.jbsoft.annotationtest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Set;

import org.reflections.Reflections;

public class App {

	public static void main(String[] args) {

		Reflections reflections = new Reflections("com.jbsoft");
		Set<Class<?>> challengeClasses = reflections.getTypesAnnotatedWith(SEImportInterface.class);

		for (Class<?> massiveImportInterface : challengeClasses) {

			for (Method method : massiveImportInterface.getDeclaredMethods()) {

				Annotation annotation = method.getAnnotation(SEImportInterfaceMethod.class);
				SEImportInterfaceMethod test = (SEImportInterfaceMethod) annotation;
				if (test != null) {
					System.out.println("Method name: " + test.name());
					try {
						method.invoke(massiveImportInterface.getDeclaredConstructor().newInstance());
					} catch (Throwable ex) {
						System.out.println(ex.getCause());
					}

				}
			}
		}
	}
}
