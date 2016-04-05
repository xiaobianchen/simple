<%--
  Created by IntelliJ IDEA.
  User: jchen19
  Date: 2016/4/5
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订餐管理系统</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
    <jsp:include page="../common/main.jsp"/>
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
                    <a href="#">
                        管理员设置
                    </a>
                    <i class="fa fa-angle-right"></i>
                </li>
                <li>
                    管理员列表
                </li>
            </ul>
            <!-- BEGIN PAGE CONTENT-->
            <div class="row">
                <div class="col-md-12 page-500">

                    <!-- Begin: life time stats -->
                    <div class="portlet">
                        <div class="portlet-title">

                            <div class="actions">
                                <a href="http://wy.foodoon.com/sys/admin/create.htm" class="btn default yellow-stripe">
                                    <i class="fa fa-plus"></i>
									<span class="hidden-480">
										 新建管理员
									</span>
                                </a>

                            </div>
                        </div>
                        <div class="portlet-body">
                            <div class="table-container">

                                <table class="table table-striped table-bordered table-hover" id="datatable_orders">
                                    <thead>
                                    <tr role="row" class="heading">

                                        <th width="10%">
                                            真实姓名
                                        </th>
                                        <th width="10%">
                                            登录名
                                        </th>
                                        <th width="10%">
                                            手机号
                                        </th>
                                        <th width="10%">
                                            角色
                                        </th>
                                        <th width="10%">
                                            操作
                                        </th>
                                    </tr>

                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>admin</td>
                                        <td>admin</td>

                                        <td>
                                            17098151234
                                        </td>
                                        <td>

                                            小区管理员,
                                            ,
                                            缴费专员,
                                            香榭核算员,
                                        </td>

                                        <td>
                                            <a href="http://wy.foodoon.com/sys/admin/bindVillage/create.htm?id=1"
                                               class=" btn btn-sm default">小区权限
                                            </a>
                                            <a title="编辑" href="http://wy.foodoon.com/sys/admin/edit.htm?id=1"
                                               class=" btn btn-sm default"><i class="fa fa-pencil"></i> 编辑
                                            </a>
                                            <a title="删除" href="javascript:;" data-id="1"
                                               class="del_btn btn btn-sm default filter-cancel"><i
                                                    class="fa fa-times"></i> 删除
                                            </a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>财务</td>
                                        <td>caiwu</td>

                                        <td>
                                            13512341234
                                        </td>
                                        <td>

                                            香榭核算员,
                                        </td>

                                        <td>
                                            <a href="http://wy.foodoon.com/sys/admin/bindVillage/create.htm?id=2"
                                               class=" btn btn-sm default">小区权限
                                            </a>
                                            <a title="编辑" href="http://wy.foodoon.com/sys/admin/edit.htm?id=2"
                                               class=" btn btn-sm default"><i class="fa fa-pencil"></i> 编辑
                                            </a>
                                            <a title="删除" href="javascript:;" data-id="2"
                                               class="del_btn btn btn-sm default filter-cancel"><i
                                                    class="fa fa-times"></i> 删除
                                            </a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>缴费账号</td>
                                        <td>jiaofei</td>

                                        <td>
                                            13512341234
                                        </td>
                                        <td>

                                            缴费专员,
                                        </td>

                                        <td>
                                            <a href="http://wy.foodoon.com/sys/admin/bindVillage/create.htm?id=3"
                                               class=" btn btn-sm default">小区权限
                                            </a>
                                            <a title="编辑" href="http://wy.foodoon.com/sys/admin/edit.htm?id=3"
                                               class=" btn btn-sm default"><i class="fa fa-pencil"></i> 编辑
                                            </a>
                                            <a title="删除" href="javascript:;" data-id="3"
                                               class="del_btn btn btn-sm default filter-cancel"><i
                                                    class="fa fa-times"></i> 删除
                                            </a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>品格管理员</td>
                                        <td>品格管理员</td>

                                        <td>
                                            13548914451
                                        </td>
                                        <td>

                                            小区管理员,
                                        </td>

                                        <td>
                                            <a href="http://wy.foodoon.com/sys/admin/bindVillage/create.htm?id=4"
                                               class=" btn btn-sm default">小区权限
                                            </a>
                                            <a title="编辑" href="http://wy.foodoon.com/sys/admin/edit.htm?id=4"
                                               class=" btn btn-sm default"><i class="fa fa-pencil"></i> 编辑
                                            </a>
                                            <a title="删除" href="javascript:;" data-id="4"
                                               class="del_btn btn btn-sm default filter-cancel"><i
                                                    class="fa fa-times"></i> 删除
                                            </a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>香榭管理员</td>
                                        <td>香榭管理员</td>

                                        <td>
                                            13548965115
                                        </td>
                                        <td>

                                            小区管理员,
                                        </td>

                                        <td>
                                            <a href="http://wy.foodoon.com/sys/admin/bindVillage/create.htm?id=5"
                                               class=" btn btn-sm default">小区权限
                                            </a>
                                            <a title="编辑" href="http://wy.foodoon.com/sys/admin/edit.htm?id=5"
                                               class=" btn btn-sm default"><i class="fa fa-pencil"></i> 编辑
                                            </a>
                                            <a title="删除" href="javascript:;" data-id="5"
                                               class="del_btn btn btn-sm default filter-cancel"><i
                                                    class="fa fa-times"></i> 删除
                                            </a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>11111111</td>
                                        <td>013到此一游</td>

                                        <td>
                                            18611111111
                                        </td>
                                        <td>

                                            小区管理员,
                                            小区财务,
                                        </td>

                                        <td>
                                            <a href="http://wy.foodoon.com/sys/admin/bindVillage/create.htm?id=7"
                                               class=" btn btn-sm default">小区权限
                                            </a>
                                            <a title="编辑" href="http://wy.foodoon.com/sys/admin/edit.htm?id=7"
                                               class=" btn btn-sm default"><i class="fa fa-pencil"></i> 编辑
                                            </a>
                                            <a title="删除" href="javascript:;" data-id="7"
                                               class="del_btn btn btn-sm default filter-cancel"><i
                                                    class="fa fa-times"></i> 删除
                                            </a>
                                        </td>
                                    </tr>
                                    </tbody>
                                </table>
                                <!--分页开始-->

                                <div class="pull-right">
                                    <div class="dataTables_paginate paging_bootstrap">
                                        <ul class="pagination" style="visibility: visible;">
                                            <li class="disabled"><a>首页</a></li>
                                            <li class="disabled"><a>上一页</a></li>
                                            <li class="disabled"><a>1</a></li>
                                            <li class="disabled"><a>下一页</a></li>
                                            <li class="disabled"><a>末页</a></li>

                                        </ul>
                                    </div>
                                </div>

                                <!-- 分页结束-->
                            </div>
                        </div>
                    </div>
                    <!-- End: life time stats -->

                </div>
            </div>
            <!-- END PAGE CONTENT-->
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
