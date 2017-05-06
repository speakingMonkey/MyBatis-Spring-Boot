package tk.mybatis.springboot.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.springboot.model.User;
import tk.mybatis.springboot.service.UserService;

/**
 * Created by zhoudf2 on 2017-5-6.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST,consumes = "application/json;charset=UTF-8", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public JSONObject addUser()
    {
        User user = new User();
        user.setAvatar("wwww.baidu.com");
        user.setNickName("zhangsan");
        userService.save(user);
        System.out.println("成功");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 200);
        return jsonObject;
    }
}
