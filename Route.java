public class Route {

    public Zone[] zones;

    public Route(Zone[] zones) {
        this.zones = zones;
    }

    public Route() {
        this.zones = new Zone[] {};
    }

    public Route(Zone a) {
        this.zones = new Zone[] { a };
    }

    public Route(Zone a, Zone b) {
        this.zones = new Zone[] { a, b };
    }

    public Route(Zone a, Zone b, Zone c) {
        this.zones = new Zone[] { a, b, c };
    }

    public Route(Zone a, Zone b, Zone c, Zone d) {
        this.zones = new Zone[] { a, b, c, d };
    }

    public Route(Zone a, Zone b, Zone c, Zone d, Zone e) {
        this.zones = new Zone[] { a, b, c, d, e };
    }

    public Route(Zone a, Zone b, Zone c, Zone d, Zone e, Zone f) {
        this.zones = new Zone[] { a, b, c, d, e, f };
    }

    // TODO add more constructors and remove array constructor

    public void add(Zone z) {
        Zone[] t = new Zone[zones.length + 1];
        for (int i = 0; i < zones.length; i++) {
            t[i] = zones[i];
        }
        t[zones.length] = z;
        zones = t;
    }

}