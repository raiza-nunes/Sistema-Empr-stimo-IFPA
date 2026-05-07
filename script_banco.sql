DROP DATABASE IF EXISTS controle_laboratorio;
CREATE DATABASE controle_laboratorio;
USE controle_laboratorio;

CREATE TABLE aluno (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       nome VARCHAR(100) NOT NULL,
                       matricula VARCHAR(20) NOT NULL UNIQUE
);

CREATE TABLE equipamento (
                             id INT AUTO_INCREMENT PRIMARY KEY,
                             nome VARCHAR(100) NOT NULL,
                             disponivel BOOLEAN NOT NULL DEFAULT TRUE
);

CREATE TABLE emprestimo (
                            id INT AUTO_INCREMENT PRIMARY KEY,
                            aluno_id INT NOT NULL,
                            equipamento_id INT NOT NULL,
                            data_emprestimo DATE NOT NULL,
                            status VARCHAR(20) NOT NULL,
                            FOREIGN KEY (aluno_id) REFERENCES aluno(id),
                            FOREIGN KEY (equipamento_id) REFERENCES equipamento(id)
);

INSERT INTO aluno (nome, matricula) VALUES ('Raiza da Costa Nunes', '20260001');
INSERT INTO aluno (nome, matricula) VALUES ('Aydêe Lauanda Costa Barroso', '20260002');
INSERT INTO aluno (nome, matricula) VALUES ('Eduardo Castro Sousa', '20260003');
INSERT INTO aluno (nome, matricula) VALUES ('Fernanda Carvalho Barradas', '20260004');
INSERT INTO aluno (nome, matricula) VALUES ('Yasmin Smith Nogueira', '20260005');

INSERT INTO equipamento (nome, disponivel) VALUES ('Monitor', true);
INSERT INTO equipamento (nome, disponivel) VALUES ('Teclado', true);
INSERT INTO equipamento (nome, disponivel) VALUES ('Mouse', true);
INSERT INTO equipamento (nome, disponivel) VALUES ('Projetor', true);
INSERT INTO equipamento (nome, disponivel) VALUES ('Webcam', true);
INSERT INTO equipamento (nome, disponivel) VALUES ('Impressora', true);

SELECT * FROM aluno;
SELECT * FROM equipamento;
SELECT * FROM emprestimo;