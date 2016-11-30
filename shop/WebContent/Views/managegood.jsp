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
<!--     <script>
    function addgood(){  
		var goodname = document.getElementById("goodname") ;
		if(goodname.value==""){
			alert("不能为空！")
			goodname.focus() ;
			return false;
		}
		var goodid = document.getElementById("goodid") ;
		if(goodid.value==""){
			alert("不能为空！")
			goodid.focus() ;
			return false;
		}
		var goodclass = document.getElementById("goodclass") ;
		if(goodclass.value==""){
			alert("不能为空！")
			goodclass.focus() ;
			return false;
		}
		var goodunit = document.getElementById("goodunit") ;
		if(goodunit.value==""){
			alert("不能为空！")
			goodunit.focus() ;
			return false;
		}
		var goodamount = document.getElementById("goodamount") ;
		if(goodamount.value==""){
			alert("不能为空！")
			goodamount.focus() ;
			return false;
		}
		var buyprice = document.getElementById("buyprice") ;
		if(buyprice.value==""){
			alert("不能为空！")
			buyprice.focus() ;
			return false;
		}
		var sellprice = document.getElementById("sellprice") ;
		if(sellprice.value==""){
			alert("不能为空！")
			sellprice.focus() ;
			return false;
		}
		
	}
</script> -->
        
</head>
<body>
    <div class="container-fluid">
        <div class="row-fluid">
            <h4>商品列表</h4>
            <div class="add"><a class="btn btn-success" href="addgood.jsp" target="test">新增</a></div>
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
                                     <td><%=s.getGoodnote() %></td>
                               </tr> 
                               
                          
                                    <%} %>  
                      
                   </tbody>
                    
                    			 </table>
                   <!--   <form name="addgood_form" action="AddGood" method="post" >
                              <div>
                              		 <label>商品名称</label>
                               	     <input type="text" id="goodname" name="goodname"/>
                              </div>
                              <div>
                              		 <label>商品编号</label>
                               	     <input type="text" id="goodid" name="goodid"/>
                              </div>
                              <div>
                             		 <label>商品类别</label>
                               	     <input type="text" id="goodclass" name="goodclass"/>
                               	  </div>
                               	  <div>
                               	  <label>商品单位</label>
                               	     <input type="text" id="goodunit" name="goodunit"/>
                               	    </div>
                               	    <div> 
                               	    <label>商品采购价</label>
                               	     <input type="text" id="buyprice" name="buyprice"/>
                               	     </div>
                               	     <div>
                               	     <label>商品销售价</label>
                               	     <input type="text" id="sellprice" name="sellprice"/>
                               	     </div>
                               	     <div>
                               	     <label>商品备注</label>
                               	     <input type="text" id="goodnote" name="goodnote"/>
                              </div>
                              <div>
                               	     <input class="put" id="put" type="button" onclick="addgood()" >
                            </div>
                            </form> -->
                      
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
