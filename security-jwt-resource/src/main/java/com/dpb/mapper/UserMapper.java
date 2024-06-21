package com.dpb.mapper;

import com.dpb.domain.UserEntity;
import org.apache.ibatis.annotations.Param;


public interface UserMapper {

    public UserEntity findByUserName(@Param("userName") String userName);
}
