# Rastr.io

## Desenvolvimento Backend

### Ferramentas necessárias

| Aplicação | Link para download |
| :--- | :--- |
| Docker Desktop | https://www.docker.com/products/docker-desktop |
| IntelliJ IDEA | https://www.jetbrains.com/idea/ |
| JDK 14         | https://www.oracle.com/java/technologies/javase/jdk14-archive-downloads.html |
| GIT | https://git-scm.com/downloads |

### Execução da infra estrutura 

A infraestrutura para desenvolvimento pode ser gerenciada (inicializada, parada e excluída) usando o Docker. Para isto, navegue até a pasta `src/backend` e execute os comandos abaixo.:

* Inicializar a infraestrutura (banco de dados e adminer)

    ```
    docker-compose -f .\docker\compose-infra.yml up -d
    ``` 

* Finalizar a infraestrutura

    ```
    docker-compose -f .\docker\compose-infra.yml down
    ```

* Executar a aplicação como container

    ```
    docker-compose -f .\docker\compose-infra.yml -f .\docker\compose-backend.yml up -d --build
    ```
