$("#page1").live("pagecreate", function() {
    if (navigator.onLine) {
        $(".status").html("在线");
    } else {
        $(".status").html("离线");
    }
})