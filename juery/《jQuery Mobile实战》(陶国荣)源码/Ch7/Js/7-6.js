$(function() {
    $('div').live('pagebeforehide', function(event, ui) {
        console.log('1. ' + ui.nextPage[0].id + ' 正在显示中... ');
    });
    $('div').live('pagebeforeshow', function(event, ui) {
        console.log('2. ' + ui.prevPage[0].id + ' 正在隐藏中... ');
    });
    $('div').live('pagehide', function(event, ui) {
        console.log('3. ' + ui.nextPage[0].id + ' 显示完成！ ');
    });
    $('div').live('pageshow', function(event, ui) {
        console.log('4. ' + ui.prevPage[0].id + ' 隐藏完成！ ');
    })
})