package com.changpeng.app.ws.ui.model.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {
    private String errorMessage;
    private String getErrorMessageKey;
    private String href;

    public ErrorMessage(){}

    public ErrorMessage(String errorMessage, String getErrorMessageKey, String href) {
        this.errorMessage = errorMessage;
        this.getErrorMessageKey = getErrorMessageKey;
        this.href = href;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getGetErrorMessageKey() {
        return getErrorMessageKey;
    }

    public void setGetErrorMessageKey(String getErrorMessageKey) {
        this.getErrorMessageKey = getErrorMessageKey;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
