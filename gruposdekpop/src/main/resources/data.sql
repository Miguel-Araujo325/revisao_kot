-- Inserir dados na tabela Empresa
INSERT INTO Empresa (nome, data_fundacao) VALUES ('Empresa A', '2022-01-01');
INSERT INTO Empresa (nome, data_fundacao) VALUES ('Empresa B', '2022-02-01');
INSERT INTO Empresa (nome, data_fundacao) VALUES ('Empresa C', '2022-03-01');

-- Inserir dados na tabela Grupo
INSERT INTO Grupo (nome, data_debut, empresa_id) VALUES ('Grupo X', '2022-01-01', 1);
INSERT INTO Grupo (nome, data_debut, empresa_id) VALUES ('Grupo Y', '2022-02-01', 1);
INSERT INTO Grupo (nome, data_debut, empresa_id) VALUES ('Grupo Z', '2022-03-01', 2);

-- Inserir dados na tabela SubUnit
INSERT INTO Sub_Unit (nome, data_debut, grupo_id) VALUES ('SubUnit 1', '2022-01-01', 1);
INSERT INTO Sub_Unit (nome, data_debut, grupo_id) VALUES ('SubUnit 2', '2022-02-01', 1);
INSERT INTO Sub_Unit (nome, data_debut, grupo_id) VALUES ('SubUnit 3', '2022-03-01', 2);
