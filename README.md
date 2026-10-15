# Exercício 3 – API REST de uma Biblioteca Virtual

Projeto desenvolvido para a disciplina de Desenvolvimento de Sistemas.

## Objetivo

Implementar uma API REST utilizando Spring Boot para gerenciamento de livros de uma biblioteca virtual.

Os livros são armazenados em memória utilizando uma lista (`ArrayList`), sem banco de dados.

## Estrutura do projeto

- `com.suaapi.model` → entidade `Livro`
- `com.suaapi.controller` → controlador e endpoints da API
- `com.suaapi` → classe principal da aplicação

## Endpoints

### GET /livros

Retorna todos os livros cadastrados.

**Status:** 200 OK

### POST /livros

Cadastra um novo livro.

**Status:** 201 Created

Exemplo de requisição:

```json
{
    "titulo": "O Hobbit",
    "autor": "J.R.R. Tolkien",
    "anoPublicacao": 1937
}
