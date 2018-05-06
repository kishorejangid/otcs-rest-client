
package com.otcs.rest.schemas;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data<T extends Properties> {

    @SerializedName("properties")
    @Expose
    private T properties;


    public T getProperties() {
        return properties;
    }

    public void setProperties(T properties) {
        this.properties = properties;
    }
}
