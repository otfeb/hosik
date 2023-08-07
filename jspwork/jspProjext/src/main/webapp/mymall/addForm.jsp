<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&family=Dongle&family=Gugi&family=Orbit&display=swap"
        rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
<style>
	#selphoto{
	width: 280px;
	height: 300px;
	}
</style>

<script type="text/javascript">
$(function(){
	$("#selphoto").attr("src",$("#photo").val());
	
	$("#photo").change(function(){
		//select에 넣기
		$("#selphoto").attr("src",this.value);
		
	});
});

</script>
</head>
<body>
<form action="addAction.jsp" method="post">
	<table class="table table-bordered" style="width: 300px">
		<tr>
			<th>상품명</th>
			<td>
				<input type="text" name="sangpum" class="form-control" required="required" style="width:120px;" placeholder="상품명">
			</td>
		</tr>
		
		<tr>
			<th>상품사진</th>
			<td>
				<select name="photo" id="photo" >
					<option value="../image/15.jpg">구두</option>
					<option value="../image/18.jpg">폰케이스</option>
					<option value="../image/25.jpg">원피스</option>
					<option value="../image/28.jpg">블라우스</option>
					<option value="../image/30.jpg">헤어밴드</option>
				</select>
			</td>
		</tr>
		
		<tr>
			<th>가격</th>
			<td>
				<input type="text" name="price" class="form-control" required="required" style="width:120px;" placeholder="가격">
			</td>
		</tr>
		
		<tr>
			<th>입고일</th>
			<td>
				<input type="date" name="ipgoday" class="form-control" required="required" style="width:180px;" placeholder="입고일">
			</td>
		</tr>
		
		<tr>
			<td colspan="2" align="center">
				<button type="submit" class="btn btn-outline-info">상품추가</button>
				<button type="button" class="btn btn-outline-success" onclick="location.href='list.jsp'">상품목록</button>
			</td>
		</tr>
	</table>
</form>
<div>
	<img alt="" src="" id="selphoto">
</div>
</body>
</html>