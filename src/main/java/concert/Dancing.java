package concert;

public class Dancing implements Performance
{
    @Override
    public void perform()
    {
        System.out.println("Dancing start");
    }

    @Override
    public void exit()
    {
        System.out.println("bye bye");
    }
}
