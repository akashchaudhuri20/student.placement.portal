package com.student.placement.portal.service;

import com.student.placement.portal.common.structures.models.UserModel;
import com.student.placement.portal.vo.request.UserSignUpRequestBody;

public interface IUserSignUp {

    UserModel signUpService( UserSignUpRequestBody userSignUpRequestBody);
}
