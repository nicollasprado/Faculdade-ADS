INSERT INTO Pessoa(cpf, email, nome, data_nasc, endereco) VALUES ('002', 'pp@email.com', 'Pedro I', '10-01-1479', 'R. Vasco');
INSERT INTO Pessoa(cpf, email, nome, data_nasc, endereco, telefone) VALUES ('003', 'ps@email.com', 'Pedro II', '10-02-1516', 'R. Flamengo', '5501');
INSERT INTO Pessoa(cpf, email, nome, data_nasc, endereco) VALUES ('001', 'dj@email.com', 'D João VI', '01-12-1415', 'R. Portugal');
INSERT INTO Pessoa(cpf, email, nome, data_nasc, endereco, telefone) VALUES ('004', 'jj@email.com', 'JJ Xavier', '12-11-1746', 'R. Minas', '5502');

INSERT INTO Paciente(cpf_pessoa, senha, plano_saude) VALUES ('002', 'senha1', false);
INSERT INTO Paciente(cpf_pessoa, senha, plano_saude) VALUES ('003', 'senha2', true);

INSERT INTO Medico(cpf_pessoa, crm) VALUES ('001', '111');
INSERT INTO Medico(cpf_pessoa, crm) VALUES ('004', '112');

INSERT INTO Especialidade(id, descricao) VALUES (11, 'Pediatra');
INSERT INTO Especialidade(id, descricao) VALUES (12, 'Cardiologista');
INSERT INTO Especialidade(id, descricao) VALUES (13, 'Ortopedista');

INSERT INTO Medico_Especialidade(cpf_medico, id_especialidade) VALUES ('001', 11);
INSERT INTO Medico_Especialidade(cpf_medico, id_especialidade) VALUES ('004', 11);
INSERT INTO Medico_Especialidade(cpf_medico, id_especialidade) VALUES ('004', 12);

INSERT INTO Agendamento(cpf_paciente, cpf_medico, dh_consulta, dh_agendamento, valor_consulta) VALUES ('002', '001', '14-04-1782 16:00', '14-03-1782 10:04:45', 80.0);
INSERT INTO Agendamento(cpf_paciente, cpf_medico, dh_consulta, dh_agendamento, valor_consulta) VALUES ('002', '004', '15-04-1782 10:00:00', '14-03-1782 10:04:45', 100.0);
INSERT INTO Agendamento(cpf_paciente, cpf_medico, dh_consulta, dh_agendamento, valor_consulta) VALUES ('002', '004', '17-05-1783 08:00:00', '10-05-1783 16:32:00', 100.0);
INSERT INTO Agendamento(cpf_paciente, cpf_medico, dh_consulta, dh_agendamento, valor_consulta) VALUES ('003', '001', '17-05-1783 08:30:00', '09-05-1783 09:05:56', 0.0);