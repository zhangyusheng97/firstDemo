<html>
<#include "../zujian/top.ftlh">

<body>
<div id="wrapper" class="toggled">
    <#--内容区域头部样式-->
    <h2 class="bg-info text-white p-3  text-center">心愿瓶小程序后台管理</h2>
    <#--左边栏-->
    <#include "../zujian/left.ftlh">
    <#--主要内容content-->
    <div id="page-content-wrapper" class="container">
        <#--添加管理员-->
        <button class="btn btn-warning text-white my-3" onclick="window.parent.location.href='/wishbottle/admin/index';">
            添加管理员
        </button>
        <div class="row clearfix">
            <div class="col-md-12 column">
                <table class="table table-bordered table-hover">
                    <thead>
                    <tr class="table-info">
                        <th>id</th>
                        <th>账号</th>
                        <th>密码</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>

                    <#list managerList as manager>
                        <tr>
                            <td>${manager.id}</td>
                            <td>${manager.account}</td>
                            <td>${manager.psd}</td>
                            <td><a href="/wishbottle/admin/change?id=${manager.id}">修改</a>
                                <a href="/wishbottle/admin/delete?id=${manager.id}">删除</a></td>
                        </tr>
                    </#list>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

</div>
</body>
</html>