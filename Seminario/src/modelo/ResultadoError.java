package modelo;

import org.ejml.simple.SimpleMatrix;

public class ResultadoError {
	private double betaIzq; 
	private double gammaIzq;
	private double alfaDer;
	private double betaDer;
	private double gammaDer;
	private double anguloYDer;
	private double anguloXDer;
	private double anguloZDer;
	private double anguloXIzq;
	private double anguloYIzq;
	private double anguloZIzq;
	private double anguloYDerOriginal;
	private double anguloXDerOriginal;
	private double anguloZDerOriginal;
	private double anguloXIzqOriginal;
	private double anguloYIzqOriginal;
	private double anguloZIzqOriginal;
	private SimpleMatrix MatrizRi;
	private SimpleMatrix MatrizRd;
	
	
	public ResultadoError(
			double betaIzq, 
			double gammaIzq,
			double alfaDer,
			double betaDer,
			double gammaDer,
			SimpleMatrix MatrizRi,
			SimpleMatrix MatrizRd
			) {
		// TODO Auto-generated constructor stub
		this.betaDer = betaDer;
		this.gammaDer = gammaDer;
		this.alfaDer = alfaDer;
		this.betaIzq = betaIzq;
		this.gammaIzq = gammaIzq;
		/*this.anguloYDerOriginal = anguloYDer;
		this.anguloXDerOriginal = anguloXDer;
		this.anguloZDerOriginal = anguloZDer;
		this.anguloXIzqOriginal = anguloXIzq;
		this.anguloYIzqOriginal = anguloYIzq;
		this.anguloZIzqOriginal = anguloZIzq;*/
		this.MatrizRi = MatrizRi;
		this.MatrizRd = MatrizRd;
	}
	
	public void calcularAngulos() {
		/*this.anguloXDer = convertirAGrados(Math.asin(-this.alfaDer));
		this.anguloYDer = convertirAGrados(Math.asin(-this.betaDer / Math.cos(Math.asin(-this.alfaDer))));
		this.anguloZDer = convertirAGrados(Math.asin(-this.gammaDer / Math.cos(Math.asin(-this.alfaDer))));
		
		this.anguloXIzq = convertirAGrados(Math.acos(1 / Math.cos(Math.asin(-this.gammaIzq))));
		this.anguloYIzq = convertirAGrados(Math.asin(-this.betaIzq / Math.cos(Math.asin(-this.gammaIzq))));
		this.anguloZIzq = convertirAGrados(Math.asin(-this.gammaIzq));*/
		
		this.anguloXDer = convertirAGrados(this.alfaDer);
		this.anguloYDer = convertirAGrados(this.betaDer);
		this.anguloZDer = convertirAGrados(this.gammaDer);
		
		this.anguloXIzq = convertirAGrados(0.0);
		this.anguloYIzq = convertirAGrados(this.betaIzq);
		this.anguloZIzq = convertirAGrados(this.gammaIzq);
	}
	
	private double convertirAGrados(double angulo) {
		return (angulo * 180) / Math.PI;
	}

	public double getAnguloYDer() {
		return anguloYDer;
	}

	public double getAnguloXDer() {
		return anguloXDer;
	}

	public double getAnguloZDer() {
		return anguloZDer;
	}

	public double getAnguloXIzq() {
		return anguloXIzq;
	}

	public double getAnguloYIzq() {
		return anguloYIzq;
	}

	public double getAnguloZIzq() {
		return anguloZIzq;
	}
	
	public double getErrorAnguloXDer() {
		return ((anguloXDer - this.MatrizRd.get(2, 1)) / anguloXDer) * 100;
	}
	
	public double getErrorAnguloYDer() {
		return ((anguloYDer - this.MatrizRd.get(0, 2)) / anguloYDer) * 100;
	}

	public double getErrorAnguloZDer() {
		return ((anguloZDer - this.MatrizRd.get(1, 0)) / anguloZDer) * 100;
	}

	public double getErrorAnguloXIzq() {
		return anguloXIzq - 0;
	}

	public double getErrorAnguloYIzq() {
		return ((anguloYIzq - this.MatrizRi.get(0, 2)) / anguloYIzq) * 100;
	}

	public double getErrorAnguloZIzq() {
		return ((anguloZIzq - this.MatrizRi.get(1, 0)) / anguloZIzq) * 100;
	}
	
}
