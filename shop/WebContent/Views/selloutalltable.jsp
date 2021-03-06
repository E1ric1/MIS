﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.*,cn.cumt.shop.domain.Order" %>
<%@page import="cn.cumt.shop.dao.impl.OrderDaoImpl,cn.cumt.shop.dao.IOrderDao,cn.cumt.shop.dbc.DBUtil" %>
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
            <h4>销售退货统计</h4>
            <div class="add"><a class="btn btn-success" href="findsell.jsp" target="test">查询</a></div>
            <div class="w">
                <div class="span12">
                    <table class="table table-condensed table-bordered table-hover tab">
                        <thead>
                            <tr>
                            	<th>订单编号</th>
                                <th>客户编号</th>
                                <th>销售时间</th>
                                <th>商品编号</th>
                                <th>销售数量</th>
                                <th>销售备注</th>
                                <th>详情</th>
                            </tr>
                        </thead>
                        <tbody id="tbody">
                         <tr>
                                     <%
                                        int orderclassid = 4 ;
  	                                    IOrderDao order = new OrderDaoImpl();
	                                    List<Order> list=order.findOrder(orderclassid);
	                                    for(Order s: list){ 
                                      %> 
                                     <td><%=s.getOrderid() %></td>
                                     <td><%=s.getSupplierid() %></td>
                                     <td><%=s.getTime() %></td>
                                     <td><%=s.getGoodid() %></td>
                                     <td><%=s.getAcount() %></td>
                                     <td><%=s.getNote() %></td>
                                     <td><a href="SellDetail?orderid=<%=s.getOrderid()%>">详情</a></td>
                                  
                               </tr> 
                               
                          
                                    <%} %>  
                      
                        
                        
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
