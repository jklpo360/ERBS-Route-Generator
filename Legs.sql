-- Table: public.Legs

DROP TABLE IF EXISTS public."Legs";

CREATE TABLE public."Legs"
(
		  leg_id INTEGER,
		  leg_name VARCHAR(30),
          attack_power DOUBLE,
          attack_speed DOUBLE,
          critical_strike_chance DOUBLE,
          critical_strike_damage DOUBLE,
          skill_amplification DOUBLE,
          defense DOUBLE,
          movement_speed DOUBLE,
          cooldown_reduction DOUBLE,
          basic_attack_amplification DOUBLE,
          vision_range DOUBLE,
          critical_strike_damage_reduction DOUBLE,
          basic_attack_damage_reduction DOUBLE,
          skill_damage_reduction DOUBLE,
          armor_penetration DOUBLE,
          max_hp DOUBLE,
          hp_regeneration DOUBLE,
          attack_range DOUBLE,
          tenacity DOUBLE,
          omnisyphon DOUBLE,
          lifesteal DOUBLE,
          max_sp DOUBLE,
          flat_sp_regeneration DOUBLE,
          percent_sp_regeneration DOUBLE,
          attack_power_per_level DOUBLE,
          skill_amplification_per_level DOUBLE,
          hp_per_level DOUBLE,
		  specials VARCHAR(12),
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Legs"
    OWNER to postgres;