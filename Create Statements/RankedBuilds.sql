DROP TABLE IF EXISTS public."RankedBuilds";

CREATE TABLE public."RankedBuilds"
(
    spear_name VARCHAR(30),
    chest_name VARCHAR(30),
    head_name VARCHAR(30),
    arm_name VARCHAR(30),
    leg_name VARCHAR(30),
    accessory_name VARCHAR(30),
    spear_id INT CHECK,
    chest_id INT,
    head_id INT,
    arm_id INT,
    leg_id INT,
    accessory_id INT,
    score DOUBLE(8 VARCHAR(30), 4),
    PRIMARY KEY (spear_id, chest_id, head_id, arm_id, leg_id, accessory_id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."RankedBuilds"
    OWNER to postgres;