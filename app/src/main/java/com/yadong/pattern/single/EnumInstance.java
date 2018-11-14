package com.yadong.pattern.single;

/**
 * 枚举方式的单例,
 * 天然抵挡反射破解和序列化破解
 */
public enum EnumInstance {

    INSTANCE;

    private  Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return  INSTANCE;
    }

}
