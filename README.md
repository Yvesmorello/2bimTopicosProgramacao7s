
# CRUD TASK COM AUTENTICAÇÃO DE USUARIO VIA JWT








## ROTAS PARA USUARIO


• ROTA PARA REGISTRO DE USUARIO
    
    - (POST) http://localhost:8080/auth/register

    - PASSE O CORPO DO USUARIO COMO O EXEMPLO ABAIXO

    {
         "username": "joao",
         "password": "123456",
         "role": "USER"
    } 

    - VOCE TERA A SEGUINTE RESPOSTA CONFORME O EXEMPLO, RETORNANDO OS DADOS REGISTRADOS E COM SENHA CRIPTOGRAFADA

    {
       "username": "joao",
       "password": "$2a$10$...",
       "role": "USER"
    }

    ** VOCE PODE UTILIZAR AS ROLES (ADMIN OU USER) **

• ROTA PARA LOGIN DO USUARIO 

    - (POST) http://localhost:8080/auth/login

    - PASSE O CORPO DO USUARIO COMO O EXEMPLO ABAIXO, INFORMANDO USERNAME E PASSWORD

    {
        "username": "joao",
        "password": "123456"
    }

    - VOCE TERA A SEGUINTE RESPOSTA CONFORME O EXEMPLO, RETORNANDO O TOKEN DE AUTENTICAÇÃO PARA UTILIZAR NAS DEMAIS ROTAS 

    {
    	"message": "Token para acesso",
	    "token": "eyJhbGciOiJIUzM4NCJ9..."
    }

    **ESTE TOKEN DEVE SER UTILIZADO PARA TER PERMISSAO PARA UTILIZAR OUTRAS ROTAS DA APLICAÇÃO, SENDO NECESSARIO INSERI-LO NO CAMPO "AUTH -> Bearer token "**





## ROTAS PARA TASK

• ROTA PARA CRIACAO DAS TASKS 

    - (POST) http://localhost:8080/task

    - PASSE O CORPO DA TASK COMO O EXEMPLO ABAIXO

    {
        "titulo": "Estudar Spring",
        "descricao": "Estudar segurança com JWT",
        "status": "PENDENTE"
    }

    - VOCE TERA A SEGUINTE RESPOSTA CONFORME O EXEMPLO, RETORNANDO OS DADOS REGISTRADOS DA TASK

    {
        "id": 1,
        "titulo": "Estudar Spring",
        "descricao": "Estudar segurança com JWT",
        "status": "PENDENTE"
    }

    **VOCE PODE UTILIZAR OS STATUS (PENDENTE, EM_ANDAMENTO OU CONCLUIDA)**

• ROTA PARA LISTAR AS TASKS CRIADAS 

    - (GET) http://localhost:8080/task

    - TERA COMO RESPOSTA AS INFORMAÇOES DE TODAS AS TASKS CRIADAS, POR EXEMPLO 

    
    {
       "id": 1,
       "titulo": "Estudar Spring",
       "descricao": "Estudar segurança com JWT",
       "status": "PENDENTE"
    }

• ROTA PARA ATUALIZAR O STATUS DE UMA TASK 

    - (PUT) http://localhost:8080/task/{ID}
    - VOCE DEVE INFORMAR O ID DA TASK QUE DESEJA ALTERAR O STATUS

    - PASSE O CORPO DA TASK QUE DESEJA ATUALIZAR O STATUS COMO O EXEMPLO ABAIXO

    {
        "titulo": "Estudar JWT",
        "descricao": "Rever tokens e segurança",
        "status": "CONCLUIDA"
    }

    - TERA COMO RESPOSTA AS INFORMAÇOES DA TASKS COM O STATUS ALTERADO, POR EXEMPLO 

    {
        "id": 1,
        "titulo": "Estudar JWT",
        "descricao": "Rever tokens e segurança",
         "status": "CONCLUIDA"
    }

    **SÓ PODE SER ALTERADO O STATUS DA TASK**

• ROTA PARA DELETER UMA TASK 

    - (DELETE) http://localhost:8080/task/1
    - VOCE DEVE INFORMAR O ID DA TASK QUE DESEJA DELETAR

    - TERA COMO RESPOSTA APENAS UMA CONFIRMAÇÃO DO SISTEMA QUE A TASK FOI REMOVIDA (204 NO CONTENT)




## ESTAS SÃO TODAS A ROTAS PARA UTILIZAR, LEMBRANDO QUE PARA UTILIZAR AS ROTAS DA TASK PRECISA ESTAR LOGADO COM O USUARIO E INFORMAR O TOKEN DE AUTENTICAÇÃO EM TODAS AS ROTAS PARA UTILIZA-LA
