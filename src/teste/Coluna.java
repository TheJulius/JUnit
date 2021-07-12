package teste;

public class Coluna {
	
	private String nomeCampo;
	private boolean notNull;
	private boolean autoIncrement;
	private String tipo;
	
	public Coluna(String nomeCampo, boolean notNull, boolean autoIncrement, String tipo) {
		super();
		setNomeCampo(nomeCampo);
		setNotNull(notNull);
		setAutoIncrement(autoIncrement);
		setTipo(tipo);
	}
	
	public Coluna(String nomeCampo, boolean notNull, String tipo) {
		super();
		setNomeCampo(nomeCampo);
		setNotNull(notNull);
		setAutoIncrement(false);
		setTipo(tipo);
	}
	
	public Coluna(String nomeCampo, String tipo, boolean autoIncrement) {
		super();
		setNomeCampo(nomeCampo);
		setNotNull(false);
		setAutoIncrement(autoIncrement);
		setTipo(tipo);
	}
	
	public Coluna(String nomeCampo, String tipo) {
		super();
		setNomeCampo(nomeCampo);
		setTipo(tipo);
	}
	
	public String getNomeCampo() {
		return nomeCampo;
	}
	public void setNomeCampo(String nomeCampo) {
		if(nomeCampo.length() > 0)
			this.nomeCampo = nomeCampo;
	}
	public boolean isNotNull() {
		return notNull;
	}
	public void setNotNull(boolean notNull) {
		this.notNull = notNull;
	}
	public boolean isAutoIncrement() {
		return autoIncrement;
	}
	public void setAutoIncrement(boolean autoIncrement) {
		this.autoIncrement = autoIncrement;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		if(tipo.length() > 0)
			this.tipo = tipo.toUpperCase();
	}
	
	public String geraNotNull() {
		
		if(isNotNull() == true) {
			return "NOT NULL ";
		}
		return "";	
	}
	
	public String geraAutoIncrement() {
		
		if(isAutoIncrement() == true) {
			return "AUTO_INCREMENT";
		} else {
			return "";	
		}	
	}
	
	public String geraCampo() {
		return "'"+getNomeCampo()+"' "
				  +getTipo()+" "
				  +geraNotNull()
				  +geraAutoIncrement();
	}

}
