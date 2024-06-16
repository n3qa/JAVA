package greedyTimes;

import java.util.LinkedHashMap;
import java.util.Map;

public class GemContainer {

    private Map<String, Long> gems;

    public GemContainer() {
        this.gems = new LinkedHashMap<>();
    }

    public Long getValue() {
        return this.gems.values().stream().mapToLong(e -> e).sum();
    }
}
