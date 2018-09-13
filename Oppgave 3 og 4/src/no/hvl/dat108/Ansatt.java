package no.hvl.dat108;

import java.util.function.Function;

/**
 * A class that holds information about a employee
 * @author Gruppe 5
 * @version 1.0.0 The finalest final version
 */
public class Ansatt {

	private String fornavn;
	private String etternavn;
	private String kjonn;
	private String stilling;
	private int aarslonn;

	/**
	 * Constructs a new employee
	 *
	 * @param fornavn first name of employee
	 * @param etternavn last name of employee
	 * @param kjonn sex of employee
	 * @param stilling working position of employee
	 * @param aarslonn yearly income
	 */
	public Ansatt(String fornavn, String etternavn, String kjonn, String stilling, int aarslonn) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.kjonn = kjonn;
		this.stilling = stilling;
		this.aarslonn = aarslonn;
	}

	/**
	 *changes the yearly income of employee
	 * @param lonn lambda function to be applied to aarslonn
	 */
	public void endreLonn(Function <Integer, Integer> lonn)  {
		this.aarslonn = lonn.apply(this.aarslonn);
	}

	/**
	 * String representation of employee
	 *
	 * @return a string representation of employee
	 */
		@Override
	public String toString() {
		return String.format("Ansatt : %s %s Kjønn: \"%s\" Stilling : \"%s\" Lønn: \"%d\"", fornavn, etternavn, kjonn, stilling, aarslonn);
	}

	/**
	 * returns the first name of employee
	 *
	 * @return the first name of employee
	 */
	public String getFornavn() {
		return fornavn;
	}

	/**
	 * returns the last name of emplyee
	 *
	 * @return the last name of emplyee
	 */
	public String getEtternavn() {
		return etternavn;
	}

	/**
	 *returns sex of the employee
	 *
	 * @return sex of the employee
	 */
	public String getKjonn() {
		return kjonn;
	}

	/**
	 * returns working position of employee
	 *
	 * @return working position of employee
	 */
	public String getStilling() {
		return stilling;
	}

	/**
	 * returns yearly salary of employee
	 *
	 * @return yearly salary of employee
	 */
	public int getAarslonn() {
		return aarslonn;
	}
}
