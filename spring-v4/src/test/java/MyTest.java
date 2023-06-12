import com.njh.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * @author Akihi
 * @date 2023/6/8 8:35 PM
 */
public class MyTest {
    public static void main(String[] args) {

    }

    @Test
    public void Test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people", People.class);
        people.getCat().cry();
        people.getDog().cry();
        System.out.println(people);

    }
}
