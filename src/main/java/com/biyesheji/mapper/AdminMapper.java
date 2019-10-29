package com.biyesheji.mapper;

import com.biyesheji.model.Admin;
import com.biyesheji.model.AdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface AdminMapper extends Mapper<Admin> {
    int countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    List<Admin> selectByExample(AdminExample example);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);
}