<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
                        		int customerid=(int)request.getAttribute("customerid");                      	
                        		ICustomerDao su = new CustomerDaoImpl() ;
                        		Customer customer = new Customer();
                        		customer = su.findById(customerid);
                        	%>
                        	<tr>
                        		<td>客户编号</td>
                        		<td><%=customerid %></td>
                        	</tr>
                        	<tr>
                        		<td>客户名称</td>
                        		<td><%=customer.getCustomername() %></td>
                        	</tr>
                        	<tr>
                        		<td>客户联系电话</td>
                        		<td><%=customer.getCustomertel() %></td>
                        	</tr>
                        	<tr>
                        		<td>客户地址</td>
                        		<td><%=customer.getCustomeraddress() %></td>
                        	</tr>
                        	<tr>
                        		<td>客户备注</td>
                        		<td><%=customer.getCustomernote() %></td>
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
