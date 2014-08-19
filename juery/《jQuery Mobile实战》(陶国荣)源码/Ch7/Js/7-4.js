$(function() {
    var $p = $("p");
    $('body').bind('orientationchange', function(event) {
        var $oVal = event.orientation;
        if ($oVal == 'portrait') {
            $p.html("垂直方向");
            $p.attr("class", "p-portrait");
        } else {
            $p.html("水平方向");
            $p.attr("class", "p-landscape");
        }
    })
})