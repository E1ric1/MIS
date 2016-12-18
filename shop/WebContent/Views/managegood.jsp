<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.*,cn.cumt.shop.domain.Good" %>
<%@page import="cn.cumt.shop.dao.impl.GoodDaoImpl,cn.cumt.shop.dao.IGoodDao,cn.cumt.shop.dbc.DBUtil" %>
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
            <h4>商品列表</h4>
            <div class="add"><a class="btn btn-success" href="addgood.jsp" target="test">新增</a></div>
            <div class="add"><a class="btn btn-success" href="findgood.jsp">查询</a></div>
            <div class="w">
                <div class="span12">
               
                    <table class="table table-condensed table-bordered table-hover tab">
                        <thead>
                        
                            <tr>
                                <th>名称</th>
                                <th>编号</th>
                                <th>分类</th>
                                <th>单位</th>
                                <th>采购价</th>
                                <th>销售价</th>
                                <th>库存</th>
                                <th>备注</th>
                            </tr>
                        </thead>
                        <tbody id="tbody">
                             <tr>
                                     <%
  	                                    IGoodDao good = new GoodDaoImpl();
	                                    List<Good> list=good.findGood();
	                                    for(Good s: list){ 
                                      %> 
                                     <td><%=s.getGoodname() %></td>
                                     <td><%=s.getGoodid() %></td>
                                     <td><%=s.getGoodclass() %></td>
                                     <td><%=s.getGoodunit() %></td>
                                     <td><%=s.getBuyprice() %></td>
                                     <td><%=s.getSellprice() %></td>
                                     <td><%=s.getGoodamount() %></td>
                                     <td><%=s.getGoodnote() %></td>
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
    <script src="../scripts/addgood.js"></script>
   
</body>
</html>
