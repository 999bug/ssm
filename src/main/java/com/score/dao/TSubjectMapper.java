package com.score.dao;

import com.score.bean.TSubject;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TSubjectMapper {

    int deleteByPrimaryKey(Integer subjectId);

    int insert(TSubject record);

    TSubject selectByPrimaryKey(Integer subjectId);

    List<TSubject> selectAll(TSubject record);

    int updateByPrimaryKey(TSubject record);

}
