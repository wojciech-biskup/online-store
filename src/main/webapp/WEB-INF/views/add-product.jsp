<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
	<title>Add Product</title>
</head>
<body>
	<select id="product-type-select" name="product-type" onchange="changeProductType()">
		<option value="cpu">CPU</option>
		<option value="graphicsCard">Graphics Card</option>
		<option value="hddDrive">HDD Drive</option>
		<option value="motherboard">Motherboard</option>
		<option value="powerSupply">Power Supply</option>
		<option value="ramStick">RAM Stick</option>
	</select>

	<form id="cpu-form" action="cpu-adding" method="POST" style="display: none">
		<span>Name: </span> <input type="text" name="name"> <br>
		<span>Clock Rate: </span> <input type="number" step="0.01" name="clockRate"> <br>
		<span>Core Amount: </span> <input type="number" name="coreAmount"> <br>
		<span>Socket: </span> <input type="text" name="socket"> <br>
		<span>Price: </span> <input type="number" step="0.01" name="price"> <br>
		<span>Amount: </span> <input type="number" name="amount"> <br>
		<input type="submit" value="Add Product">
	</form>

	<form id="graphics-card-form" action="graphics-card-adding" method="POST" style="display: none">
		<span>Name: </span> <input type="text" name="name"> <br>
		<span>Clock Rate: </span> <input type="number" name="clockRate"> <br>
		<span>Lenght: </span> <input type="number" name="lenght"> <br>
		<span>RAM Memory Size: </span> <input type="number" name="ramMemorySize"> <br>
		<span>Price: </span> <input type="number" step="0.01" name="price"> <br>
		<span>Amount: </span> <input type="number" name="amount"> <br>
		<input type="submit" value="Add Product">
	</form>

	<form id="hdd-drive-form" action="hdd-drive-adding" method="POST" style="display: none">
		<span>Name: </span> <input type="text" name="name"> <br>
		<span>Capacity: </span> <input type="number" name="capacity"> <br>
		<span>Rotation Speed: </span> <input type="number" name="rotationSpeed"> <br>
		<span>Size: </span> <input type="number" step="0.01" name="size"> <br>
		<span>Price: </span> <input type="number" step="0.01" name="price"> <br>
		<span>Amount: </span> <input type="number" name="amount"> <br>
		<input type="submit" value="Add Product">
	</form>

	<form id="motherboard-form" action="motherboard-adding" method="POST" style="display: block">
		<span>Name: </span> <input type="text" name="name"> <br>
		<span>Chipset: </span> <input type="text" name="chipset"> <br>
		<span>Memory Slots: </span> <input type="number" name="memorySlots"> <br>
		<span>Socket: </span> <input type="text" name="socket"> <br>
		<span>Type: </span> <input type="text" name="type"> <br>
		<span>Price: </span> <input type="number" step="0.01" name="price"> <br>
		<span>Amount: </span> <input type="number" name="amount"> <br>
		<input type="submit" value="Add Product">
	</form>

	<form id="power-supply-form" action="power-supply-adding" method="POST" style="display: none">
		<span>Name: </span> <input type="text" name="name"> <br>
		<span>Certification: </span> <input type="text" name="certification"> <br>
		<span>Wattage: </span> <input type="number" name="wattage"> <br>
		<span>Price: </span> <input type="number" step="0.01" name="price"> <br>
		<span>Amount: </span> <input type="number" name="amount"> <br>
		<input type="submit" value="Add Product">
	</form>

	<form id="ram-stick-form" action="ram-stick-adding" method="POST" style="display: none">
		<span>Name: </span> <input type="text" name="name"> <br>
		<span>Capacity: </span> <input type="number" name="capacity"> <br>
		<span>Frequency: </span> <input type="number" name="frequency"> <br>
		<span>Type: </span> <input type="text" name="type"> <br>
		<span>Price: </span> <input type="number" name="price"> <br>
		<span>Amount: </span> <input type="number" name="amount"> <br>
		<input type="submit" value="Add Product">
	</form>

	<script>
		function changeProductType() {
			var productType = document.getElementById("product-type-select").value;

			switch (productType) {
				case "cpu":
					document.getElementById("cpu-form").style.display = "block";
					document.getElementById("motherboard-form").style.display = "none";
					document.getElementById("graphics-card-form").style.display = "none";
					document.getElementById("ram-stick-form").style.display = "none";
					document.getElementById("hdd-drive-form").style.display = "none";
					document.getElementById("power-supply-form").style.display = "none";
					break;

				case "graphicsCard":
					document.getElementById("graphics-card-form").style.display = "block";
					document.getElementById("motherboard-form").style.display = "none";
					document.getElementById("cpu-form").style.display = "none";
					document.getElementById("ram-stick-form").style.display = "none";
					document.getElementById("hdd-drive-form").style.display = "none";
					document.getElementById("power-supply-form").style.display = "none";
					break;

				case "hddDrive":
					document.getElementById("hdd-drive-form").style.display = "block";
					document.getElementById("motherboard-form").style.display = "none";
					document.getElementById("cpu-form").style.display = "none";
					document.getElementById("graphics-card-form").style.display = "none";
					document.getElementById("ram-stick-form").style.display = "none";
					document.getElementById("power-supply-form").style.display = "none";
					break;

				case "motherboard":
					document.getElementById("motherboard-form").style.display = "block";
					document.getElementById("cpu-form").style.display = "none";
					document.getElementById("graphics-card-form").style.display = "none";
					document.getElementById("ram-stick-form").style.display = "none";
					document.getElementById("hdd-drive-form").style.display = "none";
					document.getElementById("power-supply-form").style.display = "none";
					break;

				case "powerSupply":
					document.getElementById("power-supply-form").style.display = "block";
					document.getElementById("motherboard-form").style.display = "none";
					document.getElementById("cpu-form").style.display = "none";
					document.getElementById("graphics-card-form").style.display = "none";
					document.getElementById("ram-stick-form").style.display = "none";
					document.getElementById("hdd-drive-form").style.display = "none";
					break;

				case "ramStick":
					document.getElementById("ram-stick-form").style.display = "block";
					document.getElementById("motherboard-form").style.display = "none";
					document.getElementById("cpu-form").style.display = "none";
					document.getElementById("graphics-card-form").style.display = "none";
					document.getElementById("hdd-drive-form").style.display = "none";
					document.getElementById("power-supply-form").style.display = "none";
			}
		}
	</script>
</body>
</html>