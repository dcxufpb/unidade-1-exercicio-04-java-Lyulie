package com.example.project;

public class CupomFiscal {

	public static String NOME_LOJA = "Arcos Dourados Com. de Alimentos LTDA";
	public static String LOGRADOURO = "Av. Projetada Leste";
	public static int NUMERO = 500;
	public static String COMPLEMENTO = "EUC F32/33/34";
	public static String BAIRRO = "Br. Sta Genebra";
	public static String MUNICIPIO = "Campinas";
	public static String ESTADO = "SP";
	public static String CEP = "13080-395";
	public static String TELEFONE = "(19) 3756-7408";
	public static String OBSERVACAO = "Loja 1317 (PDP)";
	public static String CNPJ = "42.591.651/0797-34";
	public static String INSCRICAO_ESTADUAL = "244.898.500.113";

	public static void imprimir_dados(){
		if(NOME_LOJA.isEmpty()) {
			System.out.printf("O campo nome da loja é obrigatório");
			return;
		}

		if (LOGRADOURO.isEmpty()) {
			System.out.printf("O campo logradouro do endereço é obrigatório");
			return;
		}

		String _logradouro = LOGRADOURO + ", ";
		String _numero = NUMERO <= 0? "s/n" : String.format("%d", NUMERO);
		String _complemento = " " + COMPLEMENTO;
		String _bairro = BAIRRO.isEmpty()? "" : BAIRRO + " - ";

		if(MUNICIPIO.isEmpty()) {
			throw new RuntimeException("O campo município do endereço é obrigatório");
		}

		String _municipio = MUNICIPIO + " - ";

		if(ESTADO.isEmpty()) {
			throw new RuntimeException("O campo estado do endereço é obrigatório");
		}

		String _cep = CEP.isEmpty()? "" : "CEP:" + CEP;
		String _telefone = TELEFONE.isEmpty()? "" : "Tel " + TELEFONE;
		_telefone = !_cep.isEmpty() && !_telefone.isEmpty()? " " + _telefone : _telefone;
		
		if (CNPJ.isEmpty()) {
			throw new RuntimeException("O campo CNPJ da loja é obrigatório");
		}

		String _cnpj = "CNPJ: " + CNPJ;
		
		if (INSCRICAO_ESTADUAL.isEmpty()) {
			throw new RuntimeException("O campo inscrição estadual da loja é obrigatório");
		}

		String _incricao_estadual = "IE: " + INSCRICAO_ESTADUAL;

		System.out.println((NOME_LOJA + "\n" +
			   _logradouro + _numero + _complemento + "\n" +
			   _bairro + _municipio + ESTADO + "\n" +
			   _cep + _telefone + "\n" +
			   OBSERVACAO + "\n" +
			   _cnpj + "\n" +
			   _incricao_estadual).replace("\n", System.lineSeparator()));
			   
	}
	
	public static void main(final String[] args) {
		imprimir_dados();
	}

}
