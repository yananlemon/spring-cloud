package site.ilemon.eurekaclient.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    private static List<User> userList = new ArrayList();

    static{
        userList.add(new User(1,"Andy","Andy@qq.com"));
        userList.add(new User(2,"Bill","Bill@qq.com"));
    }

    @GetMapping("/users")
    public List<User> getUserList(){
        return userList;
    }
}
