var rttophtml5mobi = {
    author: 'tgrong',
    version: '1.0',
    website: 'http://www.rttop.cn'
}
rttophtml5mobi.install = {
    setParam: function(name, value) {
        localStorage.setItem(name, value)
    },
    getParam: function(name) {
        return localStorage.getItem(name)
    }
}
$("#page1").live("pagecreate", function() {
    var $content = $(this).find('div[data-role="content"]');
    var $strhtml = '<a href="#page2" data-id="50000">传值</a>';
    $content.html($strhtml);
    $content.delegate('a', 'click', function(e) {
        rttophtml5mobi.install.setParam('p_link_id', $(this).data('id'))
    })
})
$("#page2").live("pagecreate", function() {
    var $content = $(this).find('div[data-role="content"]');
    var $strhtml = '传回的值是：';
    var $p_link_id = rttophtml5mobi.install.getParam('p_link_id'); ;
    $content.html($strhtml + $p_link_id);
})