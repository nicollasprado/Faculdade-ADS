-- Tarefa a - Os comandos CREATE das tabelas adotadas
CREATE TABLE users (
    id INT GENERATED ALWAYS AS IDENTITY,
    name VARCHAR(255) not null,
    username VARCHAR(30) not null,
    password VARCHAR(255) not null,
    email VARCHAR(255) not null,
    phone varchar(20),
    avatar_url varchar(255),
    banner_url varchar(255),
    actual_streak int default 0 not null,
    highest_streak int default 0 not null,
    last_streak_update timestamp default null,
    created_at timestamp default now(),

    CONSTRAINT pk_user PRIMARY KEY(id),
    CONSTRAINT uq_username UNIQUE(username),
    CONSTRAINT uq_email UNIQUE(email)
);

CREATE TABLE interest_area (
    id INT GENERATED ALWAYS AS IDENTITY,
    name VARCHAR(255) not null,
    description VARCHAR(255) DEFAULT '',

    CONSTRAINT pk_interest_area PRIMARY KEY(id),
    CONSTRAINT uq_name UNIQUE(name)
);

CREATE TABLE user_interest_area (
    id INT GENERATED ALWAYS AS IDENTITY,
    user_id INT not null,
    interest_area_id int not null,

    CONSTRAINT pk_user_interest_area PRIMARY KEY(id),
    CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE,
    CONSTRAINT fk_interest_area_id FOREIGN KEY (interest_area_id) REFERENCES interest_area (id) ON DELETE CASCADE,
    CONSTRAINT uq_user_id_interest_area_id UNIQUE(user_id, interest_area_id)
);

CREATE TABLE task_section (
    id INT GENERATED ALWAYS AS IDENTITY,
    title varchar(255) not null,
    user_id INT not null,

    CONSTRAINT pk_task_section PRIMARY KEY(id),
    CONSTRAINT fk_user_id FOREIGN KEY(user_id) REFERENCES users (id) ON DELETE CASCADE
);

CREATE TABLE task (
    id INT GENERATED ALWAYS AS IDENTITY,
    title VARCHAR(255) not null,
    is_completed BOOLEAN DEFAULT false,
    created_at TIMESTAMP DEFAULT now(),
    expires_at TIMESTAMP not null,
    task_section_id INT not null

    CONSTRAINT pk_task PRIMARY KEY(id),
    CONSTRAINT fk_task_section_id FOREIGN KEY(task_section_id) REFERENCES task_section (id) ON DELETE CASCADE
);

-- Tarefa b - Os comandos INSERT para inserir 2 registros em cada tabela adotada.

INSERT INTO users (name, username, password, email) VALUES ('Nicollas', 'nicollasmp', 'nic123', 'nic@gmail.com');
INSERT INTO users (name, username, password, email) VALUES ('Bernardo', 'bdd', 'ber123', 'bernardo@gmail.com');

INSERT INTO interest_area (name, description) VALUES ('Tecnologia', 'Qualquer area de tecnologia como programacao, hardware e redes');
INSERT INTO interest_area (name, description) VALUES ('Design', 'Design grafico, design de interfaces etc');

INSERT INTO user_interest_area (user_id, interest_area_id) VALUES (1, 1);
INSERT INTO user_interest_area (user_id, interest_area_id) VALUES (2, 2);

INSERT INTO task_section (title, user_id) VALUES ('Faculdade', 1);
INSERT INTO task_section (title, user_id) VALUES ('Projeto pessoal', 2);

INSERT INTO task (title, expires_at, task_section_id) VALUES ('Estudar Arvores', '2025-08-06 17:43:21.123456', 1);
INSERT INTO task (title, expires_at, task_section_id) VALUES ('Implementar view de login', '2025-08-06 17:43:21.123456', 2);