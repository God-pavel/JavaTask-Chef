package com.company.controller;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Enum ?????????? ????? ??????? ? ????????? ???????????
 *
 * @author ????? ?????????
 * @version 1.0
 */

public enum ResourceController {

    USER_INTERFACE("resource");

    /**
     * ???? ?????
     */
    private ResourceBundle resourceBundle;
    /**
     * ???? ??? ??????
     */
    private String resourceName;

    /**
     * ??????????? - ???????? ???????
     *
     * @param resourceName - ???? ? ???????? ??????
     */
    ResourceController(String resourceName) {
        this.resourceName = resourceName;
        resourceBundle = ResourceBundle.getBundle(this.resourceName, Locale.getDefault());
    }

    /**
     * ????? ????????? ??????
     */
    public void changeResource(Locale locale) {
        resourceBundle = ResourceBundle.getBundle(resourceName, locale);
    }

    /**
     * ????? ????????? ?????? ?? ?? ?????
     */
    public String getString(String key) {
        return resourceBundle.getString(key);
    }


}