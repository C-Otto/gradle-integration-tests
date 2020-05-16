package de.cotto.moduletwo;

import de.cotto.integration_tests.moduleone.Hello;

public class HelloWorld {
    public String helloWorld() {
        return new Hello().world() + "!";
    }
}
