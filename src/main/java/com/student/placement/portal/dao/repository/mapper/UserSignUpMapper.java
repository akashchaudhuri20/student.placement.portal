package com.student.placement.portal.dao.repository.mapper;

import com.student.placement.portal.common.database.dal.dataobject.UserSignUpDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserSignUpMapper {

    @Insert({"insert into pp_user_register(user_id, name, email_id, phone_no, is_valid, password, gmt_modified, gmt_create) values(#{userId}, #{name}, #{emailId}, #{phoneNo}, #{isValid},#{password}, #{gmtModified}, #{gmtCreate});"})
    void insert( UserSignUpDO data);
}
