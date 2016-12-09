var RoleJS = function(){
    var submitForm = function(){
        $("#search-form").ajaxSubmit({
            type: 'post', // 提交方式 get/post
            url: "/page",
            success: function(data) { // data 保存提交后返回的数据，一般为 json 数据
                // 此处可对 data 作相关处理
                $("#js-page-body").html(data);
            }
        });
    };

    var pageAjax = function(totalPage, pageNum){
        $('#js-bootpag').bootpag({
            total: totalPage,
            page: pageNum,
            maxVisible: 5,
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
        }).on("page", function(event, num){
            $("#js-bootpag-num").val(num);
            submitForm();
            $("#js-bootpag-num").val("1");
        });
    };

    var init = function(){
        $("#js-query-btn").click(function(){
            submitForm();
        });
    };
    return {
        init: function () {
            init();
        },
        initPage:function(totalPage, pageNum){
            pageAjax(totalPage, pageNum);
        }
    }
}();
