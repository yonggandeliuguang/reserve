package com.biyesheji.mapper;

import com.biyesheji.model.Gird;
import com.biyesheji.model.GirdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface GirdMapper extends Mapper<Gird> {
    int countByExample(GirdExample example);

    int deleteByExample(GirdExample example);

    List<Gird> selectByExample(GirdExample example);

    int updateByExampleSelective(@Param("record") Gird record, @Param("example") GirdExample example);

    int updateByExample(@Param("record") Gird record, @Param("example") GirdExample example);
}