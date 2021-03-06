<%--
  Created by IntelliJ IDEA.
  User: jchen19
  Date: 2016/4/6
  Time: 10:56
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

            <!-- BEGIN PAGE HEADER-->
            <div class="row">
                <div class="col-md-12">
                    <!-- BEGIN PAGE TITLE & BREADCRUMB-->

                    <ul class="page-breadcrumb breadcrumb">
                        <li>
                            <i class="fa fa-home"></i>
                            <a href="http://wy.foodoon.com/fee/water/list.htm">
                                收费统计
                            </a>
                            <i class="fa fa-angle-right"></i>
                        </li>
                        <li>
                            列表
                        </li>
                    </ul>
                    <!-- END PAGE TITLE & BREADCRUMB-->
                </div>
            </div>
            <!-- END PAGE HEADER-->

            <div class="row">

                <div class="col-md-12">


                    <form class="form-horizontal form-row-seperated" action="#" method="get">
                        <input type="hidden" name="search" value="1"/>

                        <div class="portlet">

                            <div class="portlet-body">
                                <div class="tabbable">

                                    <div class="form-body">
                                        <div class="form-group">
                                            <label class="col-md-1 control-label">小区名称:
                                            </label>

                                            <div class="col-md-2">
                                                <select name="villageId"
                                                        class="J_village form-control placeholder-no-fix">
                                                    <option value="">请选择</option>
                                                    <option value="1"
                                                            >山水湾
                                                    </option>
                                                    <option value="4"
                                                            >巴黎香榭·芙蓉公馆
                                                    </option>
                                                    <option value="6"
                                                            >品格家园
                                                    </option>
                                                </select>
                                                <b style="color:red">不能为空</b></div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-md-1 control-label">开始时间:
                                            </label>

                                            <div class="col-md-3">
                                                <div class="input-group col-md-2 input-medium date date-picker"
                                                     data-date-format="yyyy-mm-dd">
                                                    <input type="text" class="form-control" readonly="" name="endDate"
                                                           value=""/>
                                                        <span class="input-group-btn">
                                                            <button class="btn default" type="button"><i
                                                                    class="fa fa-calendar"></i></button>
                                                        </span>

                                                </div>
                                                <b style="color:red">不能为空</b></div>

                                            <label class="col-md-1 control-label">结束时间:
                                            </label>

                                            <div class="col-md-3">
                                                <div class="input-group col-md-2 input-medium date date-picker"
                                                     data-date-format="yyyy-mm-dd">
                                                    <input type="text" class="form-control" readonly="" name="endDate"
                                                           value=""/>
                                                        <span class="input-group-btn">
                                                            <button class="btn default" type="button"><i
                                                                    class="fa fa-calendar"></i></button>
                                                        </span>

                                                </div>
                                                <b style="color:red">不能为空</b></div>
                                            <div class="col-md-1">
                                                <button class="btn green" type="submit"><i class="fa fa-check"></i> 查询
                                                </button>
                                            </div>
                                            <div class="col-md-1">
                                                <a class="btn green"
                                                   href="http://wy.foodoon.com/export/stat.do?villageId=&startDate=&endDate="><i
                                                        class="fa fa-check"></i> 导出excel</a>

                                            </div>
                                        </div>

                                    </div>

                                </div>
                            </div>
                        </div>
                    </form>

                </div>

            </div>

            <!-- BEGIN PAGE CONTENT-->
            <div class="row">
                <div class="col-md-12 page-500">

                    <!-- Begin: life time stats -->
                    <div class="portlet">

                        <div class="portlet-body">
                            <div class="table-container">

                                <table class="table table-striped table-bordered table-hover" id="datatable_orders">
                                    <thead>
                                    <tr role="row" class="heading">
                                        <th width="5%" rowspan="2">
                                            日期
                                        </th>
                                        <th width="5%" rowspan="2">
                                            物业费
                                        </th>
                                        <th width="5%" colspan="2" style="text-align: center;">
                                            水费
                                        </th>
                                        <th width="5%" colspan="2" style="text-align: center;">
                                            电费
                                        </th>
                                        <th width="5%" rowspan="2">
                                            车位费
                                        </th>

                                        <th width="5%" rowspan="2">
                                            押金
                                        </th>

                                        <th width="5%" rowspan="2">
                                            自行减免
                                        </th>
                                        <th width="5%" rowspan="2">
                                            地产减免
                                        </th>

                                    </tr>
                                    <tr role="row" class="heading">
                                        <th width="5%">
                                            ic卡
                                        </th>
                                        <th width="5%">
                                            抄表
                                        </th>
                                        <th width="5%">
                                            ic卡
                                        </th>
                                        <th width="5%">
                                            抄表
                                        </th>
                                    </tr>

                                    </thead>
                                    <tbody>
                                    </tbody>
                                </table>

                            </div>
                        </div>
                    </div>
                    <!-- End: life time stats -->

                </div>
            </div>

            <div class="row">

                <div class="col-md-12 page-500">

                    <!-- Begin: life time stats -->
                    <div class="portlet">

                        <div class="portlet-body">
                            <div class="table-container">

                                <table class="table table-striped table-bordered table-hover" id="datatable_orders">
                                    <thead>
                                    <tr role="row" class="heading">
                                        <th width="5%">
                                            年份
                                        </th>
                                        <th width="5%">
                                            总计
                                        </th>
                                    </tr>

                                    </thead>
                                    <tbody>
                                    </tbody>
                                </table>

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

