@Component ->until now we are creating the beans manually .to automate the bean creation by spring we use @component 

@ComponentScan ->to scan the basePackage where the @component are present and create a bean for us




Error creating bean with name 'gameRunner' defined in file [C:\Users\saisr\eclipse-workspace\springFrameworkComponent\target\classes\com\example\springFramework\game\GameRunner.class]: Unsatisfied dependency expressed through constructor parameter 0: No qualifying bean of type 'com.example.springFramework.game.GamingConsole' available: expected single matching bean but found 2: marioGame,pacmanGame

if two classes having @component(two beans of same type) extending same interface ..then we get above error.


solution for this 

@Primary 
@Qualifier


@primary->when multiple beans are qualified which bean should be given preference.

@Qualifier ->when specific bean should be autowired.