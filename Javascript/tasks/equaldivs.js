window.onload = function() {
	var div = document.createElement("div");
	div.setAttribute('class', 'container');
	

	var row = document.createElement("div");
	row.setAttribute("class","row");

	var div1 = document.createElement("div1");
	div1.setAttribute("class","col-lg-4");
	div1.setAttribute("id","div1");

	var p = "<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit,"
	 +"sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
	 +"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."
	 +"Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur."
	 +"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>";

	div1.innerHTML = p;
	row.appendChild(div1);

	var div2 = document.createElement("div2");
	div2.setAttribute("class","col-lg-4");
	div2.setAttribute("id","div2");

	var p2 = "<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit,"
	 +"sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
	  +"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."
	   +"Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur."
	    +"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>";
	 p2 += "<p>sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
	  +"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."
	   +"Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur."
	    +"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>";
	
	// alert(typeof p1);
	// var p2 = p1 + "<br>" + p1;
	div2.innerHTML = p2;   
	row.appendChild(div2);

	var div3 = document.createElement("div3");
	div3.setAttribute("class","col-lg-4");
	div3.setAttribute("id","div3");

	div3.innerHTML = p2;

	row.appendChild(div3);

	div.appendChild(row);

	document.getElementById('main').appendChild(div);
}