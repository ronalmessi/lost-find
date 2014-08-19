$("#page1").live("pagecreate", function() {
    var $p1 = "#page1-";
    $($p1 + "txt").bind("change", function() {
        var blnResult = $.mobile.path.isRelativeUrl($(this).val()) ? "是" : "否";
        $($p1 + "b").html(blnResult)
    })
});
$("#page2").live("pagecreate", function() {
    var $p2 = "#page2-";
    $($p2 + "txt").bind("change", function() {
        var blnResult = $.mobile.path.isAbsoluteUrl($(this).val()) ? "是" : "否";
        $($p2 + "b").html(blnResult)
    })
});