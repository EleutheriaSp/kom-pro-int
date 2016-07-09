package pl.kompro.model.handel;

import java.io.Serializable;

public interface Faktura extends Serializable{ // serializacja wymagana przez zdalne klienty

	public long getId();
	public String getNumer();
}
