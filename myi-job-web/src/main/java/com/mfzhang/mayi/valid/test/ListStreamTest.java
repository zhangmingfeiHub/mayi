package com.mfzhang.mayi.valid.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.mfzhang.mayi.common.utils.CommonUtils;

/**
 * 
 * 
 * ListStreamTest.java
 * @date 2017年11月23日 下午2:47:40
 * @author mingfei.zhang
 */
public class ListStreamTest {

	public static void main(String[] args) {
		List<Address> addressList = new ArrayList<Address>(){{
			add(new Address("provinceCode1", "", "", "", ""));
			add(new Address("provinceCode2", "", "", "", ""));
			add(new Address("provinceCode3", "", "", "", ""));
		}};
		
		
		List<Phone> phoneList = new ArrayList<Phone>() {{
			add(new Phone(1, "content1", 0));
			add(new Phone(2, "provinceCode2", 0));
			add(new Phone(3, "provinceCode3", 0));
			add(new Phone(4, "provinceCode3", 1));
		}};
		
		/*List<String> provinceCodeList = addressList.stream().map(Address::getProvinceCode).collect(Collectors.toList());
		System.out.println(CommonUtils.writeValueAsString(provinceCodeList));
		
		List<String> contentList = phoneList.stream().filter(phone -> provinceCodeList.contains(phone.getContent())).map(Phone::getContent).collect(Collectors.toList());
		System.out.println(CommonUtils.writeValueAsString(contentList));
		
		phoneList.stream().forEach(phone -> {phone.setContent(phone.getContent() + "-1");phone.setType(2);});
		System.out.println(CommonUtils.writeValueAsString(phoneList));
		
		List<Address> addressList2 = new ArrayList<>();
		phoneList.stream().forEach(phone -> {
			Address address = new Address();
			address.setProvinceCode(phone.getContent() + "phone");
			addressList2.add(address);
		});
		System.out.println(CommonUtils.writeValueAsString(addressList2));*/
		
		List<Phone> filterPhoneList = phoneList.stream()
				.filter(phone -> phone.getContent().equals("provinceCode3"))
				.filter(phone -> phone.getType() == 1).collect(Collectors.toList());
		System.out.println(CommonUtils.writeValueAsString(filterPhoneList));
	}
	
}
