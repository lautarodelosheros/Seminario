package modelo;

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
	
	
	public ResultadoError(
			double betaIzq, 
			double gammaIzq,
			double alfaDer,
			double betaDer,
			double gammaDer,
			double anguloYDer,
			double anguloXDer,
			double anguloZDer,
			double anguloXIzq,
			double anguloYIzq,
			double anguloZIzq
			) {
		// TODO Auto-generated constructor stub
		this.betaDer = betaDer;
		this.gammaDer = gammaDer;
		this.alfaDer = alfaDer;
		this.betaIzq = betaIzq;
		this.gammaIzq = gammaIzq;
		this.anguloYDerOriginal = anguloYDer;
		this.anguloXDerOriginal = anguloXDer;
		this.anguloZDerOriginal = anguloZDer;
		this.anguloXIzqOriginal = anguloXIzq;
		this.anguloYIzqOriginal = anguloYIzq;
		this.anguloZIzqOriginal = anguloZIzq;
	}
	
	public void calcularAngulos() {
		this.anguloXDer = convertirAGrados(Math.asin(-this.alfaDer));
		this.anguloYDer = convertirAGrados(Math.asin(-this.betaDer / Math.cos(Math.asin(-this.alfaDer))));
		this.anguloZDer = convertirAGrados(Math.asin(-this.gammaDer / Math.cos(Math.asin(-this.alfaDer))));
		
		this.anguloXIzq = convertirAGrados(Math.acos(1 / Math.cos(Math.asin(-this.gammaIzq))));
		this.anguloYIzq = convertirAGrados(Math.asin(-this.betaIzq / Math.cos(Math.asin(-this.gammaIzq))));
		this.anguloZIzq = convertirAGrados(Math.asin(-this.gammaIzq));
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
	
	public double getErrorAnguloYDer() {
		return anguloYDer - this.anguloYDerOriginal;
	}

	public double getErrorAnguloXDer() {
		return anguloXDer - this.anguloXDerOriginal;
	}

	public double getErrorAnguloZDer() {
		return anguloZDer - this.anguloZDerOriginal;
	}

	public double getErrorAnguloXIzq() {
		return anguloXIzq - this.anguloXIzqOriginal;
	}

	public double getErrorAnguloYIzq() {
		return anguloYIzq - this.anguloYIzqOriginal;
	}

	public double getErrorAnguloZIzq() {
		return anguloZIzq - this.anguloZIzqOriginal;
	}
	
}
