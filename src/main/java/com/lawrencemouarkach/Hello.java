package com.lawrencemouarkach;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class Hello {

    private static final String HELLO = "Hello ";

    public String myHandler(String name, Context context) {
        LambdaLogger logger = context.getLogger();
        String sayHello = HELLO + name;
        logger.log(sayHello);

        return String.valueOf(sayHello);
    }
}
