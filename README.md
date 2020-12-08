```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.4.0)

2020-12-07 16:57:12.022  INFO 3459 --- [           main] app.Application                          : Starting Application using Java 11.0.8 on ... with PID 3459 (/Users/.../datacouch-647/build/classes/java/main started by ... in /Users/.../datacouch-647)
2020-12-07 16:57:12.027  INFO 3459 --- [           main] app.Application                          : No active profile set, falling back to default profiles: default
2020-12-07 16:57:12.337  INFO 3459 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data Couchbase repositories in DEFAULT mode.
2020-12-07 16:57:12.347  INFO 3459 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 7 ms. Found 0 Couchbase repository interfaces.
2020-12-07 16:57:12.410  INFO 3459 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data Couchbase repositories in DEFAULT mode.
2020-12-07 16:57:12.411  INFO 3459 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 0 ms. Found 0 Couchbase repository interfaces.
2020-12-07 16:57:12.412  INFO 3459 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data Couchbase repositories in DEFAULT mode.
2020-12-07 16:57:12.413  INFO 3459 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 0 ms. Found 0 Couchbase repository interfaces.
2020-12-07 16:57:12.569  WARN 3459 --- [           main] s.c.a.AnnotationConfigApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'couchbaseAuditingHandler': Cannot create inner bean '(inner bean)#2822c6ff' of type [org.springframework.aop.framework.ProxyFactoryBean] while setting bean property 'auditorAware'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name '(inner bean)#2822c6ff': Initialization of bean failed; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'auditorAwareRef' available
2020-12-07 16:57:12.576  INFO 3459 --- [           main] ConditionEvaluationReportLoggingListener : 

Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2020-12-07 16:57:12.589 ERROR 3459 --- [           main] o.s.b.d.LoggingFailureAnalysisReporter   : 

***************************
APPLICATION FAILED TO START
***************************

Description:

A component required a bean named 'auditorAwareRef' that could not be found.


Action:

Consider defining a bean named 'auditorAwareRef' in your configuration.


Process finished with exit code 1
```
