--Table: public.LegComponents

DROP TABLE IF EXISTS public."LegComponents";

CREATE TABLE public."LegComponents"
(
    leg_id INT, 
    component_id INT
    PRIMARY KEY (leg_id, component_id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."LegComponents"
    OWNER to postgres;