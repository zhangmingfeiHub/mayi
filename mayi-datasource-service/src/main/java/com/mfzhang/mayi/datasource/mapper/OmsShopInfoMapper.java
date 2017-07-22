package com.mfzhang.mayi.datasource.mapper;

import com.mfzhang.mayi.datasource.domain.OmsShopInfo;
import com.mfzhang.mayi.datasource.domain.OmsShopInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsShopInfoMapper {
    long countByExample(OmsShopInfoExample example);

    int deleteByExample(OmsShopInfoExample example);

    int insert(OmsShopInfo record);

    int insertSelective(OmsShopInfo record);

    List<OmsShopInfo> selectByExample(OmsShopInfoExample example);

    int updateByExampleSelective(@Param("record") OmsShopInfo record, @Param("example") OmsShopInfoExample example);

    int updateByExample(@Param("record") OmsShopInfo record, @Param("example") OmsShopInfoExample example);
}