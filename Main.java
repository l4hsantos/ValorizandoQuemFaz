import java.util.ArrayList; //esse cria o array de autores
import java.util.Arrays; //esse cria o new array
import java.util.List; //esse permite que a gente use array

public class Main {
	public static void main(String[] args) {
	List<String> autores_bancada1 = Arrays.asList("Dep. Augusto Coutinho (SOLIDARI/PE)","Dep. Carlos Veras (PT/PE)","Dep. André Ferreira (PSC/PE)","Dep. André de Paula (PSD/PE)","Dep. Luciano Bivar (PSL/PE)","Dep. Sebastião Oliveira (AVANTE/PE)","Dep. Wolney Queiroz (PDT/PE)","Dep. Renildo Calheiros (PCdoB/PE)","Dep. Danilo Cabral (PSB/PE)","Dep. Pastor Eurico (PATRIOTA/PE)","Dep. Ossesio Silva (REPUBLIC/PE)","Dep. Marília Arraes (PT/PE)","Dep. Raul Henry (MDB/PE)","Dep. Eduardo da Fonte (PP/PE)","Dep. Felipe Carreras (PSB/PE)","Dep. Túlio Gadêlha (PDT/PE)","Dep. Gonzaga Patriota (PSB/PE)","Dep. Silvio Costa Filho (REPUBLIC/PE)","Dep. Daniel Coelho (CIDADANIA/PE)");

	List<String> convenio_bancada1 = Arrays.asList("Data: 07/01/2022","Convenente: ESTADO DE PERNAMBUCO","Objeto: CONCLUSÃO AS OBRAS DA BARRAGEM GATOS, NO MUNICÍPIO DE LAGOA DOS GATOS/PE","Número: 892456","Valor(R$): 56.993.048,52");

	List<String> documento_bancada1 = Arrays.asList(
"Data: 01/07/2021 - Documento: 2021NE000026 - Fase: EMPENHO",
"Data: 01/07/2021 - Documento: 2021NE000025 - Fase: EMPENHO",
"Data: 31/12/2021 - Documento: 2021NS005743 - Fase: LIQUIDAÇÃO",
"Data: 31/12/2021 - Documento: 2021NE000140 - Fase: LIQUIDAÇÃO",
"Data: 31/12/2021 - Documento: 2021NS005736 - Fase: LIQUIDAÇÃO",
"Data: 14/02/2025 - Documento: 2025NS000387 - Fase: LIQUIDAÇÃO",
"Data: 17/02/2025 - Documento: 2025OB000212 - Fase: PAGAMENTO");

	List<String> autores_bancada2 = Arrays.asList("Sen. Armando Monteiro","Sen. Humberto Costa","Sen. Fernando Bezerra Coelho","Dep. Adalberto Cavalcanti","Dep. André de Paula","Dep. Augusto Coutinho","Dep. Betinho Gomes","Dep. Bruno Araújo","Dep. Daniel Coelho",
"Dep. Danilo Cabral","Dep. Eduardo da Fonte","Dep. Felipe Carreras",
"Dep. Fernando Coelho Filho","Dep. Gonzaga Patriota","Dep. Jarbas Vasconcelos","Dep. João Fernando Coutinho","Dep. Jorge Côrte Real",
"Dep. Kaio Maniçoba","Dep. Luciana Santos","Dep. Marinaldo Rosendo",
"Dep. Mendonça Filho","Dep. Pastor Eurico","Dep. Ricardo Teobaldo",
"Dep. Sebastião Oliveira","Dep. Silvio Costa","Dep. Tadeu Alencar",
"Dep. Wolney Queiroz","Dep. Zeca Cavalcanti");

	List<String> documento_bancada2 = Arrays.asList(
"Data: 19/12/2019 - Documento: 2019NE800121",
"Data: 31/12/2019 - Documento: 2019NS005753 - Fase: EMPENHO",
"Data: 30/06/2021 - Documento: 2021NS002440 - Fase: LIQUIDAÇÃO",
"Data: 21/12/2021 - Documento: 2021NL800056 - Fase: LIQUIDAÇÃO ",
"Data: 30/12/2022 - Documento: 2022NS003577 - Fase: LIQUIDAÇÃO",
"Data: 14/02/2025 - Documento: 2025NS000387 - Fase: LIQUIDAÇÃO",
"Data: 17/02/2025 - Documento: 2025OB000212 - Fase: PAGAMENTO");

	List<String> convenio_bancada2 = Arrays.asList("Data: 07/01/2020","Convenente: ESTADO DE PERNAMBUCO","Objeto: PREVENÇÃO A EROSÃO COSTEIRA EM ÁREAS URBANIZADAS","Número: 542986","Valor (R$): 48.525.699,30");

	emenda_bancada bancada1 = new emenda_bancada("202171180001", autores_bancada1, 2021, "GESTÃO AMBIENTAL","PERNAMBUCO (UF)", 0.00f, 0.00f, 20225934.00f, convenio_bancada1, documento_bancada1);

	emenda_bancada bancada2 = new emenda_bancada("201971180001",autores_bancada2, 2019, "GESTÃO AMBIENTAL", "PERNAMBUCO/PE", 0.00f, 0.00f, 9963183.00f, convenio_bancada2, documento_bancada2);

bancada1.ImprimeInfo();
bancada2.ImprimeInfo();
bancada3.ImprimeInfo();
	}

}
