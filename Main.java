import java.util.ArrayList; //esse cria o array de autores
import java.util.Arrays; //esse cria o new array
import java.util.List; //esse permite que a gente use array

public class Main {
	public static void main(String[] args) {
	List<String> autores_bancada1 = Arrays.asList("Dep. Augusto Coutinho (SOLIDARI/PE)","Dep. Carlos Veras (PT/PE)","Dep. André Ferreira (PSC/PE)","Dep. André de Paula (PSD/PE)","Dep. Luciano Bivar (PSL/PE)","Dep. Sebastião Oliveira (AVANTE/PE)","Dep. Wolney Queiroz (PDT/PE)","Dep. Renildo Calheiros (PCdoB/PE)","Dep. Danilo Cabral (PSB/PE)","Dep. Pastor Eurico (PATRIOTA/PE)","Dep. Ossesio Silva (REPUBLIC/PE)","Dep. Marília Arraes (PT/PE)","Dep. Raul Henry (MDB/PE)","Dep. Eduardo da Fonte (PP/PE)","Dep. Felipe Carreras (PSB/PE)","Dep. Túlio Gadêlha (PDT/PE)","Dep. Gonzaga Patriota (PSB/PE)","Dep. Silvio Costa Filho (REPUBLIC/PE)","Dep. Daniel Coelho (CIDADANIA/PE)");

	List<String> convenio_bancada1 = Arrays.asList("Data: 07/01/2022","Convenente: ESTADO DE PERNAMBUCO","Objetivo: CONCLUSÃO AS OBRAS DA BARRAGEM GATOS, NO MUNICÍPIO DE LAGOA DOS GATOS/PE","Número: 892456","Valor(R$): 56.993.048,52");

	List<String> documento_bancada1 = Arrays.asList("Data: 01/07/2021 - Documento: 2021NE000026","Data: 01/07/2021 - Documento: 2021NE000025","Data: 31/12/2021 - Documento: 2021NS005743","Data: 31/12/2021 - Documento: 2021NE000140","Data: 31/12/2021 - Documento: 2021NS005736","Data: 14/02/2025 - Documento: 2025NS000387","Data: 17/02/2025 - Documento: 2025OB000212");

	emenda_bancada bancada1 = new emenda_bancada("202171180001", autores_bancada1, 2021, "GESTÃO AMBIENTAL","PERNAMBUCO (UF)", 0.00f, 0.00f, 20225934.00f, convenio_bancada1, documento_bancada1);

bancada1.ImprimeInfo();
	}

}
