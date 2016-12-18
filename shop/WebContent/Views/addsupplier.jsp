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
    function addsupplier(){  
		var supplierid = document.getElementById("supplierid") ;
		if(supplierid.value==""){
			alert("不能为空！")
			supplierid.focus() ;
			return false;
		}
		var suppliername = document.getElementById("suppliername") ;
		if(suppliername.value==""){
			alert("不能为空！")
			suppliername.focus() ;
			return false;
		}
		var supplierhead = document.getElementById("supplierhead") ;
		if(supplierhead.value==""){
			alert("不能为空！")
			supplierhead.focus() ;
			return false;
		}
		var suppliertel = document.getElementById("suppliertel") ;
		if(suppliertel.value==""){
			alert("不能为空！")
			suppliertel.focus() ;
			return false;
		}
		var supplieraddress = document.getElementById("supplieraddress") ;
		if(supplieraddress.value==""){
			alert("不能为空！")
			supplieraddress.focus() ;
			return false;
		}
		
		form_addsupplier.submit();
	}
</script>
    <div class="container-fluid">
        <div class="row-fluid">
            <h4>添加供应商</h4>
            <div class="w">
                <div class="span12">
                    <form name="form_addsupplier" action="AddSupplier" method="post">
                <div>
                    <label>供应商编号</label>
                    <input type="text" id="supplierid" name="supplierid"/>
                </div>
                <div>
                     <label>供应商名称</label>
                     <input type="text" id="suppliername" name="suppliername"/>
                </div>
                <div>
                     <label>供应商负责人</label>
                     <input type="text" id="supplierhead" name="supplierhead"/>
                </div>
                <div>
                     <label>供应商电话</label>
                     <input type="text" id="suppliertel" name="suppliertel"/>
                </div>
                <div> 
                     <label>供应商地址</label>
                     <input type="text" id="supplieraddress" name="supplieraddress"/>
                 </div>
                 <div>
                      <label>供应商备注</label>
                      <input type="text" id="suppliernote" name="suppliernote"/>
                 </div>
                 <div>
                      <input type="button" value="提交" onclick="addsupplier()" >
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
