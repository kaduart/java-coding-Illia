# Teste Ília Java Dev 
Projeto básico de informação de um usuário que utiliza o framework SpringBootSecurity para autenticação, e basicamente um CRUD de usuário.

## Pré-requisitos
Java 8
Dependências e Libs Instaladas
Hibernate entity Manager,
SpringBoot Starter JDBC,
Spring Data JPA,
SpringBoot StarterWeb,
SpringBoot DevTools,
SpringBoot Security Web,
SpringBoot Security Config,
SpringBoot Maven Plugin,
H2 Data Base,
Mapstruct,

## Database
H2 Data Base

## Arquitetura
A Arquitetura do projeto foi criada conforme imagem, com intuito de dividir ao máximo os packages com suas classes de acordo com sua função.

## Classe UserDTO
Tem o papel de fazer a persistência dos dados junto ao Banco de Dados.

## Classe UserController
Tem a finalidade de fazer a utilização dos protocolos HTTP (GET, PUT, POST e DELETE)

## Classe UserService
É passada para a classe UserController, como forma de segurança dos dados(como se fosse um encapsulamento), evitandoa ssim que usuario através do nabegador consiga pegar essas informações, através do "ID" por exemplo.
Na classe "UserService" onde chamamos a classe "UserRepository" para fazer a persistência dos dados no Banco de dados e pegamos esse "userDTO" e o convertemos para "User" quando preciso, dependendo de qula fluxo esta vindo a informação.

## Classe UserMapper
Tem a finalidade de converte o DTO para a classe User e vice-versa.

## Classe Role
A classe Role tem a função de criar papéis para cada usuário, onde cada um tem acesso aquilo que for determinado pela gestão.

## Classe WebConfigSecurity
Foi utilizado o framework SpringBootSecurity para fazer a parte de configuração do serviço de autenticação e das Roles.

## Classe ImplementationUserDetailsService
Tem o papel de fazer a tratativa de erro caso o usuário não tenha sido encontrado, Caso seja ele redireciona para determinada tela já autenticado.

