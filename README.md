# Integration test is failing when @Component annotation not used

Run the test `com.mehmetozanguven.modulithconstraintvalidator.auth.AuthIntegrationTest`, it will fail with the following exception:

```log
rg.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.mehmetozanguven.modulithconstraintvalidator.user.FoobarService' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {}
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.raiseNoMatchingBeanFound(DefaultListableBeanFactory.java:1878) ~[spring-beans-6.1.1.jar:6.1.1]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1404) ~[spring-beans-6.1.1.jar:6.1.1]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1348) ~[spring-beans-6.1.1.jar:6.1.1]
	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:911) ~[spring-beans-6.1.1.jar:6.1.1]
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:789) ~[spring-beans-6.1.1.jar:6.1.1]
	at org.springframework.beans.factory.support.ConstructorResolver.autowireConstructor(ConstructorResolver.java:241) ~[spring-beans-6.1.1.jar:6.1.1]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.autowireConstructor(AbstractAutowireCapableBeanFactory.java:1356) ~[spring-beans-6.1.1.jar:6.1.1]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1193) ~[spring-beans-6.1.1.jar:6.1.1]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:563) ~[spring-beans-6.1.1.jar:6.1.1]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:523) ~[spring-beans-6.1.1.jar:6.1.1]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:320) ~[spring-beans-6.1.1.jar:6.1.1]
	at org.springframework.validation.beanvalidation.SpringConstraintValidatorFactory.getInstance(SpringConstraintValidatorFactory.java:56) ~[spring-context-6.1.1.jar:6.1.1]
	at org.hibernate.validator.internal.engine.constraintvalidation.ClassBasedValidatorDescriptor.newInstance(ClassBasedValidatorDescriptor.java:84) ~[hibernate-validator-8.0.1.Final.jar:8.0.1.Final]
	at org.hibernate.validator.internal.engine.constraintvalidation.AbstractConstraintValidatorManagerImpl.createAndInitializeValidator(AbstractConstraintValidatorManagerImpl.java:89) ~[hibernate-validator-8.0.1.Final.jar:8.0.1.Final]
	at org.hibernate.validator.internal.engine.constraintvalidation.ConstraintValidatorManagerImpl.getInitializedValidator(ConstraintValidatorManagerImpl.java:117) ~[hibernate-validator-8.0.1.Final.jar:8.0.1.Final]
	at org.hibernate.validator.internal.engine.constraintvalidation.ConstraintTree.getInitializedConstraintValidator(ConstraintTree.java:136) ~[hibernate-validator-8.0.1.Final.jar:8.0.1.Final]
	at org.hibernate.validator.internal.engine.constraintvalidation.SimpleConstraintTree.validateConstraints(SimpleConstraintTree.java:58) ~[hibernate-validator-8.0.1.Final.jar:8.0.1.Final]
	at org.hibernate.validator.internal.engine.constraintvalidation.ConstraintTree.validateConstraints(ConstraintTree.java:75) ~[hibernate-validator-8.0.1.Final.jar:8.0.1.Final]
	at org.hibernate.validator.internal.metadata.core.MetaConstraint.doValidateConstraint(MetaConstraint.java:130) ~[hibernate-validator-8.0.1.Final.jar:8.0.1.Final]
	at org.hibernate.validator.internal.metadata.core.MetaConstraint.validateConstraint(MetaConstraint.java:123) ~[hibernate-validator-8.0.1.Final.jar:8.0.1.Final]
	at org.hibernate.validator.internal.engine.ValidatorImpl.validateMetaConstraint(ValidatorImpl.java:555) ~[hibernate-validator-8.0.1.Final.jar:8.0.1.Final]
	at org.hibernate.validator.internal.engine.ValidatorImpl.validateConstraintsForSingleDefaultGroupElement(ValidatorImpl.java:518) ~[hibernate-validator-8.0.1.Final.jar:8.0.1.Final]
	at org.hibernate.validator.internal.engine.ValidatorImpl.validateConstraintsForDefaultGroup(ValidatorImpl.java:488) ~[hibernate-validator-8.0.1.Final.jar:8.0.1.Final]
	at org.hibernate.validator.internal.engine.ValidatorImpl.validateConstraintsForCurrentGroup(ValidatorImpl.java:450) ~[hibernate-validator-8.0.1.Final.jar:8.0.1.Final]
	at org.hibernate.validator.internal.engine.ValidatorImpl.validateInContext(ValidatorImpl.java:425) ~[hibernate-validator-8.0.1.Final.jar:8.0.1.Final]
	at org.hibernate.validator.internal.engine.ValidatorImpl.validate(ValidatorImpl.java:172) ~[hibernate-validator-8.0.1.Final.jar:8.0.1.Final]
	at org.springframework.validation.beanvalidation.SpringValidatorAdapter.validate(SpringValidatorAdapter.java:113) ~[spring-context-6.1.1.jar:6.1.1]
	at org.springframework.boot.autoconfigure.validation.ValidatorAdapter.validate(ValidatorAdapter.java:72) ~[spring-boot-autoconfigure-3.2.0.jar:3.2.0]
	at org.springframework.validation.DataBinder.validate(DataBinder.java:1244) ~[spring-context-6.1.1.jar:6.1.1]
	at org.springframework.web.servlet.mvc.method.annotation.AbstractMessageConverterMethodArgumentResolver.validateIfApplicable(AbstractMessageConverterMethodArgumentResolver.java:252) ~[spring-webmvc-6.1.1.jar:6.1.1]
	at org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor.resolveArgument(RequestResponseBodyMethodProcessor.java:141) ~[spring-webmvc-6.1.1.jar:6.1.1]
	at org.springframework.web.method.support.HandlerMethodArgumentResolverComposite.resolveArgument(HandlerMethodArgumentResolverComposite.java:122) ~[spring-web-6.1.1.jar:6.1.1]
	at org.springframework.web.method.support.InvocableHandlerMethod.getMethodArgumentValues(InvocableHandlerMethod.java:218) ~[spring-web-6.1.1.jar:6.1.1]
	at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:171) ~[spring-web-6.1.1.jar:6.1.1]
	at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:118) ~[spring-webmvc-6.1.1.jar:6.1.1]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:917) ~[spring-webmvc-6.1.1.jar:6.1.1]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:829) ~[spring-webmvc-6.1.1.jar:6.1.1]
	at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87) ~[spring-webmvc-6.1.1.jar:6.1.1]
	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1089) ~[spring-webmvc-6.1.1.jar:6.1.1]
	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:979) ~[spring-webmvc-6.1.1.jar:6.1.1]
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1014) ~[spring-webmvc-6.1.1.jar:6.1.1]
	at org.springframework.web.servlet.FrameworkServlet.doPost(FrameworkServlet.java:914) ~[spring-webmvc-6.1.1.jar:6.1.1]
	at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:590) ~[tomcat-embed-core-10.1.16.jar:6.0]
	at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:885) ~[spring-webmvc-6.1.1.jar:6.1.1]
	at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:658) ~[tomcat-embed-core-10.1.16.jar:6.0]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:205) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:149) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:51) ~[tomcat-embed-websocket-10.1.16.jar:10.1.16]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:174) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:149) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100) ~[spring-web-6.1.1.jar:6.1.1]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-6.1.1.jar:6.1.1]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:174) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:149) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93) ~[spring-web-6.1.1.jar:6.1.1]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-6.1.1.jar:6.1.1]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:174) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:149) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201) ~[spring-web-6.1.1.jar:6.1.1]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-6.1.1.jar:6.1.1]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:174) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:149) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:167) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:90) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:482) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:115) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:93) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:74) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:340) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:391) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:63) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:896) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1744) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:52) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1191) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:659) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) ~[tomcat-embed-core-10.1.16.jar:10.1.16]
	at java.base/java.lang.Thread.run(Thread.java:833) ~[na:na]
```

- To be able to run test you have to add `@Component` annotation into `AuthValidator` class:

```java

@Component // add this annotation 
@RequiredArgsConstructor
public class AuthValidator implements ConstraintValidator<AuthValidation, String> {
    private final FoobarService foobarService;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return foobarService.isValidValue(value);
    }
}

```