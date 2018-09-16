public class Complex {

    double real;
    double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
        
    }

    public static void main(String[] args) {
        Complex n1 = new Complex(2.3, 4.5),
         temp;

        temp = display(n1);
       
      System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag); 
    }

    public static Complex display(Complex n1)
    {
        Complex temp = new Complex(0.0, 0.0);

        temp.real = n1.real;
        temp.imag = n1.imag;

        return(temp);
    }
}