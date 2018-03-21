package concert;

public class DefaultEncoreable implements Encoreable
{
    @Override
    public void performEncore()
    {
        System.out.println("测试注解引入新功能");
    }
}
