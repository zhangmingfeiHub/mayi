package com.mfzhang.mayi.datasource;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.util.CollectionUtils;

public class TestStream {

	public static void main(String[] args) {
		List<SystemCodeVo> codeVos = new ArrayList<>();
		codeVos.add(new SystemCodeVo(1, "type1", "typeName1", "code1", "codeName1"));
		codeVos.add(new SystemCodeVo(2, "type2", "typeName2", "code2", "codeName2"));
		codeVos.add(new SystemCodeVo(3, "type3", "typeName3", "code3", "codeName3"));
        if(!CollectionUtils.isEmpty(codeVos)){
            StringBuffer st = new StringBuffer();
            codeVos.stream().forEach(a -> st.append("<option value='"+a.getCodeValueCode()+"'>"+a.getCodeValueName()+"</option>"));
             System.out.println(st.toString());
        }
        
        System.out.println(MessageFormat.format("[LG0016]{0}已存在", "身份证号: 111111"));
	}
	
}
