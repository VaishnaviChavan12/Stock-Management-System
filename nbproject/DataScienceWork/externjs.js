
function getopera()
    {
      var x=document.getElementById("demo");
      n=prompt("Enter a no:");
     
    if(n %2 == 0)
    {
        alert(n+" is even");
        x.innerHTML =n+ "is even";
    }
    else
    {
      alert(n+" is odd");
      x.innerHTML = n+ "is odd";
    }
   
    }
