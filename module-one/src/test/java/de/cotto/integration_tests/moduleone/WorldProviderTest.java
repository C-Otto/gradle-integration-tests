package de.cotto.integration_tests.moduleone;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WorldProviderTest {

    private WorldProvider worldProvider;

    @BeforeEach
    void setUp() {
        worldProvider = new WorldProvider();
    }

    @Test
    void name() {
        assertThat(worldProvider.getWorld()).isEqualTo("World");
    }
}