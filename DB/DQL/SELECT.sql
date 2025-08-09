-- Listar todos os dados de todas as pessoas cadastradas.
SELECT * FROM pessoa;

-- Listar nome, e-mail e data de nascimento das pessoas cadastradas.
SELECT email, nome, data_nasc FROM pessoa;

-- Listar nome, e-mail e data de nascimento da 3a à 8a pessoa cadastrada.
SELECT email, nome, data_nasc FROM pessoa OFFSET 2 LIMIT 6;

-- Listar nome, e-mail e idade das pessoas cadastradas.
SELECT email, nome, EXTRACT(year FROM AGE(NOW(), data_nasc)) AS idade FROM pessoa;

-- Listar a quantidade de agendamentos.
SELECT COUNT(*) FROM agendamento;

-- Listar a data/hora das consultas e os respectivos valores com desconto de 5%. Os valores devem ser precedidos com "R$". Por exemplo: R$ 150.00.
SELECT dh_consulta, CONCAT('R$ ', valor_consulta - (valor_consulta * 0.05)) FROM agendamento;

-- Listar nome, cpf e e-mail dos pacientes que não possuem plano de saúde.
SELECT nome, cpf, email FROM paciente WHERE plano_saude = false;

-- Listar os dados dos agendamentos registrados para o mesmo o mês da consulta.
SELECT * FROM agendamento WHERE EXTRACT(month from dh_agendamento) = EXTRACT(month from NOW()::date);

-- Listar cpf, nome e e-mail dos pacientes que não possuem telefone.
SELECT pessoa.cpf, pessoa.nome, pessoa.email FROM pessoa INNER JOIN paciente ON pessoa.cpf = paciente.cpf_pessoa WHERE pessoa.telefone is null;

-- Listar a data das consultas cujo o valor está entre R$ 50.00 e R$ 100.00.
SELECT * FROM agendamento WHERE valor_consulta BETWEEN 50.0 AND 100.0;

-- Listar cpf, nome e e-mail dos pacientes que moram em "Natal".
SELECT pessoa.cpf, pessoa.nome, pessoa.email FROM pessoa INNER JOIN paciente ON pessoa.cpf = paciente.cpf_pessoa WHERE endereco ILIKE '%natal%';

-- Listar cpf, nome, e-mail e data de nascimento dos pacientes ordenados pela data de nascimento.
SELECT pessoa.cpf, pessoa.nome, pessoa.email, pessoa.data_nasc FROM pessoa INNER JOIN paciente ON pessoa.cpf = paciente.cpf_pessoa ORDER BY pessoa.data_nasc ASC;

-- Listar a quantidade de pacientes que não possuem plano de saúde.
SELECT COUNT(*) FROM paciente WHERE plano_saude = false;

-- Listar o maior e o menor valor das consultas agendadas para cada dia que contém consulta.
SELECT dh_consulta, MIN(valor_consulta) AS min_valor, MAX(valor_consulta) AS max_valor FROM agendamento GROUP BY dh_consulta;

-- Listar a média dos valores das consultas agendadas para o mês de Dezembro.
SELECT avg(valor_consulta) FROM agendamento WHERE EXTRACT(month from dh_consulta) = 12;

-- Listar nome e e-mail das pessoas que agendaram alguma consulta para o dia do seu aniversário.
SELECT pessoa.nome, pessoa.email FROM pessoa INNER JOIN agendamento ON pessoa.cpf = agendamento.cpf_paciente WHERE WHERE EXTRACT(day FROM pessoa.data_nasc) = EXTRACT(day FROM dh_agendamento) AND EXTRACT(month FROM pessoa.data_nasc) = EXTRACT(month FROM dh_agendamento);

-- Listar o nome, e-mail, cpf dos médicos e as suas respectivas especialidades.
SELECT pessoa.nome, pessoa.email, pessoa.cpf, especialidade.descricao FROM pessoa INNER JOIN medico ON medico.cpf_pessoa = pessoa.cpf INNER JOIN medico_especialidade ON medico.cpf_pessoa = medico_especialidade.cpf_medico INNER JOIN especialidade ON medico_especialidade.id_especialidade = especialidade.id;

-- Listar a quantidade de consultas para cada médico.
SELECT medico.cpf_medico, COUNT(*) AS total_consultas FROM medico INNER JOIN agendamento ON medico.cpf_medico = agendamento.cpf_medico GROUP BY medico.cpf_medico;