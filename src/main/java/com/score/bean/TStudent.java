package com.score.bean;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author LSY
 */
@Getter
@Setter
public class TStudent implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long studentNo;

    private String studentName;

    private String studentSex;

    private String stuPass;

    private double score1;

    private double score2;

    private double score3;

    private double sumScore;

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex == null ? null : studentSex.trim();
    }

}