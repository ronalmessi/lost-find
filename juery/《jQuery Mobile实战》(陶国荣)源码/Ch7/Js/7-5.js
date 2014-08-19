$('div[data-role="page"]').live('pageinit', function(event, ui) {
    var eventsElement = $('p');
    $(window).bind('scrollstart', function() {
        eventsElement.html("开始滚动");
        eventsElement.css('background', 'green');
    })
    $(window).bind('scrollstop', function() {
        eventsElement.html("滚动停止");
        eventsElement.css('background', 'red');
    })
})