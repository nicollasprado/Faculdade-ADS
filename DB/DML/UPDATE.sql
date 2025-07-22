UPDATE Pessoa SET data_nasc = '01-12-1416' WHERE cpf = 001;
UPDATE Pessoa SET telefone = '5503', email = 'pf@email.com' WHERE cpf = 002;
UPDATE Pessoa SET telefone = CONCAT('9', telefone);
UPDATE Agendamento SET dh_consulta = REPLACE(dh_consulta, '17-05-1783', '19-05-1783'), valor_consulta = 150.00 WHERE dh_consulta LIKE '%17-05-1783%';
UPDATE Medico_Especialidade SET id = 13 WHERE id = 12, cpf_medico = '004';