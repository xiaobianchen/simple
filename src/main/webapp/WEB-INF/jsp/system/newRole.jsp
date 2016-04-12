<%--
  Created by IntelliJ IDEA.
  User: jchen19
  Date: 2016/4/11
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>订餐管理系统</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
    <!--loading all css files-->
    <link href="http://static.wy.foodoon.com/admin/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet"
          type="text/css"/>
    <link href="<c:url value="/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/css/uniform.default.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/css/style-metronic.css" />" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/css/style.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/css/style-responsive.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/css/plugins.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/css/light.css"/>" rel="stylesheet" type="text/css" id="style_color"/>
    <link href="<c:url value="/css/style.min.css"/> " rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/css/login.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/img/favicon.ico"/>" rel="shortcut icon"/>
    <link href="<c:url value="/css/datepicker.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/css/bootstrap-timepicker.min.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/css/colorpicker.css"/> " rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/css/daterangepicker-bs3.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/css/datetimepicker.css"/> " rel="stylesheet" type="text/css"/>

    <!--loading all js files-->
    <script src="<c:url value="/js/jquery-1.11.1.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/jquery-migrate-1.2.1.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/bootstrap.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/bootstrap-hover-dropdown.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/jquery.slimscroll.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/jquery.blockui.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/jquery.cokie.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/jquery.uniform.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/login.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/respond.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/excanvas.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/jquery.flot.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/jquery.flot.resize.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/jquery.flot.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/jquery.flot.stack.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/jquery.flot.crosshair.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/jquery.flot.categories.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/app.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/charts.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/ui-alert-dialog-api.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/bootbox.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/plupload.full.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/jstree.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/bootstrap-datepicker.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/bootstrap-datepicker.zh-CN.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/js/bootstrap-timepicker.min.js"/>"></script>
    <script src="<c:url value="/js/clockface.js"/>"></script>
    <script src="<c:url value="/js/jquery.flot.min.js"/>"></script>
    <script src="<c:url value="/js/daterangepicker.js"/>"></script>
    <script src="<c:url value="/js/bootstrap-colorpicker.js"/>"></script>
    <script src="<c:url value="/js/bootstrap-datetimepicker.min.js"/>" type="text/javascript"></script>


</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-header-fixed">
<!-- BEGIN HEADER -->
<div class="header navbar navbar-fixed-top">
    <!-- BEGIN TOP NAVIGATION BAR -->

    <div class="header-inner">
        <!-- BEGIN LOGO -->

        <a class="navbar-brand" href="#" style="color:white;padding-left: 30px">
            订餐管理系统
        </a>
        <!-- END LOGO -->

        <ul class="nav navbar-nav pull-right">
            <li style="color:white;line-height:50px">
                <a style="color:white;" href="#" target="_blank"> 帮助中心</a>
            </li>
            <li style="color:white;line-height:50px">
                <i class="fa fa-user"></i> 欢迎您：admin
            </li>
            <li>
                <a style="color:white;" href="#">
                    <i class="fa fa-key"></i> 退出
                </a>
            </li>
        </ul>
    </div>
