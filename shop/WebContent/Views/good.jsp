﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.*,cn.cumt.shop.domain.Order" %>
<%@page import="cn.cumt.shop.dao.impl.OrderDaoImpl,cn.cumt.shop.dao.IOrderDao,cn.cumt.shop.dbc.DBUtil" %>
<%@page import="cn.cumt.shop.dao.impl.CustomerDaoImpl,cn.cumt.shop.dao.ICustomerDao,cn.cumt.shop.domain.Customer" %>
<%@page import="cn.cumt.shop.dao.impl.GoodDaoImpl,cn.cumt.shop.dao.IGoodDao,cn.cumt.shop.domain.Good" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link href="../bootstrap2.3.2/css/bootstrap.min.css" rel="stylesheet" />
    <title></title>
    <link href="../styles/Common.css" rel="stylesheet" />
    <link href="../styles/Index2.css" rel="stylesheet" />
</head>
<body>
    <div class="container-fluid">
        <div class="row-fluid">
            <h4>订单详情</h4>
            <div class="w">
                <div class="span12">
                    <table class="table table-condensed table-bordered table-hover tab">
                        <thead>
                            <tr>
                                <th>项目</th>
                                <th>详情</th>
                            </tr>
                        </thead>
                        <tbody id="tbody">
                        <%
                        		int goodid=(int)request.getAttribute("goodid");
                        		IGoodDao go = new GoodDaoImpl() ;
                        		Good good = new Good();
                        		good = go.findById(goodid);
                        	%>
                        	<tr>
                        		<td>商品编号</td>
                        		<td><%=goodid %></td>
                        	</tr>
                        	
                        	<tr>
                        		<td>商品名称</td>
                        		<td><%=good.getGoodname() %></td>
                        	</tr>
                        	<tr>
                        		<td>商品采购价</td>
                        		<td><%=good.getBuyprice() %></td>
                        	</tr>
                        	<tr>
                        		<td>商品销售价</td>
                        		<td><%=good.getSellprice()%></td>
                        	</tr>
                        	<tr>
                        		<td>商品库存</td>
                        		<td><%=good.getGoodamount() %></td>
                        	</tr>
                        	<tr>
                        		<td>商品单位</td>
                        		<td><%=good.getGoodunit() %></td>
                        	</tr>
                        	<tr>
                        		<td>商品类别</td>
                        		<td><%=good.getGoodclass() %></td>
                        	</tr>
                        	<tr>
                        		<td>商品备注</td>
                        		<td><%=good.getGoodnote() %></td>
                        	</tr>
                        </tbody>
                        
                    </table>
                    <div id="page" class="tr"></div>
                </div>
            </div>
        </div>
    </div>

    <script src="../scripts/jquery-1.9.1.min.js"></script>
    <script src="../bootstrap2.3.2/js/bootstrap.min.js"></script>
    <script src="../layer-v2.3/layer/layer.js"></script>
    <script src="../laypage-v1.3/laypage/laypage.js"></script>
    <script src="../scripts/Index2.js"></script>
</body>
</html>
