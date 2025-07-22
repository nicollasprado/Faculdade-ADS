DELETE FROM Agendamento WHERE cpf_paciente = '002', dh_agendamento = '17-05-1783';
DELETE FROM Agendamento WHERE cpf_medico = '001', valor_consulta = 0.0;
DELETE FROM Paciente USING Pessoa WHERE telefone = null OR telefone = '' OR plano_saude = true;
DELETE FROM Medico WHERE cpf_pessoa = '004';