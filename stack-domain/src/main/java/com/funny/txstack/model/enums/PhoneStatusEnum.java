package com.funny.txstack.model.enums;

public enum PhoneStatusEnum {


    PHONE_STATUS_ONE("phone_status=1", "正常"),
    PHONE_STATUS_FOUR("phone_status=4", "空号"),
    PHONE_STATUS_ONETHREE("phone_status=13", "欠费"),
    PHONE_STATUS_TWOSEVEN("phone_status=27", "关机"),
    PHONE_STATUS_NINENINE("phone_status=99", "其它");

    PhoneStatusEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }
    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static String getValue(String key) {
        if (key == null) {
            return "";
        }
        for (PhoneStatusEnum phoneStatus : PhoneStatusEnum.values()) {
            if (phoneStatus.getKey().equals(key)) {
                return phoneStatus.getValue();
            }
        }
        return "";
    }


}

