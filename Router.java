import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.nio.file.Path;

public class Router {

    public Build build;

    public char[] targetsList;

    public Router(Build build) {
        this.build = build;
        targetsList = clearGatherables(build.componentsList);

    }

    public Route[] makeNZonePaths(int n) {
        int[][] itemZones = Constants.ITEM_ZONES;
        int[][] zoneTree = new int[targetsList.length][];

        Route[] out = new Route[] {};

        int k = 0;
        for (char c : targetsList) {
            zoneTree[k] = itemZones[((int) c)];
            k++;
        }

        Triple engine = new Triple(zoneTree, n);

        out = engine.solve();

        return out;
    }

    public static char[] append(char[] a, char[] b) {
        char[] c = Arrays.copyOf(a, a.length + b.length);
        int i = 0;
        for (char x : b) {
            c[a.length + i] = b[i];
            i++;
        }
        return c;
    }

    public static <T> T[] append(T[] a, T[] b) {
        T[] c = Arrays.copyOf(a, a.length + b.length);
        int i = 0;
        for (T x : b) {
            c[a.length + i] = b[i];
            i++;
        }
        return c;
    }

    public static <T> T[] subArray(T[] array, int beg, int end) {
        return Arrays.copyOfRange(array, beg, end + 1);
    }

    public static char[] clearGatherables(char[] a) {
        char[] b = new char[] {};
        // System.out.println("**********************************************");
        for (char c : a) {
            // System.out.println(Constants.DICTIONARY[(int) c]);
            if (c != (char) 9 && c != (char) 4 && c != (char) 3) {
                b = append(b, new char[] { c });
            }
        }

        return b;
    }

    int validRoute(Route route) {
        int[] routeItems = new int[80];
        int[] buildItems = new int[80];
        int bcount = 0;

        for (Zone z : route.zones) {
            for (char c : z.components) {
                routeItems[(int) c]++;
            }
        }
        for (char c : targetsList) {
            buildItems[(int) c]++;
            bcount++;
        }

        int count = 0;

        for (int i = 1; i < buildItems.length; i++) {
            if (buildItems[i] != 0 && routeItems[i] != 0) {
                count++;
            }
        }

        return bcount - count;
    }
}

// public Route[] makeOneZonePaths() {
// for (Zone z : Constants.ZONES) {
// Route temp = new Route(z);
// if (validRoute(temp) < 2) {
// return new Route[] { temp };
// }
// }
// return null;
// }

// public Route[] makeTwoZonePaths() {
// Route[] accum = new Route[] {};
// for (Zone z : Constants.ZONES) {
// for (Zone y : Constants.ZONES) {
// Route temp = new Route(z, y);
// if (validRoute(temp) < 2) {
// append(accum, new Route[] { temp });
// }
// }
// }
// return accum;
// }

// public Route[] makeThreeZonePaths() {
// Route[] accum = new Route[] {};
// for (Zone z : Constants.ZONES) {
// for (Zone y : Constants.ZONES) {
// for (Zone x : Constants.ZONES) {
// Route temp = new Route(z, y, x);
// if (validRoute(temp) < 2) {
// append(accum, new Route[] { temp });
// }
// }
// }
// }
// return accum;
// }

// public Route[] makeFourZonePaths() {
// Route[] accum = new Route[] {};
// for (Zone z : Constants.ZONES) {
// for (Zone y : Constants.ZONES) {
// for (Zone x : Constants.ZONES) {
// for (Zone w : Constants.ZONES) {
// Route temp = new Route(z, y, x, w);
// if (validRoute(temp) < 2) {
// append(accum, new Route[] { temp });
// }
// }
// }
// }
// }
// return accum;
// }

// public Route[] makeFiveZonePaths() {
// Route[] accum = new Route[] {};
// for (Zone z : Constants.ZONES) {
// for (Zone y : Constants.ZONES) {
// for (Zone x : Constants.ZONES) {
// for (Zone w : Constants.ZONES) {
// for (Zone v : Constants.ZONES) {
// Route temp = new Route(z, y, x, w, v);
// if (validRoute(temp) < 2) {
// append(accum, new Route[] { temp });
// }
// }
// }
// }
// }
// }
// return accum;
// }