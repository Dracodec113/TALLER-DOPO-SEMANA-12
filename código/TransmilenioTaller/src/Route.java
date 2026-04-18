import java.util.*;

public class Route {
    private String routeName;
    private List<Station> stoppingStations = new ArrayList<Station>();

    public Route(String name){
        routeName = name;
    }



    public void addStations(){
        Station station1 = new Station("A");
        Station station2 = new Station("B");
        Station station3 = new Station("C");
        Station station4 = new Station("D");

        stoppingStations.add(station1);
        stoppingStations.add(station2);
        stoppingStations.add(station3);
        stoppingStations.add(station4);
    }
    
    public String getRouteName(){
        return routeName;
    }

    public List<Station> getStoppingStations(){
        return stoppingStations;
    }
}
