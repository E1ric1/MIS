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
<script>
    function addcustomer(){  
		var customerid = document.getElementById("customerid") ;
		if(customerid.value==""){
			alert("不能为空！")
			customerid.focus() ;
			return false;
		}
		var customername = document.getElementById("customername") ;
		if(customername.value==""){
			alert("不能为空！")
			customername.focus() ;
			return false;
		}
		var customertel = document.getElementById("customertel") ;
		if(customertel.value==""){
			alert("不能为空！")
			customertel.focus() ;
			return false;
		}
		var customeraddress = document.getElementById("customeraddress") ;
		if(customeraddress.value==""){
			alert("不能为空！")
			customeraddress.focus() ;
			return false;
		}
		
		form_addcustomer.submit();
	}
</script>
    <div class="container-fluid">
        <div class="row-fluid">
            <h4>添加客户</h4>
            <div class="w">
                <div class="span12">
                    <form name="form_addcustomer" action="AddCustomer" method="post">
                <div>
                    <label>客户编号</label>
                    <input type="text" id="customerid" name="customerid"/>
                </div>
                <div>
                     <label>客户姓名</label>
                     <input type="text" id="customername" name="customername"/>
                </div>
                <div>
                     <label>客户电话</label>
                     <input type="text" id="customertel" name="customertel"/>
                </div>
                <div> 
                     <label>客户地址</label>
                     <input type="text" id="customeraddress" name="customeraddress"/>
                 </div>
                 <div>
                      <label>客户备注</label>
                      <input type="text" id="customernote" name="customernote"/>
                 </div>
                 <div>
                      <input type="button" value="提交" onclick="addcustomer()" >
                 </div>
                 </form>
                    
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
