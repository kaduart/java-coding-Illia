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
<img src="/src/main/java/br/com/teste/ilia/arquitetura.png">
A Arquitetura do projeto foi criada conforme imagem, com intuito de dividir ao máximo os packages com suas classes de acordo com sua função.

## Classe UserDTO
<img src="/src/main/java/br/com/teste/ilia/userDTO.png">
Tem o papel de fazer a persistência dos dados junto ao Banco de Dados.

## Classe UserController
<img src="/src/main/java/br/com/teste/ilia/userController.png">
Tem a finalidade de fazer a utilização dos protocolos HTTP (GET, PUT, POST e DELETE)

## Classe UserService
<img src="/src/main/java/br/com/teste/ilia/userService.png">
É passada para a classe UserController, como forma de segurança dos dados(como se fosse um encapsulamento), evitando assim que usuário através do navegador(por exemplo),consiga pegar essas informações, através do "ID".
Na classe "UserService" onde chamamos a classe "UserRepository" para fazer a persistência dos dados no Banco de dados e pegamos esse "userDTO" e o convertemos para "User" e vice-versa.

## Classe UserMapper
<img src="/src/main/java/br/com/teste/ilia/userMapper.png">
Tem a finalidade de converte o DTO para a classe User e vice-versa.

## Classe Role
<img src="/src/main/java/br/com/teste/ilia/role.png">
A classe Role tem a função de criar papéis para cada usuário, onde cada um tem acesso aquilo que for determinado pela gestão.

## Classe WebConfigSecurity
<img src="/src/main/java/br/com/teste/ilia/WebConfigSecurity.png">
Foi utilizado o framework SpringBootSecurity para fazer a parte de configuração do serviço de autenticação e das Roles.

## Classe ImplementationUserDetailsService
<img src="/src/main/java/br/com/teste/ilia/ImplementationUserDetailsService.png">
Tem o papel de fazer a tratativa de erro caso o usuário não tenha sido encontrado, Caso seja ele redireciona para determinada tela já autenticado.


## OBS:
Foi feita a integração ao HEROKU automaticamente, quando houver alguma alteração (git push etc...).
