package concert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ConcertConfig.class})
public class TestConcert
{
    @Autowired @Qualifier("dancing")
    private Performance performance;

    @Test
    public void testConcert()
    {
        //可以看到，获取同一个Bean表演，转换成不同的两个Bean
        //引入了新的方法performEncore()
        performance.perform();
        performance.exit();

        Encoreable encoreable = (Encoreable)performance;
        encoreable.performEncore();

    }
}
