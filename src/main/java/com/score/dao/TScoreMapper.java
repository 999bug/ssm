package com.score.dao;

import com.score.bean.TScore;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TScoreMapper {


    int deleteByPrimaryKey(Integer scoreId);


    int insert(TScore record);


    TScore selectByPrimaryKey(Integer scoreId);


    List<TScore> selectAll(TScore score);

    List<TScore> selectByStudentId(long studentId);


    int updateByPrimaryKey(TScore record);


    int countByType(TScore record);
}