package com.example;

import org.eclipse.microprofile.faulttolerance.Fallback;

public interface SomeInterface {

    @Fallback
    String annotatedMethod(String input);

    String nonAnnotatedMethod(String input);
}
