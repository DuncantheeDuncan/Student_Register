var sec;
		var number;
		var name_of_mudule;



		window.onload = function () {
			DisplayCurrentTime()
		};
		setInterval(DisplayCurrentTime, 1000);

		function DisplayCurrentTime() {
			var date = new Date();
			var hours = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
			var minutes = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
			var seconds = date.getSeconds() < 10 ? "0" + date.getSeconds() : date.getSeconds();
			time = hours + ":" + minutes + ":" + seconds;
			var lblTime = document.getElementById("displaytimer");
			// lblTime.innerHTML = time;
			getTheTime(hours, minutes);
		};


		function getTheTime(hours, minutes) {
			var time = hours + ":" + minutes;

			var show = document.getElementById("displaytimerr");
			show.innerHTML = time;

			if (hours >= 9 && minutes >= 30) { //Module 1
				sec = 4000;
				number = 1;
				name_of_mudule = "#active";
				var i = name_of_mudule + number;
				fade(i, sec);

			}
			/*else */
			if (hours >= 10 && minutes >= 30) { //Module 2
				sec = 4000;
				number = 2;
				name_of_mudule = "#active";
				var i = name_of_mudule + number;
				fade(i, sec);

			}
			/*else*/
			if (hours >= 10 && minutes >= 45) { //break 3
				sec = 4000;
				number = 3;
				name_of_mudule = "#active";
				var i = name_of_mudule + number;
				fade(i, sec);
			}
			/*else*/
			if (hours >= 11 && minutes >= 45) { //Module 4
				sec = 4000;
				number = 4;
				name_of_mudule = "#active";
				var i = name_of_mudule + number;
				fade(i, sec);
			}
			/*else*/
			if (hours >= 12 && minutes >= 45) { //Module 5
				sec = 4000;
				number = 5;
				name_of_mudule = "#active";
				var i = name_of_mudule + number;
				fade(i, sec);
			}
			/*else*/
			if (hours >= 13 && minutes >= 30) { //break 6
				sec = 4000;
				number = 6;
				name_of_mudule = "#active";
				var i = name_of_mudule + number;
				fade(i, sec);
			}
			if (hours >= 14 && minutes >= 30) { //Module 7
				sec = 4000;
				number = 7;
				name_of_mudule = "#active";
				var i = name_of_mudule + number;
				fade(i, sec);
			}
			if (hours >= 15 && minutes >= 30) { //Module 8
				sec = 4000;
				number = 8;
				name_of_mudule = "#active";
				var i = name_of_mudule + number;
				fade(i, sec);
			}
			if (hours >= 16 && minutes >= 30) { //Module 9
				sec = 4000;
				number = 9;
				name_of_mudule = "#active";
				var i = name_of_mudule + number;
				fade(i, sec);
			}


//		<script src="../javascript/datesForTimeable.js"></script>
			console.log({
				i,
				sec,
				hours,
				minutes
			});


		}




		function fade(i, sec) {
			$(document).ready(function () {
				setTimeout(function () {
					$(i).hide("2000");
				}, sec);
			});

		}