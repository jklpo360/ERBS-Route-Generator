--Table: public.SpearComponents

DROP TABLE IF EXISTS public."SpearComponents";

CREATE TABLE public."SpearComponents"
(
    spear_id INT, 
    component_id INT
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."SpearComponents"
    OWNER to postgres;