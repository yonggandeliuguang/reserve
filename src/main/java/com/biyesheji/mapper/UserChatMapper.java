package com.biyesheji.mapper;

import com.biyesheji.model.UserChat;
import com.biyesheji.model.UserChatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserChatMapper extends Mapper<UserChat> {
    int countByExample(UserChatExample example);

    int deleteByExample(UserChatExample example);

    List<UserChat> selectByExample(UserChatExample example);

    int updateByExampleSelective(@Param("record") UserChat record, @Param("example") UserChatExample example);

    int updateByExample(@Param("record") UserChat record, @Param("example") UserChatExample example);
}