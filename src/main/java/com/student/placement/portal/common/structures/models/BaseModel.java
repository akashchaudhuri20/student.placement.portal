package com.student.placement.portal.common.structures.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
public class BaseModel {

    private Date gmtModified;
    private Date gmtCreate;
}
