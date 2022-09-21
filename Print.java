public class Print {

    public static void main(String[] args) {
        int[][] itemZones = new int[80][];
        for (int i = 0; i < 80; i++) {
            int[] a = new int[] {};
            int j = 0;
            for (Zone z : Constants.ZONES) {
                for (int k = 0; k < z.components.length; k++) {
                    if (i != 0 && i != 3 && i != 4 && i != 9) {
                        if (((int) z.components[k]) == i) {
                            a = Constants.append(a, new int[] { j });
                        }
                    } else {
                        a = new int[] { 255, 255, 255 };
                    }
                }
                j++;
            }
            itemZones[i] = a;
        }

        System.out.println("public static final int[][] ITEM_ZONES = new int[][]{");

        for (int[] carr : itemZones) {
            System.out.print("\t\t{");
            System.out.print(toString(carr));
            System.out.print("},\n");
        }

        System.out.println("};");

    }

    static String toString(int[] c) {
        if (c == null) {
            return "";
        }
        String temp = "";
        int i;
        for (i = 0; i < c.length - 1; i++) {
            temp += ((int) c[i]) + ", ";
        }
        if (i > 0) {
            temp += ((int) c[i]);
        }
        return temp;
    }
}
