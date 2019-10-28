package com.kevin.webfluxdemo.sys.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResult {
    //错误码
    private Integer code = 0;
    //提示信息
    private String msg = "操作成功！";
    //具体的内容
    private Object data;

    private long count;

}
