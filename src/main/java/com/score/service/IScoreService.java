package com.score.service;

import com.github.pagehelper.PageInfo;
import com.score.bean.ResultObject;
import com.score.bean.TScore;

/**
 * @author LSY
 */
public interface IScoreService {

    /**
     * 模糊查询学生成绩
     */
    PageInfo<TScore> getAllScore(TScore score, int limit, int page);

    /**
     * 增加学生成绩
     */
    ResultObject<Object> insertScore(TScore score);

    /**
     * 更改学生成绩
     */
    Integer updateScore(TScore score);

    /**
     * 删除学生学生成绩
     */
    Integer deleteScore(int scoreId);

    /**
     * 根据编号查询学生成绩
     */
    PageInfo<TScore> getScoreByName(long studentId, int limit, int page);

}
