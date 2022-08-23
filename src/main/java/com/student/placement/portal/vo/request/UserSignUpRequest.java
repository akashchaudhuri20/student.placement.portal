package com.student.placement.portal.vo.request;

import lombok.Data;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

@Data
public class UserSignUpRequest extends BaseRestRequest implements Serializable {

    UserSignUpRequestBody userSignUpRequestBody;
    ApiRequestHeader apiRequestHeader;

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
