package no.hvl.dat108;

import java.util.function.Function;


public class Ansatt {

	private String fornavn;
	private String etternavn;
	private String kjonn;
	private String stilling;
	private int aarslonn;

	public Ansatt(String fornavn, String etternavn, String kjonn, String stilling, int aarslonn) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.kjonn = kjonn;
		this.stilling = stilling;
		this.aarslonn = aarslonn;
	}

	public void endreLonn(Function <Integer, Integer> foo)  {
		this.aarslonn = foo.apply(this.aarslonn);
	}

		@Override
	public String toString() {
		return String.format("Ansatt : %s %s Kjønn: \"%s\" Stilling : \"%s\" Lønn: \"%d\"", fornavn, etternavn, kjonn, stilling, aarslonn);
	}

	public String getFornavn() {
		return fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public String getKjonn() {
		return kjonn;
	}

	public String getStilling() {
		return stilling;
	}

	public int getAarslonn() {
		return aarslonn;
	}
}
