import com.nie.service.ProxyInvocationHandler;
import com.nie.service.UserService;
import com.nie.service.UserServiceImp;

/**
 * @author Akihi
 * @date 2023/6/14 8:38 PM
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImp userService = new UserServiceImp();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);
        UserService target = (UserService) pih.getTarget();
        target.rent();

    }
}
