--Table: public.ChestComponents

DROP TABLE IF EXISTS public."ChestComponents";

CREATE TABLE public."ChestComponents"
(
    chest_id INT, 
    component_id INT
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."ChestComponents"
    OWNER to postgres;