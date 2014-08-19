$(function() {
    var cnv = $("#cnvMain");
    var cxt = cnv.get(0).getContext('2d');
    var w = window.innerWidth / 1.2;
    var h = window.innerHeight / 1.2;
    var $tip = $('#spnTip');
    cnv.attr("width", w);
    cnv.attr("height", h);
    //绑定画布的tap事件
    cnv.bind('tap', function(event) {
        var obj = this;
        var t = obj.offsetTop;
        var l = obj.offsetLeft;
        while (obj = obj.offsetParent) {
            t += obj.offsetTop;
            l += obj.offsetLeft;
        }
        tapX = event.pageX;
        tapY = event.pageY;
        //开始画圆
        cxt.beginPath();
        cxt.arc(tapX - l, tapY - t, 5, 0, Math.PI * 2, true);
        cxt.closePath();
        //填充圆的颜色
        cxt.fillStyle = "#666";
        cxt.fill();
        $tip.html("X: " + (tapX - l) + " Y: " + tapY);
    })
})   