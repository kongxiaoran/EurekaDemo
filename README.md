

#### **中文文档：**

&emsp;&emsp;跟我一样对于Eureka集群配置不太熟悉的小白，可以下拉这个demo去学习如何搭建一个高可用的Eureka伪集群。

##### 		1.eureka（Eureka Server）:

&emsp;&emsp;Eureka Server在这里是为了实现服务发现功能，各个节点启动后，会在Eureka Server中进行注册。这		样EurekaServer中的服务注册表中将会存储所有可用服务节点的信息，服务节点的信息可以在界面中直观的		看到。

&emsp;&emsp;特别的是该demo中，我们采用的是单机高可用eureka注册中心。三个eureka server 互相注册，形成一		个eureka server 集群，来提高eureka的可用性。

##### 		2.consumer（Eureka client） : 

&emsp;&emsp;代表通用意义上的消费者。这个消费者节点上，我们使用的是Feign声明式的web service客户端并配置		了Ribbon（负载均衡工具）、Hystrix的断路器。

##### 		3.provider（Eureka client）:

&emsp;&emsp;代表通用意义上的生产者。该节点上没有什么特殊的配置。和其他节点一样的是，使用了SpringSecurity		去设置安全用户验证，保护eureka。

##### 4.hystrix-dashboard :

> &emsp;&emsp;Hystrix源生提供了单机和集群的监控服务，单机借助*Hystrix-Dashboard*,集群借助*Turbine*

&emsp;&emsp;Feign中集成了Ribbon与Hystrix两个重要组件，而consumer就是一个feign客户端。所以我们可以在浏览器上直接使用hystrix监控consumer：

```markdown
http://localhost:8900/hystrix.stream			//8900为consumer所占端口
```

&emsp;&emsp;我们使用Hystrix-Dashboard 的原因是：它能可视化监控单体应用，也可以在它的基础上整合 Turbine，对集群进行监控。

##### 5.consumer-hystrix-turbine

&emsp;&emsp;Turbine有一个重要的功能就是汇聚监控信息，并将汇聚到的监控信息提供给Hystrix Dashboard来集中展示和监控。



------

#### **English documents**

&emsp;&emsp;Like me, Xiaobai, who is not familiar with Eureka cluster configuration, can drop down this demo to learn how to build a highly available Eureka pseudo cluster.

##### 1.eureka（Eureka Server）:

&emsp;&emsp;Eureka Server is here to implement service discovery. After each node starts, it will register in 	Eureka Server. In this way, the service registry in Eureka Server will store the information of all available service nodes, and the information of service nodes can be seen intuitively in the interface.

&emsp;&emsp;In particular, in this demo, we use a single-machine high-availability Eureka registry. Three Eureka servers are registered with each other to form a cluster of Eureka servers to improve the availability of eureka.

##### 2.consumer（Eureka client） : 

&emsp;&emsp;Represents consumers in a general sense. On this consumer node, we use a Feign declarative web service client with Ribbon (Load Balancing Tool) and Hystrix circuit breakers.

##### 3.provider（Eureka client）:

&emsp;&emsp;Represents producers in a general sense. There is no special configuration on this node. Like other nodes, Spring Security is used to set up secure user authentication and protect eureka.





