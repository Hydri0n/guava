package xyz.hplus.guava.controller;

import xyz.hplus.web.support.AppContext;

/**
 * @Author xiehongsong
 * @Date 2022/8/15
 */
public class BaseController {
    public Integer getUserId() {
        String idStr = AppContext.getString("userId");
        if (idStr == null) {
            return null;
        }
        return Integer.valueOf(idStr);
    }
}
