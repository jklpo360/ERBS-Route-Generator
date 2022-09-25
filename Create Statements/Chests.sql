-- Table: public.Chests

DROP TABLE IF EXISTS public."Chests";

CREATE TABLE public."Chests"
(
		  chest_id INT PRIMARY KEY,
		  chest_name VARCHAR(30),
          attack_power FLOAT8,
          attack_speed FLOAT8,
          critical_strike_chance FLOAT8,
          critical_strike_damage FLOAT8,
          skill_amplification FLOAT8,
          defense FLOAT8,
          movement_speed FLOAT8,
          cooldown_reduction FLOAT8,
          basic_attack_amplification FLOAT8,
          vision_range FLOAT8,
          critical_strike_damage_reduction FLOAT8,
          basic_attack_damage_reduction FLOAT8,
          skill_damage_reduction FLOAT8,
          armor_penetration FLOAT8,
          max_hp FLOAT8,
          hp_regeneration FLOAT8,
          attack_range FLOAT8,
          tenacity FLOAT8,
          omnisyphon FLOAT8,
          lifesteal FLOAT8,
          max_sp FLOAT8,
          flat_sp_regeneration FLOAT8,
          percent_sp_regeneration FLOAT8,
          attack_power_per_level FLOAT8,
          skill_amplification_per_level FLOAT8,
          hp_per_level FLOAT8,
		  specials VARCHAR(12)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Chests"
    OWNER to postgres;