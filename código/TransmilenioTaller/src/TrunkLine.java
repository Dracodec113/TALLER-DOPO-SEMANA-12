import java.util.*;
import java.util.stream.Collectors;

public class TrunkLine {
    private List<Route> routes = new ArrayList<Route>();

    public void addRoute(){
        Route route1 = new Route("A");
        Route route2 = new Route("B");
        Route route3 = new Route("C");
        Route route4 = new Route("D");

        routes.add(route3);
        routes.add(route1);
        routes.add(route2);
        routes.add(route4);
    }

    public List<Route> getOrganizedRoutes(){
        return routes.stream()
            .sorted(Comparator.comparing(Route:: getRouteName))
            .collect(Collectors.toList());
    }

    public List<Route> getRoutes(){
        return routes;
    }

}
