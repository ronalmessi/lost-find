var $intInterval;
var $intHeight = 0;
var $p1 = "#page1-";
$("#page1").live("pagecreate", function() {
    $($p1 + "a1").live("click", function() {
        $intInterval = window.setInterval("AutoScroll()", 1000);
    })
})
//编写自动滚动函数
function AutoScroll() {
    if ($intHeight < 30) {
        $.mobile.silentScroll($intHeight);
        $($p1 + "a1").html($intHeight);
        $intHeight = $intHeight + 2;
    } else {
        window.clearInterval($intInterval);
    }
}