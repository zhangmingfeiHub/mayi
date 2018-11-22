package com.zebra.print.utils;


import java.io.Serializable;



public class JsonResult<T> implements Serializable {


    private static final long serialVersionUID = -6945394194962856573L;

    boolean isOk = true;

	String resDescription;

	T data;

    public boolean isOk() {
        return isOk;
    }

    public void setOk(boolean ok) {
        isOk = ok;
    }

    public String getResDescription() {
        return resDescription;
    }

    public void setResDescription(String resDescription) {
        this.resDescription = resDescription;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
