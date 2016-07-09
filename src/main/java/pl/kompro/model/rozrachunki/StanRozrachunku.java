package pl.kompro.model.rozrachunki;

public enum StanRozrachunku {
	Tworzony( 0),
	Zatwierdzony( 10),
	Anulowany( 20);
	
	public final int id;
	
	StanRozrachunku( int stan){
		this.id= stan;
	}
}
