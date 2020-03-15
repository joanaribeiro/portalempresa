-- popula tabela de funcionarios
insert into funcionario(matricula, funcao, nome) values ('1001', 'Analista', 'Joana Ribeiro');
insert into funcionario(matricula, funcao, nome) values ('1002', 'Administrativo', 'Funcionario Fulano');
insert into funcionario(matricula, funcao, nome) values ('1003', 'Financeiro', 'Funcionario Cicrano');

-- popula tabela de transacoes
insert into transacao(data_operacao, tipo_operacao, montante) values ('15/03/2020', 'Pagamento de folha', '-50200')
insert into transacao(data_operacao, tipo_operacao, montante) values ('14/03/2020', 'Saque ATM', '-450')
insert into transacao(data_operacao, tipo_operacao, montante) values ('15/03/2020', 'Vendas TEF', '100700')
insert into transacao(data_operacao, tipo_operacao, montante) values ('12/03/2020', 'Saque ATM', '-450')
insert into transacao(data_operacao, tipo_operacao, montante) values ('13/03/2020', 'Saque ATM', '-450')