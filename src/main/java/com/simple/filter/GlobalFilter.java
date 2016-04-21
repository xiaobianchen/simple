package com.simple.filter;

import com.simple.util.WebUtil;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/21
 */
public class GlobalFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)request;
        HttpServletResponse  resp = (HttpServletResponse)response;

        req.setCharacterEncoding("UTF-8");

        WebUtil.Context.init(req, resp);

        try {
            chain.doFilter(request,response);
        } finally {
            WebUtil.Context.destroy();
        }


    }

    @Override
    public void destroy() {

    }
}
