-- Listar o nome, e-mail e crm dos médicos.
SELECT p.nome, p.email, m.crm 
FROM pessoa p 
INNER JOIN medico m ON p.cpf = m.cpf_pessoa;

-- Listar o nome, e-mail e senha dos pacientes.
SELECT pe.nome, pe.email, pe.senha 
FROM pessoa pe 
INNER JOIN paciente pa ON pe.cpf = pa.cpf_pessoa;

-- Listar os CRM dos médicos e as descrições das suas respectivas especialidades.
SELECT m.crm, e.descricao 
FROM medico m 
INNER JOIN medico_especialidade me ON m.cpf_pessoa = me.cpf_medico 
INNER JOIN especialidade e ON me.id_especialidade = e.id; 

-- Listar o crm de todos os médicos cardiologistas.
SELECT m.crm 
FROM medico m 
INNER JOIN medico_especialidade me ON m.cpf_pessoa = me.cpf_medico 
INNER JOIN especialidade e ON me.id_especialidade = e.id 
WHERE e.descricao ILIKE 'CARDIOLOGISTA';

-- Listar o nome, CPF, crm e senha dos pacientes que também são médicos.
SELECT pe.nome, pe.cpf, pe.senha, m.crm 
FROM pessoa pe INNER JOIN paciente pa ON pe.cpf = pa.cpf_pessoa 
INNER JOIN medico m ON m.cpf_pessoa = pa.cpf_pessoa;

-- Listar o nome dos médicos e as respectivas quantidades de consultas agendadas. Observem que alguns médicos podem não ter consulta agendada.
SELECT p.nome, COUNT(a.cpf_medico) AS total_consultas 
FROM pessoa p 
INNER JOIN medico m ON p.cpf = m.cpf_pessoa 
LEFT JOIN agendamento a ON a.cpf_medico = m.cpf_pessoa 
GROUP BY p.nome;

-- Listar as especialidades e a quantidade de médicos cadastrados nessa especialidade. Observem que algumas especialidades podem não ter médicos associados.
SELECT e.descricao, COUNT(m.cpf_pessoa) AS total_medicos 
FROM especialidade e 
INNER JOIN medico_especialidade me ON e.id = me.id_especialidade 
LEFT JOIN medico m ON me.cpf_medico = m.cpf_pessoa 
GROUP BY e.descricao DESC;

-- Listar os dados dos agendamentos, exibindo: (a) o nome e e-mail do paciente, (b) data/hora e valor da consulta, e (c) o nome e crm dos médicos.
SELECT pp.nome AS paciente_nome, pp.email AS paciente_email, a.dh_consulta, a.valor_consulta, pm.nome AS medico_nome, m.crm 
FROM agendamento a 
INNER JOIN pessoa pp ON a.cpf_paciente = pp.cpf
INNER JOIN medico m ON a.cpf_medico = m.cpf_pessoa
INNER JOIN pessoa pm ON a.cpf_medico = pm.cpf_pessoa;

-- Listar a data/hora das consultas agendadas para todos os cardiologistas  cadastrados.
SELECT a.dh_consulta
FROM agendamento a
INNER JOIN medico m ON a.cpf_medico = m.cpf_pessoa
INNER JOIN medico_especialidade me ON m.cpf_pessoa = me.cpf_medico
INNER JOIN especialidade e ON me.id_especialidade = e.id
WHERE e.descricao ILIKE 'cardiologista';

-- Listar o nome e CRM dos médicos e a média das suas consultas agendadas para o mês de dezembro/2020.
SELECT p.nome, m.crm,  AVG(a.valor_consulta) AS media_valor_consulta
FROM pessoa p
INNER JOIN medico m ON p.cpf = m.cpf_pessoa
INNER JOIN agendamento a ON m.cpf_pessoa = a.cpf_medico
WHERE EXTRACT(month FROM dh_consulta) = 12 
AND EXTRACT(year FROM dh_consulta) = 2020
GROUP BY p.nome, m.crm
ORDER BY media_valor_consulta DESC;