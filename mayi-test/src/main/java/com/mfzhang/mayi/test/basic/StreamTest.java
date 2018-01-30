package com.mfzhang.mayi.test.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.util.StringUtils;

/**
 * 
 * @author mingfei.z
 *
 */
public class StreamTest {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		List<ShopBindContractResultVo> list = getList();
		List<SapContractSecond> scsList = getScsList();
		
		list.stream().forEach(shop -> {
			String contractCode = "";
			
			for (SapContractSecond scs : scsList) {
				if (scs.getShopId().intValue() == shop.getShopId().intValue()) {
					contractCode += scs.getSapContractCode() + ",";
				}
			}
			contractCode = StringUtils.isEmpty(contractCode) ? "" : contractCode.substring(0, contractCode.length() - 1);
			shop.setSecondContractCode(contractCode);
			
			System.err.println("shopId: " + shop.getShopId() + ", contractCode: " + contractCode);
		});
	}
	
	private static List<ShopBindContractResultVo> getList() {
		List<ShopBindContractResultVo> list = new ArrayList<>();
		
		ShopBindContractResultVo sbcr1 = new ShopBindContractResultVo();
		sbcr1.setShopId(100);
		list.add(sbcr1);

		ShopBindContractResultVo sbcr2 = new ShopBindContractResultVo();
		sbcr2.setShopId(200);
		list.add(sbcr2);

		ShopBindContractResultVo sbcr3 = new ShopBindContractResultVo();
		sbcr3.setShopId(300);
		list.add(sbcr3);

		ShopBindContractResultVo sbcr4 = new ShopBindContractResultVo();
		sbcr4.setShopId(400);
		list.add(sbcr4);

		ShopBindContractResultVo sbcr5 = new ShopBindContractResultVo();
		sbcr5.setShopId(500);
		list.add(sbcr5);

		ShopBindContractResultVo sbcr6 = new ShopBindContractResultVo();
		sbcr6.setShopId(600);
		list.add(sbcr6);

		ShopBindContractResultVo sbcr7 = new ShopBindContractResultVo();
		sbcr7.setShopId(700);
		list.add(sbcr7);
		
		return list;
	}

	private static List<SapContractSecond> getScsList() {
		List<SapContractSecond> list = new ArrayList<>();
		
		SapContractSecond sbcr1 = new SapContractSecond();
		sbcr1.setShopId(100l);
		sbcr1.setSapContractCode("100code");
		list.add(sbcr1);

		SapContractSecond sbcr2 = new SapContractSecond();
		sbcr2.setShopId(202l);
		sbcr2.setSapContractCode("202code");
		list.add(sbcr2);

		SapContractSecond sbcr3 = new SapContractSecond();
		sbcr3.setShopId(300l);
		sbcr3.setSapContractCode("300code");
		list.add(sbcr3);

		SapContractSecond sbcr4 = new SapContractSecond();
		sbcr4.setShopId(400l);
		sbcr4.setSapContractCode("400code");
		list.add(sbcr4);

		SapContractSecond sbcr5 = new SapContractSecond();
		sbcr5.setShopId(501l);
		sbcr5.setSapContractCode("501code");
		list.add(sbcr5);

		SapContractSecond sbcr6 = new SapContractSecond();
		sbcr6.setShopId(100l);
		sbcr6.setSapContractCode("100code");
		list.add(sbcr6);

		SapContractSecond sbcr7 = new SapContractSecond();
		sbcr7.setShopId(100l);
		sbcr7.setSapContractCode("100code");
		list.add(sbcr7);
		
		return list;
	}
	
}
