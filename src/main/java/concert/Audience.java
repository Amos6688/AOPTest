package concert;

import org.aspectj.lang.annotation.*;

/**
 * 观众类：观看演出的切面
 */
@Aspect //将此类转变为一个切面
public class Audience
{
    @Pointcut("execution(* concert.Performance.perform(..))")   //定义命名大切点
    public void  performance() {}

    @Before("performance()") //表演之前
    public void silenceCellPhones()
    {
        System.out.println("Silencing cell Phones");
    }

    @Before("performance()") //表演之前
    public void takeSeats()
    {
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()") //表演之后
    public void applause()
    {
        System.out.println("CLAP CLAP CLAP");
    }

    @AfterThrowing("performance()")
    public void demandRefund()
    {
        System.out.println("Demanding a refund");
    }
}
