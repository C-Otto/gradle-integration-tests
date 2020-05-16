package de.cotto.integration_tests.moduleone;

public class Hello {
    private final WorldProvider worldProvider = new WorldProvider();

    public String world() {
        return "Hello " + worldProvider.getWorld();
    }
}
