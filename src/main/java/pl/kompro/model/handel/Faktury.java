package pl.kompro.model.handel;

import java.io.Serializable;
import java.util.EnumSet;
import java.util.List;

public interface Faktury {
	public KryteriaFaktury odbKryteriaFaktury();

	
	
	public interface KryteriaFaktury {//extends Serializable{

		public void wstPlatnika( long platnik);

		public List<Faktura> odbFaktury();
		public EnumSet<ZakresFaktur> odbZakresFaktur();

		enum ZakresFaktur{
			FS_PODSTAWOWE,
			FS_POZOSTALE;
		}
	}
}
