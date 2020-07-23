<html>
<#include "../zujian/top.ftlh">

<body>
<div id="wrapper" class="toggled">
    <#--内容区域头部样式-->
    <h2 class="bg-info text-white p-3  text-center">性别统计表详情</h2>
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
                var male=0;var female = 0;
                for (var i = 0;i<json.length;i++){
                    if(json[i].gender == 0)
                        male ++;
                    else
                        female++;
                }
                var option = {
                    title: {
                        text: '用户性别统计',
                        left: 'center'
                    },
                    tooltip: {
                        trigger: 'item',
                        formatter: '{a} <br/>{b} : {c} ({d}%)'
                    },
                    legend: {
                        orient: 'vertical',
                        left: 'left',
                        data: ['男', '女']
                    },
                    series: [
                        {
                            name: '用户性别统计',
                            type: 'pie',
                            radius: '55%',
                            center: ['50%', '60%'],
                            data: [
                                {value: male, name: '男'},
                                {value: female, name: '女'}
                            ],
                            emphasis: {
                                itemStyle: {
                                    shadowBlur: 10,
                                    shadowOffsetX: 0,
                                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                                }
                            }
                        }
                    ]
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