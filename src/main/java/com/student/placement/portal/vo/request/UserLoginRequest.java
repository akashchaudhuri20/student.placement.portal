package com.student.placement.portal.vo.request;

import lombok.Data;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@Data
public class UserLoginRequest {

    UserLoginRequestBody userLoginRequestBody;
    ApiRequestHeader apiRequestHeader;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
