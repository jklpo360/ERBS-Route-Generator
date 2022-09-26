--Table: public.HeadComponents

DROP TABLE IF EXISTS public."HeadComponents";

CREATE TABLE public."HeadComponents"
(
    head_id INT, 
    component_id INT
    PRIMARY KEY (head_id, component_id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."HeadComponents"
    OWNER to postgres;