# Sistema Odontológico

O software é composto por funcionalidades indispensáveis para toda clínica ou consultório odontológico. Nele é possível cadastrar novos pacientes, criar suas fichas de anamnese, inserir informações do seu plano de tratamento, orçar cada procedimento que será realizado, acompanhar o pagamento do cliente, agendar novas consultas e gerar relatórios gráficos com os dados mais importantes da empresa.


## Requisitos

É necessário ter instalado as seguintes tecnologias instaladas em sua máquina para o funcionamento da aplicação:

- Postgrees **v9.6**
- NetBeans

## Iniciando o Projeto

- Abra o projeto com Netbeans.
- Crie uma nova base de dados com o nome  `odonto` 
> **Atenção!** certifique-se de que o usuário do seu banco de dados seja `postgrees` e a senha `root`. Caso você use usuário e senha diferentes no seu banco, é possível alterar no arquivo `conf.properties` e no `persistence.xml` dentro do pacote META-INF.
- Execute a aplicação e na tela de login tente fazer um acesso com qualquer informação. Isso fará com que o ORM crie todas as tabelas inexistentes.
- Abra a classe Main do pacote de testes e execute. Você pode usar o atalho `shift + f6`. É um script que cria o usuário de Administrador com todas as permissões.

**Pronto!** Agora é possível acessar com o login: `admin` e senha `admin123`.

## Versionamento

Lembre de **nunca** commitar a pasta `/build` e o arquivo `build.xml`
