<%--
  Created by IntelliJ IDEA.
  User: jchen19
  Date: 2016/4/5
  Time: 12:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订餐管理系统</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
    <jsp:include page="common/main.jsp"/>
</head>
<!-- END HEAD -->

<!-- BEGIN BODY -->
<body class="page-header-fixed">
<!-- BEGIN HEADER -->
<div class="header navbar navbar-fixed-top">
    <!-- BEGIN TOP NAVIGATION BAR -->
    <div class="header-inner">
        <!-- BEGIN LOGO -->
        <a class="navbar-brand" href="/simple" style="color:white;padding-left: 30px">
            订餐管理系统
        </a>
        <!-- END LOGO -->

        <ul class="nav navbar-nav pull-right">
            <li style="color:white;line-height:50px">
                <a style="color:white;" href="#" target="_blank">帮助中心</a>
            </li>
            <li style="color:white;line-height:50px">
                <i class="fa fa-user"></i> 欢迎您：admin
            </li>
            <li>
                <a style="color:white;" href="/simple/loggout.action">
                    <i class="fa fa-key"></i> 退出
                </a>
            </li>
        </ul>
    </div>
</div>
<div class="clearfix">
</div>

<div class="page-container">
    <!-- BEGIN SIDEBAR -->
    <div class="page-sidebar-wrapper">
        <div class="page-sidebar navbar-collapse collapse">
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
                        <li class="tooltips">
                            <a href="/simple/role.action">
                                角色配置
                            </a>
                        </li>
                        <li class="tooltips">
                            <a href="/simple/sms.action">
                                短信设置
                            </a>
                        </li>
                        <li class="tooltips ">
                            <a href="/simple/bindinguser.action">
                                商城绑定用户
                            </a>
                        </li>
                        <li class="tooltips ">
                            <a href="/simple/cleardata.action">
                                清理数据
                            </a>
                        </li>
                        <li class="tooltips ">
                            <a href="/simple/export.action">
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
                            <a href="/simple/Income.action">
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
                            <a href="#">
                                订单管理
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
            <!-- BEGIN PAGE CONTENT-->
            <div class="row">
                <div class="col-md-12">
                    <form class="form-horizontal form-row-seperated" action="#" method="get">
                        <input type="hidden" name="search" value="1"/>

                        <div class="portlet">

                            <div class="portlet-body">
                                <div class="tabbable">

                                    <div class="form-body">
                                        <div class="form-group">
                                            <label class="col-md-1 control-label">用户名称:
                                            </label>

                                            <div class="col-md-2">
                                                <input name="username" type="text" value="" class="form-control"/>
                                            </div>

                                            <label class="col-md-1 control-label">下单时间:
                                            </label>

                                            <div class="col-md-2">
                                                <input name="orderedTime" type="text" value="" class="form-control"/>
                                            </div>

                                            <label class="col-md-1 control-label">用户电话:
                                            </label>

                                            <div class="col-md-2">
                                                <input name="phoneNumber" type="text" value="" class="form-control"/>
                                            </div>

                                            <label class="col-md-1 control-label">外送地址:
                                            </label>

                                            <div class="col-md-2">
                                                <input name="orderAddress" type="text" value="" class="form-control"/>
                                            </div>

                                        </div>

                                        <div class="form-group">
                                            <label class="col-md-1 control-label">总价格:
                                            </label>

                                            <div class="col-md-2">
                                                <input name="totalPrice" type="text" value="" class="form-control"/>
                                            </div>

                                            <label class="col-md-1 control-label">支付票据:
                                            </label>

                                            <div class="col-md-2">
                                                <input name="payNote" type="text" value="" class="form-control"/>
                                            </div>

                                            <div class="col-md-2">
                                                <button class="btn green" type="submit"><i class="fa fa-check"></i> 查询
                                                </button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>

                </div>
            </div>
            <div class="row">
                <div class="col-md-12 page-500">
                    <!-- Begin: life time stats -->
                    <div class="portlet">

                        <div class="portlet-title">

                        </div>
                        <div class="portlet-body">
                            <div class="table-container">

                                <table class="table table-striped table-bordered table-hover" id="datatable_orders">
                                    <thead>
                                    <tr role="row" class="heading">

                                        <th width="5%">
                                            下单时间
                                        </th>
                                        <th width="5%">
                                            下单用户
                                        </th>
                                        <th width="5%">
                                            用户电话
                                        </th>
                                        <th width="5%">
                                            外送地址
                                        </th>
                                        <th width="5%">
                                            总价格
                                        </th>
                                        <th width="10%">
                                            支付票据
                                        </th>
                                        <th width="5%">
                                            操作
                                        </th>
                                    </tr>

                                    </thead>
                                    <tbody>

                                    </tbody>
                                </table>
                                <!--分页开始-->

                                <div class="pull-right">
                                    <div class="dataTables_paginate paging_bootstrap">
                                        <ul class="pagination" style="visibility: visible;">
                                            <li>
                                                <a href="#">首页</a>
                                            </li>
                                            <li><a>上一页</a></li>
                                            <li><a>下一页</a></li>
                                            <li><a>末页</a></li>
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

            $('.J_selectAll').click(function (e) {
                if (this.checked) {
                    selectAll();
                } else {
                    invertSelect();
                }
            });

            function selectAll() {
                $("input[name='billIdList']").each(function () {
                    $(this).attr('checked', true);
                    $(this).parents('.checker').find('span').addClass('checked');
                });
            }

            function invertSelect() {
                $(".J_selectBox").each(function () {
                    if ($(this).attr('checked')) {
                        $(this).attr('checked', false);
                        $(this).parents('.checker').find('span').removeClass('checked');
                    } else {
                        $(this).attr('checked', true);
                        $(this).parents('.checker').find('span').addClass('checked');
                    }
                });
            }


            $(".J_village").change(function (e1) {
                var villageId = $(this).children('option:selected').val();
                $('.J_village_id').val(villageId)
                $.ajax({
                    type: 'POST',
                    url: 'http://wy.foodoon.com/sys/common/getBuilding.htm',
                    data: {
                        'villageId': villageId,
                    },
                    dataType: 'json',
                    success: function (data) {
                        $('.J_building').empty();
                        if (data.buildingList.length > 0) {

                            createBuildingOption('.J_building', data.buildingList);
                        }
                    }
                });

            });

            function createBuildingOption(cls, response) {
                $(cls).empty();
                var select = $(cls);
                select.append('<option value="">请选择</option>');
                $.each(response, function (i, item) {
                    var v = $(cls).val();
                    if (v && v == item.buildingId) {
                        select.append($("<option selected>" + item.buildingName + "</option>").attr("value", item.buildingId));
                    } else {
                        select.append($("<option>" + item.buildingName + "</option>").attr("value", item.buildingId));
                    }

                });

            }


            $(".J_building").change(function (e1) {
                var buildingId = $(this).children('option:selected').val();
                $('.J_building_id').val(buildingId)
                $.ajax({
                    type: 'POST',
                    url: 'http://wy.foodoon.com/sys/common/getUnit.htm',
                    data: {
                        'buildingId': buildingId,
                    },
                    dataType: 'json',
                    success: function (data) {
                        $('.J_unit').empty();
                        if (data.unitList.length > 0) {

                            createUnitOption('.J_unit', data.unitList);
                        }
                    }
                });

            });

            function createUnitOption(cls, response) {
                $(cls).empty();
                var select = $(cls);
                select.append('<option value="">请选择</option>');
                $.each(response, function (i, item) {
                    var v = $(cls).val();
                    if (v && v == item.unitId) {
                        select.append($("<option selected>" + item.unitName + "</option>").attr("value", item.unitId));
                    } else {
                        select.append($("<option>" + item.unitName + "</option>").attr("value", item.unitId));
                    }

                });

            }


            $(".J_unit").change(function (e1) {
                var unitId = $(this).children('option:selected').val();
                $('.J_unit_id').val(unitId)
                $.ajax({
                    type: 'POST',
                    url: 'http://wy.foodoon.com/sys/common/getSuite.htm',
                    data: {
                        'unitId': unitId,
                    },
                    dataType: 'json',
                    success: function (data) {
                        $('.J_suite').empty();
                        if (data.suiteList.length > 0) {

                            createSuiteOption('.J_suite', data.suiteList);
                        }
                    }
                });

            });

            function createSuiteOption(cls, response) {
                $(cls).empty();
                var select = $(cls);
                select.append('<option value="">请选择</option>');
                $.each(response, function (i, item) {
                    var v = $(cls).val();
                    if (v && v == item.suiteId) {
                        select.append($("<option selected>" + item.suiteName + "</option>").attr("value", item.suiteId));
                    } else {
                        select.append($("<option>" + item.suiteName + "</option>").attr("value", item.suiteId));
                    }

                });
            }

            $(".J_suite").change(function (e1) {
                var suiteId = $(this).children('option:selected').val();
                $('.J_suite_id').val(suiteId)
            });
        });
    </script>
</div>


</body>
</html>
