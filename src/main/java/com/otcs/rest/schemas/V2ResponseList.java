
package com.otcs.rest.schemas;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class V2ResponseList<T extends Properties> implements OTCSResponse {

    @SerializedName("results")
    @Expose
    private List<Result<T>> results = null;

    @SerializedName("links")
    @Expose
    private Links links;

    public List<Result<T>> getResults() {
        return results;
    }

    public void setResults(List<Result<T>> results) {
        this.results = results;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

}
