$(document).bind("mobileinit", function() {
    $.extend($.mobile, {
        gradeA: function() {
            //创建一个临时的div元素
            var divTmp = document.createElement("div");
            //设置元素的内容
            divTmp.innerHTML = '<div style="-webkit-transform:rotate(360deg);-moz-transform:rotate(360deg);"></div>';
            //定义一个初始值
            var btnSupport = false;
            btnSupport = (divTmp.firstChild.style.webkitTransform != undefined) || (divTmp.firstChild.style.MozTransform != undefined);
            return btnSupport;
        }
    });
});