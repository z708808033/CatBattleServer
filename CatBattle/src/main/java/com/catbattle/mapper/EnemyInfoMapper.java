package com.catbattle.mapper;

import com.catbattle.bean.EnemyInfo;
import com.catbattle.bean.EnemyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnemyInfoMapper {
    long countByExample(EnemyInfoExample example);

    int deleteByExample(EnemyInfoExample example);

    int deleteByPrimaryKey(String enemyId);

    int insert(EnemyInfo record);

    int insertSelective(EnemyInfo record);

    List<EnemyInfo> selectByExample(EnemyInfoExample example);

    EnemyInfo selectByPrimaryKey(String enemyId);

    int updateByExampleSelective(@Param("record") EnemyInfo record, @Param("example") EnemyInfoExample example);

    int updateByExample(@Param("record") EnemyInfo record, @Param("example") EnemyInfoExample example);

    int updateByPrimaryKeySelective(EnemyInfo record);

    int updateByPrimaryKey(EnemyInfo record);
}