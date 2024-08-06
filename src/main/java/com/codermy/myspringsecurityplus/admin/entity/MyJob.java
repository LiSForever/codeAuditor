package com.codermy.myspringsecurityplus.admin.entity;

import lombok.Data;


@Data
public class MyJob extends BaseEntity {
    private static final long serialVersionUID = 8925514045582234222L;

    private Integer jobId;

    private String jobName;

    private Integer status;

    private Integer sort;

    /** 用户是否存在此岗位标识 默认不存在 */
    private boolean flag = false;
}
