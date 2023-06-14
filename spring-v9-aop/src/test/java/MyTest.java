import com.nie.service.UserService;
import com.nie.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Akihi
 * @date 2023/6/14 9:44 PM
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //代理类必须用接口接收，代理的必须是接口
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
//        userService.del();
//        userService.update();
//        userService.select();
    }
}
