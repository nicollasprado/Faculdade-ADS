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
    task_section_id INT not null,

    CONSTRAINT pk_task PRIMARY KEY(id),
    CONSTRAINT fk_task_section_id FOREIGN KEY(task_section_id) REFERENCES task_section (id) ON DELETE CASCADE
);

CREATE TABLE subtask (
    id INT GENERATED ALWAYS AS IDENTITY,
    title VARCHAR(255) not null,
    is_completed BOOLEAN DEFAULT false,
    created_at TIMESTAMP DEFAULT now(),
    task_id INT not null,

    CONSTRAINT pk_subtask PRIMARY KEY(id),
    CONSTRAINT fk_task_id FOREIGN KEY(task_id) REFERENCES task (id) ON DELETE CASCADE
);

-- Tarefa b - Os comandos INSERT para inserir 2 registros em cada tabela adotada.

INSERT INTO users (name, username, password, email) VALUES ('Nicollas', 'nicollasmp', 'nic123', 'nic@gmail.com');
INSERT INTO users (name, username, password, email, phone) VALUES ('Bernardo', 'bdd', 'ber123', 'bernardo@gmail.com', '849999-7777');

INSERT INTO interest_area (name, description) VALUES ('Tecnologia', 'Qualquer area de tecnologia como programacao, hardware e redes');
INSERT INTO interest_area (name, description) VALUES ('Design', 'Design grafico, design de interfaces etc');

INSERT INTO user_interest_area (user_id, interest_area_id) VALUES (1, 1);
INSERT INTO user_interest_area (user_id, interest_area_id) VALUES (2, 2);

INSERT INTO task_section (title, user_id) VALUES ('Faculdade', 1);
INSERT INTO task_section (title, user_id) VALUES ('Projeto pessoal', 2);

INSERT INTO task (title, expires_at, task_section_id) VALUES ('Estudar Arvores', '2025-08-06 17:43:21.123456', 1);
INSERT INTO task (title, expires_at, task_section_id) VALUES ('Implementar view de login', '2025-08-06 17:43:21.123456', 2);

INSERT INTO subtask (title, task_id) VALUES ('Arvore binaria', 1);
INSERT INTO subtask (title, task_id) VALUES ('tipos get e post', 2);

-- Tarefa c. Um comando UPDATE para atualizar um campo dos registros que satisfazem uma condição simples.
-- Colocar um 7 antes de todos telefones para usuarios que ja possuem telefone cadastrado
UPDATE users
SET phone = CONCAT('7', phone)
WHERE phone is not null;

-- Tarefa d. Um comando UPDATE para atualizar um campo dos registros que satisfazem uma condição composta.
-- Remover telefone de usuarios com email e telefone cadastrado
UPDATE users
SET phone = null
WHERE email is not null 
AND phone is not null;

-- Tarefa e. Um comando UPDATE para atualizar dois campos dos registros que satisfazem uma condição.
-- aumentar a streak atual e atualizar a ultima data de atualização da streak caso a streak seja ao menos de 1 dia atras
UPDATE users
SET actual_streak = actual_streak + 1,
last_streak_update = now()
WHERE DATE(last_streak_update) < CURRENT_DATE;

-- Tarefa f. Um comando DELETE para remover os registros que satisfazem uma condição simples.
-- Remover usuários que estão inativos por pelo menos 1 mes
DELETE FROM users
WHERE EXTRACT(month FROM AGE(NOW(), last_streak_update)) > 0;

-- Tarefa g. Um comando DELETE para remover os registros que satisfazem uma condição composta.
-- Remover tasks que possuem data de expiração anterior a data de criação
DELETE FROM tasks
WHERE created_at > expires_at;

-- Tarefa h. Um comando DELETE para remover os registros que satisfazem uma condição que envolve uma coluna de outra tabela.
-- Remover task sections que não possuem nenhuma task atrelada
DELETE FROM task_section ts
WHERE NOT EXISTS (
    SELECT * FROM task t WHERE t.task_section_id = ts.id
);

-- Tarefa i. Um comando SELECT para exibir alguns dados dos registros que satisfazem uma condição.
-- Selecionar nome de usuario e email de usuarios com streak maior que 10
SELECT username, email 
FROM users 
WHERE actual_streak > 10;

-- Tarefa j. Um comando SELECT para exibir alguns dados dos registros que satisfazem uma condição composta.
-- Selecionar nome de usuario e email de usuarios que possuem a highest_streak maior que 29 e a streak atual esta zerada
SELECT username, email
FROM users
WHERE highest_streak > 29
AND actual_streak = 0;

-- Tarefa k. Um comando SELECT para exibir alguns dados dos registros de DUAS tabelas usando algum operador de junção qualificada (ex. INNER JOIN).
-- Selecionar todas tarefas e com isso mostrar seu nome e o nome da seção que ela esta atrelada
SELECT t.title, ts.title
FROM task t
INNER JOIN task_section ts
ON t.task_section_id = ts.id;

-- Tarefa l. Um comando SELECT para exibir alguns dados dos registros de TRÊS tabelas usando os operadores de junção qualificada (ex. INNER JOIN).
-- Selecionar todas tarefas e mostrar o seu nome, o nome da seção que ela esta atrelada e o usuário que a pertence
SELECT t.title, ts.title, u.username
FROM task t
INNER JOIN task_section ts
ON t.task_section_id = ts.id
INNER JOIN users u
ON u.id = ts.user_id;

-- Tarefa m. Um comando SELECT para exibir alguns dados dos registros de tabelas usando algum operadores de junção externa (ex. OUTER LEFT ou OUTER RIGHT  JOIN).
-- Selecionar o nome de todas tarefas e o nome de suas subtarefas, mostrar subtarefa como null caso não tenha nenhuma
SELECT t.title, st.title
FROM task t
LEFT JOIN subtask st
ON t.id = st.task_id;

-- Tarefa n. Um comando SELECT para exibir alguns dados dos registros de tabelas usando o operador de junção qualificada FULL OUTER  JOIN.
-- Selecionar o nome de usuario e o nome de cada area de interesse que o pertence
SELECT u.username, ia.name
FROM users u
FULL OUTER JOIN user_interest_area uia
ON uia.user_id = u.id
FULL OUTER JOIN interest_area ia
ON uia.interest_area_id = ia.id;