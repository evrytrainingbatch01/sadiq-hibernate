<html>
<body>
<h2>Hello World!</h2>
<form action="./patient" method="post">
Patient name :<input type="text" name="patientname"><br>
Age :<input type="number" name="age"><br>
Blood group :<select name="bloodgroup">
           <option>A+</option>
           <option>A-</option>   
           <option>B+</option>
           <option>B-</option>
           <option>AB+</option>
           <option>AB-</option>
           <option>O+</option>
           <option>O-</option>
       </select><br>
Doctors : 	<select name="doctors">
				<option>Dentist</option>
				<option>Physician</option>
				<option>Surgeon</option>
			</select><br>
Tests Recommended : <select name="tests">
						<option>General Check-up</option>
						<option>X-Ray</option>
						<option>Scanning</option>
						<option>Blood Pressure</option>
					</select>
					<button type="submit">Submit</button>
<button type="reset">Reset</button>
</form>e
</body>
</html>
