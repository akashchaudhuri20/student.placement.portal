package com.student.placement.portal.dao.repository;

import com.student.placement.portal.common.database.dal.dataobject.UserSignUpDO;
import com.student.placement.portal.dao.repository.mapper.UserSignUpMapper;
import com.student.placement.portal.common.structures.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataAccessorServiceImpl implements DataAccessService{

    @Autowired
    private UserSignUpAccessor userSignUpAccessor;

    @Override
    public UserModel userSignUp ( UserModel userModel ) {
        userSignUpAccessor.signUp(userModel);
        return userModel;
    }
}
