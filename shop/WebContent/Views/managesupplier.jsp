<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.*,cn.cumt.shop.domain.Supplier" %>
<%@page import="cn.cumt.shop.dao.impl.SupplierDaoImpl,cn.cumt.shop.dao.ISupplierDao,cn.cumt.shop.dbc.DBUtil" %>
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
            <h4>供应商列表</h4>
            <div class="add"><a class="btn btn-success" href="addsupplier.jsp">新增</a></div>
            <div class="w">
                <div class="span12">
                    <table class="table table-condensed table-bordered table-hover tab">
                        <thead>
                            <tr>
                                <th>编号</th>
                                <th>名称</th>
                                <th>负责人</th>
                                <th>电话</th>
                                <th>地址</th>
                                <th>备注</th>
                            </tr>
                        </thead>
                        <tbody id="tbody">
                             <tr>
                                     <%
  	                                    ISupplierDao supplier = new SupplierDaoImpl();
	                                    List<Supplier> list=supplier.findSupplier();
	                                    for(Supplier s: list){ 
                                      %> 
                                     <td><%=s.getSupplierid() %></td>
                                     <td><%=s.getSuppliername() %></td>
                                     <td><%=s.getSupplierhead() %></td>
                                     <td><%=s.getSuppliertel() %></td>
                                     <td><%=s.getSupplieraddress() %></td>
                                     <td><%=s.getSuppliernote() %></td>
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
