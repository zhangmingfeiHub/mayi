package com.mfzhang.mayi.datasource.mapper;

import com.mfzhang.mayi.datasource.domain.MdmMall;
import com.mfzhang.mayi.datasource.domain.MdmMallExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MdmMallMapper {
    long countByExample(MdmMallExample example);

    int deleteByExample(MdmMallExample example);

    int insert(MdmMall record);

    int insertSelective(MdmMall record);

    List<MdmMall> selectByExample(MdmMallExample example);

    int updateByExampleSelective(@Param("record") MdmMall record, @Param("example") MdmMallExample example);

    int updateByExample(@Param("record") MdmMall record, @Param("example") MdmMallExample example);
}