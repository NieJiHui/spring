import com.nie.config.NjhConfig;
import com.nie.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Akihi
 * @date 2023/6/13 8:18 PM
 */
public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(NjhConfig.class);
//        方法名就是Bean的名字
        User user = context.getBean("getUser", User.class);
        System.out.println(user);

    }
}
