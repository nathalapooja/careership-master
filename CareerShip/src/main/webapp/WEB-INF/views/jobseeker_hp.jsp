<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Virtual Job Fair </title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  
   /* Remove the navbar's default rounded borders and increase the bottom margin */
    
    .navbar {
      margin-bottom: 50px;
      border-radius: 0;
    }
	
	 #fullscreen_bg {
  background-image: url('http://beatwhale.com/images/background.png');
    position: fixed;
    top: 0;
    right: 0;
    bottom: 0;
    left: 0;
    background-size: cover;
    background-position: 50% 50%;
	overflow : scroll;
    }
	
	#hi{
		
		 font-family:Georgia, serif;
		font-size: 30px;
		color: white;
		padding-bottom: 0px;
	}
	
	#bye{
	font-family: "Comic Sans MS", cursive, sans-serif;
	font-size: 20px;
	position: static;
		color: white;
		padding-bottom: 0px;
		text-align:center;
		//width:900px;
		//height:30px;
	}
	
	#abc{
	height : 300px;
	width : 600px;
	
	}
	
	//tr:nth-child(even){background-color: #f2f2f2}
	
	
	#customers {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	color: white;
    border-collapse: collapse;
    width: 100%;
}

#customers td, #customers th {
    border: 1px solid #ddd;
    padding: 8px;
}

//#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #AFEEEE;}

#customers th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: center;
    background-color: 	#87CEFA;
    color: white;
}


#button1{
background-color: white;
    color: black;
    border: 2px solid #4CAF50; /* Green */
}

#button2{
background-color: white;
    color: black;
    border: 2px solid #f44336; /* Red */
}
	
	
	
/* animation for heading careership */	
	#myDIV {
    -webkit-animation: mymove 5s infinite; /* Chrome, Safari, Opera */
    animation: mymove 5s infinite;
	 font-family:Georgia, serif;
		font-size: 30px;
		color: white;
		padding-bottom: 0px;
}

/* Chrome, Safari, Opera */
@-webkit-keyframes mymove {
    50% {text-shadow: 10px 20px 30px blue;}
}

/* Standard syntax */
@keyframes mymove {
    50% {text-shadow: 10px 20px 30px blue;}
}
	
	
	</style>
	
	
	<body>
	<div class="jumbotron">
  <div class="container text-center">
  <div id="fullscreen_bg"/>
	
	
	<div class="row">
<div class="small-12 columns">

<div id="myDIV">
CAREERSHIP
<h4>Find the right job. Right now. </h4>
</div>

</div>
</div>
	
	
	
	
	<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
	  <a class="navbar-brand" href="#">
	  <img src= "https://thumb1.shutterstock.com/display_pic_with_logo/3278303/552246277/stock-vector-search-job-icon-one-of-set-web-icons-552246277.jpg" width=50px style = "display:inline-block;">
	  <span style="display: inline-block;" width=50px></span>
	  </a>
	  
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li ><a href="/vjf/home">Home</a></li>
        <li ><a href="/vjf/job/backgroudinfo">Job Seeker Bio Data</a></li>
        <li ><a href="/vjf/jobseek/searchjobs">Search Jobs</a></li>
          <li><a href="/vjf/jobseek/applyjobs">Job Seeker Home</a></li>
        
          </ul>
      <ul class="nav navbar-nav navbar-right">
	    <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-user">
          <c:if test="${not empty EmployerEmail}">
  			${EmployerEmail} 
  		</c:if>
  		<c:if test="${not empty JobSeekerEmail}">
  			${JobSeekerEmail}
  			
  		</c:if>
        
         <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="/vjf/jobseekerlogin">Job Seeker</a></li>
          <li><a href="/vjf/employerlogin">Employer</a></li>
          
        </ul>
      </li>
        <li><a href="/logout">Logout</a></li>
      </ul>
    </div>
  </div>
</nav>
	 
	 
	 <h2 id="hi">Making the job of looking for a job a little easier.</h2>
<p id="hi"> 
<img id = "abc" src ="http://blogs-images.forbes.com/markmurphy/files/2015/07/job-search.jpg" />
</p>
<p> </p>
<p> <button type="button" class="btn btn-success" onclick="window.location.href='/vjf/jobseek/viewjobs'">APPLY FOR JOB</button> </p>
 <p> <button type="button" class="btn btn-success" onclick="window.location.href='/vjf/job/backgroudinfo'">ADD BACKGROUND INFO</button> </p>
</div>	

	 
	 
	</div>
	</div>
	</div>
	</body>
