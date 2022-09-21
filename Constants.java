import java.util.Arrays;

public class Constants {
        public static final Zone[] ZONES = new Zone[] {
                        /* 00 */new Zone("Dock",
                                        new char[] { (char) 5, (char) 10, (char) 11, (char) 12, (char) 13,
                                                        (char) 16, (char) 30, (char) 43, (char) 45, (char) 51,
                                                        (char) 60, (char) 62, (char) 63, (char) 69, (char) 70,
                                                        (char) 71, }),
                        /* 01 */new Zone("Pond",
                                        new char[] { (char) 2, (char) 7, (char) 10, (char) 20, (char) 28,
                                                        (char) 31, (char) 32, (char) 34, (char) 37, (char) 39,
                                                        (char) 41, (char) 50, (char) 51, (char) 54, (char) 57,
                                                        (char) 62, (char) 69, }),
                        /* 02 */new Zone("Beach",
                                        new char[] { (char) 2, (char) 5, (char) 10, (char) 15, (char) 20, (char) 24,
                                                        (char) 26, (char) 29, (char) 32, (char) 34, (char) 39,
                                                        (char) 40, (char) 41, (char) 45, (char) 64, (char) 67,
                                                        (char) 69, }),
                        /* 03 */new Zone("Uptown",
                                        new char[] { (char) 1, (char) 7, (char) 14, (char) 18, (char) 26, (char) 29,
                                                        (char) 36, (char) 46, (char) 50, (char) 54, (char) 56,
                                                        (char) 58, (char) 66, (char) 71, (char) 73, (char) 74,
                                                        (char) 75, }),
                        /* 04 */new Zone("Alley",
                                        new char[] { (char) 11, (char) 13, (char) 15, (char) 21, (char) 34,
                                                        (char) 38, (char) 40, (char) 42, (char) 43, (char) 45,
                                                        (char) 54, (char) 55, (char) 58, (char) 67, (char) 76,
                                                        (char) 77, }),
                        /* 05 */new Zone("Hotel",
                                        new char[] { (char) 12, (char) 19, (char) 16, (char) 23, (char) 26, (char) 29,
                                                        (char) 30, (char) 35, (char) 46, (char) 52, (char) 53,
                                                        (char) 55, (char) 56, (char) 64, (char) 66, (char) 67,
                                                        (char) 73, (char) 75, (char) 78, }),
                        /* 06 */new Zone("Avenue",
                                        new char[] { (char) 1, (char) 5, (char) 8, (char) 16, (char) 18, (char) 19,
                                                        (char) 24, (char) 33, (char) 35, (char) 36, (char) 56,
                                                        (char) 60, (char) 61, (char) 74, (char) 77, (char) 79, }),
                        /* 07 */new Zone("Hospital",
                                        new char[] { (char) 12, (char) 14, (char) 17, (char) 21, (char) 38, (char) 43,
                                                        (char) 48, (char) 52, (char) 53, (char) 55, (char) 61,
                                                        (char) 73, (char) 79, }),
                        /* 08 */new Zone("Temple",
                                        new char[] { (char) 15, (char) 19, (char) 20, (char) 22, (char) 25, (char) 27,
                                                        (char) 28, (char) 30, (char) 31, (char) 36, (char) 44,
                                                        (char) 49, (char) 57, (char) 68, (char) 70, (char) 76, }),
                        /* 09 */new Zone("Archery Range",
                                        new char[] { (char) 8, (char) 11, (char) 18, (char) 22, (char) 25,
                                                        (char) 28, (char) 37, (char) 44, (char) 49, (char) 58,
                                                        (char) 59, (char) 63, (char) 69, (char) 74, }),
                        /* 10 */new Zone("Cemetery",
                                        new char[] { (char) 2, (char) 7, (char) 23, (char) 25, (char) 27, (char) 28,
                                                        (char) 36, (char) 40, (char) 41, (char) 44, (char) 52,
                                                        (char) 71, (char) 72, (char) 76, }),
                        /* 11 */new Zone("Forest",
                                        new char[] { (char) 2, (char) 7, (char) 20, (char) 23, (char) 27, (char) 28,
                                                        (char) 31, (char) 33, (char) 44, (char) 57, (char) 59,
                                                        (char) 61, (char) 65, (char) 69, (char) 72, (char) 77, }),
                        /* 12 */new Zone("Factory",
                                        new char[] { (char) 6, (char) 8, (char) 12, (char) 13, (char) 16, (char) 17,
                                                        (char) 18, (char) 21, (char) 32, (char) 59, (char) 64,
                                                        (char) 66, (char) 67, (char) 70, }),
                        /* 13 */new Zone("Chapel",
                                        new char[] { (char) 5, (char) 6, (char) 22, (char) 26, (char) 33, (char) 39,
                                                        (char) 42, (char) 47, (char) 48, (char) 51, (char) 62,
                                                        (char) 63, (char) 65, (char) 75, (char) 78, (char) 79, }),
                        /* 14 */new Zone("School",
                                        new char[] { (char) 1, (char) 6, (char) 13, (char) 14, (char) 17, (char) 24,
                                                        (char) 37, (char) 38, (char) 39, (char) 43, (char) 46,
                                                        (char) 48, (char) 50, (char) 60, (char) 79, })
        };

