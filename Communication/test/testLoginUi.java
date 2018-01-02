import com.cjl.awt.ui.UserLoginWindow;
import org.junit.jupiter.api.Test;

/**
 * Created by chenjianliang on 2018/1/1.
 */
public class testLoginUi {

    @Test
    public void show(){
        UserLoginWindow userLoginWindow = new UserLoginWindow();
        userLoginWindow.init();
    }
}
