var CbgJS = function () {
    var submitForm = function () {
        $("#search-form").ajaxSubmit({
            type: 'post', // 提交方式 get/post
            url: "/api/getCbgPage",
            dataType: "json",
            beforeSubmit: function (a, f, o) {
                //给表单中某个隐藏值赋值
                var loadHtml =
                    '<div class="sk-spinner sk-spinner-wave" style="margin-top: 100px;margin-bottom: 100px;height: 50px;">'
                    + '<div class="sk-rect1"></div>'
                    + '<div class="sk-rect2 m-l-xs"></div>'
                    + '<div class="sk-rect3 m-l-xs"></div>'
                    + '<div class="sk-rect4 m-l-xs"></div>'
                    + '<div class="sk-rect5 m-l-xs"></div>'
                    + '</div>';
                $("#search-content").html(loadHtml);
            },
            success: function (data) { // data 保存提交后返回的数据，一般为 json 数据
                if (data.returncode != 0) {
                    alert("维护中,请稍后重试")
                    return;
                }
                var role_list = data.result.list
                var total = data.result.total;
                var pages = data.result.pages;
                var pageNum = data.result.pageNum;

                $("#span-total").html(total);
                $("#span-cur-page").html(pageNum);
                $("#span-total-page").html(pages);
                $("#span-page-size").html(data.result.pageSize);

                var table_html = '<table class="table table-hover table-striped margin-bottom-5">' +
                    '              <thead>' +
                    '                <tr>' +
                    '                    <th style="text-align: center;width: 5%;">角色</th>' +
                    '                    <th style="text-align: center;width: 12%;">名字</th>' +
                    '                    <th style="text-align: center;width: 12%;">等级</th>' +
                    '                    <th style="text-align: center;width: 7%;">价格</th>' +
                    '                    <th class="hidden-sm hidden-xs" style="text-align: center;width: 8%;">装评/修为</th>' +
                    '                    <th class="hidden-sm hidden-xs" style="text-align: center;width: 8%;">加护/炼护</th>' +
                    '                    <th class="hidden-sm hidden-xs" style="text-align: center;width: 8%;">追电/疾语</th>' +
                    '                    <th style="text-align: center;width: 25%;">亮点</th>' +
                    '                    <th style="text-align: center;width: 14%;">购买</th>' +
                    '                </tr>' +
                    '             </thead>' +
                    '             <tbody>';
                if (role_list == null || role_list == '' || role_list == undefined || role_list.length == 0) {
                    table_html += '<tr><td colspan="10" style="text-align: center">搜索无结果</td></tr>';
                } else {
                    $.each(role_list, function (index, value) {
                        var img_url = value.sch + "" + value.sex;
                        var level_desc = "";
                        if(value.flySoulPhase == 2 ){
                            level_desc ='<span class="label label-inverse pull-right">天魂</span>';
                        }
                        table_html += '<tr>' +
                            '                    <td style="text-align: center;">' +
                            '                        <img src="/images/' + img_url + '.jpg">' +
                            '                    </td>' +
                            '                    <td style="text-align: center;">' + value.name + '</td>' +
                            '                    <td style="text-align: center;">' + value.lvText + level_desc +'</td>' +
                            '                    <td style="text-align: center;">¥ <font color="red">' + value.price + '</font></td>' +
                            '                    <td class="hidden-sm hidden-xs" style="text-align: center;">' + value.equXiuwei + '<br>' + value.xiuwei + '</td>' +
                            '                    <td class="hidden-sm hidden-xs" style="text-align: center;">' + value.jiahu + '/' + value.lianhu + '</td>' +
                            '                    <td class="hidden-sm hidden-xs" style="text-align: center;">' + value.movespeed + '/' + value.castspeed + '</td>' +
                            '                    <td style="text-align: center;">' + value.shizhuang + value.teji + value.yuanhun + value.other + '</td>' +
                            '                    <td style="text-align: center;">' +
                            '                        <a class="btn btn-primary" onclick="CbgJS.buy(\' ' + value.id + '\',\' ' + value.url + '\')">购买</a>\n' +
                            '                        <a class="btn btn-info"' +
                            '                           onclick="CbgJS.detail(\'' + value.id + ' \',\' ' + value.name + '\',\' +' + value.lv + '\',\'' + value.sch + '\')">英雄榜</a>'
                        '                    </td>' +
                        '                </tr>';
                    });
                }
                table_html += '  </tbody>';
                $("#js-page-body").html(table_html);
                CbgJS.initPage(pages,pageNum);
            }
        });
    }

    var pageAjax = function (totalPage, pageNum) {
        $('#js-bootpag').bootpag({
            total: totalPage,
            page: pageNum,
            maxVisible: 7,
            leaps: false,
            firstLastUse: true,
            first: '首页',
            last: '尾页',
            wrapClass: 'pagination',
            activeClass: 'active',
            disabledClass: 'disabled',
            nextClass: 'next',
            prevClass: 'prev',
            lastClass: 'last',
            firstClass: 'first'
        }).on("page", function (event, num) {
            $("#js-bootpag-num").val(num);
            submitForm();
            $("#js-bootpag-num").val("1");
        });
    };

    var init = function () {
        $("#js-query-btn").click(function () {
            submitForm();
        });

        $("#js-reset-btn").click(function () {
            $('#search-form')[0].reset()
        });
        get_last_date();
        submitForm();
    };
    var buy = function (id, url) {
        update(id);
        window.open(url);
    };
    var soldOut = function (id) {
        if (window.confirm("确定要删除吗？")) {
            $.ajax({
                type: 'post',
                url: '/api/delete',
                data: {'id': id},
                dataType: 'json',
                success: function (data) {
                    if (data.returncode == 0) {
                        submitForm();
                    } else {
                        alert(data.message);
                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    alert(errorThrown)
                    return false;
                }
            });
        }


    };
    
    var get_last_date = function () {
        $.ajax({
            type: 'post',
            url: '/api/getLastDate',
            dataType: 'json',
            success: function (data) {
                $("#last-date").html(data.result);
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                alert(errorThrown)
                return false;
            }
        });
    }
    var update = function (id) {
        $.ajax({
            type: 'post',
            url: '/api/update',
            data: {'id': id},
            dataType: 'json',
            success: function (data) {
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                alert(errorThrown)
                return false;
            }
        });
    }

    var detail = function (id, name, level, school) {
        update(id);
        var url = "http://bang.tx3.163.com/bang/search#name=" + name + "&school=" + school + "&level=" + level
        window.open(url);
    };
    return {
        init: function () {
            init();
        },
        buy: function (id, url) {
            buy(id, url);
        },
        initPage: function (totalPage, pageNum) {
            pageAjax(totalPage, pageNum);
        },
        soldOut: function (id) {
            soldOut(id);
        },
        detail: function (id, name, level, school) {
            detail(id, name, level, school);
        }
    }
}
();
