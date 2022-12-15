package org.cloud.sonic.controller.models.http;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class SaveJenkins implements Serializable {

    @NotNull
    @ApiModelProperty(value = "jenkinsUrl", required = true, example = "http://10.23.*.*:8080/")
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
