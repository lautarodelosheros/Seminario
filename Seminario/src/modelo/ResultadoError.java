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
		this.betaDer = betaDer;
		this.gammaDer = gammaDer;
		this.alfaDer = alfaDer;
		this.betaIzq = betaIzq;
		this.gammaIzq = gammaIzq;
		this.MatrizRi = MatrizRi;
		this.MatrizRd = MatrizRd;
	}
	
	public void calcularAngulos() {
		this.anguloXDer = this.alfaDer;
		this.anguloYDer = this.betaDer;
		this.anguloZDer = this.gammaDer;
		
		this.anguloXIzq = 0.0;
		this.anguloYIzq = this.betaIzq;
		this.anguloZIzq = this.gammaIzq;
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
		if (anguloXDer == 0)
			return anguloXDer; 
		return ((anguloXDer - this.MatrizRd.get(2, 1)) / anguloXDer) * 100;
	}
	
	public double getErrorAnguloYDer() {
		if (anguloYDer == 0)
			return anguloYDer;
		return ((anguloYDer - this.MatrizRd.get(0, 2)) / anguloYDer) * 100;
	}

	public double getErrorAnguloZDer() {
		if (anguloZDer == 0)
			return anguloZDer;
		return ((anguloZDer - this.MatrizRd.get(1, 0)) / anguloZDer) * 100;
	}

	public double getErrorAnguloXIzq() {
		return anguloXIzq - 0;
	}

	public double getErrorAnguloYIzq() {
		if (anguloYIzq == 0)
			return anguloYIzq;
		return ((anguloYIzq - this.MatrizRi.get(0, 2)) / anguloYIzq) * 100;
	}

	public double getErrorAnguloZIzq() {
		if (anguloZIzq == 0)
			return anguloZIzq;
		return ((anguloZIzq - this.MatrizRi.get(1, 0)) / anguloZIzq) * 100;
	}
	
}
