# 🚚 Trackr

## Ferramentas para desenvolvimento

| Aplicação | Link para download |
| :--- | :--- |
| Docker Desktop | https://www.docker.com/products/docker-desktop |
| IntelliJ IDEA | https://www.jetbrains.com/idea/ |
| JDK 14         | https://www.oracle.com/java/technologies/javase/jdk14-archive-downloads.html |
| GIT | https://git-scm.com/downloads |
| NodeJS | https://nodejs.org/en/ |
| Yarn | https://yarnpkg.com/ |

### Setup Frontend

Para desenvolvimento _frontend_ é necessário instalar o [Vue CLI](https://cli.vuejs.org/) e alguns plugins. Para isso, execute o comando abaixo:

```powershell
npm install -g @vue/cli @vue/cli-service-global

# ou

yarn global add @vue/cli @vue/cli-service-global
```

Para instalar as dependências da aplicação, navegue até a pasta `frontend` e execute:

```powershell
yarn
```

E, depois, para subir a aplicação, execute:

```powershell
yarn serve
```

A saída deve ser algo parecido com

```none
DONE Compiled successfully in 7353ms
          
No type errors found
Version: typescript 3.9.7
Time: 3179ms

  App running at:
  - Local:   http://localhost:8081/
  - Network: http://192.168.100.4:8081/

  Note that the development build is not optimized.
  To create a production build, run yarn build.
```


## Infraestrutura 

Atualmente o _backend_ usa um [banco de dados em memória embutido](https://www.h2database.com/html/main.html), portanto, o setup da infraestrutura não é necessário para desenvolvimento.

A infraestrutura para desenvolvimento _backend_ (banco de dados) pode ser gerenciada (inicializada, parada e excluída) usando o Docker. Para isto, navegue até a pasta `src/backend` e execute os comandos abaixo:

* Inicializar a infraestrutura (banco de dados e adminer)

    ```powershell
    docker-compose -f .\docker\compose-infra.yml up -d
    ``` 

* Finalizar a infraestrutura

    ```powershell
    docker-compose -f .\docker\compose-infra.yml down
    ```

* Executar a aplicação como container

    ```powershell
    docker-compose -f .\docker\compose-infra.yml -f .\docker\compose-backend.yml up -d --build
    ```
