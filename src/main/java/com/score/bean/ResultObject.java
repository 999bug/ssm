package com.score.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * @author LSY
 */
@Getter
@Setter
public class ResultObject<T> {

    private String code;
    private String msg;
    private T data;
    private Long count;

}
