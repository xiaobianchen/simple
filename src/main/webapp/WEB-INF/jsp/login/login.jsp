<%--
  Created by IntelliJ IDEA.
  User: jchen19
  Date: 2016/4/5
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<jsp:include page="../common/main.jsp"/>
<html>
<head>
    <title>订餐管理系统</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1.0" name="viewport"/>
    <meta content="" name="description"/>
    <meta content="" name="xiaobian"/>
</head>

<body class="login">
<div class="logo">
    &nbsp;
</div>

<!-- BEGIN LOGIN -->
<div class="content">
    <!-- BEGIN LOGIN FORM -->
    <shiro:notAuthenticated>
        <form class="login-form" method="post" action="login.action">
            <h3 class="form-title">订餐管理系统</h3>
            <input type="hidden" name="_form_token" value="b31631e6-e617-4266-bfd6-64e13fabf5b0">
            <input type="hidden" name="redirectURL" value="">

            <div class="form-group">
                <label class="control-label visible-ie8 visible-ie9">用户名</label>

                <div class="input-icon">
                    <i class="fa fa-user"></i>
                    <input class="form-control placeholder-no-fix" type="text" autocomplete="off" placeholder="用户名"
                           name="username" value=""/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label visible-ie8 visible-ie9">密码</label>

                <div class="input-icon">
                    <i class="fa fa-lock"></i>
                    <input class="form-control placeholder-no-fix" type="password" autocomplete="off" placeholder="密码"
                           name="password" value=""/>
                </div>
            </div>
            <div class="form-actions">

                <button type="submit" class="btn green pull-right">
                    登录 <i class="m-icon-swapright m-icon-white"></i>
                </button>
            </div>
        </form>
        <c:if test="${requestScope['exception'] == 'LoginException'}">
            <p>登录失败！</p>
        </c:if>
    </shiro:notAuthenticated>

    <!-- END REGISTRATION FORM -->
</div>
<!-- END LOGIN -->

</body>
</html>
