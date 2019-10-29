package com.biyesheji.mapper;

import com.biyesheji.model.Chat;
import com.biyesheji.model.ChatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ChatMapper extends Mapper<Chat> {
    int countByExample(ChatExample example);

    int deleteByExample(ChatExample example);

    List<Chat> selectByExample(ChatExample example);

    int updateByExampleSelective(@Param("record") Chat record, @Param("example") ChatExample example);

    int updateByExample(@Param("record") Chat record, @Param("example") ChatExample example);
}