package org.openmrs.test.parameter;

public class Profiling {
    public boolean isEnabled() {
        String value = System.getProperty("profiler.enabled", "false");
        return Boolean.valueOf(value);
    }

    public int getPort() {
        String value = System.getProperty("profiler.port", "10001");
        int port = 10001;
        try {
            port = Integer.parseInt(value);
        } catch (NumberFormatException e) {

        }

        return port;
    }
}
