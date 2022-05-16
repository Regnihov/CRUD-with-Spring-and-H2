
function createForm(){
	var form = "<form>";
	form += "<label for='name'>Campaign name:</label><br><input type='text' id='name'><br>";

	form += "<input type='submit' value='Submit campaign'></form>";
	document.getElementById('contents').innerHTML = form;
}

function editList(){
	document.getElementById('contents').innerHTML = "";

}

function deleteList(){
	document.getElementById('contents').innerHTML = "";

}
