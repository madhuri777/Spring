function validation() {
	var name=document.getElementById("username").value;
	 var email_id=document.getElementById("emails").value;
	 var pass=document.getElementById("password").value;
	 var repass=document.getElementById("repasswd").value;
 
	 if(nameValidation(name)&&emailValidation(email)&&passValidation(pass)){
		 alert("all fields filled correctly");
		 return true;
	 }
	 
} 
function nameValidation(name){
	if(name==""){
		alert("please enter name");
		return false;
	}else{
		return true;
	}
}
function emailValidation(email_id) {
	if(email==""){
		alert("please enter the email");
		return false;
	}else{
		return true;
	}
	
}
function passValidation(pass) {
	if(pass.length<8&&pass.length>12){
		alert("password length should be greater than 8 and less than 12");
		return false;
	}else{
		alert("u enterd right passwd");
		return true;
	}
}