Spring Basic:
Courtesy: https://www.youtube.com/watch?v=If1Lw4pLLEo&t=736s

Spring is a DI framework for developing java projects.
One of the main design pattern we use when developing spring projects is - "Dependency Injection":
1) DI allows one object to connect with dependant objects. i.e. to run a laptop, we need dependant objects like hard drive, RAM, CPU etc.
2) Helps in achieving loose coupling. instance, laptop can be modified with new hard drive/RAM/CPU without affecting the whole laptop performance.
3) With loose coupling it is also possible to do testing components using Mock objects. instance in java, junit.

Some limitations:
- Learning curve. Aspirants had to go a lot of effort in grasping concepts on DI and IOC in order to fully understand spring.

Competitor of Spring (other used DI framework):
- Google Guice
- Dagger

how to name an enterprise project:
groupId: com.arnav //package name
artifactId: demo //project name
package: com.arnav.demo.web

when downloading <dependency>hibernate</dependency>, it downloads for the first time from remote repository (repository of hibernate) then stores in a local repository. So for first time, internet is required. Local repository will be your users folder.

3 ways to add dependency:
1) XML configuration (<bean id="xyz" class="com.arnav..">) - ClassPathXmlApplicationContext("spring.xml")
2) annotation configuration  - AnnotationConfigApplicationContext(AppConfig.class)
3) Java configuration

@Autowired can be applied on properties, setter methods and constructors.

Diff between Inject and Autowired:
The @Inject annotation also serves the same purpose,
but the main difference between them is that @Inject is a standard annotation
for dependency injection and @Autowired is spring specific.

Since Spring is not the only framework which provides dependency injection,
in the future if you change your container and moves to another DI framework
like Google Guice, you need to reconfigure your application.

You can potentially avoid that development effort by using standard annotation - @Inject



