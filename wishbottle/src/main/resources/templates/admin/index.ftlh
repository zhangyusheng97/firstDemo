<html>
<#include "../zujian/top.ftlh">

<body>
<div id="wrapper" class="toggled">
    <#--内容区域头部样式-->
    <h2 class="bg-info text-white p-3  text-center">后台管理员添加</h2>
    <#--左边栏-->
    <#include "../zujian/left.ftlh">
    <#--主要内容content-->
    <div id="page-content-wrapper" class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <form role="form" method="post" action="/wishbottle/admin/save">
                    <div class="form-group">
                        <label>账号</label>
                        <input name="account" type="text" class="form-control"></input>

                    </div>
                    <div class="form-group">
                        <label>密码</label>
                        <input name="psd" type="text" class="form-control"></input>

                    </div>

                    <input hidden type="text" name="id"></input>
                    <button type="submit" class="btn  btn-info">提交</button>
                </form>
            </div>
        </div>
    </div>

</div>
</body>
</html>