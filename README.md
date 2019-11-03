# demo
springcloud入门小例子,持续更新中
## 项目说明
   **本项目为springcloud入门基础小例子，旨在为不熟悉springcloud的同学建立，持续更新中，代码中不具备实际应用场景的具体代码，只是一个个小的example组成，是为了方便各位快速理解springcloud的主要部件以及快速上手springcloud**
## 项目构成
  + demo
    + demo-eureka、注册中心示例
    + demo-gateway、网关示例
    + demo-clientone、模拟微服务客户端1
    + demo-clienttwo、模拟微服务客户端2
    + demo-clientthree、模拟微服务客户端3
    + nignx.conf、nginx配置示例文件
## 微服务说明
|名字  | 作用
|------------- | -------------
|demo-eureka  | 所有微服务公用的注册中心，所有微服务实例都会注册到这来，可以简单理解为一份名单，如果A需要B，则来这份名单里找即可
|demo-gateway  | 微服务的网关，同时也是一个实例，会启动之后注册到注册中心，承担着限流、路由、负载均衡、熔断、认证、鉴权等重要任务
|demo-clientone | 一个模拟的对外提供服务的应用，下面两个client也是如此，只是为了演示springcloud的框架的一些功能
|demo-clienttwo | 同上，是另外一个模拟的应用
|demo-clientthree | 同clienttwo是同一个应用，只不过端口不同而已，他们里面的所有方法都是一样的
|nginx.conf | nginx的配置文件，用于访问自己的文件服务器、静态资源、请求转发等
## 用户端(PC、移动端等)的基本请求流程
