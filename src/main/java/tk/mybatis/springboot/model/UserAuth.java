package tk.mybatis.springboot.model;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Created by zhoudf2 on 2017-5-6.
 */
@Table(name = "user_auths")
public class UserAuth {

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "identity_type")
    private String identityType;

    @Column(name = "identifier")
    private String identifier;

    @Column(name = "credential")
    private String credential;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential;
    }
}
