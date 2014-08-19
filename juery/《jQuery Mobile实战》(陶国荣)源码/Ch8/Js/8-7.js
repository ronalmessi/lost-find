$(function() {
    $("#slider").bind("change", function() {
        if ($(this).val() == 0) {
            $('#btnTmp').button('disable');
        } else {
            $('#btnTmp').button('enable');
        }
    })
})