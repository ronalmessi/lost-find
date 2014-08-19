$("#page1").live("pagecreate", function() {
    var $p1 = "#page1-";
    $("#page1-txt1,#page1-txt2").live("change", function() {
        var $txt1 = $($p1 + "txt1").val();
        var $txt2 = $($p1 + "txt2").val();
        if ($txt1 != "" && $txt2 != "") {
            var blnResult = $.mobile.path.isSameDomain($txt1, $txt2) ? "是" : "否";
            $($p1 + "b").html(blnResult)
        }
    })
});