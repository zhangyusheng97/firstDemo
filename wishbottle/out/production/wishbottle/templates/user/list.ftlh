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

        <button class="btn btn-warning text-white my-3" onclick="window.parent.location.href='/wishbottle/user/gender';">
            查看性别统计表
        </button>
        <button class="btn btn-warning text-white my-3" onclick="window.parent.location.href='/wishbottle/user/age';">
            查看年龄统计表
        </button>
        <button class="btn btn-warning text-white my-3" onclick="window.parent.location.href='/wishbottle/user/city';">
            查看地区统计表
        </button>


        <div class="row clearfix">
            <div class="col-md-12 column">
                <table class="table table-bordered table-hover">
                    <thead>
                    <tr class="table-info">
                        <th>id</th>
                        <th>用户名</th>
                        <th>年龄</th>
                        <th>性别</th>
                        <th>城市</th>

                    </tr>
                    </thead>
                    <tbody>

                    <#list userList as user>
                        <tr>
                            <td>${user.id}</td>
                            <td>${user.name}</td>
                            <td>${user.age}</td>
                        <#if user.gender == 0>
                            <td>男</td>
                         <#else >
                             <td>女</td>
                        </#if>
                            <td>${user.city}</td>
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