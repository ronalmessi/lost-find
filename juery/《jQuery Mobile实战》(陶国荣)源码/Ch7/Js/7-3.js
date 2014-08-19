// 全局命名空间
var swiptimg = {
    $index: 0,
    $width: 120,
    $swipt: 0,
    $legth: 3
}
var $imgul = $("#ifrswipt");
$(".imgswipt").each(function() {
    $(this).swipeleft(function() {
        if (swiptimg.$index < swiptimg.$legth) {
            swiptimg.$index++;
            swiptimg.$swipt = -swiptimg.$index * swiptimg.$width;
            //alert(swiptimg.$swipt + "/" + swiptimg.$index);
            $imgul.animate({ left: swiptimg.$swipt }, "slow");
        }
    }).swiperight(function() {
        if (swiptimg.$index > 0) {
            swiptimg.$index--;
            swiptimg.$swipt = -swiptimg.$index * swiptimg.$width;
            //alert(swiptimg.$swipt + "/" + swiptimg.$index);
            $imgul.animate({ left: swiptimg.$swipt }, "slow");
        }
    })
})