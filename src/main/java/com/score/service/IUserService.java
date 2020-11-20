package com.score.service;

import com.github.pagehelper.PageInfo;
import com.score.bean.User;
import java.util.List;

/**
 * @author LSY
 */
public interface IUserService {

    /**
     * 全量查询用户
     */
    List<User> getUser(User user);

    /**
     * 分页查询用户
     *
     * @param page 页码
     * @param size 数量
     */
    PageInfo<User> getUsersLimit(int page, int size);
}
