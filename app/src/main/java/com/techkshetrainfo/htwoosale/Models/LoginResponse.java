package com.techkshetrainfo.htwoosale.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by techkshetra-1 on 28/3/18
 */

public class LoginResponse {

    @SerializedName("code")
    @Expose
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
