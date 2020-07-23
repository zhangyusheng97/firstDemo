<html>
<#include "../zujian/top.ftlh">

<body>
<div id="wrapper" class="toggled">
    <#--内容区域头部样式-->
    <h2 class="bg-info text-white p-3  text-center">年龄统计表详情</h2>
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


        <div id="main" style="width: 600px;height:400px;position: absolute;left:500px;top: 200px" ></div>

    </div>
</div>
</body>
<script type="text/javascript">
    var myChart = echarts.init(document.getElementById('main'));

    $(function(){
        $.ajax({
            url : "getGender",
            dataType : "json",
            cache : false,
            success : function(json) {
                var one = 0; var two  = 0; var three = 0 ; var four = 0; var five = 0;
                for (var i = 0;i<json.length;i++){
                    if (json[i].age < 10)
                        one++;
                    else if (json[i].age>=10 &&json[i].age<20)
                        two++;
                    else if (json[i].age>=20 &&json[i].age<30)
                        three++;
                    else if (json[i].age>=30 &&json[i].age<40)
                        four++;
                    else
                        five++;
                }
                var option =  {
                    title: {
                        text: '用户年龄情况统计',
                        left: 'center'
                    },
                    tooltip: {},
                    xAxis: {
                        type: 'category',
                        data: ['0~10岁', '10~20岁', '20~30岁', '30~40岁', '40岁以上']
                    },
                    yAxis: {
                        type: 'value'
                    },
                    series: [{
                        data: [one, two, three, four, five],
                        type: 'bar'
                    }]
                };
                myChart.setOption(option);
            },
            errr:function(){
                layer.alert("error");
            }
        })
    })

</script>
</html>