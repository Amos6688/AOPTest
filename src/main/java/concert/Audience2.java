package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience2
{
    @Pointcut("execution(* concert.Performance.exit(..))")
    public void exit() {}

    @Around("exit()")       //环绕通知方法
    public void quit(ProceedingJoinPoint jp)
    {
        try{
            System.out.println("Thanks  Thanks Thanks");
            jp.proceed();  //执行方法
            System.out.println("byebye  byebye byebye");
        }catch (Throwable e){
            System.out.println("sorry sorry sorry");
        }
    }

}
