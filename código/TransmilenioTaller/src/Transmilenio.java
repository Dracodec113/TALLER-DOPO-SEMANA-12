import java.util.ArrayList;
import java.util.List;

public class Transmilenio {

    private List<Route> allRoutes = new ArrayList<Route>();
    private List<TrunkLine> allTrunkLines = new ArrayList<TrunkLine>();
    public static void main(String[] args){
        Transmilenio transmilenio = new Transmilenio();
        //TEST TRUNKLINE PUNTO 2
        TrunkLine trunkLine = new TrunkLine();
        trunkLine.addRoute();
        List<Route> test = trunkLine.getOrganizedRoutes();
        System.out.println(test);
        System.out.println(trunkLine.getRoutes());
        List<Route> organizedRoutes = trunkLine.getOrganizedRoutes();
        for(Route r:organizedRoutes){
            System.out.println(r.getRouteName());
        }

        //TEST ROUTE PUNTO 3
        Route testRoute = new Route("A");
        testRoute.addStations();
        transmilenio.allRoutes.add(testRoute);
        int distanceTest = transmilenio.distanceBetweenStations("A", "D", "A");
        System.out.println(distanceTest);
    }

    public int distanceBetweenStations(String stationAName, String stationBName, String route){
        Route selectedRoute = allRoutes.stream()
            .filter(r -> r.getRouteName().equals(route))
            .findFirst()
            .orElse(null);
        List<Station> stopStations = selectedRoute.getStoppingStations();

        Station stationA  = stopStations.stream()
            .filter(s -> s.getStationName().equals(stationAName))
            .findFirst()
            .orElse(null);

        Station stationB  = stopStations.stream()
            .filter(s -> s.getStationName().equals(stationBName))
            .findFirst()
            .orElse(null);

        int stationDistance = (int) stopStations.subList(selectedRoute.getStoppingStations().indexOf(stationA), 
        selectedRoute.getStoppingStations().indexOf(stationB)).stream()
            .count() - 1;
        return stationDistance;
    }
}
