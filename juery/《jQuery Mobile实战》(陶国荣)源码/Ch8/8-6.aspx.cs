using System;
using System.Collections.Generic;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Ch8_8_6 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        string strName = Request["Name"];
        string strPass = Request["Pass"];
        bool blnLogin = false;
        if (strName == "admin" && strPass == "123456")
        {
            blnLogin = true;
        }
        Response.Clear();
        Response.Write(blnLogin);
        Response.End();
    }
}
