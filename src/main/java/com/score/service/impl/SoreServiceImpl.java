package com.score.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.score.bean.ResultObject;
import com.score.bean.TScore;
import com.score.dao.TScoreMapper;
import com.score.dao.TStudentMapper;
import com.score.dao.TSubjectMapper;
import com.score.service.IScoreService;
import com.score.util.Constant;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoreServiceImpl implements IScoreService {

    @Autowired
    private TScoreMapper scoreMapper;

    @Override
    public PageInfo<TScore> getAllScore(TScore score, int limit, int page) {
        // 首先开启PageHelper的分页
        PageHelper.startPage(page, limit);
        // 查询分页信息 调用方式与普通方式一致
        List<TScore> list = scoreMapper.selectAll(score);
        // 生成PageInfo对象
        PageInfo<TScore> pageInfo = new PageInfo<TScore>(list);
        return pageInfo;
    }

    @Override
    public ResultObject<Object> insertScore(TScore score) {

        ResultObject<Object> rs = new ResultObject<Object>();

        Integer total = scoreMapper.insert(score);
        if (null == total || 0 == total) {
            rs.setCode(Constant.HASE_RETUEN_CODE);
            rs.setMsg("成绩添加失败");
        } else {
            rs.setCode(Constant.SUCCESS_RETUEN_CODE);
            rs.setMsg("成绩添加成功");
        }
        return rs;
    }

    @Override
    public Integer updateScore(TScore score) {
        // TODO Auto-generated method stub
        return scoreMapper.updateByPrimaryKey(score);
    }

    @Override
    public Integer deleteScore(int scoreId) {
        // TODO Auto-generated method stub
        return scoreMapper.deleteByPrimaryKey(scoreId);
    }


    @Override
    public PageInfo<TScore> getScoreByName(long studentId, int limit, int page) {
        // 首先开启PageHelper的分页
        PageHelper.startPage(page, limit);
        // 查询分页信息 调用方式与普通方式一致
        List<TScore> list = scoreMapper.selectByStudentId(studentId);

        // 生成PageInfo对象
        PageInfo<TScore> pageInfo = new PageInfo<TScore>(list);
        return pageInfo;
    }

}