        public static final int[][] ITEM_ZONES = new int[][] {
                        {}, // 0
                        { 3, 6, 14 }, // 1
                        { 1, 2, 10, 11 }, // 2
                        {}, // 3
                        {}, // 4
                        { 0, 2, 6, 13 }, // 5
                        { 12, 13, 14 }, // 6
                        { 1, 3, 10, 11 }, // 7
                        { 6, 9, 12 }, //// 8
                        {}, // 9
                        { 0, 1, 2 }, // 10
                        { 0, 4, 9 }, // 11
                        { 0, 5, 7, 12 }, // 12
                        { 0, 4, 12, 14 }, // 13
                        { 3, 7, 14 }, // 14
                        { 2, 4, 8 }, // 15
                        { 0, 5, 6, 12 }, // 16
                        { 7, 12, 14 }, // 17
                        { 3, 6, 9, 12 }, // 18
                        { 5, 6, 8 }, // 19
                        { 1, 2, 8, 11 }, // 20
                        { 4, 7, 12 }, // 21
                        { 8, 9, 13 }, // 22
                        { 5, 10, 11 }, // 23
                        { 2, 6, 14 }, // 24
                        { 8, 9, 10 }, // 25
                        { 2, 3, 5, 13 }, // 26
                        { 8, 10, 11 }, // 27
                        { 1, 8, 9, 10, 11 }, // 28
                        { 2, 3, 5 }, // 29
                        { 0, 5, 8 }, // 30
                        { 1, 8, 11 }, // 31
                        { 1, 2, 12 }, // 32
                        { 6, 11, 13 }, // 33
                        { 1, 2, 4 }, // 34
                        { 5, 6 }, // 35
                        { 3, 6, 8, 10 }, // 36
                        { 1, 9, 14 }, // 37
                        { 4, 7, 14 }, // 38
                        { 1, 2, 13, 14 }, // 39
                        { 2, 4, 10 }, // 40
                        { 1, 2, 10 }, // 41
                        { 4, 13 }, // 42
                        { 0, 4, 7, 14 }, // 43
                        { 8, 9, 10, 11 }, // 44
                        { 0, 2, 4 }, // 45
                        { 3, 5, 14 }, // 46
                        { 13 }, // 47
                        { 7, 13, 14 }, // 48
                        { 8, 9 }, // 49
                        { 1, 3, 14 }, // 50
                        { 0, 1, 13 }, // 51
                        { 5, 7, 10 }, // 52
                        { 5, 7 }, // 53
                        { 1, 3, 4 }, // 54
                        { 4, 5, 7 }, // 55
                        { 3, 5, 6 }, // 56
                        { 1, 8, 11 }, // 57
                        { 3, 4, 9 }, // 58
                        { 9, 11, 12 }, // 59
                        { 0, 6, 14 }, // 60
                        { 6, 7, 11 }, // 61
                        { 0, 1, 13 }, // 62
                        { 0, 9, 13 }, // 63
                        { 2, 5, 12 }, // 64
                        { 11, 13 }, // 65
                        { 3, 5, 12 }, // 66
                        { 2, 4, 5, 12 }, // 67
                        { 8 }, // 68
                        { 0, 1, 2, 9, 11 }, // 69
                        { 0, 8, 12 }, // 70
                        { 0, 3, 10 }, // 71
                        { 10, 11 }, // 72
                        { 3, 5, 7 }, // 73
                        { 3, 6, 9 }, // 74
                        { 3, 5, 13 }, // 75
                        { 4, 8, 10 }, // 76
                        { 4, 6, 11 }, // 77
                        { 5, 13 }, // 78
                        { 6, 7, 13, 14 },// 79
        };

