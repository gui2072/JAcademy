CREATE TABLE login(
    id INT PRIMARY KEY AUTO_INCREMENT,
    usuario VARCHAR(11), -- chave estrangeira de aluno ou professor ou fucionario
    senha VARCHAR(32)
);
