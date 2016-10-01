import modelo.MatrizRotacionDerecha;
import modelo.MatrizRotacionIzquierda;
import modelo.MiVector;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrizRotacionIzquierda mI = new MatrizRotacionIzquierda(2.0, 1.5, 2.5);
		mI.printMatrizRotacion();
		
		MiVector vectorI = new MiVector(5.0, 5.0, 12.0);
		
		vectorI.imprimir();
		
		mI.rotarVector(vectorI).imprimir();
		
		MatrizRotacionDerecha mD = new MatrizRotacionDerecha(1.5, 2.0, 2.5);
		mD.printMatrizRotacion();
		
		MiVector vectorD = new MiVector(0.0, -1.0, 5.755002002);
		
		vectorD.imprimir();
		
		mD.rotarVector(vectorD).imprimir();
		
	}

}
