--Table: public.ArmComponents

DROP TABLE IF EXISTS public."ArmComponents";

CREATE TABLE public."ArmComponents"
(
    arm_id INT, 
    component_id INT
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."ArmComponents"
    OWNER to postgres;