package com.mfzhang.mayi.datasource.mapper;

import com.mfzhang.mayi.datasource.domain.MdmDealer;
import com.mfzhang.mayi.datasource.domain.MdmDealerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MdmDealerMapper {
    long countByExample(MdmDealerExample example);

    int deleteByExample(MdmDealerExample example);

    int insert(MdmDealer record);

    int insertSelective(MdmDealer record);

    List<MdmDealer> selectByExample(MdmDealerExample example);

    int updateByExampleSelective(@Param("record") MdmDealer record, @Param("example") MdmDealerExample example);

    int updateByExample(@Param("record") MdmDealer record, @Param("example") MdmDealerExample example);
}