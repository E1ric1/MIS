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
    function addgood(){  
		var goodid = document.getElementById("goodid") ;
		if(goodid.value==""){
			alert("不能为空！")
			goodid.focus() ;
			return false;
		}
		var goodname = document.getElementById("goodname") ;
		if(goodname.value==""){
			alert("不能为空！")
			goodname.focus() ;
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
		addgood_form.submit() ;
	}
</script>
    <div class="container-fluid">
        <div class="row-fluid">
            <h4>添加商品</h4>
            <div class="w">
                <div class="span12">
                <form name="addgood_form" action="AddGood" method="post">
                <div>
                    <label >商品编号</label>
                    <input type="text" id="goodid" name="goodid"/>
                </div>
                <div>
                    <label >商品名称</label>
                    <input type="text" id="goodname" name="goodname"/>
                </div>
                <div>
                     <label >商品类别</label>
                     <input type="text" id="goodclass" name="goodclass"/>
                </div>
                <div>
                     <label>库存数量</label>
                     <input type="text" id="goodamount" name="goodamount"/>
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
                      <input type="button" value="提交" onclick="addgood()" >
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
