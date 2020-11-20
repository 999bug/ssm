package com.score.bean;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


/**
 * @author LSY
 */
@Getter
@Setter
public class TScore implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer scoreId;

    private Integer scoreValue;

    private Integer subjectId;

    private String subjectName;

    private String subjectType;

    private Long studentId;

    private String studentName;

}