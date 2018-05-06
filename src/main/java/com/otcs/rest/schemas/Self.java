
package com.otcs.rest.schemas;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Self {

    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("content_type")
    @Expose
    private String contentType;
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("method")
    @Expose
    private String method;
    @SerializedName("name")
    @Expose
    private String name;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
