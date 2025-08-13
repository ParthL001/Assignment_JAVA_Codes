public class complex {
	public double real ;
	public double imag ;
	public complex() {
		this.real = 0 ;
		this.imag = 0 ;
	}
	public complex(double real , double imag) {
		this.real = real ;
		this.imag =imag ;
	}
	public complex add(complex c2){
		double realadd = this.real + c2.real ;
		double imagadd = this.imag + c2.imag ;
		return new complex(realadd , imagadd);
	}
	public complex sub(complex c2){
		double realsub = this.real - c2.real ;
		double imagsub = this.imag - c2.imag ;
		return new complex(realsub , imagsub);
	}
	public complex mul(complex c2){
		double realmul = (this.real * c2.real) - (this.imag * c2.imag) ;
		double imagmul = (this.real * c2.imag) + (this.imag* c2.real ) ;
		return new complex(realmul , imagmul);
	}
	public complex div(complex c2){
		double realdiv = ( (this.real * c2.real) + (this.imag * c2.imag) ) / ( (c2.real * c2.real) + (c2.imag * c2.imag) );
		double imagdiv = ( (this.imag * c2.real) - (this.real * c2.imag) ) / ( (c2.real * c2.real) + (c2.imag * c2.imag) ) ;
		return new complex(realdiv , imagdiv);
	}
	@Override
	public String toString() {
		return real + " + " + imag + "i" ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		complex c1 = new complex(4 , 9) ;
		complex c2 = new complex(2 , 3) ;
		System.out.println("1st Number c1 is  " + c1) ;
		System.out.println("2nd Number c2 is  " + c2) ;
		System.out.println(" ADDITION        = " + c1.add(c2)) ;
		System.out.println(" SUBSTRACTION    = " + c1.sub(c2)) ;
		System.out.println(" MULTIPLICATION  = " + c1.mul(c2)) ;
		System.out.println(" DIVIDION        = " + c1.div(c2)) ;
	}

}