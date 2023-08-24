[中文文档](https://github.com/jacksparrow414/springcloud-demo/edit/master/README_ZH_CN.md)
# demo description
A small example of getting started with Spring Cloud, which is being updated continuously

## project instruction
It is designed for those who are not familiar with SpringCloud. The code does not have specific codes for actual application scenarios.   

  
It is just composed of small examples. It is for you to quickly understand the main components of SpringCloud and quickly get started with SpringCloud.

## project directory structure
- demo-eureka, registry center example
- demo-gateway, gateway example
- demo-clientone, simulated microservice client 1
- demo-clienttwo, simulated microservice client 2
- demo-clientthree, simulated microservice client 3
- nignx.conf, nginx configuration example file

## Microservice Description
|Name  | Description
|------------- | -------------
|demo-eureka  | demo-eureka is a common registration center for all microservices. All microservice instances will be registered here. It can be simply understood as a list. If A needs B, just come to this list and find it
|demo-gateway  | The gateway of the microservice, which is also an instance, will register with the registration center after startup, and undertake important tasks such as current limiting, routing, load balancing, fuse, authentication, and authentication
|demo-clientone | ClientOne is a simulated external service application, the same is true for the following two clients, just to demonstrate some functions of the springcloud framework
|demo-clienttwo | Same as above, another simulated application
|demo-clientthree | It is the same application as ClientTwo, but the port is different, and all the methods in them are the same
|nginx.conf | nginx configuration file, used to access its own file server, static resources, request forwarding, etc

## The basic request process of the client (PC, mobile, etc.)
Web browser/APP/H5 applet ----->initiate a request to nginx------->nginx reverse proxy, forward the request to the gateway in the microservice------>the gateway according to the interface Path ------> load balancing call target microservice interface ------> interface call

## Support for distributed transactions
At present, the distributed transaction Seata framework has been connected to ensure the transaction consistency of calls between microservices. For Seata usage, please refer to the following articles:
1. [Getting started with Seata](https://blog.csdn.net/dghkgjlh/article/details/104730024)

## Application Performance Monitoring for Distributed Systems
The application performance monitoring tool SkyWalking that has been connected to the distributed system can refer to the following articles for the use of SkyWalking:
1. [Getting started with SkyWalking](https://blog.csdn.net/dghkgjlh/article/details/106745714)