        public static final Item[] SPEARS = new Item[] {
                        new Item("Eighteen Foot Spear", new double[] {
                                        87.0, // 1 ap; //Attack Power
                                        25.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.04, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0], new char[] { (char) 28, (char) 27, (char) 16, (char) 29 }),
                        new Item("Lance of Poseidon", new double[] {
                                        83.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        21.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        5.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 28, (char) 30, (char) 31, (char) 12, (char) 23 }),
                        new Item("Fangtain Huaji", new double[] {
                                        79.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        16.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[] { (char) 3 },
                                        new char[] { (char) 12, (char) 23, (char) 32, (char) 33, (char) 8 }),
                        new Item("Dragon Guandao", new double[] {
                                        98.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        -0.05, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        120.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        5.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 12, (char) 23, (char) 32, (char) 12, (char) 34 })
        };

        public static final Item[] HEADS = new Item[] {
                        new Item("Virtuous Outlaw", new double[] {
                                        22.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.06, // 7 ms; //Movement Speed
                                        12.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[] { (char) 23 },
                                        new char[] { (char) 35, (char) 7, (char) 27, (char) 19 }),
                        new Item("Crystal Tiara", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        23.0, // 3 critC; //Critical Strike Chance
                                        5.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        12.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        400.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0], new char[] { (char) 36, (char) 3, (char) 15, (char) 5, (char) 4 }),
                        new Item("Motorcycle Helmet", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        23.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        40.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        100.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 39, (char) 4, (char) 16, (char) 26, (char) 12 }),
                        new Item("Tactical OPS Helmet", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        23.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        13.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        10.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        115.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 37, (char) 38, (char) 39, (char) 16, (char) 26 }),
                        new Item("Helm of Banneret", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        17.0, // 6 def; //Defense
                                        0.08, // 7 ms; //Movement Speed
                                        6.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        5.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        200.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 37, (char) 40, (char) 36, (char) 27, (char) 11 }),
                        new Item("Imperial Crown", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        50.0, // 5 sa; //Skill Amplification
                                        15.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        10.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 37, (char) 38, (char) 2, (char) 20, (char) 20 }),
                        new Item("Imperial Burgonet", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        50.0, // 5 sa; //Skill Amplification
                                        13.0, // 6 def; //Defense
                                        0.06, // 7 ms; //Movement Speed
                                        6.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        400.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 37, (char) 40, (char) 36, (char) 27, (char) 2,
                                                        (char) 20 }),
                        new Item("Mohawk Headgear", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        200.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        50.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[] { (char) 18 },
                                        new char[] { (char) 39, (char) 4, (char) 13, (char) 8, (char) 41 }),
                        new Item("Vigilante", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        7.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        175.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        50.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 39, (char) 4, (char) 13, (char) 23 }),
                        new Item("Diadem", new double[] {
                                        15.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        15.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        12.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        270.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 36, (char) 3, (char) 7, (char) 26, (char) 34 }),
                        new Item("Crusader Helmet", new double[] {
                                        5.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        20.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[] { (char) 12 },
                                        new char[] { (char) 37, (char) 38, (char) 2, (char) 20, (char) 42 })
        };

        public static final Item[] CHESTS = new Item[] {
                        new Item("Cardinal Robes", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        35.0, // 5 sa; //Skill Amplification
                                        9.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        130.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        50.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0], new char[] { (char) 42, (char) 19, (char) 18, (char) 43 }),
                        new Item("Sunset Armor", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        22.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        1.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        170.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 44, (char) 9, (char) 40, (char) 20, (char) 34 }),
                        new Item("Optical Camouflage Suit", new double[] {
                                        18.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        24.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        10.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 45, (char) 11, (char) 5, (char) 4, (char) 21 }),
                        new Item("Rocker's Jacket", new double[] {
                                        22.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        9.0, // 6 def; //Defense
                                        0.08, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[] { (char) 3 },
                                        new char[] { (char) 46, (char) 9, (char) 40, (char) 24, (char) 59 }),
                        new Item("Crusader Armor", new double[] {
                                        15.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        21.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        50.0, // 15 hp; //Max HP
                                        75.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 44, (char) 23, (char) 12, (char) 42, (char) 47 }),
                        new Item("Amazoness Armor", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        17.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        6.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        105.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 44, (char) 23, (char) 12, (char) 45, (char) 38 }),
                        new Item("Dragon Dobok", new double[] {
                                        25.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        9.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        12.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        100.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 19, (char) 38, (char) 48, (char) 49, (char) 10 }),
                        new Item("Commander's Armor", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        55.0, // 5 sa; //Skill Amplification
                                        20.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 44, (char) 9, (char) 40, (char) 20, (char) 2 }),
                        new Item("Butler's Suit", new double[] {
                                        27.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.08, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        18.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 46, (char) 9, (char) 50, (char) 51, (char) 27 }),
                        new Item("Battle Suit", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        20.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        5.0, // 12 bR; //Basic Attack Damage Reduction
                                        4.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        70.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 46, (char) 3, (char) 12, (char) 34, (char) 45, (char) 11 }),
                        new Item("EOD Suit", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        25.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        10.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        115.0, // 15 hp; //Max HP
                                        60.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 46, (char) 3, (char) 12, (char) 34, (char) 49, (char) 43 }),
                        new Item("Tuxedo", new double[] {
                                        20.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        10.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        12.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 46, (char) 9, (char) 50, (char) 19, (char) 38 }),
                        new Item("High Priest Robes", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        17.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        15.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        50.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        85.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[] { (char) 9 },
                                        new char[] { (char) 49, (char) 43, (char) 7, (char) 13, (char) 52 }),
                        new Item("Changpao", new double[] {
                                        12.0, // 1 ap; //Attack Power
                                        33.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        9.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        2.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 19, (char) 38, (char) 48, (char) 17, (char) 5, (char) 7 })
        };

        public static final Item[] ARMS = new Item[] {
                        new Item("Corrupting Touch", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        40.0, // 5 sa; //Skill Amplification
                                        13.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[] { (char) 3 },
                                        new char[] { (char) 53, (char) 22, (char) 13 }),
                        new Item("Sword Stopper", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        17.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        5.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[] { (char) 18 },
                                        new char[] { (char) 43, (char) 9, (char) 12, (char) 34, (char) 8 }),
                        new Item("Draupnir", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        50.0, // 5 sa; //Skill Amplification
                                        13.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        30.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        240.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 54, (char) 2, (char) 20, (char) 43, (char) 9 }),
                        new Item("Creed of the Knight", new double[] {
                                        22.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        15.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        18.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        45.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 10, (char) 9, (char) 12, (char) 23, (char) 43, (char) 55 }),
                        new Item("Sheath of Shah Jahan", new double[] {
                                        22.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        120.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 34, (char) 34, (char) 12, (char) 9, (char) 20 }),
                        new Item("Burnished Aegis", new double[] {
                                        8.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        21.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        170.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        300.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 54, (char) 41, (char) 8, (char) 10, (char) 9 }),
                        new Item("Tindalos Band", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        40.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        12.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        300.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 54, (char) 2, (char) 20, (char) 56, (char) 21 }),
                        new Item("Nightingale", new double[] {
                                        20.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        160.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[] { (char) 8 },
                                        new char[] { (char) 43, (char) 57, (char) 7, (char) 5 }),
                        new Item("Plasma Arc", new double[] {
                                        18.0, // 1 ap; //Attack Power
                                        24.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        15.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 10, (char) 9, (char) 12, (char) 23, (char) 16, (char) 26 }),
                        new Item("Smart Band", new double[] {
                                        30.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        12.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        10.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 26, (char) 34, (char) 7, (char) 1, (char) 22 }),
                        new Item("Radar", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        30.0, // 2 as; //Attack Speed
                                        20.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        17.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 56, (char) 5, (char) 4, (char) 21, (char) 16, (char) 26 })
        };

        public static final Item[] LEGS = new Item[] {
                        new Item("Feather Boots", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        32.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        27.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        25.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 58, (char) 18, (char) 43, (char) 9, (char) 27 }),
                        new Item("Maverick Runner", new double[] {
                                        15.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        27.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        15.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 58, (char) 59, (char) 1, (char) 22, (char) 16, (char) 26 }),
                        new Item("Straitjacket Sneakers", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        10.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        27.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        100.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0], new char[] { (char) 60, (char) 19, (char) 22, (char) 13 }),
                        new Item("Bucephalus", new double[] {
                                        5.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        20.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        5.0, // 6 def; //Defense
                                        0.27, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 60, (char) 12, (char) 5, (char) 4, (char) 61, (char) 40 }),
                        new Item("EOD Boots", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        10.0, // 6 def; //Defense
                                        27.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        40.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[] { (char) 20 },
                                        new char[] { (char) 61, (char) 21, (char) 12, (char) 23, (char) 58, (char) 18,
                                                        (char) 43 }),
                        new Item("White Rhinos", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        5.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        27.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        20.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[] { (char) 3 },
                                        new char[] { (char) 58, (char) 18, (char) 42, (char) 9, (char) 8 }),
                        new Item("Tachyon Brace", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        5.0, // 6 def; //Defense
                                        27.0, // 7 ms; //Movement Speed
                                        8.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 61, (char) 21, (char) 16, (char) 26, (char) 12 }),
                        new Item("SCV", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        27.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        14.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 1, (char) 22, (char) 16, (char) 26, (char) 12 })
        };

        public static final Item[] ACCESSORIES = new Item[] {
                        new Item("White Crane Fan", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        20.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.04, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[] { (char) 3 }, new char[] { (char) 33, (char) 8, (char) 27 }),
                        new Item("Uchiwa", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        25.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        8.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        70.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0], new char[] { (char) 50, (char) 19, (char) 33 }),
                        new Item("Magazine", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        110.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0], new char[] { (char) 62, (char) 12, (char) 34 }),
                        new Item("Laced Quiver", new double[] {
                                        10.0, // 1 ap; //Attack Power
                                        24.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.04, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0], new char[] { (char) 27, (char) 28, (char) 51 }),
                        new Item("Revenge of Goujain", new double[] {
                                        10.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        30.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0], new char[] { (char) 63, (char) 15, (char) 1, (char) 22 }),
                        new Item("Buccaneer Doubloon", new double[] {
                                        15.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        12.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        8.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0], new char[] { (char) 50, (char) 64, (char) 30 }),
                        new Item("Hawkeye", new double[] {
                                        15.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        1.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[] { (char) 23 },
                                        new char[] { (char) 67, (char) 14, (char) 65, (char) 66 }),
                        new Item("Jolly Roger", new double[] {
                                        12.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        10.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[] { (char) 19 },
                                        new char[] { (char) 50, (char) 64, (char) 27, (char) 51 }),
                        new Item("Music Box", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        20.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        175.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0], new char[] { (char) 62, (char) 26, (char) 16, (char) 12 }),
                        new Item("Active Camouflage", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        10.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        200.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0],
                                        new char[] { (char) 62, (char) 12, (char) 34, (char) 46, (char) 3 }),
                        new Item("Grimoire", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[] { (char) 16 },
                                        new char[] { (char) 35, (char) 7, (char) 22, (char) 9 }),
                        new Item("Aether Fringe", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        20.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.08, // 7 ms; //Movement Speed
                                        10.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[0], new char[] { (char) 35, (char) 7, (char) 27 }),
                        new Item("Pile Bunker", new double[] {
                                        14.0, // 1 ap; //Attack Power
                                        10.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        0.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[] { (char) 3 },
                                        new char[] { (char) 8, (char) 26, (char) 16, (char) 12 }),
                        new Item("Schrodinger's Box", new double[] {
                                        0.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        10.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        0.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        110.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[] { (char) 3 }, new char[] { (char) 62, (char) 22, (char) 13 }),
                        new Item("Veritas Lux Mea", new double[] {
                                        8.0, // 1 ap; //Attack Power
                                        0.0, // 2 as; //Attack Speed
                                        0.0, // 3 critC; //Critical Strike Chance
                                        0.0, // 4 critD; //Critical Strike Damage
                                        22.0, // 5 sa; //Skill Amplification
                                        0.0, // 6 def; //Defense
                                        0.0, // 7 ms; //Movement Speed
                                        8.0, // 8 cdr; //Cooldown Reduction
                                        0.0, // 9 ba; //Basic Attack Amplification
                                        0.0, // 10 vis; //Vision Range
                                        0.0, // 11 cR; //Critical Strike Damage Reduction
                                        0.0, // 12 bR; //Basic Attack Damage Reduction
                                        0.0, // 13 sR; //Skill Damage Reduction
                                        0.0, // 14 pen; //Armor Penetration
                                        0.0, // 15 hp; //Max HP
                                        0.0, // 16 hpR; //HP Regeneration (percentage)
                                        0.0, // 17 range; //Attack Range
                                        0.0, // 18 tenacity; //Tenacity
                                        0.0, // 19 omni; //Omnisyphon
                                        0.0, // 20 steal; //Lifesteal
                                        0.0, // 21 sp; //Max SP
                                        0.0, // 22 fspr; //SP Regeneration (flat)
                                        0.0, // 23 pspr; //SP Regeneration (percentage)
                                        0.0, // 24 appl; //Attack Power Per Level
                                        0.0, // 25 sapl; //Skill Amplification Per Level
                                        0.0// 26 hppl; //Max HP Per Level
                        },
                                        new char[] { (char) 2 },
                                        new char[] { (char) 42, (char) 47, (char) 49, (char) 68 })
        };

        public static final String[] DICTIONARY = new String[] {
                        "",
                        "Fountain Pen",
                        "Pickaxe",
                        "Branch",
                        "Stone",
                        "Glass Bottle",
                        "Chalk",
                        "Flower",
                        "Nail",
                        "Leather",
                        "Turtle Shell",
                        "Rubber",
                        "Scrap Metal",
                        "Lighter",
                        "Laser Pointer",
                        "Stallion Medal",
                        "Battery",
                        "Alcohol",
                        "Oil",
                        "Cloth",
                        "Gemstone",
                        "Glue",
                        "Paper",
                        "Iron Ore",
                        "Can",
                        "Gunpowder",
                        "Piano Wire",
                        "Feather",
                        "Bamboo",
                        "Carbonated Water",
                        "Kitchen Knife",
                        "Short Spear",
                        "Hatchet",
                        "Fan",
                        "Hammer",
                        "Playing Cards",
                        "Hairband",
                        "Hat",
                        "Scissors",
                        "Bike Helmet",
                        "Steel Chain",
                        "Mousetrap",
                        "Cross",
                        "Bandage",
                        "Fabric Armor",
                        "Wetsuit",
                        "Windbreaker",
                        "Holy Grail",
                        "Razor",
                        "Monk's Robe",
                        "Ribbon",
                        "Short Rod",
                        "Ice",
                        "Cotton Gloves",
                        "Bracelet",
                        "Needle",
                        "Watch",
                        "Oriental Herb",
                        "Running Shoes",
                        "Iron Ball",
                        "Slippers",
                        "Tights",
                        "Box",
                        "Rusty Sword",
                        "Walther PPK",
                        "Short Crossbow",
                        "Fedorova",
                        "Binoculars",
                        "Buddhist Scripture",
                        "Snare",
                        "Ramen",
                        "Coffee",
                        "Egg",
                        "Lemon",
                        "Chocolate",
                        "Whiskey",
                        "Garlic",
                        "Honey",
                        "Guitar",
                        "Milk",
        };

        public static String toString(Build cur) {
                return "(s: " + cur.spear.name + ", h: " + cur.head.name + ", c: " + cur.chest.name + ", a: "
                                + cur.arm.name + ", l: " + cur.leg.name + ", a: " + cur.accessory.name + ")";
        }

        public static String toString(Zone zone) {
                return zone.name;
        }

        public static String toString(Item item) {
                return item.name;
        }

        public static String toString(char[] componentsList) {
                String accum = "";
                for (char c : componentsList) {
                        accum += ", " + DICTIONARY[(int) c];
                }
                return accum;
        }

        public static String toString(int[] ints) {
                String accum = "{";
                for (int i : ints) {
                        accum += i + ", ";
                }
                accum += "}";
                return accum;
        }

        public static String toString(int[][] intss) {
                String accum = "{\n";
                for (int[] ints : intss) {
                        accum += "\t{";
                        int k = 0;
                        for (int i : ints) {
                                if (k == ints.length - 1) {
                                        accum += i + "}\n";
                                } else {
                                        accum += i + ", ";
                                }
                                k++;
                        }
                }
                return accum;
        }

        public static Zone[] toZoneArray(int[] in) {
                Zone[] out = new Zone[in.length];
                int i = 0;
                for (int x : in) {
                        out[i] = ZONES[x];
                        i++;
                }
                return out;
        }

        public static Route[] removeDupeZones(Route[] in) {
                Route[] out = new Route[in.length];
                int i = 0;
                for (Route r : in) {
                        out[i] = removeDupes(r);
                        i++;
                }
                return out;
        }

        public static Route removeDupes(Route a) {
                Zone[] b = new Zone[] {};
                boolean dupe = false;
                for (Zone x : a.zones) {

                        for (Zone n : b) {
                                if (n.name == x.name) {
                                        dupe = true;
                                }
                        }
                        if (!dupe) {
                                b = Constants.append(b, new Zone[] { x });
                        }
                        dupe = false;
                }
                return new Route(b);
        }

        public static Route[] sortByLength(Route[] in, int budget) {
                Route[] out = new Route[in.length];
                int i = 0;
                // for(){

                // }
                // TODO
                return out;
        }

        public static boolean searchForFailure(int[] in) {
                for (int i : in) {
                        if (i == 255) {
                                return true;
                        }
                }
                return false;
        }

        public static boolean contains(int[] in, int x) {
                for (int i : in) {
                        if (i == x) {
                                return true;
                        }
                }
                return false;
        }

        public static boolean containsLessThan(int[] in, int x) {
                for (int i : in) {
                        if (i >= x) {
                                return true;
                        }
                }
                return false;
        }

        public static int[][] arrayClone(int[][] in) {
                int[][] myInt = new int[in.length][];
                for (int i = 0; i < in.length; i++) {
                        int[] aMatrix = in[i];
                        int aLength = aMatrix.length;
                        myInt[i] = new int[aLength];
                        System.arraycopy(aMatrix, 0, myInt[i], 0, aLength);
                }
                return myInt;
        }

        public static char[][] arrayClone(char[][] in) {
                char[][] myInt = new char[in.length][];
                for (int i = 0; i < in.length; i++) {
                        char[] aMatrix = in[i];
                        int aLength = aMatrix.length;
                        myInt[i] = new char[aLength];
                        System.arraycopy(aMatrix, 0, myInt[i], 0, aLength);
                }
                return myInt;
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

        public static char[] append(char[] a, char b) {
                char[] c = Arrays.copyOf(a, a.length + 1);
                c[a.length] = b;
                return c;
        }

        public static int[] append(int[] a, int[] b) {
                int[] c = Arrays.copyOf(a, a.length + b.length);
                int i = 0;
                for (int x : b) {
                        c[a.length + i] = b[i];
                        i++;
                }
                return c;
        }

        public static int[] append(int[] a, int b) {
                int[] c = Arrays.copyOf(a, a.length + 1);
                c[a.length] = b;
                return c;
        }

        public static int[][] append(int[][] a, int[][] b) {
                int[][] c = Arrays.copyOf(a, a.length + b.length);
                int i = 0;
                for (int[] x : b) {
                        c[a.length + i] = b[i];
                        i++;
                }
                return c;
        }

        public static int[][] append(int[][] a, int[] b) {
                int[][] c = Arrays.copyOf(a, a.length + 1);
                c[a.length] = b;
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

        public static <T> T[] append(T[] a, T b) {
                T[] c = Arrays.copyOf(a, a.length + 1);
                c[a.length] = b;
                return c;
        }
}
