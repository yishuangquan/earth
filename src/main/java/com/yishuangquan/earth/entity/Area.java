package com.yishuangquan.earth.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Area {
    Long id;
    String code;
    @NonNull
    String name;
    Integer type;
    Long parentId;
    String createBy;
    Date createDate;
    String updateBy;
    Date updateDate;
    String remarks;
    Boolean isDelete;
}
