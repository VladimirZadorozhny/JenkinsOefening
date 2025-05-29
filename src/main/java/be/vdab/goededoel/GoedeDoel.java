package be.vdab.goededoel;

import java.math.BigDecimal;

/**
 * Een <strong>goed doel</strong> waarvoor men geld inzamelt
 * @author John Dalton
 */
public class GoedeDoel {

	private final String naam;
	private BigDecimal opbrengst = BigDecimal.ZERO;

	/**
	 * Maakt een GoedeDoel object
	 * @param naam De naam van het goede doel
	 */

	public GoedeDoel(String naam) {
		this.naam = naam;
	}

	/**
	 * Geeft de naam terug
	 * @return De naam van het goede doel
	 */
	public String getNaam() {
		return naam;
	}


	public void setOpbrengst(BigDecimal opbrengst) {
		this.opbrengst = opbrengst;
	}

	/**
	 * Geeft de opbrengst terug
	 * @return De opbrengst van het goede doel
	 */
	public BigDecimal getOpbrengst() {
		return opbrengst;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof GoedeDoel ander && naam.equalsIgnoreCase(ander.naam);
	}

	@Override
	public int hashCode() {
		return this.naam.toUpperCase().hashCode();
	}
}
