package com.wusd.filter;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class XssAndSqlHttpServletRequestWrapper extends HttpServletRequestWrapper {
    private HttpServletRequest request;
    public XssAndSqlHttpServletRequestWrapper(HttpServletRequest request) {
        super(request);
        this.request = request;
    }
    @Override
    public String getParameter(String name) {
        String value = this.request.getParameter(name);
        if (StringUtils.isNotEmpty(value)) {
            System.out.println("转换前value:" + value);
            value = StringEscapeUtils.escapeHtml4(value);
            System.out.println("转换后value:" + value);
        }
        return value;
    }
}
