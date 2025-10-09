package Algorithm;

public class GeoPolicalZoneDriver {
    public static String checkForStateInZone(String state) {
        String unknownState = "Unknown state";
        for (GeoPoliticalZone zones : GeoPoliticalZone.values()) {
            for(String states : zones.getStates()) {
                if(states.equalsIgnoreCase(state)) {
                    unknownState = zones.name();
                    return unknownState;
                }
            }
        }
        return unknownState;
    }

    }
