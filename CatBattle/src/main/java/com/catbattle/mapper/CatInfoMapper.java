package com.catbattle.mapper;

import com.catbattle.bean.CatInfo;
import com.catbattle.bean.CatInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CatInfoMapper {
    long countByExample(CatInfoExample example);

    int deleteByExample(CatInfoExample example);

    int deleteByPrimaryKey(String catId);

    int insert(CatInfo record);

    int insertSelective(CatInfo record);

    List<CatInfo> selectByExample(CatInfoExample example);

    CatInfo selectByPrimaryKey(String catId);

    int updateByExampleSelective(@Param("record") CatInfo record, @Param("example") CatInfoExample example);

    int updateByExample(@Param("record") CatInfo record, @Param("example") CatInfoExample example);

    int updateByPrimaryKeySelective(CatInfo record);

    int updateByPrimaryKey(CatInfo record);
}