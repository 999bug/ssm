package com.score.service;


import com.github.pagehelper.PageInfo;
import com.score.bean.TStudent;
import java.util.List;

/**
 * @author LSY
 */
public interface IStudentService {

    /**
     * 全量查询用户
     */
    PageInfo<TStudent> getAll(TStudent student, int page, int size);

    /**
     * 查询是否存在
     */
    TStudent selectByNo(long studentNo);

    /**
     * 增加学生信息
     */
    Long addStudent(TStudent student);


    /**
     * 修改学生信息
     */
    Integer updateStudent(TStudent student);


    /**
     * 删除学生信息
     */
    Long deleteStudent(long studentNo);

    /**
     * 全量查询用户为下拉框
     */
    List<TStudent> selectAllStudent();

    /**
     * 查询学生账号信息
     */
    List<TStudent> selectloginStudent(TStudent student);

}
