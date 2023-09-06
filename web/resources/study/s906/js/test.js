const test = () => {
	alert("TEST");
}

window.onload = () => {
	const btn = document.getElementById("btn");
	btn.addEventListener("click", test);
}