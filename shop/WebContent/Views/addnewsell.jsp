﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.*,cn.cumt.shop.domain.Order" %>
<%@page import="cn.cumt.shop.dao.impl.OrderDaoImpl,cn.cumt.shop.dao.IOrderDao,cn.cumt.shop.dbc.DBUtil" %>
<%@page import="cn.cumt.shop.dao.impl.SupplierDaoImpl,cn.cumt.shop.dao.ISupplierDao,cn.cumt.shop.domain.Supplier" %>
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
<script >
    function addorder(){  
	
		var orderid = document.getElementById("orderid") ;
		if(orderid.value==""){
			alert("不能为空！")
			orderid.focus() ;
			return false;
		}
		
		var goodid = document.getElementById("goodid") ;
		if(goodid.value==""){
			alert("不能为空！")
			goodid.focus() ;
			return false;
		}
		var acount = document.getElementById("acount") ;
		if(acount.value==""){
			alert("不能为空！")
			acount.focus() ;
			return false;
		}
		
		addorder_form.submit() ;
	}
</script>
    <div class="container-fluid">
        <div class="row-fluid">
            <h4>添加销售订单</h4>
            <div class="w">
                <div class="span12">
                <form name="addorder_form" action="AddNewSellOrder" method="post">
                 <%
               		int oid = (int)session.getAttribute("oid");
                	IOrderDao dao = new OrderDaoImpl();
               	 	Order order = new Order();
                    order=dao.findorder1(oid);
                
                %>
                <div>
                    <label>总订单编号</label>
                    <input type="text" id="order" name="order" value=<%=oid %>>
                </div>
                <div>
                    <label>订单编号</label>
                    <input type="text" id="orderid" name="orderid"/>
                </div>
                <div>
                    <label>客户编号</label>
                    <input type="text" id="customerid" name="customerid" value=<%=order.getCustomerid() %>>
                </div>
                <div>
                     <label>商品编号</label>
                     <input type="text" id="goodid" name="goodid"/>
                </div>
                <div>
                     <label>销售数量</label>
                     <input type="text" id="acount" name="acount"/>
                </div>
                <div>
                     <label>销售时间</label>
                     <input type="text" id="time" name="time" value=<%=order.getTime() %>>
                </div>
                <div> 
                     <label>销售备注</label>
                     <input type="text" id="note" name="note"/>
                 </div>
                 <div>
                      <input type="button" value="提交" onclick="addorder()" >
                 </div>
                 </form>
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
