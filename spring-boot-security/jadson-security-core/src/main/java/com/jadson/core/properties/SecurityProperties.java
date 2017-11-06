package com.jadson.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: dengjunzhen
 * @Date: 下午9:06 2017/11/5
 **/
@ConfigurationProperties(prefix = "system.security")
public class SecurityProperties {


    private BrowserProperties browser = new BrowserProperties();

    public BrowserProperties getBrowser() {
        return browser;
    }

    public void setBrowser(BrowserProperties browser) {
        this.browser = browser;
    }
}
