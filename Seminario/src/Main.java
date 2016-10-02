import modelo.MatrizRotacionDerecha;
import modelo.MatrizRotacionIzquierda;
import modelo.MiVector;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prueba rotacion izquierda vector
		MatrizRotacionIzquierda mI = new MatrizRotacionIzquierda(2.0, 2.5, 1.5);
		System.out.println(mI.toString());
		
		MiVector vectorI = new MiVector(5.0, 5.0, 12.0);
		
		System.out.println(vectorI.toString());
		
		System.out.println(mI.rotarVector(vectorI).toString());
				
		//prueba de resta
		MiVector vectorA = new MiVector(5.0, 5.0, 12);
		MiVector vectorB = new MiVector(5.0, 6.0, 6.244997998);
		
		System.out.println(vectorA.restar(vectorB).toString());
		
		//Prueba rotacion derecha vector
		MatrizRotacionDerecha mD = new MatrizRotacionDerecha(1.5, 2.0, 2.5);
		System.out.println(mD.toString());
		
		MiVector vectorD = new MiVector(0.0, -1.0, 5.755002002);
		
		System.out.println(vectorD.toString());
		
		System.out.println(mD.rotarVector(vectorD).toString());
		
	}

}
