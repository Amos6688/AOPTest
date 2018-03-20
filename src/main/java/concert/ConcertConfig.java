package concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy //启动Aspect注解的自动代理
@ComponentScan
public class ConcertConfig
{
    @Bean
    public Audience audience()
    {
        return new Audience();
    }

    @Bean
    public Audience2 audience2()
    {
        return new Audience2();
    }

    @Bean
    public Dancing dancing()
    {
        return new Dancing();
    }
}
