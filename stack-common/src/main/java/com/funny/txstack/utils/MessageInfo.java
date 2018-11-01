package com.funny.txstack.utils;

import java.io.Serializable;

/**
 * @author fangli
 */
public class MessageInfo implements Serializable {
    private static final long serialVersionUID = 586786028769464057L;
    public String SendWho;
    public String Type;
    public String Title;
    public String Message;
    public String RemindDesc;

    public MessageInfo() {
    }

    public String getSendWho() {
        return this.SendWho;
    }

    public void setSendWho(String sendWho) {
        this.SendWho = sendWho;
    }

    public String getType() {
        return this.Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public String getTitle() {
        return this.Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getMessage() {
        return this.Message;
    }

    public void setMessage(String message) {
        this.Message = message;
    }

    public String getRemindDesc() {
        return this.RemindDesc;
    }

    public void setRemindDesc(String remindDesc) {
        this.RemindDesc = remindDesc;
    }
}
