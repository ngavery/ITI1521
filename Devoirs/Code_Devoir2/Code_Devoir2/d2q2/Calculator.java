/**********************Q2-Devoir2 ITI1521*********/
class Calculator {
private double first, second; // two calculator operands
private String oP;  

Calculator() {};

void operation(String str) {
first = second; // keep first operand
second = 0; // initialize and get ready for second operand
oP = str;
}

void add() {
oP = "+"; }
void subtract() {
oP = "-";
}
void multiply() {
oP = "x";
}
void divide() {
oP = "/";
}
void factorial() {
oP = "!";
}
void pow() {
oP = "^";
}
void rootSquare() {
oP = "sqrt";
}
void nepLog() {
oP = "ln";
}

void compute() {


  if (oP == "+")
   second = first + second;
  if (oP == "x")
    second = first * second;
  if (oP == "/")
    second = first / second;
  if (oP == "!")
  //first = Math.sqrt(2*Math.PI*first)*((first/Math.E)^(first))*(1+(1/12*first));
  if (oP == "^")
    second = Math.pow(first, second);
  if (oP == "sqrt")
    first = Math.sqrt(first);
  if (oP == "ln")
    first = Math.log(first);


 }
  
void clear() {
first = 0;
second = 0;
oP = "";
}

double display() {
return second;
}

/*
AUTRES METHODES SI NECESSAIRE
*/

}





