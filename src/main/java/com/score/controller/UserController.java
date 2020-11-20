package com.score.controller;

import com.score.bean.ResultObject;
import com.score.bean.TStudent;
import com.score.bean.User;
import com.score.service.IUserService;
import com.score.service.IStudentService;
import com.score.util.Constant;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {


    @Autowired
    private IUserService userService;

    @Autowired
    private IStudentService studentService;

    //标识请求地址
    @PostMapping("/login")
    public ResultObject<List<User>> getUsers(User user, HttpServletRequest request) {
        //查询用户列表
        List<User> list = userService.getUser(user);
        ResultObject<List<User>> rs = new ResultObject<List<User>>();
        if (list.isEmpty()) {
            //状态码
            rs.setCode(Constant.FAILURE_RETUEN_CODE);
            //提示
            rs.setMsg("登录失败");
        } else {
            //状态码
            rs.setCode(Constant.SUCCESS_RETUEN_CODE);
            request.getSession().setAttribute("user", list.get(0));
            //提示
            rs.setMsg("登录成功");
        }
        //数据
        rs.setData(list);
        return rs;
    }

    @RequestMapping("/loginOut")
    public ResultObject<Object> loginOut(HttpServletRequest request) {
        //查询用户列表
        ResultObject<Object> rs = new ResultObject<Object>();
        request.getSession().removeAttribute("user");
        //数据
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("退出成功");
        return rs;
    }

    //标识请求地址
    @PostMapping("/studentLogin")
    public ResultObject<List<TStudent>> studentLogin(User user, HttpServletRequest request) {
        //查询用户列表
        TStudent student = new TStudent();
        student.setStudentNo(Long.parseLong(user.getUserName()));
        student.setStuPass(user.getPassword());
        List<TStudent> list = studentService.selectloginStudent(student);
        ResultObject<List<TStudent>> rs = new ResultObject<List<TStudent>>();
        if (list.isEmpty()) {
            //状态码
            rs.setCode(Constant.FAILURE_RETUEN_CODE);
            //提示
            rs.setMsg("登录失败");
        } else {
            //状态码
            rs.setCode(Constant.SUCCESS_RETUEN_CODE);
            request.getSession().setAttribute("student", list.get(0));
            //提示
            rs.setMsg("登录成功");
        }
        //数据
        rs.setData(list);
        return rs;
    }

    @RequestMapping("/studentloginOut")
    public ResultObject<Object> studentloginOut(HttpServletRequest request) {
        //查询用户列表
        ResultObject<Object> rs = new ResultObject<Object>();
        request.getSession().removeAttribute("student");
        //数据
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("退出成功");
        return rs;
    }


}
