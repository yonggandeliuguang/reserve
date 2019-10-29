package com.biyesheji.mapper;

import com.biyesheji.model.Content;
import com.biyesheji.model.ContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ContentMapper extends Mapper<Content> {
    int countByExample(ContentExample example);

    int deleteByExample(ContentExample example);

    List<Content> selectByExample(ContentExample example);

    int updateByExampleSelective(@Param("record") Content record, @Param("example") ContentExample example);

    int updateByExample(@Param("record") Content record, @Param("example") ContentExample example);
}