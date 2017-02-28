function createresearchbutton(){
	document.getElementById('research-button').style="display:inline-block;width:12%;";
	document.getElementById('research').style="width:70%";
}
function deleteresearchbutton(){
	document.getElementById('research-button').style="display:none;width:0%;";
	document.getElementById('research').style="width:85%";
}
function buttonresearch(){
	if(document.getElementById('research').value==""){
		deleteresearchbutton();
	}else{
		createresearchbutton();
	}
}