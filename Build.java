import java.io.Serializable;
import java.util.Arrays;

public class Build implements Serializable {

    private static final long serialVersionUID = 8966323675558624557L;

    public Item spear;
    public Item head;
    public Item chest;
    public Item arm;
    public Item leg;
    public Item accessory;

    public char[] componentsList;

    public double[] statsList = new double[26];

    public char[] specialsList;

    public final int[] levels = new int[] { 9, 13, 17 };

    public final int[] enemyArmors = new int[] { 40, 80, 120 };

    public double attack;
    public double defense;
    public double attackSpeed;
    public double mobility;
    public double clearSpeed;

    public Build(Item spear, Item head, Item chest, Item arm, Item leg, Item accessory) {
        this.spear = spear;
        this.head = head;
        this.chest = chest;
        this.arm = arm;
        this.leg = leg;
        this.accessory = accessory;

        for (int i = 0; i < 26; i++) {
            statsList[i] = spear.stats[i] + head.stats[i] + chest.stats[i] + arm.stats[i] + leg.stats[i]
                    + accessory.stats[i];
        }

        specialsList = Constants.append(spear.specials, Constants.append(head.specials,
                Constants.append(chest.specials,
                        Constants.append(arm.specials, Constants.append(leg.specials, accessory.specials)))));
        componentsList = Constants.append(spear.components,
                Constants.append(head.components, Constants.append(chest.components,
                        Constants.append(arm.components, Constants.append(leg.components, accessory.components)))));

        componentsList = clearDupes(componentsList);
        // System.out.println("****************************************");
        // for (char x : componentsList) {
        // System.out.println(Constants.DICTIONARY[(int) x]);
        // }

        // attack = calculateAttack();
        // defense = calculateDefense();
        // attackSpeed = calculateAttackSpeed();
        // mobility = calculateMobility();
        // clearSpeed = calculateClearSpeed();
    }

    public double calculateAttack() {

        // TODO make this more realistic (currently going based on the stats that the
        // saved plans system uses)

        return 0;
    }

    public double calculateDefense() {

        // TODO make this more realistic (currently going based on the stats that the
        // saved plans system uses)
        return 0;
    }

    public double calculateAttackSpeed() {

        // TODO make this more realistic (currently going based on the stats that the
        // saved plans system uses)
        return 0;
    }

    public double calculateMobility() {

        // TODO make this more realistic (currently going based on the stats that the
        // saved plans system uses)
        calculateAttackSpeed();
        return 0;
    }

    public double calculateClearSpeed() {

        int[] buckets = new int[79];

        // TODO make this more realistic (currently going based on the stats that the
        // saved plans system uses)
        return 0;
    }

    public static char[] clearDupes(char[] a) {
        char[] b = new char[] {};
        boolean dupe = false;
        for (char x : a) {

            for (char n : b) {
                if (n == x) {
                    dupe = true;
                }
            }
            if (!dupe) {
                b = Constants.append(b, x);
            }
            dupe = false;
        }
        return b;
    }

}
