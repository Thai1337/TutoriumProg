public class Rechner{
	private char operator;
	private float a;
	private float b;
	private float result;
	//private boolean repeat;
	

	public static void main(String[] args) {
		Rechner calculator = new Rechner();
		boolean repeat = true;
		
		do{

			calculator.input();

			if(calculator.calculate() == true){
				calculator.output();
			}else{
				calculator.input();
			}

			IO.println("\nWeiter?: N oder n");
			
			char test = IO.readChar();

			if(test == 'n' || test == 'N'){
				repeat = false;
			}

		}while(repeat);
	}

	public void input(){
        IO.print("\nOperator(+, -, *, /): ");
		operator = IO.readChar();

		IO.print("Zahl 1: ");
		a = IO.readFloat();

		IO.print("Zahl 2: ");
		b = IO.readFloat();
	}

	public boolean calculate(){

		switch(operator){
	        case '+':
	            result = a + b;
	            break;
	        case '-':
	            result = a - b;
	            break;
	        case '*':
	            result = a * b;
	            break;
	        case '/':
	            if(b != 0){ // Divison durch 0
					result = a / b;	
				}else{
					return false;
				}
	            break;
	        default:
	        	return false;
        }
		return true;
	}

	public void output(){
		IO.println(a + " " + operator + " " + b + " = " + result);
	}

}