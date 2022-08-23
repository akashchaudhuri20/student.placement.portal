package com.student.placement.portal.dao.repository;

import com.student.placement.portal.common.structures.models.UserModel;
import com.student.placement.portal.vo.request.UserSignUpRequestBody;

public interface DataAccessService {
    UserModel userSignUp( UserModel userModel);
}
