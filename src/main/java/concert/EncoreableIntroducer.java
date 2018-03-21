package concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * 利用AOP的引入功能，可以为Spring bean添加新方法
 * 在Spring中，切面只是实现了他们所包装bean相同接口的代理。
 * 如果代理能够暴露新接口的话，切面所通知的bean就像实现了新的接口，底层是否实现也无所谓
 */
@Aspect
public class EncoreableIntroducer
{
    /**
     * value属性制定了那种类型的bean要引入该接口。加号表示的是Performance的所有子类，而不是Performance
     * defaultImpl属性指定了引入功能具体实现的类
     *  @DeclareParents 注解所标注的静态属性指明了要引入的接口
     */
    @DeclareParents(value = "concert.Performance+",
    defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}

//和其他切面一样，需要在Sping应用中将EncoreableIntroducer声明为一个bean