
public class FelixBuild extends Build {
    // Base Stats
    public final double ATTACK_POWER = 26; // Attack Power
    public final double ATTACK_SPEED = .14; // Attack Speed
    public final double CRIT_CHANCE = 0; // Critical Strike Chance
    public final double CRIT_DMG = 1.70; // Critical Strike Damage
    public final double SKILL_AMP = 0; // Skill Amplification
    public final double DEFENSE = 32; // Defense
    public final double MOVE_SPEED = 3.46; // Movement Speed
    public final double BAT_AMP = 0; // Basic Attack Amplification
    public final double VISION_RANGE = 5.7; // Vision Range
    public final double CRIT_REDUC = 0; // Critical Strike Damage Reduction
    public final double BAT_REDUC = .01; // Basic Attack Damage Reduction
    public final double SKILL_REDUC = .04; // Skill Damage Reduction
    public final double ARMOR_PEN = 0; // Armor Penetration
    public final double MAX_HP = 770; // Max HP
    public final double FLAT_HP_REGEN = 1.6; // HP Regeneration (percentage) (per.5 seconds)
    public final double PERCENTAGE_HP_REGEN = 0; // HP Regeneration (percentage)
    public final double ATTACK_RANGE = 2.6; // Attack Range
    public final double TENACITY = 0; // Tenacity
    public final double OMNISYPHON = 0; // Omnisyphon
    public final double LIFE_STEAL = 0; // Lifesteal
    public final double MAX_SP = 430; // Max SP
    public final double FLAT_SP_REGEN = 1.6; // SP Regeneration (flat) (per.5 seconds)
    public final double PECENTAGE_SP_REGEN = 0; // SP Regeneration (percentage)

    // Weapon Masteries
    public final double AS_PER_LEVEL = 3.0;
    public final double BAT_AMP_PER_LEVEL = .024;
    public final double SKILL_AMP_PERCENT_PER_LEVEL = 3.8;

    public FelixBuild(Item spear, Item helm, Item chest, Item arm, Item leg, Item accessory) {
        super(spear, helm, chest, arm, leg, accessory);
    }
}
