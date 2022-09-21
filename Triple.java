import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Triple {

    public int[][] zoneTree;

    public ArrayList<Tuple> accum = new ArrayList<Tuple>();

    public int[] passedZones;

    public int budget;

    public int count;

    public Triple(int[][] zoneTree, int budget) {
        this.zoneTree = zoneTree;
        passedZones = new int[] {};
        this.budget = budget;

        // System.out.println("****************************************");
        // for (int[] xs : zoneTree) {
        // Constants.toString(xs);
        // }
    }

    public Route[] solve() {
        // TODO only the first item's listed available zones are being used
        int[] zoneWeights = new int[15];
        for (int i = 0; i < zoneTree.length; i++) {
            for (int j = 0; j < zoneTree[i].length; j++) {
                zoneWeights[zoneTree[i][j]]++;
            }
        }
        // zoneWeights is now weighted by how many items are found there (not using
        // right now, but useful)
        int c = 0;
        for (int x : zoneWeights) {
            if (x != 0) {
                c++;
            }
        }
        int[] validZones;
        if (c != 15) {
            validZones = new int[c];
            int offset = 0;
            for (int i = 0; i < 15; i++) {
                if (zoneWeights[i] != 0) {
                    validZones[i - offset] = i;
                } else {
                    offset++;
                }
            }
        } else {
            validZones = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
        }

        // TODO the permutator of paths skips the second zone in each candidate list
        while (count < budget) {
            if (count == 0) {
                int i = 0;
                for (int x : validZones) {
                    accum.add(new Tuple(new int[] { x }, Constants.arrayClone(zoneTree)));
                    accum.set(i, accum.get(i).removeZone(x, this));
                    i++;
                }
                count++;
            } else {
                // shorten validZones
                validZones = Arrays.copyOfRange(validZones, 1, validZones.length);
                // add a new zone to every existing path
                ArrayList<Tuple> newAccum = new ArrayList<Tuple>();
                int k = 0;
                for (int i = 0; i < accum.size(); i++) {
                    for (int x : validZones) {
                        if (!(Constants.containsLessThan(accum.get(i).path, x))) {
                            newAccum.add(
                                    new Tuple(Constants.append(accum.get(i).path, x),
                                            Constants.arrayClone(accum.get(i).zoneTree)));
                            newAccum.set(k, newAccum.get(k).removeZone(x, this));
                            k++;
                        }
                    }
                }

                accum = newAccum;
                count++;
            }
        }
        Route[] out = new Route[] {};
        for (Tuple t : accum) {
            if (t.path.length > 0 && t.path.length <= budget) {
                out = Constants.append(out, new Route(Constants.toZoneArray(t.path)));
            }
        }

        return out;
    }

    public String toString() {
        String out = "[\n";
        for (int i = 0; i < accum.size(); i++) {
            out += accum.get(i).toString() + "\n";
        }
        out += "\n]";
        return out;
    }
}
