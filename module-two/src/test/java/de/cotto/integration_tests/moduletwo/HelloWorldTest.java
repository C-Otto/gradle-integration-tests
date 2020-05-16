package de.cotto.integration_tests.moduletwo;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class HelloWorldTest {
    @Test
    void test() {
        assertThat(new HelloWorld().helloWorld()).isEqualTo("Hello World!");
    }
}