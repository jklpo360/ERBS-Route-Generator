DROP TABLE IF EXISTS public."ItemZones";

CREATE TABLE public."ItemZones"
(
    component_id INT,
	zone_id INT,
    PRIMARY KEY (component_id, zone_id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."ItemZones"
    OWNER to postgres;
