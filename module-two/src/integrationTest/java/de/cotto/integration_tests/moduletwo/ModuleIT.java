package de.cotto.integration_tests.moduletwo;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

public class ModuleIT {
    @Test
    void name() {
        String helloWorld = new HelloWorld().helloWorld();
        assertThat(helloWorld).isEqualTo("XXX");
    }
}
