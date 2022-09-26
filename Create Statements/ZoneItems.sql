DROP TABLE IF EXISTS public."ZoneItems";

CREATE TABLE public."ZoneItems"
(
	zone_id INT PRIMARY KEY,
    zone_name VARCHAR(20),
    items VARCHAR(30)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."ZoneItems"
    OWNER to postgres;
