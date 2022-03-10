function SayHello(){
    alert("I just said, \"Hello.\"");
}

function concatenate(first, last) {
    var full;
    full = first + last;
    return full;
 }

 function secondFunction() {
    var result;
    result = concatenate('Zara', 'Ali');
    document.write (result );
 }

 function over() {
    //document.write() opens a new document.  Clears existing
    document.getElementById("mouse").innerHTML = "Mouse Over";
 }    

 function out() {
    document.getElementById("mouse").innerHTML = "Mouse Out";
 }     


let d = new Date();
document.body.innerHTML = "<h1>Time right now is:  " + d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds() + "</h1>";

document.write("<h1>Hello World!</h1>");

secondFunction();