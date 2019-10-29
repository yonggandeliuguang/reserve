package com.biyesheji.mapper;

import com.biyesheji.model.Good;
import com.biyesheji.model.GoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface GoodMapper extends Mapper<Good> {
    int countByExample(GoodExample example);

    int deleteByExample(GoodExample example);

    List<Good> selectByExample(GoodExample example);

    int updateByExampleSelective(@Param("record") Good record, @Param("example") GoodExample example);

    int updateByExample(@Param("record") Good record, @Param("example") GoodExample example);
}