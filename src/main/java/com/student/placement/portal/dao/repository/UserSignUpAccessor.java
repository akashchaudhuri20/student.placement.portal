package com.student.placement.portal.dao.repository;

import com.student.placement.portal.common.database.dal.dataobject.UserSignUpDO;
import com.student.placement.portal.common.structures.models.UserModel;
import com.student.placement.portal.dao.repository.mapper.UserSignUpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("userSignUpAccessor")
public class UserSignUpAccessor {

    @Autowired(required = true)
    private UserSignUpMapper userSignUpMapper;

    UserModel signUp(UserModel userModel){
        userSignUpMapper.insert(convertToUserSignUpDO(userModel));
        return userModel;
    }

    private UserSignUpDO convertToUserSignUpDO(UserModel userModel){
        UserSignUpDO userSignUpDO = new UserSignUpDO();
        userSignUpDO.setUserId(userModel.getUserId());
        userSignUpDO.setUserType(userModel.getUserType());
        userSignUpDO.setName(userModel.getName());
        userSignUpDO.setPassword(userModel.getPassword());
        userSignUpDO.setEmailId(userModel.getEmailId());
        userSignUpDO.setIsValid(String.valueOf(userModel.isValid()));
        userSignUpDO.setGmtModified(userModel.getGmtModified());
        userSignUpDO.setGmtCreate(userModel.getGmtCreate());

        return userSignUpDO;
    }
}
