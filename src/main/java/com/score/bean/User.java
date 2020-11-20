package com.score.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 *
 * @author LSY
 * 用户实体类
 */
@Component
@Getter
@Setter
public class User {

    private int userId;

    private String userName;

    private String password;

    private String type;

}
