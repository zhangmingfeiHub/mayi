package com.mfzhang.mayi.datasource.mapper;

import com.mfzhang.mayi.datasource.domain.MdmCommonBooth;
import com.mfzhang.mayi.datasource.domain.MdmCommonBoothExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MdmCommonBoothMapper {
    long countByExample(MdmCommonBoothExample example);

    int deleteByExample(MdmCommonBoothExample example);

    int insert(MdmCommonBooth record);

    int insertSelective(MdmCommonBooth record);

    List<MdmCommonBooth> selectByExample(MdmCommonBoothExample example);

    int updateByExampleSelective(@Param("record") MdmCommonBooth record, @Param("example") MdmCommonBoothExample example);

    int updateByExample(@Param("record") MdmCommonBooth record, @Param("example") MdmCommonBoothExample example);
}