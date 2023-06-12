import com.njh.dao.UserDao;
import com.njh.dao.UserDaoImpl;
import com.njh.dao.UserDaoMysqlImpl;
import com.njh.service.UserService;
import com.njh.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Akihi
 * @date 2023/6/6 10:40 AM
 */
public class MyTest {
    public static void main(String[] args) {
        // 用户实际调用的业务层，Dao层用户不需要接触
//        UserServiceImpl userService = new UserServiceImpl();
//
//        userService.setUserDao(new UserDaoMysqlImpl());
//        userService.getUser();

        // 使用Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userDao = (UserService) context.getBean("userService");
        userDao.getUser();


    }
}
