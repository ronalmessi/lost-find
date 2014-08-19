$("#page1").live("pagecreate", function() {
    var $p1 = "#page1-";
    $($p1 + "txt").bind("change", function() {
        var strPath = $($p1 + "a").html();
        var absPath = $.mobile.path.makePathAbsolute($(this).val(), strPath);
        $($p1 + "b").html(absPath)
    })
})
$("#page2").live("pagecreate", function() {
    var $p2 = "#page2-";
    $($p2 + "txt").bind("change", function() {
        var strPath = $($p2 + "a").html();
        var absPath = $.mobile.path.makeUrlAbsolute($(this).val(), strPath);
        $($p2 + "b").html(absPath)
    })
})