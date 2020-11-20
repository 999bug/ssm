package com.score.dao;

import com.score.bean.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {

    /**
     * 全量查询用户
     */
    List<User> getUser(User user);
}
