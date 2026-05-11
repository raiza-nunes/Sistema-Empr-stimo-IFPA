# Sistema de Gerenciamento de Empréstimos de Laboratório

<p align="center">
  <img src="https://img.shields.io/badge/Java-25-orange?style=for-the-badge&logo=openjdk" />
  <img src="https://img.shields.io/badge/MySQL-8.0-blue?style=for-the-badge&logo=mysql" />
  <img src="https://img.shields.io/badge/JDBC-Banco%20de%20Dados-success?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Status-Em%20Desenvolvimento-brightgreen?style=for-the-badge" />
</p>

---

#  Sobre o Projeto

O Sistema de Gerenciamento de Empréstimos de Laboratório foi desenvolvido com o objetivo de auxiliar no controle de equipamentos utilizados em ambientes acadêmicos.

A aplicação permite registrar alunos, cadastrar equipamentos e controlar empréstimos realizados no laboratório, mantendo todas as informações armazenadas em banco de dados relacional.

O projeto foi construído utilizando Java com integração JDBC ao MySQL, aplicando conceitos fundamentais de Programação Orientada a Objetos (POO) e organização em camadas.

---

#  Objetivos do Sistema

- Automatizar o controle de empréstimos
- Organizar equipamentos do laboratório
- Registrar alunos cadastrados
- Armazenar histórico de movimentações
- Facilitar consultas de disponibilidade
- Evitar perda de informações

---

#  Tecnologias Utilizadas

| Tecnologia | Utilização |
|---|---|
| Java 25 | Desenvolvimento da aplicação |
| MySQL | Banco de dados |
| JDBC | Conexão Java com MySQL |
| Git | Controle de versão |
| GitHub | Hospedagem do projeto |
| IntelliJ IDEA | Ambiente de desenvolvimento |

---

#  Estrutura do Projeto

```text
SistemaEmprestimos/
│
├── src/
│   ├── database/
│   │   └── ConexaoMySQL.java
│   │
│   ├── dao/
│   │   ├── AlunoDAO.java
│   │   ├── EquipamentoDAO.java
│   │   └── EmprestimoDAO.java
│   │
│   ├── model/
│   │   ├── Aluno.java
│   │   ├── Equipamento.java
│   │   └── Emprestimo.java
│   │
│   └── Main.java
│
├── diagramas/
│   ├── caso_de_uso.png
│   ├── diagrama_classes.png
│   └── diagrama_sequencia.png
│
├── script_banco.sql
└── README.md
```

---

#  Funcionalidades

##  Cadastro de alunos

Permite armazenar os dados dos alunos que utilizam os equipamentos do laboratório.

---

##  Cadastro de equipamentos

Gerencia os equipamentos disponíveis para empréstimo.

### Exemplos:
- Mouse
- Monitor
- Teclado
- Headset

---

##  Controle de empréstimos

Relaciona:
- aluno
- equipamento
- data do empréstimo

---

##  Consulta de informações

O sistema permite visualizar:
- alunos cadastrados
- equipamentos disponíveis
- histórico de empréstimos

---

#  Banco de Dados

O banco de dados foi modelado utilizando relacionamentos entre tabelas para garantir integridade das informações.

##  Principais tabelas

### aluno
Armazena os dados dos estudantes.

### equipamento
Responsável pelos equipamentos do laboratório.

### emprestimo
Tabela responsável por relacionar alunos e equipamentos utilizando chaves estrangeiras.

---

#  Exemplo de Consulta SQL

```sql
SELECT a.nome AS aluno,
       e.nome AS equipamento,
       em.data_emprestimo
FROM emprestimo em
INNER JOIN aluno a ON em.aluno_id = a.id
INNER JOIN equipamento e ON em.equipamento_id = e.id;
```

---

#  Diagramas do Sistema

A modelagem do sistema foi documentada utilizando diagramas UML para representar a estrutura e o funcionamento da aplicação.

---

#  Diagrama de Caso de Uso

Representa as interações entre os usuários e o sistema.

<p align="center">
  <img src="./diagramas/caso_de_uso.png" width="700"/>
</p>

---

#  Diagrama de Classes

Mostra a estrutura das classes, atributos, métodos e relacionamentos utilizados no sistema.

<p align="center">
  <img src="./diagramas/diagrama_classes.png" width="700"/>
</p>

---

#  Diagrama de Sequência

Representa o fluxo de execução das operações do sistema durante um empréstimo.

<p align="center">
  <img src="./diagramas/diagrama_sequencia.png" width="700"/>
</p>

---

# 🚀 Como Executar o Projeto

##  Clonar o repositório

```bash
git clone https://github.com/seuusuario/seurepositorio.git
```

---

##  Configurar o banco de dados

Execute o arquivo:

```text
script_banco.sql
```

no MySQL Workbench.

---

##  Configurar conexão JDBC

Edite a classe:

```text
ConexaoMySQL.java
```

e informe:
- usuário
- senha
- porta do MySQL

---

##  Executar o projeto

Abra o projeto no IntelliJ IDEA e execute:

```text
Main.java
```

---

#  Conceitos Aplicados

Durante o desenvolvimento foram utilizados conceitos importantes de engenharia de software:

- Programação Orientada a Objetos
- Encapsulamento
- JDBC
- Persistência de dados
- Estrutura em camadas
- DAO (Data Access Object)
- Relacionamento entre tabelas
- UML
- Tratamento de exceções

---



---

#  Autor
Raiza Nunes

Projeto desenvolvido para fins acadêmicos e aprimoramento de conhecimentos em:

- Java
- Banco de Dados
- JDBC
- UML
- Arquitetura de Software
- Git e GitHub
