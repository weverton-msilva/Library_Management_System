# 📚 Library Management System (CLI)

> Um sistema de gerenciamento de biblioteca desenvolvido em Java puro (Console/CLI), focado na aplicação de conceitos sólidos de Orientação a Objetos, manipulação de coleções e tratamento de exceções.

## 🚀 Sobre o Projeto

Este projeto foi desenvolvido como parte de um portfólio para demonstrar domínio sobre a linguagem Java e os pilares da Orientação a Objetos. A aplicação roda diretamente no terminal e permite o controle completo do acervo de uma biblioteca, gerenciamento de usuários (leitores) e o fluxo de empréstimos e devoluções.

## 🛠️ Tecnologias Utilizadas

* **Java (JDK 17+)**
* **Programação Orientada a Objetos (POO):** Encapsulamento, Herança, Polimorfismo e Interfaces.
* **Java Collections Framework:** Uso avançado de `List`, `Map` e `Set` para armazenamento em memória.
* **Java Time API (`java.time`):** Para controle de prazos, datas de empréstimo e cálculo de multas.

## 📋 Funcionalidades

* **Gerenciamento de Livros:**
  * Cadastrar novos livros (Título, Autor, ISBN, Ano e Quantidade em estoque).
  * Listar todos os livros disponíveis no acervo.
  * Buscar livros por título ou autor.
* **Gerenciamento de Usuários:**
  * Cadastrar leitores (Nome, ID/Matrícula, E-mail).
  * Listar usuários cadastrados.
* **Sistema de Empréstimos e Devoluções:**
  * Realizar empréstimo vinculando um usuário a um livro disponível (com validação de estoque).
  * Registrar a devolução do livro e atualizar automaticamente a data de entrega.
  * Cálculo automático de multas em caso de atraso na devolução.

## 📂 Arquitetura do Projeto

```text
src/
└── com/
    └── biblioteca/
        ├── model/           # Classes de domínio (Livro, Usuario, Emprestimo)
        ├── exception/       # Exceções personalizadas (LivroIndisponivelException)
        ├── repository/      # Gerenciamento dos dados na memória
        ├── service/         # Regras de negócio (Validações, empréstimos)
        └── Main.java        # Interface CLI e menu interativo no terminal

```

## ⚙️ Como Executar o Projeto

### Pré-requisitos

* Ter o **Java JDK 17** ou superior instalado na sua máquina (`java -version`).
* Ter uma IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code) ou o terminal configurado.

### Passo a passo para execução

1. **Clone este repositório:**
```bash
git clone [https://github.com/seu-usuario/library-management-system.git](https://github.com/seu-usuario/library-management-system.git)

```

2. **Abra o projeto** na sua IDE favorita.
3. **Localize a classe principal:** Navegue até o arquivo `src/com/biblioteca/Main.java`.
4. **Compile e execute:**
* **Pela IDE:** Clique no botão de "Play" (Run) ao lado da classe `Main` ou dentro dela.
* **Pelo Terminal:** Abra a pasta raiz do projeto no terminal e execute os comandos:
```bash
# Compilar as classes
javac -d bin src/com/biblioteca/*.java src/com/biblioteca/model/*.java src/com/biblioteca/repository/*.java src/com/biblioteca/service/*.java src/com/biblioteca/exception/*.java

# Executar a aplicação
java -cp bin com.biblioteca.Main

```

5. **Interaja com o menu** exibido no console do terminal digitando as opções desejadas.

## 💡 Próximos Passos (Evoluções Futuras)

* [ ] Adicionar funcionalidade de devolução com cálculo de multas.
* [ ] Persistência de dados em arquivos (JSON ou CSV).
* [ ] Migração do repositório em memória para banco de dados relacional (PostgreSQL / H2).
* [ ] Criação de uma API REST utilizando **Spring Boot**.

---

Desenvolvido com 💙 por [Weverton](https://www.google.com/search?q=https://github.com/seu-usuario).
