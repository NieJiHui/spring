import com.njh.pojo.Student;
import com.njh.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;
import sun.tools.java.ClassPath;

/**
 * @author Akihi
 * @date 2023/6/6 9:14 PM
 */

public class MyTest {
    public static void main(String[] args) {
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userBean.xml");

        User bee = context.getBean("user", User.class);

        System.out.println(bee);
    }
}
