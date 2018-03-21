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
        performance.perform();

        performance.exit();
    }
}
