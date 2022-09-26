DROP TABLE IF EXISTS public."ComponentDictionary";

CREATE TABLE public."ComponentDictionary"
(
    component_id INT PRIMARY KEY,
	component_name VARCHAR(20)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."ComponentDictionary"
    OWNER to postgres;