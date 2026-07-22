package com.mobile.springbootjwtapi.models.req;

import com.mobile.springbootjwtapi.models.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class UserProductGroupDetailReq extends BaseEntity{
    private Integer id;
    private Integer productUnitId;
    private Integer productGroupId;
    private String status;
}