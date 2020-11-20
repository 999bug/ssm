package com.score.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.score.bean.User;
import com.score.dao.UserDao;
import com.score.service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUser(User user) {
        return userDao.getUser(user);
    }

    /**
     * 分页查询用户
     *
     * @param page 页码
     * @param size 数量
     */
    @Override
    public PageInfo<User> getUsersLimit(int page, int size) {
        //首先开启PageHelper的分页
        PageHelper.startPage(page, size);
        //查询分页信息 调用方式与普通方式一致
        List<User> list = userDao.getUser(new User());
        //生成PageInfo对象
        PageInfo<User> pageInfo = new PageInfo<User>(list);
        return pageInfo;
    }
}
