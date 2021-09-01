function Q1(){
	var n=document.getElementById("number").value;
	var sum=0;
	for(var i=1;i<=n;i++){
		sum+=i;
	}
	document.getElementById("Result").value=sum;
}
function Q2(){
	var n=document.getElementById("number").value;
	var sum=0;
	for(var i=1;i<=n;i++){
		if((i%3==0)||(i%5==0)){
		sum+=i;
		}
	}
	document.getElementById("Result").value=sum;
}
function Q3(){
	var n=document.getElementById("number").value;
	document.getElementById("evenOrOdd").value=parity(n);
}
function parity(n){
	if(n%2==0){
		return "Even Number";
	}
	else{
		return "Odd Number";
	}
}
function Q4(){
	var n=document.getElementById("number").value;
	document.getElementById("ratio").value=headsRatio(n);
}
function headsRatio(n){
	var heads=0;
	for(var i=1;i<=n;i++){
		if(Math.floor(Math.random()*2)==0){
			heads=heads+1;
		}
	}
	return heads/n;
}
function Q5(){
	var year=parseInt(document.getElementById("year").value);
	year=leapyear(year);
	var years="<ul>";
	for(var i=1;i<20;i++){
	years+="<li>"+(year+(4*i))+"</li>";
	}
	document.getElementById("demo").innerHTML=years;
}
function leapyear(year) {
	while (true) {

        if ((year % 4 === 0) && (year % 100 !== 0)||(year % 400 === 0)) {
           break;
        } 
        else {
        year++;
        }    
    }
	return year;
}
function Q6(){
	var list=["Hello","World","in","a","frame"];
	var text="*******************<br>";
	for(var i=0;i<list.length;i++){
		text+="*"+list[i]+"*<br>";
	}
	text+="****************";
	document.getElementById("demo").innerHTML=text;
}
function Q7(){
	var currency=document.getElementById("dollars").value;
	var text="a. "+(currency*74.28)+" INR(Indian Rupee)<br>b. "+(currency*109.14)+" Yen(Japanese Yen)<br>c. "+(currency*0.84)+" Euro(Euro)<br>d. "+(currency*0.72)+" Pound sterling (Pound sterling)";
	document.getElementById("demo").innerHTML=text;
}
function Q8(){
	var a=["a","b","c"];
	var b=[1,2,3];
	document.getElementById("demo").innerHTML=a.concat(b);
}
function Q9(){
	var a=["a","b","c"];
	var b=[1,2,3];
	var res=[];
	res.push(a.shift());
	res.push(b.shift());
	res.push(a.shift());
	res.push(b.shift());
	res.push(a.shift());
	res.push(b.shift());
	document.getElementById("demo").innerHTML=res;
}
function Q10(){
	var fib=[1,1];
	for(var i=2;i<100;i++){
		fib.push(fib[i-1]+fib[i-2]);
	}
	document.getElementById("demo").innerHTML=fib;
}
function Q11(){
	var a=[1,2,3,4,5];
	document.getElementById("demo").innerHTML=a.reverse();
}
function Q12(){
	var token=document.getElementById("token").value;
	var res="";
	var word="";
	for(var i=0;i<token.length;i++){
		if(token.charAt(i)=='a' || token.charAt(i)=='b'){
			if(res.length<word.length){
				res=word;
				word="";
			}
		}
		else{
			word+=token.charAt(i);
		}
	}
	document.getElementById("demo").innerHTML=res;
}
function Q13(){
	var arr=[1,2,3,4,5];
	var text="<ul>";
	text+="<li>"+sumUsingFor(arr)+"</li>";
	text+="<li>"+sumUsingWhile(arr)+"</li>";
	text+="<li>"+sumUsingDoWhile(arr)+"</li></ul>";
	document.getElementById("demo").innerHTML=text;
}
function sumUsingFor(arr){
	var sum=0;
	var i;
	for(i=0;i<arr.length;i++){
		sum+=arr[i];
	}
	return sum;
}
function sumUsingWhile(arr){
	var sum=0;
	var i=0;
	while(i<arr.length){
		sum+=arr[i];
		i++;
	}
	return sum;
}
function sumUsingDoWhile(arr){
	var sum=0;
	var i=0;
	do{
		sum+=arr[i];
		i++;
	}while(i<arr.length);
	return sum;
}
function Q14(){
	var arr=[];
	var i=0,sum=0,text="",even=0,odd=0;
	for(i=0;i<100;i++){
		arr.push(Math.random());
	}
	var max=arr[0],min=arr[0];
	for(i=0;i<100;i++){
		if(arr[i]>max){
			max=arr[i];
		}
		if(arr[i]<min){
			min=arr[i];
		}
		if(arr[i]%2==0){
			even+=1;
		}
		else{
			odd+=1;
		}
		sum+=arr[i];
	}
	text=arr+"<br><ul>";
	text+="<li>Largest among the array: "+max+"</li>";
	text+="<li>smallest among the array: "+min+"</li>";
	text+="<li>largest amount even and odd count: ";
	if(even>odd){
		text+="Even count - "+even;
	}
	else{
		text+="Odd count - "+odd;
	}
	text+="</li>";
	text+="<li>Sum of elements in the array: "+sum+"</li>";
	text+="<li>Average of elements in the array: "+(sum/100)+"</li></ul>";
	document.getElementById("demo").innerHTML=text;
}
function Q15(){
	var arr=[12,23,1,92,34,83,10,34,2,19,10,40,81,0,24,29,72,52,18,9];
	var i,j,t;
	var text="Before sorting:<br>"+arr;
	for(i=0;i<arr.length;i++){
		for(j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j]){
				t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
	}
	text+="<br>After sorting:<br>"+arr;
	document.getElementById("demo").innerHTML=text;
}
function Q16(){
	var text="<table border='1'>";
	var i,j;
	var row=document.getElementById("rows").value;
	var col=document.getElementById("cols").value;
	for(i=1;i<=row;i++){
		text+="<tr>";
		for(j=1;j<=col;j++){
			text+="<td>(row"+i+",col"+j+")</td>";
		}
		text+="</tr>";
	}
	text+="</table>"
	document.getElementById("demo").innerHTML=text;
}
function Q17(){
	var arr=[1,2,3,4,5,6,7];
	var n;
	var k=document.getElementById("k").value;
	for(var i=0;i<k%7;i++){
		n=arr.shift();
		arr.push(n);
	}
	document.getElementById("demo").innerHTML=arr;
}
function Q18(){
	var str="The quick brown fox";
	var text=""
	var words=str.split(" ");
	for(var i=0;i<words.length;i++){
		text+=words[i].split('').reverse().join('')+"ay ";
	}
	document.getElementById("demo").innerHTML=text;
}
function Q19(ch){
	var str;
	var op;
	if(ch=="Clear"){
		document.getElementById("display").value="";
	}
	else if(ch=="="){
		str=document.getElementById("display").value;
		if(str.includes("+")){
			op=str.split("+");
			document.getElementById("display").value=(parseFloat(op[0])+parseFloat(op[1]));
		}
		else if(str.includes("-")){
			op=str.split("-");
			document.getElementById("display").value=(parseFloat(op[0])-parseFloat(op[1]));
		}
		else if(str.includes("*")){
			op=str.split("*");
			document.getElementById("display").value=(parseFloat(op[0])*parseFloat(op[1]));
		}
		else if(str.includes("/")){
			op=str.split("/");
			document.getElementById("display").value=(parseFloat(op[0])/parseFloat(op[1]));
		}
	}
	else {
		str=document.getElementById("display").value;
		document.getElementById("display").value=(str.concat(ch));
	}
}