package tk.mybatis.springboot.model;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Created by zhoudf2 on 2017-5-6.
 */
@Table(name = "users")
public class User extends BaseEntityLong {

    @Column(name = "nickname")
    private String nickName;

    @Column(name = "avatar")
    private String avatar;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
