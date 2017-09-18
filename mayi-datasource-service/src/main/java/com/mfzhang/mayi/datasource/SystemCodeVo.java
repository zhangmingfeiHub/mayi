package com.mfzhang.mayi.datasource;

public class SystemCodeVo {

	private Integer id;
	private String codeType;
	private String codeTypeName;
	private String codeValueCode;
	private String codeValueName;
	
	public SystemCodeVo() {}

	public SystemCodeVo(Integer id, String codeType, String codeTypeName, String codeValueCode, String codeValueName) {
		super();
		this.id = id;
		this.codeType = codeType;
		this.codeTypeName = codeTypeName;
		this.codeValueCode = codeValueCode;
		this.codeValueName = codeValueName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getCodeTypeName() {
		return codeTypeName;
	}

	public void setCodeTypeName(String codeTypeName) {
		this.codeTypeName = codeTypeName;
	}

	public String getCodeValueCode() {
		return codeValueCode;
	}

	public void setCodeValueCode(String codeValueCode) {
		this.codeValueCode = codeValueCode;
	}

	public String getCodeValueName() {
		return codeValueName;
	}

	public void setCodeValueName(String codeValueName) {
		this.codeValueName = codeValueName;
	}

}
