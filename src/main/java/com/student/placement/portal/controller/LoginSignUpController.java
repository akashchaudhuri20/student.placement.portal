package com.student.placement.portal.controller;

import com.student.placement.portal.common.structures.models.UserModel;
import com.student.placement.portal.service.UserSignUpService;
import com.student.placement.portal.util.UrlConstant;
import com.student.placement.portal.vo.request.UserSignUpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginSignUpController {

    @Autowired
    private UserSignUpService userSignUpService;

    @PostMapping(path = UrlConstant.USER_SIGNUP, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserModel signUp( @RequestBody UserSignUpRequest userSignUpRequest){
        return userSignUpService.signUpService(userSignUpRequest.getUserSignUpRequestBody());
    }
}
