<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Login Page</title>
</head>
	<body bgcolor="#FFFFFF" text="#000000" onload="document.form.j_username.focus();">
<form method="post" action="/loginVerify" name="form">

<table width="900" height="580" border="0" align="center" cellpadding="0"
 cellspacing="0" background="/assets/image/loginform_bk.jpg">
  <tr>
    <td width="50%"><div align="center">
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <table width="250" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="13%" class="boxHD"><div align="left">Login ID</div></td>

          <td class="boxHD">:</td>
          <td width="75%"><div align="left">
            <input name="j_username" type="text" class="form_field" size="25" maxlength="100" />
          </div></td>
        </tr>
        <tr>
          <td colspan="2"><div align="left"></div></td>
          <td>&nbsp;</td>

        </tr>
        <tr>
          <td class="boxHD"><div align="left">Password</div></td>
          <td class="boxHD">:</td>
          <td><div align="left">
            <input name="j_password" type="password" class="form_field" size="25" maxlength="35" />
          </div></td>
        </tr>

        <tr>
          <td colspan="2"><div align="left"></div></td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td colspan="2"><div align="left"></div></td>
          <td><div align="left">
            <input  type="submit" class="button" value="Login" alt="Submit"/>
          </div></td>

        </tr>
        <tr>
          <td colspan="2"><div align="left"></div></td>
          <td>&nbsp;</td>
        </tr>
      </table>
    </div></td>
    <td width="50%">&nbsp;</td>
  </tr>
</table>
</form>
</body>
</html>