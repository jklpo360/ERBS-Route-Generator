--Table: public.HeadComponents

DROP TABLE IF EXISTS public."HeadComponents";

CREATE TABLE public."HeadComponents"
(
    head_id INT, 
    component_id INT
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."HeadComponents"
    OWNER to postgres;