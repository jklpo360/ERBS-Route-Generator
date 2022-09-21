import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Setup {

    public static void main(String args[]) {
        // Item[] spears = Constants.SPEARS;
        // Item[] heads = Constants.HEADS;
        // Item[] chests = Constants.CHESTS;
        // Item[] arms = Constants.ARMS;
        // Item[] legs = Constants.LEGS;
        // Item[] accessories = Constants.ACCESSORIES;

        // Item[] spears = new Item[] { Constants.SPEARS[0] };

        // for (Item s : spears) {
        // System.out.println(s.name + " " + s.stats.length + " " + s.specials.length);
        // }

        Item[] heads = new Item[] { Constants.HEADS[1], Constants.HEADS[3] };

        // for (Item h : heads) {
        // System.out.println(h.name + " " + h.stats.length + " " + h.specials.length);
        // }

        Item[] chests = new Item[] { Constants.CHESTS[9], Constants.CHESTS[11],
                Constants.CHESTS[13] };

        // for (Item c : chests) {
        // System.out.println(c.name + " " + c.stats.length + " " + c.specials.length);
        // }

        Item[] arms = new Item[] { Constants.ARMS[8], Constants.ARMS[10] };

        // for (Item a : arms) {
        // System.out.println(a.name + " " + a.stats.length + " " + a.specials.length);
        // }

        Item[] legs = new Item[] { Constants.LEGS[0], Constants.LEGS[3],
                Constants.LEGS[5] };

        // for (Item l : legs) {
        // System.out.println(l.name + " " + l.stats.length + " " + l.specials.length);
        // }

        Item[] accessories = new Item[] { Constants.ACCESSORIES[3], Constants.ACCESSORIES[8],
                Constants.ACCESSORIES[12] };

        System.out.println("****************************************************");
        // for (Item a : accessories) {
        // System.out.println(a.name + " " + a.stats.length + " " + a.specials.length);
        // }

        // Zone[] zones = Zones.getZones();

        // for (Zone z : zones) {
        // System.out.println(z.name + " " + z.components.length);
        // }
        // Build[] list = new Build[689920];
        // System.out.println(spears.length);
        // System.out.println(heads.length);
        // System.out.println(chests.length);
        // System.out.println(arms.length);
        // System.out.println(legs.length);
        // System.out.println(accessories.length);

        // Build[] potentialBuilds = new Build[8 * 14];

        // Build temp;

        // // for (Item l : legs) {
        // // for (Item a : accessories) {

        // Build cur = new Build(spears[0], heads[2], chests[13], arms[10], legs[3],
        // accessories[3]);
        // System.out.println(System.getProperty("user.dir") + "\\BuildList.txt");
        // FileOutputStream out;
        // ObjectOutputStream objOut;
        // try {
        // out = new FileOutputStream("DronedRoutedBuildList.txt");
        // objOut = new ObjectOutputStream(out);
        // } catch (FileNotFoundException e) {
        // e.printStackTrace();
        // System.out.println(e.getCause());
        // out = null;
        // objOut = null;
        // } catch (IOException e) {
        // e.printStackTrace();
        // System.out.println(e.getCause());
        // out = null;
        // objOut = null;
        // }
        // for (Item s : spears) {
        Item s = Constants.SPEARS[0];
        for (Item h : heads) {
            for (Item c : chests) {
                for (Item a : arms) {
                    for (Item l : legs) {
                        for (Item y : accessories) {
                            Build cur = new Build(s, h, c, a, l, y);

                            // Build crit = new Build(spears[0], heads[1], chests[2], arms[10], legs[0],
                            // accessories[3]);

                            Router r = new Router(cur);

                            Route[] paths = r.makeNZonePaths(4);

                            paths = Constants.removeDupeZones(paths);
                            boolean done = false;
                            for (Route route : paths) {
                                if (r.validRoute(route) < 2) {
                                    if (!done) {
                                        // try {
                                        // objOut.writeObject(
                                        // "(s: " + cur.spear.name + ", h: " + cur.head.name + ", c: "
                                        // +
                                        // cur.chest.name + ", a: "
                                        // + cur.arm.name + ", l: " + cur.leg.name + ", y: "
                                        // + cur.accessory.name
                                        // + ",len: "
                                        // + cur.componentsList.length + ")\n");
                                        // } catch (IOException e) {
                                        // e.printStackTrace();
                                        // System.out.println(e.getCause());
                                        // }

                                        System.out
                                                .println("(s: " + cur.spear.name + ", h: " + cur.head.name + ", c: "
                                                        +
                                                        cur.chest.name + ", a: "
                                                        + cur.arm.name + ", l: " + cur.leg.name + ", y: "
                                                        + cur.accessory.name
                                                        + ",len: "
                                                        + cur.componentsList.length + ")");
                                        done = true;
                                    }

                                    for (Zone z : route.zones) {
                                        // try {
                                        // objOut.writeObject(z.name + ", ");
                                        // } catch (IOException e) {
                                        // e.printStackTrace();
                                        // System.out.println(e.getCause());
                                        // }
                                        System.out.print(z.name + ", ");
                                    }

                                    System.out.print("\n");
                                }
                            }
                            System.out.print("\n");
                        }
                    }
                }
            }
            // }
        }

        // Build cur2 = new Build(spears[0], heads[2], chests[8], arms[10], legs[3],
        // accessories[8]);

        // // Build crit = new Build(spears[0], heads[1], chests[2], arms[10], legs[0],
        // // accessories[3]);
        // System.out
        // .println("(s: " + cur2.spear.name + ", h: " + cur2.head.name + ", c: " +
        // cur2.chest.name + ", a: "
        // + cur2.arm.name + ", l: " + cur2.leg.name + ", a: " + cur2.accessory.name +
        // ", len: "
        // + cur2.componentsList.length + ")");

        // r = new Router(cur2);

        // paths = r.makeNZonePaths(4);

        // paths = Constants.removeDupeZones(paths);

        // for (Route route : paths) {
        // if (r.validRoute(route) < 2) {
        // for (Zone z : route.zones) {
        // System.out.print(z.name + ", ");
        // }

        // System.out.print("\n");
        // }
        // }
        // *********************************************************************************************************************
        // */
        // Route[] makeOneZonePaths = r.makeOneZonePaths();
        // Route[] makeTwoZonePaths = r.makeTwoZonePaths();
        // Route[] makeThreeZonePaths = r.makeThreeZonePaths();
        // Route[] makeFourZonePaths = r.makeFourZonePaths();
        // Route[] makeFiveZonePaths = r.makeFiveZonePaths();

        // System.out.println(makeOneZonePaths.length);
        // System.out.println(makeTwoZonePaths.length);
        // System.out.println(makeThreeZonePaths.length);
        // System.out.println(makeFourZonePaths.length);
        // System.out.println(makeFiveZonePaths.length);

        // if (makeOneZonePaths.length == 0) {
        // if (makeTwoZonePaths.length == 0) {
        // if (makeThreeZonePaths.length == 0) {
        // if (makeFourZonePaths.length == 0) {
        // if (makeFiveZonePaths.length == 0) {
        // System.out.println("no paths");
        // } else {
        // for (Route route : makeFiveZonePaths) {
        // System.out.println(
        // route.zones[0].name + ", " + route.zones[1].name + ", "
        // + route.zones[2].name
        // + ", " + route.zones[3].name + ", " + route.zones[4].name);
        // }
        // }

        // } else {
        // for (Route route : makeFourZonePaths) {
        // System.out.println(route.zones[0].name + ", " + route.zones[1].name + ", "
        // + route.zones[2].name + ", " + route.zones[3].name);
        // }
        // }

        // } else {
        // for (Route route : makeThreeZonePaths) {
        // System.out
        // .println(route.zones[0].name + ", " + route.zones[1].name + ", "
        // + route.zones[3].name);
        // }
        // }

        // } else {
        // for (Route route : makeTwoZonePaths) {
        // System.out.println(route.zones[0].name + ", " + route.zones[1].name);
        // }
        // }
        // System.out.println();
        // } else {
        // System.out.println(makeOneZonePaths[0].zones[0].name);
        // }
        // }
        // }

        // accessories[4]);

        // Build[] list = new Build[758912];

        // Builder.build(spears, heads, chests, arms, legs, accessories);
        // System.out.println(System.getProperty("user.dir") + "\\BuildList.txt");
        // try {
        // FileInputStream in = new FileInputStream("BuildList.txt");
        // ObjectInputStream objIn = new ObjectInputStream(in);
        // for (int i = 0; i < 689920; i++) {
        // list[i] = (Build) objIn.readObject();
        // }
        // objIn.close();
        // } catch (FileNotFoundException e) {
        // e.printStackTrace();
        // System.out.println(e.getCause());
        // } catch (IOException e) {
        // e.printStackTrace();
        // System.out.println(e.getCause());
        // } catch (ClassNotFoundException e) {
        // e.printStackTrace();
        // System.out.println(e.getCause());
        // }
        // System.out.println(list[10000].arm.name);
    }

}