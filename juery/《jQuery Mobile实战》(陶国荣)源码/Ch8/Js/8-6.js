$(function() {
    $("#btnSub").click(function() {
        var frmData = $("#form1").serialize();
        $.ajax({
            type: "POST",
            url: "8-6.aspx",
            cache: false,
            data: frmData,
            success: function(data) {
                alert(data);
                if (data == "True") {
                    $("#divTip").html("操作提示，登录成功！");
                }
                else {
                    $("#divTip").html("用户名或密码错误！");
                }
            }
        })
        return false;
    })
})