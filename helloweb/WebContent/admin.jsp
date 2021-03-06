<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0"><meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link href="bootstrap/css/style_admin.css" rel="stylesheet" type="text/css"/>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<!--[if lt IE 9]>
   <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
   <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
<![endif]-->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>admin</title>
</head>
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row clearfix">
				<div class="col-md-2 column">
					<ul class="nav nav-stacked nav-pills">
						<li>
						<h3>Administrator</h3>
						</li>
						<li class = "active">
							 <a href="AdminQueryMessage">查询详细信息</a>
						</li>
						<li>
							 <a href="AdminQueryClass">查询班级信息</a>
						</li>
						<li>
							 <a href="AdminAddStudent">添加学生资料</a>
						</li>
						<li>
							 <a href="AdminUpdateStudent">修改学生资料</a>
						</li>
								</ul>
				</div>
				<div class="col-md-8 column">
					 <ul class="breadcrumb">
						<li class = "pull-right">
						 <a href="Logout"><span class="glyphicon glyphicon-log-out"></span>登出</a>
						</li>
					</ul>
					<form action="AdminQueryMessage" method="POST">
					输入学号
					<input class="form-control"  name="student_id" type="text"><br/>
					<button type="submit" class="btn btn-primary ">查询</button>
					</form>
					<hr/>
					<dl class="dl-horizontal">
								<dt>学号:</dt>
								<dd>${studentmessage.studentId}<br/><br/></dd>	
								<dt>学院:</dt>
								<dd>${studentclass.academy}<br/><br/></dd>
								<dt>系:</dt>
								<dd>${studentclass.department}<br/><br/></dd>
								<dt>专业:</dt>
								<dd>${studentclass.major}<br/><br/></dd>
								<dt>班级:</dt>
								<dd>${studentclass.class_name}<br/><br/></dd>
								<dt>姓名:</dt>
								<dd>${studentmessage.name}<br/><br/></dd>
								<dt>性别:</dt>
								<dd>${studentmessage.sexy eq "0" ?"男":"女"}<br/><br/></dd>
								<dt>年龄:</dt>
								<dd>${studentmessage.age eq "0" ? "": studentmessage.age}<br/><br/></dd>
								</dl>
				</div>
			</div>
		</div>
	</div>
</div>
			
</body>
</html>