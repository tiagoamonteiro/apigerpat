# ApiGerPat

Desenvolvimento de uma Web API REST para o gerenciamento de patrimônios empresarial.


#### Configurações utilizadas
- JDK Java 8.0
- Spring Framework (Spring Boot + Spring Web + Spring Data JPA)
- PostgresSQL

#### Endpoints

Sessão Usuario
- Criar usuário (POST): `/api/usuarios`

---

Sessão Patrimônio
- Listagem de patrimônios (GET): `/api/patrimonios`
- Listar um unico patrimônio (GET): `/api/patrimonio/{id}`
- Cadastro de patrimônio (POST): `/api/patrimonio`
- Deletar um patrimônio (DELETE): `/api/patrimonio` (Dados no corpo da requisição)

```
{ //Ex:
    "numeroTombo": 5,                    
    "nome":"DELL",
    "descricao":"Computador",
    "marca_id":"1"      
}
```
- Altera um patrimônio (PUT): `/api/patrimonio` (Dados no corpo da requisição)

---

Sessão Marcas
- Listagem de marcas (GET): `/api/marcas`
- Listar um unica marca (GET): `/api/marcas/{id}`
- Cadastro de marca (POST): `/api/marca`
- Deletar uma marca (DELETE): `/api/marca` (Dados no corpo da requisição)

```
{ //Ex:
    "id": 2,                    
    "nome":"Samsung"     
}
```
- Altera um patrimônio (PUT): `/api/marca` (Dados no corpo da requisição)