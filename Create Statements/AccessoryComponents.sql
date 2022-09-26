--Table: public.AccessoryComponents

DROP TABLE IF EXISTS public."AccessoryComponents";

CREATE TABLE public."AccessoryComponents"
(
    accessory_id INT, 
    component_id INT
    PRIMARY KEY (accessory_id, component_id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."AccessoryComponents"
    OWNER to postgres;