CREATE TABLE roles (
  id serial PRIMARY KEY,
  role varchar(45) NOT NULL,
  user_id bigint DEFAULT NULL,
  CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES users (id)
);

INSERT INTO roles VALUES (1,'STUDENT',1),(2,'PROFESSOR',2);

