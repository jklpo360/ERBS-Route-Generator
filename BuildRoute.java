import java.io.Serializable;

public class BuildRoute implements Serializable {

    private static final long serialVersionUID = 5229166763981943735L;

    public Route route;
    public Build build;

    public BuildRoute(Route route, Build build) {
        this.route = route;
        this.build = build;
    }

}
