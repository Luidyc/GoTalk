
# Go Talk - Live Chat

Aplicando o conceito de WEBSOCKET, estabelecendo uma conexão através do metodo STOMP.
Aplicação foi criada para treinar e aprimorar os conhecimentos dos métodos WEB.

* WebSocket Message Broker
* Message Mapping

O projeto possui pagina estatica, com HTML, CSS e JavaScript, permitindo utilizar os recursos.


## Documentação da API

#### Ao clicar em conectar, abre uma conexão TCP, realizada através do Websocket conectado a uma porta entre servidor e cliente.

```http
  CONNECT /GoTalk
```

#### Em seguida registra com Subcribe, criando uma conexão bidirecional onde pode enviar e consome as informação.

```http
  SUBSCRIBE /GoTalk/topics/livechat
```

#### Ao clicar em Send, a messagem é enviada em forma de Input.

```http
  SEND /GoTalk/app/new-message
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `user`      | `string` | Nome do usuario informado no campo |
| `message`      | `string` | Texto da mensagem |

#### No mesmo instante que a mensagem é enviada ela é consumida para ser exibida

```http
  MESSAGE /GoTalk/topics/livechat
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `content`      | `string` | Conteudo do Output, que é o usuario + mensagem |




## Autores

- [@LuidyC](https://www.github.com/Luidyc)

