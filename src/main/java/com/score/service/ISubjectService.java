package com.score.service;

import com.github.pagehelper.PageInfo;
import com.score.bean.TSubject;
import java.util.List;

/**
 * @author LSY
 */
public interface ISubjectService {

    /**
     * 全量查询用户
     */
    PageInfo<TSubject> getAll(TSubject subject, int page, int size);

    /**
     * 查询是否存在
     */
    TSubject selectByNo(int subjectId);

    Integer addSubject(TSubject subject);

    Integer updateSubject(TSubject subject);

    Integer deleteSubject(int subjectId);

    List<TSubject> selectAllSubject();

//    List<TSubject> selectloginStudent(TSubject subject);

}
