package com.student.placement.portal.service;

import com.student.placement.portal.common.structures.models.UserModel;
import com.student.placement.portal.dao.repository.DataAccessService;
import com.student.placement.portal.vo.request.UserSignUpRequest;
import com.student.placement.portal.vo.request.UserSignUpRequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserSignUpService implements IUserSignUp{

    @Autowired(required = true)
    private DataAccessService dataAccessService;

    public UserModel signUpService(UserSignUpRequestBody userSignUpRequestBody){

        return dataAccessService.userSignUp(convertToUserModel(userSignUpRequestBody));
    }

    private UserModel convertToUserModel(UserSignUpRequestBody userSignUpRequestBody){
        UserModel userModel = new UserModel();
        userModel.setUserId("24242554646");
        userModel.setUserType(userSignUpRequestBody.getUserType());
        userModel.setName(userSignUpRequestBody.getName());
        userModel.setPassword(userSignUpRequestBody.getPassword());
        userModel.setEmailId(userSignUpRequestBody.getEmail());
        userModel.setValid(Boolean.FALSE);
        userModel.setGmtModified(new Date());
        userModel.setGmtCreate(new Date());
        return userModel;
    }
}
