var json;

function loadJsonData() {
	var xhttp;
	if(window.XMLHttpRequest) {
		xhttp = new XMLHttpRequest();
	} else {
		xhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	// alert(xhttp);
	xhttp.onreadystatechange = function() {
		if(this.readyState == 4 && this.status == 200) {
			var result = JSON.parse(this.responseText);
			
			// JSONObject jsonObject = (JSONObject) result;
			json = result;
			
			for (var i = 0; i < result.length; i++) {
				var t = document.getElementById("dataTable");
                var r = document.createElement("TR");
                var j = i+1;
                r.innerHTML = '<tr><th scope="row">'+ j +'</th>'
                +'   <td><input type="text" value="'+result[i].name+'" /></td>'
                +'   <td><input type="text" value="'+result[i].email+'" /></td>'
                +'   <td><input type="button" value="Delete" onclick="deleteData('+ j + ')" /></td></tr> ';
                t.tBodies[0].appendChild(r);
			}

			// document.getElementById('displayArea').innerHTML = this.responseText;
		}
	}

	xhttp.open("GET","http://localhost:8088/AjaxCrud/data.json",true);
	xhttp.send();
}
function deleteData(n) {
	alert(json[n-1].name);
	// alert(n-1 + " "+ typeof json);
	// alert(json[0]);
	// delete json[n-1].name;
	// delete json[n-1].email;
	// json[n-1].delete(json[n-1].name);
	// delete json[n-1];
	// console.log(json[n-1]);
	// loadJsonData();
}