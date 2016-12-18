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
            <h4>查询客户</h4>
            <div class="w">
                <div class="span12">
                <form action="FindCustomer" method="post">
                <div>
                    <label>请输入客户编号</label>
                     <input type="text" id="customerid" name="customerid"/>
                 </div>   
                 <div>
                 	 <input type="submit"  value="查询"/>
                 </div>
                 </form>
                 <br/>
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
