import com.cjl.awt.ui.ChatWindow;
import com.cjl.awt.ui.ServerStatusWindow;
import com.cjl.awt.ui.UserLoginWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by chenjianliang on 2018/1/1.
 */
public class myTest {
    public static void main(String[] args) {
        ServerStatusWindow userLoginWindow = new ServerStatusWindow();
        userLoginWindow.init();

//
//        userLoginWindow.getBtnLogin().addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                System.out.println("myTest.actionPerformed"+userLoginWindow.getLoginInfo());
//
//            }
//        });
//
//        userLoginWindow.getBtnReset().addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                userLoginWindow.reset();
//            }
//        });
    }
}
