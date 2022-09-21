import java.util.Arrays;

public class Tuple {
    public int[] path;
    public int[][] zoneTree;

    public Tuple(int[] path, int[][] zoneTree) {
        this.path = path;
        this.zoneTree = zoneTree;
    }

    public Tuple removeZone(int zone, Triple t) {
        for (int j = 0; j < zoneTree.length; j++) {
            if (zoneTree[j].length == 1 && zoneTree[j][0] == zone) {
                zoneTree[j] = new int[] { 255 };
            } else {
                int i = 0;
                for (int x : zoneTree[j]) {
                    if (x == zone) {
                        zoneTree[j] = new int[] {};
                        // if (i == 0) {
                        // zoneTree[j] = Arrays.copyOfRange(zoneTree[j], 1, zoneTree[j].length);
                        // } else if (i == 1) {
                        // if (zoneTree[j].length == 2) {
                        // zoneTree[j] = new int[] { zoneTree[j][0] };
                        // } else {
                        // zoneTree[j] = Constants.append(new int[] { zoneTree[j][0] },
                        // Arrays.copyOfRange(zoneTree[j], 2, zoneTree[j].length));
                        // }
                        // } else {
                        // if (zoneTree[j].length == i + 1) {
                        // zoneTree[j] = Arrays.copyOfRange(zoneTree[j], 0, i);
                        // } else {
                        // zoneTree[j] = Constants.append(Arrays.copyOfRange(zoneTree[j], 0, i),
                        // Arrays.copyOfRange(zoneTree[j], i + 1, zoneTree[j].length));
                        // }
                        // }
                    }
                    i++;
                }
            }
        }
        int i = 0;
        for (int[] z : zoneTree) {
            if (z.length == 0 || z[0] == 255) {
                z = new int[] {};
            }
        }

        // System.out.println("******************");
        // System.out.println("\n{");
        // for(){

        // }
        // System.out.println("}");
        // System.out.println("******************");
        return this;
    }

    public String toString() {
        String accum = "path: {";
        for (int i = 0; i < path.length; i++) {
            accum += path[i] + ", ";
        }
        accum += "}\n zoneTree: {";
        for (int i = 0; i < zoneTree.length; i++) {
            accum += "\n{";
            if (zoneTree[i].length != 0) {
                for (int j = 0; j < zoneTree[i].length; j++) {
                    accum += zoneTree[i][j] + ", ";
                }

            }
            accum += "}";
        }
        accum += "\n}";
        return accum;
    }
}
