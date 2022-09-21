public class Combo {

    public final int ap = 0; // Attack Power
    public final int as = 1; // Attack Speed
    public final int critC = 2; // Critical Strike Chance
    public final int critD = 3; // Critical Strike Damage
    public final int sa = 4; // Skill Amplification
    public final int def = 5; // Defense
    public final int ms = 6; // Movement Speed
    public final int cdr = 7; // Cooldown Reduction
    public final int ba = 8; // Basic Attack Amplification
    public final int vis = 9; // Vision Range
    public final int cR = 10; // Critical Strike Damage Reduction
    public final int bR = 11; // Basic Attack Damage Reduction
    public final int sR = 12; // Skill Damage Reduction
    public final int pen = 13; // Armor Penetration
    public final int hp = 14; // Max HP
    public final int hpR = 15; // HP Regeneration (percentage)
    public final int range = 16; // Attack Range
    public final int tenacity = 17; // Tenacity
    public final int omni = 18; // Omnisyphon
    public final int steal = 19; // Lifesteal
    public final int sp = 20; // Max SP
    public final int fspr = 21; // SP Regeneration (flat)
    public final int pspr = 22; // SP Regeneration (percentage)
    public final int appl = 23; // Attack Power Per Level
    public final int sapl = 24; // Skill Amplification Per Level
    public final int hppl = 25; // Max HP Per Level

    public int level;
    public int tLevel;
    public int qLevel;
    public int wLevel;
    public int eLevel;
    public int rLevel;
    public int enemyArmor;

    public Combo(int level, int tLevel, int qLevel, int wLevel, int eLevel, int rLevel, int weaponLevel, int enemyArmor,
            FelixBuild build) {
        this.level = level;
        this.tLevel = tLevel;
        this.qLevel = qLevel;
        this.wLevel = wLevel;
        this.eLevel = eLevel;
        this.rLevel = rLevel;
        this.enemyArmor = enemyArmor;
    }

    public double aADmg() {
        return sp * (1 + ba);
    }

    public double TDmg() {
        if (tLevel == 1) {
            return ap * .45;
        } else if (tLevel == 2) {
            return ap * .5;
        } else {
            return ap * .4;
        }
    }

    // public double qDmg() {
    // return ((30 + (25 * qLevel)) + (ap * .45) + (sa * .30)) * weaponLevel;
    // }

    // public double empQDmg() {

    // }

    // public double WDmg() {

    // }

    // public double empWDmg() {

    // }

    // public double EDmg() {

    // }

    // public double empEDmg() {

    // }

    // public double minRDmg() {

    // }

    // public double maxRDmg() {

    // }

    // public double spearSkillDmg(boolean lvl2) {
    // // TODO Verify in-game
    // if (lvl2) {
    // return (statsList[ap] * 2.5) + (statsList[sa] * .20);
    // }
    // return (statsList[ap] * 1.5) + (statsList[sa] * .20);
    // }

}
