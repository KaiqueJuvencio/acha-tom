package br.com.achatom.model;

import java.util.List;

public class CampoHarmonicoModel {

	private String nomeCampoHarmonico;
	private String Do;
	private String Re;
	private String Mi;
	private String Fa;
	private String Sol;
	private String La;
	private String Si;

	public CampoHarmonicoModel(String nomeCampoHarmonico, List<String> notas) {
		this.nomeCampoHarmonico = nomeCampoHarmonico;
		montaCampo(notas);
	}

	public String getNomeCampoHarmonico() {
		return nomeCampoHarmonico;
	}

	public String getDo() {
		return Do;
	}

	public String getRe() {
		return Re;
	}

	public String getMi() {
		return Mi;
	}

	public String getFa() {
		return Fa;
	}

	public String getSol() {
		return Sol;
	}

	public String getLa() {
		return La;
	}

	public String getSi() {
		return Si;
	}

	@Override
	public String toString() {
		return "Campo de: " + nomeCampoHarmonico; // + " [Do=" + Do + ", Re=" + Re + ", Mi=" + Mi + ", Fa=" + Fa
		// + ", Sol=" + Sol + ", La=" + La + ", Si=" + Si + "]";
	}

	private void montaCampo(List<String> ListaDeNotas) {
		int i = 1;
		for (String nota : ListaDeNotas) {
			if (i == 1) {
				this.Do = nota;
			} else if (i == 2) {
				this.Re = nota;
			} else if (i == 3) {
				this.Mi = nota;
			} else if (i == 4) {
				this.Fa = nota;
			} else if (i == 5) {
				this.Sol = nota;
			} else if (i == 6) {
				this.La = nota;
			} else if (i == 7) {
				this.Si = nota;
			}
			i++;
		}
	}

}
