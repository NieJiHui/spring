import com.nie.pojo.Hello;
import com.nie.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Akihi
 * @date 2023/6/6 11:21 AM
 */
public class MyTest {
    public static void main(String[] args) {
        // 获取Spring的上下文对象！即获取xml配置路径
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 对象均通过Spring管理，要使用，直接取出即可
        Hello hello = (Hello)context.getBean("hello");
        hello.show();
        User user = (User) context.getBean("user");

    }
}
