public class Station {
    private String stationName;
    private String occupancyLevel;
    private int waitTime;

    public Station(String name){
        stationName = name;
    }

    public String getStationName(){
        return stationName;
    }
}
