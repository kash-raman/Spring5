Spring IoC

From resources folder- 
 <import resource="services.xml"/>
 <import resource="resources/messageSource.xml"/>
  <import resource="/resources/themeSource.xml"/>

Import from file or class path using 
file:C:/config/services.xml or classpath:/config/services.xml

BEAN
Bean id - is always only one and unique. 
	If id is not  available, name [0] will be used as id. 
	If bean name is not available, container will generate unique id. 
		if XML - fullclassname#0 
		if @component - uncapital classname
		 @bean - method name 
		@bean(“name”) - name 

bean Name - optional, can be multiple. ; , $(space) delimiter. 
bean in @Configuration vs @component - full vs lite. no weaving 
static @bean in @Configuration - primary for postProcessor. The bean which doesn’t require changes to lifecycle.


//collections in bean - list/map/set/properties//merge only last 2 types
//parent
//inner bean


Dependency Resolution Process
The container performs bean dependency resolution as follows:
* The ApplicationContext is created and initialized with configuration metadata that describes all the beans. Configuration metadata can be specified by XML, Java code, or annotations. 
* For each bean, its dependencies are expressed in the form of properties, constructor arguments, or arguments to the static-factory method( if you use that instead of a normal constructor). These dependencies are provided to the bean, when the bean is actually created. 
* Each property or constructor argument is an actual definition of the value to set, or a reference to another bean in the container. 
* Each property or constructor argument that is a value is converted from its specified format to the actual type of that property or constructor argument. By default, Spring can convert a value supplied in string format to all built-in types, such as int, long, String, boolean, and so forth. 

An inner bean definition does not require a defined ID or name. If specified, the container does not use such a value as an identifier. The container also ignores the scope flag on creation, because inner beans are always anonymous and are always created with the outer bean. It is not possible to access inner beans independently or to inject them into collaborating beans other than into the enclosing bean.

The list/>, set/>, map/>, and props/> elements set the properties and arguments of the Java Collectiontypes List, Set, Map, and Properties, respectively.

 @Autowired for interfaces that are well-known resolvable dependencies: BeanFactory, ApplicationContext, Environment, ResourceLoader, ApplicationEventPublisher, and MessageSource

@Autowired applies to fields, constructors, and multi-argument methods, allowing for narrowing through qualifier annotations at the parameter level. By contrast, @Resource is supported only for fields and bean property setter methods with a single argument. As a consequence, you should stick with qualifiers if your injection target is a constructor or a multi-argument method.

Qualifier - attribute or meta tag
custom qualifier can be created

@component vs @Configuration - later CGLIB usage. @Component classes are not enhanced with CGLIB to intercept the invocation of methods and fields. CGLIB proxying is the means by which invoking methods or fields within @Bean methods in @Configuration classes creates bean metadata references to collaborating objects. Such methods are not invoked with normal Java semantics but rather go through the container in order to provide the usual lifecycle management and proxying of Spring beans, even when referring to other beans through programmatic calls to @Bean methods. In contrast, invoking a method or field in a @Bean method within a plain @Component class has standard Java semantics, with no special CGLIB processing or other constraints applying. 




Profiles :

Can be declared in class level or method level in @Configuration 
can have logical operation like |, & , ! operated 
can have multiple profile - {p1,!p2} , {p1,p2} - all should be valid
default is default profile. 
Can be activated by using 
ctx.getEnvironment().setActiveProfiles("development");
-Dspring.profiles.active="profile1,profile2"
@ActiveProfiles -test
