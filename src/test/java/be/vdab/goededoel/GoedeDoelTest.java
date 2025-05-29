package be.vdab.goededoel;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GoedeDoelTest {
	private static final String NAAM = "CliniClowns";
	private GoedeDoel doel;

	@BeforeEach
	void beforeEach() {
		doel = new GoedeDoel(NAAM);
	}

	@Test
	void getNaam() {
		assertThat(doel.getNaam()).isEqualTo(NAAM);
	}

	@Test
	void eenNieuwDoelHeeftNogGeenOpbrengst() {
		assertThat(doel.getOpbrengst()).isZero();
	}

	@Test
	void doelenMetDezelfdeNamenZijnGelijk() {
		assertThat(doel).isEqualTo(new GoedeDoel(NAAM));
	}

	@Test
	void doelenMetVerschillendeNamenZijnVerschillend() {
		assertThat(doel).isNotEqualTo(new GoedeDoel("CliniClowns2"));
	}

	@Test
	void doelVerschiltVanObjectMetAnderType() {
		assertThat(doel).isNotEqualTo("Gewoon een String, niet een object met het type GoedeDoel!");
	}

}
