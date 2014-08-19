$('#page1').live("pagecreate", function() {
    var $randombg = Math.floor(Math.random() * 4); // 0 to 3
    var $p = $('#pChange');
    $p.removeClass("p0").addClass('p' + $randombg);
})