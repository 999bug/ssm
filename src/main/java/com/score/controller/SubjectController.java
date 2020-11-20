package com.score.controller;

import com.github.pagehelper.PageInfo;
import com.score.bean.ResultObject;
import com.score.bean.TSubject;
import com.score.service.ISubjectService;
import com.score.util.Constant;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/subject")
@RestController
public class SubjectController {

    @Autowired
    private ISubjectService subjectService;

    @RequestMapping("/getAllSubject")
    public ResultObject<List<TSubject>> getSubjects(TSubject subject,
        @RequestParam("limit") int limit, @RequestParam("page") int page) {
        PageInfo<TSubject> pageInfo = subjectService.getAll(subject, page, limit);
        ResultObject<List<TSubject>> rs = new ResultObject<List<TSubject>>();
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("查询成功");
        rs.setData(pageInfo.getList());
        rs.setCount(pageInfo.getTotal());
        return rs;
    }

    @RequestMapping("/addSubject")
    public ResultObject<Object> addSubject(TSubject subject) {

        Integer subjectId = subject.getSubjectId();
        TSubject result = subjectService.selectByNo(subjectId);
        //统一返回
        ResultObject<Object> rs = new ResultObject<Object>();
        if (null == result) {
            subjectService.addSubject(subject);
            rs.setCode(Constant.SUCCESS_RETUEN_CODE);
            rs.setMsg("增加课程信息成功");
        } else {
            rs.setCode(Constant.HASE_RETUEN_CODE);
            rs.setMsg("课程已存在");
        }
        return rs;
    }

    @RequestMapping("/updateSubject")
    public ResultObject<Object> updateSubject(TSubject subject) {
        Integer total = subjectService.updateSubject(subject);
        //统一返回
        ResultObject<Object> rs = new ResultObject<Object>();
        if (null == total || 0 == total) {
            rs.setCode(Constant.FAILURE_RETUEN_CODE);
            rs.setMsg("修改课程信息失败");
        } else {
            rs.setCode(Constant.SUCCESS_RETUEN_CODE);
            rs.setMsg("修改课程信息成功");
        }
        return rs;
    }

    //标识请求地址
    @RequestMapping("/deleteSubject")
    public ResultObject<Object> deleteSubject(@RequestParam("subjectId") int subjectId) {
        Integer total = subjectService.deleteSubject(subjectId);
        //统一返回
        ResultObject<Object> rs = new ResultObject<Object>();
        if (null == total || 0 == total) {
            rs.setCode(Constant.FAILURE_RETUEN_CODE);
            rs.setMsg("删除课程信息失败");
        } else {
            rs.setCode(Constant.SUCCESS_RETUEN_CODE);
            rs.setMsg("删除课程信息成功");
        }
        return rs;
    }

    /**
     * 获取学生下拉框
     */
    @RequestMapping("/subjectSelect")
    public ResultObject<List<TSubject>> subjectSelect() {
        ResultObject<List<TSubject>> rs = new ResultObject<List<TSubject>>();
        List<TSubject> list = subjectService.selectAllSubject();
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("查询成功");
        rs.setData(list);
        int total = list.size();
        Long a = Long.parseLong(String.valueOf(total));
        rs.setCount(a);
        return rs;
    }

}
