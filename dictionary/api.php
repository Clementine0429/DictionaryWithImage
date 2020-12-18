<?php
	require_once ('lib/db.php');
	if(isset($_GET['Status'])){
		$r= DP::run_query("select `word`, `definition`, `image` from `table_dictionary` where Status=? ", [$_GET['Status']], 2);
		
		echo json_encode($r);
	}
	
	
	
	if(isset($_GET['word']) && isset($_GET['definition'])){
		$r= DP::run_query("insert into `table_dictionary`(`word`, `definition`, `image`) values (?,?,?) ", [$_GET['word'], $_GET['definition'],$_GET['image']], 3);
		
		echo json_encode($r);
	
	}
	
	else if(isset($_GET['word'])){
		$r= DP::run_query("select `word`, `definition`, `image` from `table_dictionary` where word like concat(?,'%') limit 0,5", [$_GET['word']], 2);
		
		print json_encode($r);
	}
?>
