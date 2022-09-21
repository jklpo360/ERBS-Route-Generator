// public class Arms {

// public static Item[] getArms() {

// Item[] arms = new Item[11];

// arms[0] = new Item("Corrupting Touch", new double[] {
// 0.0, // 1 ap; //Attack Power
// 0.0, // 2 as; //Attack Speed
// 0.0, // 3 critC; //Critical Strike Chance
// 0.0, // 4 critD; //Critical Strike Damage
// 40.0, // 5 sa; //Skill Amplification
// 13.0, // 6 def; //Defense
// 0.0, // 7 ms; //Movement Speed
// 0.0, // 8 cdr; //Cooldown Reduction
// 0.0, // 9 ba; //Basic Attack Amplification
// 0.0, // 10 vis; //Vision Range
// 0.0, // 11 cR; //Critical Strike Damage Reduction
// 0.0, // 12 bR; //Basic Attack Damage Reduction
// 0.0, // 13 sR; //Skill Damage Reduction
// 0.0, // 14 pen; //Armor Penetration
// 0.0, // 15 hp; //Max HP
// 0.0, // 16 hpR; //HP Regeneration (percentage)
// 0.0, // 17 range; //Attack Range
// 0.0, // 18 tenacity; //Tenacity
// 0.0, // 19 omni; //Omnisyphon
// 0.0, // 20 steal; //Lifesteal
// 0.0, // 21 sp; //Max SP
// 0.0, // 22 fspr; //SP Regeneration (flat)
// 0.0, // 23 pspr; //SP Regeneration (percentage)
// 0.0, // 24 appl; //Attack Power Per Level
// 0.0, // 25 sapl; //Skill Amplification Per Level
// 0.0// 26 hppl; //Max HP Per Level
// },
// new char[] { (char) 3 }, new char[] { (char) 53, (char) 22, (char) 13 });
// arms[1] = new Item("Sword Stopper", new double[] {
// 0.0, // 1 ap; //Attack Power
// 0.0, // 2 as; //Attack Speed
// 0.0, // 3 critC; //Critical Strike Chance
// 0.0, // 4 critD; //Critical Strike Damage
// 0.0, // 5 sa; //Skill Amplification
// 17.0, // 6 def; //Defense
// 0.0, // 7 ms; //Movement Speed
// 0.0, // 8 cdr; //Cooldown Reduction
// 0.0, // 9 ba; //Basic Attack Amplification
// 0.0, // 10 vis; //Vision Range
// 0.0, // 11 cR; //Critical Strike Damage Reduction
// 5.0, // 12 bR; //Basic Attack Damage Reduction
// 0.0, // 13 sR; //Skill Damage Reduction
// 0.0, // 14 pen; //Armor Penetration
// 0.0, // 15 hp; //Max HP
// 0.0, // 16 hpR; //HP Regeneration (percentage)
// 0.0, // 17 range; //Attack Range
// 0.0, // 18 tenacity; //Tenacity
// 0.0, // 19 omni; //Omnisyphon
// 0.0, // 20 steal; //Lifesteal
// 0.0, // 21 sp; //Max SP
// 0.0, // 22 fspr; //SP Regeneration (flat)
// 0.0, // 23 pspr; //SP Regeneration (percentage)
// 0.0, // 24 appl; //Attack Power Per Level
// 0.0, // 25 sapl; //Skill Amplification Per Level
// 0.0// 26 hppl; //Max HP Per Level
// },
// new char[] { (char) 18 },
// new char[] { (char) 42, (char) 9, (char) 12, (char) 34, (char) 8 });
// arms[2] = new Item("Draupnir", new double[] {
// 0.0, // 1 ap; //Attack Power
// 0.0, // 2 as; //Attack Speed
// 0.0, // 3 critC; //Critical Strike Chance
// 0.0, // 4 critD; //Critical Strike Damage
// 50.0, // 5 sa; //Skill Amplification
// 13.0, // 6 def; //Defense
// 0.0, // 7 ms; //Movement Speed
// 0.0, // 8 cdr; //Cooldown Reduction
// 0.0, // 9 ba; //Basic Attack Amplification
// 0.0, // 10 vis; //Vision Range
// 0.0, // 11 cR; //Critical Strike Damage Reduction
// 0.0, // 12 bR; //Basic Attack Damage Reduction
// 0.0, // 13 sR; //Skill Damage Reduction
// 0.0, // 14 pen; //Armor Penetration
// 0.0, // 15 hp; //Max HP
// 30.0, // 16 hpR; //HP Regeneration (percentage)
// 0.0, // 17 range; //Attack Range
// 0.0, // 18 tenacity; //Tenacity
// 0.0, // 19 omni; //Omnisyphon
// 0.0, // 20 steal; //Lifesteal
// 240.0, // 21 sp; //Max SP
// 0.0, // 22 fspr; //SP Regeneration (flat)
// 0.0, // 23 pspr; //SP Regeneration (percentage)
// 0.0, // 24 appl; //Attack Power Per Level
// 0.0, // 25 sapl; //Skill Amplification Per Level
// 0.0// 26 hppl; //Max HP Per Level
// },
// new char[0], new char[] { (char) 54, (char) 2, (char) 20, (char) 42, (char) 9
// });
// arms[3] = new Item("Creed of the Knight", new double[] {
// 22.0, // 1 ap; //Attack Power
// 0.0, // 2 as; //Attack Speed
// 0.0, // 3 critC; //Critical Strike Chance
// 15.0, // 4 critD; //Critical Strike Damage
// 0.0, // 5 sa; //Skill Amplification
// 18.0, // 6 def; //Defense
// 0.0, // 7 ms; //Movement Speed
// 0.0, // 8 cdr; //Cooldown Reduction
// 0.0, // 9 ba; //Basic Attack Amplification
// 0.0, // 10 vis; //Vision Range
// 0.0, // 11 cR; //Critical Strike Damage Reduction
// 0.0, // 12 bR; //Basic Attack Damage Reduction
// 0.0, // 13 sR; //Skill Damage Reduction
// 0.0, // 14 pen; //Armor Penetration
// 0.0, // 15 hp; //Max HP
// 45.0, // 16 hpR; //HP Regeneration (percentage)
// 0.0, // 17 range; //Attack Range
// 0.0, // 18 tenacity; //Tenacity
// 0.0, // 19 omni; //Omnisyphon
// 0.0, // 20 steal; //Lifesteal
// 0.0, // 21 sp; //Max SP
// 0.0, // 22 fspr; //SP Regeneration (flat)
// 0.0, // 23 pspr; //SP Regeneration (percentage)
// 0.0, // 24 appl; //Attack Power Per Level
// 0.0, // 25 sapl; //Skill Amplification Per Level
// 0.0// 26 hppl; //Max HP Per Level
// },
// new char[0],
// new char[] { (char) 10, (char) 9, (char) 12, (char) 23, (char) 42, (char) 55
// });
// arms[4] = new Item("Sheath of Shah Jahan", new double[] {
// 22.0, // 1 ap; //Attack Power
// 0.0, // 2 as; //Attack Speed
// 0.0, // 3 critC; //Critical Strike Chance
// 0.0, // 4 critD; //Critical Strike Damage
// 0.0, // 5 sa; //Skill Amplification
// 0.0, // 6 def; //Defense
// 0.0, // 7 ms; //Movement Speed
// 0.0, // 8 cdr; //Cooldown Reduction
// 0.0, // 9 ba; //Basic Attack Amplification
// 0.0, // 10 vis; //Vision Range
// 0.0, // 11 cR; //Critical Strike Damage Reduction
// 0.0, // 12 bR; //Basic Attack Damage Reduction
// 0.0, // 13 sR; //Skill Damage Reduction
// 0.0, // 14 pen; //Armor Penetration
// 120.0, // 15 hp; //Max HP
// 0.0, // 16 hpR; //HP Regeneration (percentage)
// 0.0, // 17 range; //Attack Range
// 0.0, // 18 tenacity; //Tenacity
// 0.0, // 19 omni; //Omnisyphon
// 0.0, // 20 steal; //Lifesteal
// 0.0, // 21 sp; //Max SP
// 0.0, // 22 fspr; //SP Regeneration (flat)
// 0.0, // 23 pspr; //SP Regeneration (percentage)
// 0.0, // 24 appl; //Attack Power Per Level
// 0.0, // 25 sapl; //Skill Amplification Per Level
// 0.0// 26 hppl; //Max HP Per Level
// },
// new char[0], new char[] { (char) 34, (char) 34, (char) 12, (char) 9, (char)
// 20 });
// arms[5] = new Item("Burnished Aegis", new double[] {
// 8.0, // 1 ap; //Attack Power
// 0.0, // 2 as; //Attack Speed
// 0.0, // 3 critC; //Critical Strike Chance
// 0.0, // 4 critD; //Critical Strike Damage
// 0.0, // 5 sa; //Skill Amplification
// 21.0, // 6 def; //Defense
// 0.0, // 7 ms; //Movement Speed
// 0.0, // 8 cdr; //Cooldown Reduction
// 0.0, // 9 ba; //Basic Attack Amplification
// 0.0, // 10 vis; //Vision Range
// 0.0, // 11 cR; //Critical Strike Damage Reduction
// 0.0, // 12 bR; //Basic Attack Damage Reduction
// 0.0, // 13 sR; //Skill Damage Reduction
// 0.0, // 14 pen; //Armor Penetration
// 170.0, // 15 hp; //Max HP
// 0.0, // 16 hpR; //HP Regeneration (percentage)
// 0.0, // 17 range; //Attack Range
// 0.0, // 18 tenacity; //Tenacity
// 0.0, // 19 omni; //Omnisyphon
// 0.0, // 20 steal; //Lifesteal
// 300.0, // 21 sp; //Max SP
// 0.0, // 22 fspr; //SP Regeneration (flat)
// 0.0, // 23 pspr; //SP Regeneration (percentage)
// 0.0, // 24 appl; //Attack Power Per Level
// 0.0, // 25 sapl; //Skill Amplification Per Level
// 0.0// 26 hppl; //Max HP Per Level
// },
// new char[0], new char[] { (char) 54, (char) 40, (char) 8, (char) 10, (char) 9
// });
// arms[6] = new Item("Tindalos Band", new double[] {
// 0.0, // 1 ap; //Attack Power
// 0.0, // 2 as; //Attack Speed
// 0.0, // 3 critC; //Critical Strike Chance
// 0.0, // 4 critD; //Critical Strike Damage
// 40.0, // 5 sa; //Skill Amplification
// 0.0, // 6 def; //Defense
// 0.0, // 7 ms; //Movement Speed
// 12.0, // 8 cdr; //Cooldown Reduction
// 0.0, // 9 ba; //Basic Attack Amplification
// 0.0, // 10 vis; //Vision Range
// 0.0, // 11 cR; //Critical Strike Damage Reduction
// 0.0, // 12 bR; //Basic Attack Damage Reduction
// 0.0, // 13 sR; //Skill Damage Reduction
// 0.0, // 14 pen; //Armor Penetration
// 0.0, // 15 hp; //Max HP
// 0.0, // 16 hpR; //HP Regeneration (percentage)
// 0.0, // 17 range; //Attack Range
// 0.0, // 18 tenacity; //Tenacity
// 0.0, // 19 omni; //Omnisyphon
// 0.0, // 20 steal; //Lifesteal
// 0.0, // 21 sp; //Max SP
// 300.0, // 22 fspr; //SP Regeneration (flat)
// 0.0, // 23 pspr; //SP Regeneration (percentage)
// 0.0, // 24 appl; //Attack Power Per Level
// 0.0, // 25 sapl; //Skill Amplification Per Level
// 0.0// 26 hppl; //Max HP Per Level
// },
// new char[0], new char[] { (char) 54, (char) 2, (char) 20, (char) 56, (char)
// 21 });
// arms[7] = new Item("Nightingale", new double[] {
// 20.0, // 1 ap; //Attack Power
// 0.0, // 2 as; //Attack Speed
// 0.0, // 3 critC; //Critical Strike Chance
// 0.0, // 4 critD; //Critical Strike Damage
// 0.0, // 5 sa; //Skill Amplification
// 0.0, // 6 def; //Defense
// 0.0, // 7 ms; //Movement Speed
// 0.0, // 8 cdr; //Cooldown Reduction
// 0.0, // 9 ba; //Basic Attack Amplification
// 0.0, // 10 vis; //Vision Range
// 0.0, // 11 cR; //Critical Strike Damage Reduction
// 0.0, // 12 bR; //Basic Attack Damage Reduction
// 0.0, // 13 sR; //Skill Damage Reduction
// 0.0, // 14 pen; //Armor Penetration
// 160.0, // 15 hp; //Max HP
// 0.0, // 16 hpR; //HP Regeneration (percentage)
// 0.0, // 17 range; //Attack Range
// 0.0, // 18 tenacity; //Tenacity
// 0.0, // 19 omni; //Omnisyphon
// 0.0, // 20 steal; //Lifesteal
// 0.0, // 21 sp; //Max SP
// 0.0, // 22 fspr; //SP Regeneration (flat)
// 0.0, // 23 pspr; //SP Regeneration (percentage)
// 0.0, // 24 appl; //Attack Power Per Level
// 0.0, // 25 sapl; //Skill Amplification Per Level
// 0.0// 26 hppl; //Max HP Per Level
// },
// new char[] { (char) 8 },
// new char[] { (char) 42, (char) 55, (char) 57, (char) 7, (char) 5 });
// arms[8] = new Item("Plasma Arc", new double[] {
// 18.0, // 1 ap; //Attack Power
// 24.0, // 2 as; //Attack Speed
// 0.0, // 3 critC; //Critical Strike Chance
// 0.0, // 4 critD; //Critical Strike Damage
// 0.0, // 5 sa; //Skill Amplification
// 15.0, // 6 def; //Defense
// 0.0, // 7 ms; //Movement Speed
// 0.0, // 8 cdr; //Cooldown Reduction
// 0.0, // 9 ba; //Basic Attack Amplification
// 0.0, // 10 vis; //Vision Range
// 0.0, // 11 cR; //Critical Strike Damage Reduction
// 0.0, // 12 bR; //Basic Attack Damage Reduction
// 0.0, // 13 sR; //Skill Damage Reduction
// 0.0, // 14 pen; //Armor Penetration
// 0.0, // 15 hp; //Max HP
// 0.0, // 16 hpR; //HP Regeneration (percentage)
// 0.0, // 17 range; //Attack Range
// 0.0, // 18 tenacity; //Tenacity
// 0.0, // 19 omni; //Omnisyphon
// 0.0, // 20 steal; //Lifesteal
// 0.0, // 21 sp; //Max SP
// 0.0, // 22 fspr; //SP Regeneration (flat)
// 0.0, // 23 pspr; //SP Regeneration (percentage)
// 0.0, // 24 appl; //Attack Power Per Level
// 0.0, // 25 sapl; //Skill Amplification Per Level
// 0.0// 26 hppl; //Max HP Per Level
// },
// new char[0],
// new char[] { (char) 10, (char) 9, (char) 12, (char) 23, (char) 16, (char) 26
// });
// arms[9] = new Item("Smart Band", new double[] {
// 30.0, // 1 ap; //Attack Power
// 0.0, // 2 as; //Attack Speed
// 0.0, // 3 critC; //Critical Strike Chance
// 0.0, // 4 critD; //Critical Strike Damage
// 0.0, // 5 sa; //Skill Amplification
// 0.0, // 6 def; //Defense
// 0.0, // 7 ms; //Movement Speed
// 12.0, // 8 cdr; //Cooldown Reduction
// 0.0, // 9 ba; //Basic Attack Amplification
// 0.0, // 10 vis; //Vision Range
// 0.0, // 11 cR; //Critical Strike Damage Reduction
// 0.0, // 12 bR; //Basic Attack Damage Reduction
// 0.0, // 13 sR; //Skill Damage Reduction
// 0.0, // 14 pen; //Armor Penetration
// 0.0, // 15 hp; //Max HP
// 0.0, // 16 hpR; //HP Regeneration (percentage)
// 0.0, // 17 range; //Attack Range
// 0.0, // 18 tenacity; //Tenacity
// 0.0, // 19 omni; //Omnisyphon
// 10.0, // 20 steal; //Lifesteal
// 0.0, // 21 sp; //Max SP
// 0.0, // 22 fspr; //SP Regeneration (flat)
// 0.0, // 23 pspr; //SP Regeneration (percentage)
// 0.0, // 24 appl; //Attack Power Per Level
// 0.0, // 25 sapl; //Skill Amplification Per Level
// 0.0// 26 hppl; //Max HP Per Level
// },
// new char[0], new char[] { (char) 26, (char) 34, (char) 7, (char) 1, (char) 22
// });
// arms[10] = new Item("Radar", new double[] {
// 0.0, // 1 ap; //Attack Power
// 30.0, // 2 as; //Attack Speed
// 20.0, // 3 critC; //Critical Strike Chance
// 0.0, // 4 critD; //Critical Strike Damage
// 0.0, // 5 sa; //Skill Amplification
// 17.0, // 6 def; //Defense
// 0.0, // 7 ms; //Movement Speed
// 0.0, // 8 cdr; //Cooldown Reduction
// 0.0, // 9 ba; //Basic Attack Amplification
// 0.0, // 10 vis; //Vision Range
// 0.0, // 11 cR; //Critical Strike Damage Reduction
// 0.0, // 12 bR; //Basic Attack Damage Reduction
// 0.0, // 13 sR; //Skill Damage Reduction
// 0.0, // 14 pen; //Armor Penetration
// 0.0, // 15 hp; //Max HP
// 0.0, // 16 hpR; //HP Regeneration (percentage)
// 0.0, // 17 range; //Attack Range
// 0.0, // 18 tenacity; //Tenacity
// 0.0, // 19 omni; //Omnisyphon
// 0.0, // 20 steal; //Lifesteal
// 0.0, // 21 sp; //Max SP
// 0.0, // 22 fspr; //SP Regeneration (flat)
// 0.0, // 23 pspr; //SP Regeneration (percentage)
// 0.0, // 24 appl; //Attack Power Per Level
// 0.0, // 25 sapl; //Skill Amplification Per Level
// 0.0// 26 hppl; //Max HP Per Level
// },
// new char[0],
// new char[] { (char) 56, (char) 5, (char) 4, (char) 21, (char) 16, (char) 26
// });
// return arms;
// }
// }