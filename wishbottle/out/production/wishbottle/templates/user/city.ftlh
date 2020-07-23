<html>
<#include "../zujian/top.ftlh">

<body>
<div id="wrapper" class="toggled">
    <#--内容区域头部样式-->
    <h2 class="bg-info text-white p-3  text-center">地区统计表详情</h2>
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

                var option = {
                    title : {
                        text: '用户城市统计',
                        left: 'center'
                    },
                    tooltip : {
                        trigger: 'item'
                    },
                    legend: {
                        orient: 'vertical',
                        left: 'left',
                    },
                    visualMap: {
                        min: 0,
                        max: 3,
                        left: 'left',
                        top: 'bottom',
                        text:['高','低'],           // 文本，默认为数值文本
                        calculable : true
                    },
                    toolbox: {
                        show: true,
                        orient : 'vertical',
                        left: 'right',
                        top: 'center',
                        feature : {
                            mark : {show: true},
                            dataView : {show: true, readOnly: false},
                            restore : {show: true},
                            saveAsImage : {show: true}
                        }
                    },
                    series : [
                        {
                            name: '人数',
                            type: 'map',
                            mapType: 'china',
                            roam: false,
                            label: {
                                normal: {
                                    show: false
                                },
                                emphasis: {
                                    show: true
                                }
                            },
                            data:[
                                {name: '北京',value: 1},
                                {name: '天津',value: 0},
                                {name: '上海',value: 0},
                                {name: '重庆',value: 0},
                                {name: '河北',value: 0},
                                {name: '河南',value: 0},
                                {name: '云南',value: 0},
                                {name: '辽宁',value: 0},
                                {name: '黑龙江',value: 0},
                                {name: '湖南',value: 0},
                                {name: '安徽',value: 0},
                                {name: '山东',value: 0},
                                {name: '新疆',value: 0},
                                {name: '江苏',value: 0},
                                {name: '浙江',value: 0},
                                {name: '江西',value: 0},
                                {name: '湖北',value: 1},
                                {name: '广西',value: 0},
                                {name: '甘肃',value: 0},
                                {name: '山西',value: 0},
                                {name: '内蒙古',value: 0},
                                {name: '陕西',value: 0},
                                {name: '吉林',value: 0},
                                {name: '福建',value: 0},
                                {name: '贵州',value: 0},
                                {name: '广东',value: 2},
                                {name: '青海',value: 0},
                                {name: '西藏',value: 0},
                                {name: '四川',value: 0},
                                {name: '宁夏',value: 0},
                                {name: '海南',value: 0},
                                {name: '台湾',value: 0},
                                {name: '香港',value: 0},
                                {name: '澳门',value: 0}
                            ]
                        }
                    ]
                };
                myChart.setOption(option);





</script>
</html>