</div>
<!-- END HEADER -->
<div class="clearfix">
</div>
<div class="page-container">
    <!-- BEGIN SIDEBAR -->
    <div class="page-sidebar-wrapper">
        <div class="page-sidebar navbar-collapse collapse">
            <!-- add "navbar-no-scroll" class to disable the scrolling of the sidebar menu -->
            <!-- BEGIN SIDEBAR MENU -->
            <ul class="page-sidebar-menu" data-auto-scroll="true" data-slide-speed="200">
                <li class="sidebar-toggler-wrapper">
                </li>
                <li class="sidebar-search-wrapper">

                </li>
                <li class="  start active  ">
                    <a href="javascript:;">
                        <i class="fa fa-shopping-cart"></i>
                        <span class="title">
                             主要功能
                        </span>
                        <span class="arrow ">
                        </span>
                    </a>
                    <ul class="sub-menu">

                        <li class="tooltips  active ">
                            <a href="#">
                                订单管理
                            </a>
                        </li>
                        <li class="tooltips ">
                            <a href="#">
                                餐品管理
                            </a>
                        </li>
                        <li class="tooltips ">
                            <a href="#">
                                优惠券管理
                            </a>
                        </li>

                        <li class="tooltips ">
                            <a href="#">
                                人员管理
                            </a>
                        </li>
                        <li class="tooltips ">
                            <a href="#">
                                发票记录
                            </a>
                        </li>

                        <li class="tooltips ">
                            <a href="#">
                                付款方式
                            </a>
                        </li>
                    </ul>
                </li>

                <li class="  ">
                    <a href="javascript:;">
                        <i class="fa fa-gift"></i>
                        <span class="title">
                            系统设置
                        </span>
                        <span class="arrow">
                        </span>
                    </a>
                    <ul class="sub-menu">
                        <li class="tooltips ">
                            <a href="/simple/admin.action">
                        <span class="title">
                            管理员设置
                        </span>
                            </a>
                        </li>
                        <li class="tooltips ">
                            <a href="/simple/role.action">
                                角色配置
                            </a>
                        </li>
                        <li class="tooltips ">
                            <a href="#">
                                短信设置
                            </a>
                        </li>
                        <li class="tooltips ">
                            <a href="#">
                                商城绑定用户
                            </a>
                        </li>
                        <li class="tooltips ">
                            <a href="#">
                                清理数据
                            </a>
                        </li>
                        <li class="tooltips ">
                            <a href="#">
                                导入数据
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="  ">
                    <a href="javascript:;">
                        <i class="fa fa-gift"></i>
                        <span class="title">
                            数据汇总
                        </span>
                        <span class="arrow">
                        </span>
                    </a>
                    <ul class="sub-menu">
                        <li class="tooltips ">
                            <a href="#">
                                <span class="title">
                                    收入汇总
                                </span>
                            </a>
                        </li>
                        <li class="tooltips ">
                            <a href="#">
                                <span class="title">
                                    收费率汇总
                                </span>
                            </a>
                        </li>
                        <li class="tooltips ">
                            <a href="#">
                                <span class="title">
                                    其他报表
                                </span>
                            </a>
                        </li>
                    </ul>
                </li>

            </ul>
            <!-- END SIDEBAR MENU -->
        </div>
    </div>
    <!-- END SIDEBAR -->

    <div class="page-content-wrapper">
        <div class="page-content" style="min-height:690px !important">
            <ul class="page-breadcrumb breadcrumb">
                <li>
                    <i class="fa fa-home"></i>
                    <a href="/simple/role.action">
                        设置角色
                    </a>
                    <i class="fa fa-angle-right"></i>
                </li>
                <li>
                    添加角色
                </li>
            </ul>
            <!-- BEGIN PAGE CONTENT-->
            <div class="row">
                <div class="col-md-12">
                    <form:form class="form-horizontal form-row-seperated" method="post" modelAttribute="role">
                        <input type="hidden" name="_form_token" value="8e2479ea-334e-491f-bc0b-8c739c2c8791">

                        <div class="portlet">
                            <div class="portlet-body">
                                <div class="tabbable">

                                    <div class="form-body">
                                        <div class="form-group">
                                            <label class="col-md-2 control-label">角色名称:
                                                <span class="required">*</span>
                                            </label>

                                            <div class="col-md-6">
                                                <input class="form-control placeholder-no-fix" type="text"
                                                       name="roleName" value="${role.roleName}"/>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="col-md-2 control-label">角色描述
                                                <span class="required">*</span>
                                            </label>

                                            <div class="col-md-6">
                                                <input class="form-control placeholder-no-fix" type="text"
                                                       name="roleDesc" value="${role.roleDesc}"/>
                                            </div>
                                        </div>


                                        <div class="form-group">
                                            <div class="col-md-2"></div>
                                            <div class="col-md-6">
                                                <button class="btn green" type="submit"><i class="fa fa-check"></i> 保存
                                                </button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </div>

    <script>

        $(document).ready(function () {
            App.init(); // initlayout and core plugins
        });
    </script>
</div>


</body>
</html>


