import java.io.Serializable;

public class Item implements Serializable {

    private static final long serialVersionUID = 5229166763981943735L;

    String name;

    // 1 public double ap; //Attack Power
    // 2 public double as; //Attack Speed
    // 3 public double critC; //Critical Strike Chance
    // 4 public double critD; //Critical Strike Damage
    // 5 public double sa; //Skill Amplification
    // 6 public double def; //Defense
    // 7 public double ms; //Movement Speed
    // 8 public double cdr; //Cooldown Reduction
    // 9 public double ba; //Basic Attack Amplification
    // 10 public double vis; //Vision Range
    // 11 public double cR; //Critical Strike Damage Reduction
    // 12 public double bR; //Basic Attack Damage Reduction
    // 13 public double sR; //Skill Damage Reduction
    // 14 public double pen; //Armor Penetration
    // 15 public double hp; //Max HP
    // 16 public double hpR; //HP Regeneration (percentage)
    // 17 public double range; //Attack Range
    // 18 public double tenacity; //Tenacity
    // 19 public double omni; //Omnisyphon
    // 20 public double steal; //Lifesteal
    // 21 public double sp; //Max SP
    // 22 public double fspr; //SP Regeneration (flat)
    // 23 public double pspr; //SP Regeneration (percentage)
    // 24 public double appl; //Attack Power Per Level
    // 25 public double sapl; //Skill Amplification Per Level
    // 26 public double hppl; //Max HP Per Leve
    public double[] stats;

    /**
     * Character mappings for special traits:
     * 
     * (char)018'r': Reflection (damage and heal cut)
     * (char)003'c': 40% heal cut
     * (char)023'w': Smooth Walker
     * (char)019's': Swift Strides
     * (char)012'l': lifeline: shield and skill amp boost
     * (char)009'i': CDR cap increase (5%)
     * (char)045'I': CDR cap increase (10%)
     * (char)008'h': Healing Power increase (15%)
     * (char)020't': Trap Damage Reduction (10%)
     * (char)016'p': Primordial Hex
     * (char)002'b': Blessing: Calm Mind
     * (char)010'm': 150% sp regen
     * (char)030'w': 0.02 MS
     * (char)031'x': 0.04 MS
     * (char)032'y': 0.06 MS
     * (char)033'z': 0.08 MS
     * 
     */

    public char[] specials;

    /**
     * Character mappings for component items: (79 in total)
     * 
     * (char)001'a': Fountain Pen
     * (char)002'b': Pickaxe
     * (char)003'c': Branch
     * (char)004'd': Stone
     * (char)005'e': Glass Bottle
     * (char)006'f': Chalk
     * (char)007'g': Flower
     * (char)008'h': Nail
     * (char)009'i': Leather
     * (char)010'j': Turtle Shell
     * (char)011'k': Rubber
     * (char)012'l': Scrap Metal
     * (char)013'm': Lighter
     * (char)014'n': Laser Pointer
     * (char)015'o': Stallion Medal
     * (char)016'p': Battery
     * (char)017'q': Alcohol
     * (char)018'r': Oil
     * (char)019's': Cloth
     * (char)020't': Gemstone
     * (char)021'u': Glue
     * (char)022'v': Paper
     * (char)023'w': Iron Ore
     * (char)024'x': Can
     * (char)025'y': Gunpowder
     * (char)026'z': Piano Wire
     * (char)027'1': Feather
     * (char)028'2': Bamboo
     * (char)029'3': Carbonated Water
     * (char)030'4': Kitchen Knife
     * (char)031'5': Short Spear
     * (char)032'6': Hatchet
     * (char)033'7': Fan
     * (char)034'8': Hammer
     * (char)035'9': Playing Cards
     * (char)036'0': Hairband
     * (char)037'A': Hat
     * (char)038'B': Scissors
     * (char)039'C': Bike Helmet
     * (char)040'D': Steel Chain
     * (char)041'E': Mousetrap
     * (char)042'F': Cross (char) 79,
     * (char)043'G': Bandage
     * (char)044'H': Fabric Armor
     * (char)045'I': Wetsuit
     * (char)046'J': Windbreaker
     * (char)047'K': Holy Grail
     * (char)048'L': Razor
     * (char)049'M': Monk's Robe
     * (char)050'N': Ribbon
     * (char)051'O': Short Rod
     * (char)052'P': Ice
     * (char)053'Q': Cotton Gloves
     * (char)054'R': Bracelet
     * (char)055'S': Needle
     * (char)056'T': Watch
     * (char)057'U': Oriental Herb
     * (char)058'V': Running Shoes
     * (char)059'W': Iron Ball
     * (char)060'X': Slippers
     * (char)061'Y': Tights
     * (char)062'Z': Box
     * (char)063'+': Rusty Sword
     * (char)064'-': Walther PPK
     * (char)065'!': Short Crossbow
     * (char)066'_': Fedorova
     * (char)067'.': Binoculars
     * (char)068'@': Buddhist Scripture
     * (char)069':': Snare
     * (char)070'#': Ramen
     * (char)071'$': Coffee
     * (char)072'%': Egg
     * (char)073'*': Lemon
     * (char)074'?': Chocolate
     * (char)075'/': Whiskey
     * (char)076'`': Garlic
     * (char)077'~': Honey
     * (char)078'|': Guitar
     * (char)079'>': Milk
     * (char)080'^':
     * (char)081'&':
     * (char)082'<':
     */

    public char[] components;

    public Item(String name, double[] stats, char[] specials, char[] components) {
        this.name = name;
        this.stats = stats;
        this.specials = specials;
        this.components = components;
    }

}
