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

        <div class="row clearfix">
            <div class="col-md-12 column">
                <table class="table table-bordered table-hover">
                    <thead>
                    <tr class="table-info">
                        <th>id</th>
                        <th>作者</th>
                        <th>心愿瓶内容</th>
                        <th>心愿瓶状态</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>

                    <#list wishList as list>
                        <tr>
                            <td>${list.id}</td>
                            <td>${list.writerId}</td>
                            <td>${list.content}</td>
                            <#if list.status == 0>
                                <td>未被捞取</td>
                                <#else>
                                <td>已被捞取</td>
                            </#if>
                            <td><a href="/wishbottle/wishbottle/delete?id=${list.id}">删除</a></td>
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