package Figurasgeometricas1;

public class Figuras {
	private int base;
	private int altura;

	public Figuras() {

	}

	public Figuras(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public void areaPerimetroCuadrado(int base) {
		int area, perimetro;
		area = base*base;
		perimetro = base*4;
		
		System.out.println("El area del cuadrado es: " + area + "El perimetro es: "+ perimetro);
		
	}
	
	public void areaPerimetroRectangulo(int base, int altura) {
		int area, perimetro;
		area = base*altura;
		perimetro = base*2 + altura*2;
		
		System.out.println("El area del rectangulo es: " + area + "El perimetro es: "+ perimetro);
		
	}

}
