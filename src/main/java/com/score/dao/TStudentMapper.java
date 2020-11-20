package com.score.dao;

import com.score.bean.TStudent;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface TStudentMapper {

    long deleteByPrimaryKey(Long studentNo);

    Long insert(TStudent record);

    TStudent selectByPrimaryKey(Long studentNo);

    List<TStudent> selectAll(TStudent record);

    int updateByPrimaryKey(TStudent record);

    /**
     * 查询学生总成绩
     */
    Map<String, Object> selectFinalScore(TStudent student);

    /**
     * 查询学生账号信息
     */
    List<TStudent> selectloginStudent(TStudent student);

}