$(function(){
    init_zhiye();
    init_xiuwei();
    init_zhuangbei();
    init_zongxiuwei();
    init_server_fenbu();
    init_shili_fenbu();
});


function init_zhiye() {
    // 基于准备好的dom，初始化echarts实例
    var map_zhiye = echarts.init(document.getElementById('map_zhiye'));
    var school_count = new Array();
    $.ajax({
        type:'get',
        url:'/report/school',
        dataType:'json',
        success:function (data) {
            if(data.returncode==0){
                for (var index in data.result){
                    school_count.push(data.result[index].count)
                }
            }else{
                alert(data.message);
            }
        },
        error:function (XMLHttpRequest, textStatus, errorThrown) {
            alert(errorThrown)
            return false;
        }
    });
    console.log(school_count)
    // 指定图表的配置项和数据
    var map_zhiye_option  = {
        title : {
            text: '门派分布',
            subtext: '更新时间12月22日14:30',
            x:'center'
        },
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: ['荒火教','天机营','翎羽山庄','魍魉','太虚观','云麓仙居','冰心堂','弈剑听雨阁','鬼墨','龙巫宫']
        },
        series : [
            {
                name: '职业分布',
                type: 'pie',
                radius : '55%',
                center: ['50%', '60%'],
                data:[
                    {value:school_count[0], name:'荒火教'},
                    {value:school_count[1], name:'天机营'},
                    {value:school_count[2], name:'翎羽山庄'},
                    {value:school_count[3], name:'魍魉'},
                    {value:school_count[4], name:'太虚观'},
                    {value:school_count[5], name:'云麓仙居'},
                    {value:school_count[6], name:'冰心堂'},
                    {value:school_count[7], name:'弈剑听雨阁'},
                    {value:school_count[8], name:'鬼墨'},
                    {value:school_count[9], name:'龙巫宫'}
                ],
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };
    // 使用刚指定的配置项和数据显示图表。
    map_zhiye.setOption(map_zhiye_option);
}


function init_xiuwei() {
    // 基于准备好的dom，初始化echarts实例
    var map_xiuwei_fenbu = echarts.init(document.getElementById('map_xiuwei_fenbu'));
    // 指定图表的配置项和数据
    var map_xiuwei_fenbu_option = {
        title : {
            text: '79战场人物修为分布',
            subtext: '纯属虚构',
            x:'center'
        },
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: ['-3.0','3.0-3.5','3.5-4','4.5-5','5.5-6','6+']
        },
        series : [
            {
                name: '人物修为分布',
                type: 'pie',
                radius : '55%',
                center: ['50%', '60%'],
                data:[
                    {value:335, name:'-3.0'},
                    {value:335, name:'3.0-3.5'},
                    {value:310, name:'3.5-4'},
                    {value:234, name:'4.5-5'},
                    {value:135, name:'5.5-6'},
                    {value:1548, name:'6+'}
                ],
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };
    // 使用刚指定的配置项和数据显示图表。
    map_xiuwei_fenbu.setOption(map_xiuwei_fenbu_option);
}


function init_zhuangbei() {
    // 基于准备好的dom，初始化echarts实例
    var map_zhuangbei_fenbu = echarts.init(document.getElementById('map_zhuangbei_fenbu'));
    // 指定图表的配置项和数据
    var map_zhuangbei_fenbu_option = {
        title : {
            text: '装备评价分布',
            subtext: '纯属虚构',
            x:'center'
        },
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: ['-6','6-6.5','6.5-7','7.5-8','8-8.5','8.5-9','9-9.5','9.5+']
        },
        series : [
            {
                name: '装备评价分布',
                type: 'pie',
                radius : '55%',
                center: ['50%', '60%'],
                data:[
                    {value:335, name:'-6'},
                    {value:335, name:'6-6.5'},
                    {value:310, name:'6.5-7'},
                    {value:234, name:'7.5-8'},
                    {value:135, name:'8-8.5'},
                    {value:45, name:'8.5-9'},
                    {value:21, name:'9-9.5'},
                    {value:6, name:'9.5+'}
                ],
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };
    // 使用刚指定的配置项和数据显示图表。
    map_zhuangbei_fenbu.setOption(map_zhuangbei_fenbu_option);
}


function init_zongxiuwei() {
    // 基于准备好的dom，初始化echarts实例
    var map_zongxiuwei_fenbu = echarts.init(document.getElementById('map_zongxiuwei_fenbu'));
    // 指定图表的配置项和数据
    var map_zongxiuwei_fenbu_option= {
        title : {
            text: '总修为分布',
            subtext: '纯属虚构',
            x:'center'
        },
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: ['-6','6-7','7-8','8-9','9-10','10-11','11-12','12-13','13-14','14-15','15-16','16-17','17-18']
        },
        series : [
            {
                name: '总修为分布',
                type: 'pie',
                radius : '55%',
                center: ['50%', '60%'],
                data:[
                    {value:335, name:'-16'},
                    {value:310, name:'6-7'},
                    {value:234, name:'7-8'},
                    {value:135, name:'8-9'},
                    {value:1548, name:'9-10'},
                    {value:335, name:'10-11'},
                    {value:310, name:'11-12'},
                    {value:234, name:'12-13'},
                    {value:135, name:'13-14'},
                    {value:1548, name:'14-15'},
                    {value:335, name:'15-16'},
                    {value:310, name:'16-17'},
                    {value:234, name:'17-18'},
                    {value:135, name:'18+'}
                ],
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };
    // 使用刚指定的配置项和数据显示图表。
    map_zongxiuwei_fenbu.setOption(map_zongxiuwei_fenbu_option);
}


function init_server_fenbu() {
    // 基于准备好的dom，初始化echarts实例
    var server_fenbu = echarts.init(document.getElementById('server_fenbu'));
    // 指定图表的配置项和数据
    var server_fenbu_option = {
        title: {
            text: '服务器分布'
        },
        tooltip: {},
        legend: {
            data:['销量']
        },
        xAxis: {
            data: ["天下无双","烟雨江南","碧海青天","飞龙在天","琉璃月","魔影幽篁"]
        },
        yAxis: {},
        series: [{
            name: '销量',
            type: 'bar',
            data: [5, 20, 36, 10, 10, 20]
        }]
    };
    // 使用刚指定的配置项和数据显示图表。
    server_fenbu.setOption(server_fenbu_option);
}


function init_shili_fenbu() {
    // 基于准备好的dom，初始化echarts实例
    var shili_fenbu = echarts.init(document.getElementById('shili_fenbu'));
    // 指定图表的配置项和数据
    var shili_fenbu_option = {
        title: {
            text: '势力分布'
        },
        tooltip: {},
        legend: {
            data:['销量']
        },
        xAxis: {
            data: ["秋风落秋叶飘","鬼鬼小童","星空","浪起来","涅槃"]
        },
        yAxis: {},
        series: [{
            name: '销量',
            type: 'bar',
            data: [5, 20, 36, 10, 10]
        }]
    };
    // 使用刚指定的配置项和数据显示图表。
    shili_fenbu.setOption(shili_fenbu_option);
}

