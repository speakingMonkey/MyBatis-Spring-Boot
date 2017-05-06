package tk.mybatis.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.springboot.mapper.UserMapper;
import tk.mybatis.springboot.model.City;
import tk.mybatis.springboot.model.User;

/**
 * Created by zhoudf2 on 2017-5-6.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper uerMapper;

    public void save(User user) {
        if (user.getId() != null) {
            uerMapper.updateByPrimaryKey(user);
        } else {
            uerMapper.insert(user);
        }
    }
}
