$(document).bind("mobileinit", function() {
    //$.mobile.loadingMessage = '努力加载中...';
    //$.mobile.pageLoadErrorMessage = '找不到对应页面！';
    $.extend($.mobile, {
        loadingMessage: '努力加载中...',
        pageLoadErrorMessage: '找不到对应页面！'
    });
});