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
            <h4>查询订单</h4>
            <div class="w">
                <div class="span12">
                <a class="btn btn-success" href="allorder.jsp">查询所有采购订单</a>
                <form action="FindOrder" method="post">
                <div>
                    <label>请输入采购订单编号</label>
                     <input type="text" id="orderid" name="orderid"/>
                 </div>   
                 <div>
                 	 <input type="submit"  value="提交"/>
                 </div>
                 </form>
                    <div id="page" class="tr"></div>
                </div>
                
                
                
                 <div class="span12">
                <a class="btn btn-success" href="allorder.jsp">查询所有采购退货订单</a>
                <form action="FindoutOrder" method="post">
                <div>             	
                    <label>请输入采购退货订单编号</label>
                     <input type="text" id="orderid" name="orderid"/>
                 </div>   
                 <div>
                 	 <input type="submit"  value="提交"/>
                 </div>
                 </form>
                    <div id="page" class="tr"></div>
                </div>
                
                               
                 <div class="span12">
                <a class="btn btn-success" href="allorder.jsp">查询所有销售订单</a>
                <form action="FindSellOrder" method="post">
                <div>               	
                    <label>请输入销售订单编号</label>
                     <input type="text" id="orderid" name="orderid"/>
                 </div>   
                 <div>
                 	 <input type="submit"  value="提交"/>
                 </div>
                 </form>
                    <div id="page" class="tr"></div>
                </div>
                
                
                                
                 <div class="span12">
                <a class="btn btn-success" href="allorder.jsp">查询所有销售退货订单</a>
                <form action="FindSellOutOrder" method="post">
                <div>
                    <label>请输入销售退货订单编号</label>
                     <input type="text" id="orderid" name="orderid"/>
                 </div>   
                 <div>
                 	 <input type="submit"  value="提交"/>
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
