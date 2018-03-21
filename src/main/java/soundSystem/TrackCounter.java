package soundSystem;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class TrackCounter
{
    private Map<Integer, Integer> trackCounts =
            new HashMap<>();

    //指定了要提供给通知方法的参数类型int以及参数名字trackNumber。
    // 注意：通知方法必须有此类型的参数，但是参数名字可以有trackNumber不同
    @Pointcut("execution(* soundSystem.CompactDisc.playTrack(int))" +
    "&& args(trackNumber)")
    public void trackPlayed(int trackNumber) {}

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber)
    {
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, currentCount + 1);
    }

    public int getPlayCount(int trackNumber)
    {
        return trackCounts.containsKey(trackNumber)
                ? trackCounts.get(trackNumber) : 0;
    }
}
