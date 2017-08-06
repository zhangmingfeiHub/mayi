package com.mfzhang.mayi.datasource.mapper;

import com.mfzhang.mayi.datasource.domain.OmsMarketInfo;
import com.mfzhang.mayi.datasource.domain.OmsMarketInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsMarketInfoMapper {
    long countByExample(OmsMarketInfoExample example);

    int deleteByExample(OmsMarketInfoExample example);

    int insert(OmsMarketInfo record);

    int insertSelective(OmsMarketInfo record);

    List<OmsMarketInfo> selectByExample(OmsMarketInfoExample example);

    int updateByExampleSelective(@Param("record") OmsMarketInfo record, @Param("example") OmsMarketInfoExample example);

    int updateByExample(@Param("record") OmsMarketInfo record, @Param("example") OmsMarketInfoExample example);
}