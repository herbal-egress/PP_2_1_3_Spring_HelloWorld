import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name = "cat")
    @Scope("prototype") // @Scope определяет, сколько экземпляров создаст Spring.
    // "singleton" - на основе этого бина будет создан только один экземпляр.
    // "prototype" - каждый раз при обращении, Spring создает новый экземпляр

    public Cat getCat() {
        Cat cat = new Cat();
        cat.setMessage("Miu World!");
        return cat;
    }
}