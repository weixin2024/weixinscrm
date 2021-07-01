<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>操作员账号信息</title>
<!--公共的js与css文件-->
<#include "/common/common.ftl">
</head>
<body>
    <#include "/user/common/top.ftl">
	<!-- 要于顶部有距离-->
	<div class="projects-header page-header" style="margin: 30px 0 22px;">
	</div>
	<div class="container-fluid">
		<div class="row">
            <#include "/user/common/leftmenu.ftl">
			<div class="col-sm-9  col-md-10  main">
				<ol class="breadcrumb" style="margin-top: 3px; margin-bottom: 10px">
					<li class="glyphicon glyphicon-home" aria-hidden="true"></li>
					<li class="active">用户查询列表</li>
				</ol>
				<div class="row">
					<form action="/user/account/list" id="form" method="post">
						<div class="col-md-2">
							<input type="text" name="account" value="${info.account!}"
								class="form-control" placeholder="账号"
								aria-describedby="basic-addon1">
						</div>
					 
						
						
                        <div class="col-md-2">
							<select class="form-control" onchange="selectOnchang(this)">
								<option value="10" <#if pageBean.pageSize==10> selected</#if> >10条</option>
								<option value="30" <#if pageBean.pageSize==30> selected</#if> >30条</option>
								<option value="50" <#if pageBean.pageSize==50> selected</#if> >50条</option>
								<option value="100" <#if pageBean.pageSize==100> selected</#if> >100条</option>
							</select>
						</div>
						 
						<div class="col-md-1">
							<button type="submit" class="btn btn-default">查询</button>
						</div>
						
						<div class="col-md-1">
                            <button type="button" onclick="toAdd()" class="btn btn-default">添加</button>
                        </div>
                        
                        <div class="col-md-3">
                           <input type="hidden" id="pageNo" name="pageNo">
                           <input type="hidden" id="pageSize" name="pageSize" value="${pageBean.pageSize!}">
                        </div>
                        
					</form>
				</div>
				<div class="projects-header page-header" style="margin: 3px 0 6px;"></div>
				<div class="table-responsive">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>操作员账号</th>
								<th>密码</th>
								<th>昵称</th>
								<th>状态</th>
                                <th>创建时间</th>
								<th align="center">操作</th>
							</tr>
						</thead>
						<tbody>
						 
                         <#if pageBean?exists>  
                            <#list pageBean.resultList as user>
								<tr>
								    <td>${user.account!}</td>
									<td>${user.password!}</td>
									<td>${user.nickname!}</td>
									<td>${(user.state==1)?string('正常','禁用')}</td>
                                    <td>${user.create_time?string('yyyy-MM-dd HH:mm:ss')!}</td>
									<td><a  href="/user/account/toedit/${user.id}">修改</a></td>
								</tr>
							</#list>
                         </#if>  
						</tbody>
					</table>
				</div>
				<div class="projects-header page-header" style="margin: 0px 0 0px;"></div>
				<div align="center">
					<nav>
						  <#include "/common/page.ftl">
					</nav>
				</div>
			</div>
		</div>
	</div>

</body>
 <script type="text/javascript">
  function gotoPage(pageNo){
     $('#pageNo').val(pageNo)
     $('#pageSize').val()
	 $('#form').submit();
  }
  
  function toAdd(){
    location.href="/user/account/toadd";
  } 
  
  /*
  function deleteUser(id){
      var res=confirm("真的要删除该条记录吗?")
	  if(res){
	       location.href="/user/account/delete/"+id;
	  }
  }
  */
 
  function selectOnchang(obj){
	  var value = obj.options[obj.selectedIndex].value;
	  $('#pageSize').val(value);
  }
  
  
  
</script>
</html>