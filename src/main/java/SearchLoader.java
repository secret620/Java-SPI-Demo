import com.spi.IOne;
import com.spi.OneImpl;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @Description 表示 ：
 * @Author Shi You Qin
 * @Email secret620@163.com
 * @Date Create 17:30 2020/10/29
 **/
public class SearchLoader {
    public static void main(String[] args) {
        ServiceLoader<IOne> iOne = ServiceLoader.load(IOne.class);
        Iterator<IOne> iterator = iOne.iterator();
        while (iterator.hasNext()){
            IOne one = iterator.next();
            one.test();
            System.out.println(one);
        }
        System.out.println(iOne);
    }
}
