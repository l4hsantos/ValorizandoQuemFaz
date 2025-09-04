import java.util.ArrayList; // cria listas dinâmicas
import java.util.Arrays;    // cria listas fixas (Arrays.asList)
import java.util.List;      // interface de listas

public class Main {
    public static void main(String[] args) {

        // ======== EMENDAS DE BANCADA ========
        List<String> autores_bancada1 = Arrays.asList("Dep. Augusto Coutinho (SOLIDARI/PE)",
                "Dep. Carlos Veras (PT/PE)", "Dep. André Ferreira (PSC/PE)", "Dep. André de Paula (PSD/PE)",
                "Dep. Luciano Bivar (PSL/PE)", "Dep. Sebastião Oliveira (AVANTE/PE)", "Dep. Wolney Queiroz (PDT/PE)",
                "Dep. Renildo Calheiros (PCdoB/PE)", "Dep. Danilo Cabral (PSB/PE)", "Dep. Pastor Eurico (PATRIOTA/PE)",
                "Dep. Ossesio Silva (REPUBLIC/PE)", "Dep. Marília Arraes (PT/PE)", "Dep. Raul Henry (MDB/PE)",
                "Dep. Eduardo da Fonte (PP/PE)", "Dep. Felipe Carreras (PSB/PE)", "Dep. Túlio Gadêlha (PDT/PE)",
                "Dep. Gonzaga Patriota (PSB/PE)", "Dep. Silvio Costa Filho (REPUBLIC/PE)",
                "Dep. Daniel Coelho (CIDADANIA/PE)");

        List<String> convenio_bancada1 = Arrays.asList("Data: 07/01/2022", "Convenente: ESTADO DE PERNAMBUCO",
                "Objeto: CONCLUSÃO AS OBRAS DA BARRAGEM GATOS, NO MUNICÍPIO DE LAGOA DOS GATOS/PE",
                "Número: 892456", "Valor(R$): 56.993.048,52");

        List<String> documento_bancada1 = Arrays.asList("Data: 01/07/2021 - Documento: 2021NE000026 - Fase: EMPENHO",
                "Data: 01/07/2021 - Documento: 2021NE000025 - Fase: EMPENHO",
                "Data: 31/12/2021 - Documento: 2021NS005743 - Fase: LIQUIDAÇÃO",
                "Data: 31/12/2021 - Documento: 2021NE000140 - Fase: LIQUIDAÇÃO",
                "Data: 31/12/2021 - Documento: 2021NS005736 - Fase: LIQUIDAÇÃO",
                "Data: 14/02/2025 - Documento: 2025NS000387 - Fase: LIQUIDAÇÃO",
                "Data: 17/02/2025 - Documento: 2025OB000212 - Fase: PAGAMENTO");


        List<String> autores_bancada3 = Arrays.asList("Dep. André de Paula", "Dep. André Ferreira",
                "Dep. Augusto Coutinho", "Dep. Carlos Veras", "Dep. Daniel Coelho", "Dep. Danilo Cabral",
                "Dep. Eduardo da Fonte", "Dep. Felipe Carreras", "Dep. Fernando Coelho Filho", "Dep. Fernando Monteiro",
                "Dep. Fernando Rodolfo", "Dep. Gonzaga Patriota", "Dep. Luciano Bivar", "Dep. Marília Arraes",
                "Dep. Milton Coelho", "Dep. Ossesio Silva", "Dep. Pastor Eurico", "Dep. Raul Henry",
                "Dep. Renildo Calheiros", "Dep. Ricardo Teobaldo", "Dep. Sebastião Oliveira", "Dep. Silvio Costa Filho",
                "Dep. Tadeu Alencar", "Dep. Túlio Gadêlha", "Dep. Wolney Queiroz"); 
        List<String> convenio_bancada3 = Arrays.asList("NENHUM REGISTRO ENCONTRADO");

        List<String> documento_bancada3 = Arrays.asList("Data: 04/07/2023 - Documento: 2023NE463728 - Fase: EMPENHO",
                "Data: 04/07/2023 - Documento: 2023NE463730 - Fase: EMPENHO",
                "Data: 25/08/2023 - Documento: 2023NS054073 - Fase: LIQUIDAÇÃO",
                "Data: 28/08/2023 - Documento: 2023OB819540 - Fase: PAGAMENTO");

        emenda_bancada bancada1 = new emenda_bancada("202171180001", autores_bancada1, 2021, "GESTÃO AMBIENTAL",
                "PERNAMBUCO (UF)", 0.00f, 0.00f, 20225934.00f, convenio_bancada1, documento_bancada1);
        emenda_bancada bancada2 = new emenda_bancada("201971180001", autores_bancada1, 2019, "GESTÃO AMBIENTAL",
                "PERNAMBUCO/PE", 0.00f, 0.00f, 9963183.00f, convenio_bancada1, documento_bancada2);
        emenda_bancada bancada3 = new emenda_bancada("202371180001", autores_bancada3, 2023, "SAÚDE", "PERNAMBUCO (UF)",
                15746106.00f, 15746106.00f, 0.00f, convenio_bancada3, documento_bancada3);

        bancada1.ImprimeInfo();
        bancada2.ImprimeInfo();
        bancada3.ImprimeInfo();

        // ======== EMENDAS DE COMISSÃO ========
        List<String> autores_comissao1 = Arrays.asList("COM. AGRICULTURA PEC ABAST D. RURAL");
        List<String> autores_comissao2 = Arrays.asList("COM. ASSUNTOS ECONÔMICOS");
        List<String> autores_comissao3 = Arrays.asList("COM. DEFESA DO CONSUMIDOR");

        List<String> convenio_comissao1 = Arrays.asList(
                "Data: 04/07/2024 - Convenente: MUNICÍPIO DE ITUACU - Objeto: EXECUÇÃO DE OBRAS OU SERVIÇOS DE ENGENHARIA EM ESTRADAS VICINAIS NO MUNICÍPIO DE ITUACU",
                "Data: 12/07/2024 - Convenente: ASSOCIAÇÃO DOS TRABALHADORES AGROEXTRATIVISTAS - Objeto: PROJETO DE AQUISIÇÃO DE EQUIPAMENTOS");
        List<String> convenio_comissao2 = Arrays.asList("NENHUM REGISTRO ENCONTRADO");
        List<String> convenio_comissao3 = Arrays.asList("NENHUM REGISTRO ENCONTRADO");

        List<String> documento_comissao1 = Arrays.asList("Data: 13/05/2024 - Documento: 2024NE000623 - Fase: EMPENHO",
                "Data 30/05/2025 - Documento: 2025NS002603 - Fase: LIQUIDAÇÃO",
                "Data: 25/08/2025 - Documento: 2025OB000893 - Fase: PAGAMENTO");
        List<String> documento_comissao2 = Arrays.asList("Data: 08/07/2022 - Documento: 2022NS004179 - Fase: LIQUIDAÇÃO",
                "Data: 12/07/2022 - Documento: 2022OB801815 - Fase: PAGAMENTO",
                "Data: 19/12/2022 - Documento: 2022NE000427 - Fase: EMPENHO");
        List<String> documento_comissao3 = Arrays.asList("Data: 01/12/2023 - Documento: 2023NE000383 - Fase: EMPENHO",
                "Data: 19/01/2024 - Documento: 2024SN000925 - Fase: LIQUIDAÇÃO",
                "Data: 12/03/2024 - Documento: 2024OB000315 - Fase: PAGAMENTO");

        emenda_comissao comissao1 = new emenda_comissao("202450100001", autores_comissao1, 2024, "AGRICULTURA", "MÚLTIPLO",
                5063524.30f, 149999997.19f, 4312754.80f, convenio_comissao1, documento_comissao1);
        emenda_comissao comissao2 = new emenda_comissao("202260050003", autores_comissao2, 2022, "ADMINISTRAÇÃO",
                "NACIONAL", 2084197.00f, 1500000.00f, 2084197.00f, convenio_comissao2, documento_comissao2);
        emenda_comissao comissao3 = new emenda_comissao("202350130002", autores_comissao3, 2023, "DIREITOS DA CIDADANIA",
                "NACIONAL", 0.00f, 0.00f, 50000.00f, convenio_comissao3, documento_comissao3);

        comissao1.ImprimeInfo();
        comissao2.ImprimeInfo();
        comissao3.ImprimeInfo();

        // ===== EMENDA DE RELATOR =====

        List<String> autores_relator1 = Arrays.asList("RELATOR GERAL");
        List<String> autores_relator2 = Arrays.asList("S/I - SEM INFORMAÇÃO");
        List<String> autores_relator3 = Arrays.asList("S/I - SEM INFORMAÇÃO");

        List<String> documentos_relator1 = Arrays.asList(
"Data: 20/08/2020 - Documento: 2020NE440124 - Fase: EMPENHO",
"Data: 26/08/2020 - Documento: 2020NS004144 - Fase: LIQUIDAÇÃO",
"Data: 28/08/2020 - Documento: 2020OB801457 - Fase: PAGAMENTO");

        List<String> documentos_relator2 = Arrays.asList(
"Data: 02/04/2014 - Documento: 2014NE802287 - Fase: EMPENHO - Favorecido: MUNICIPIO DE MATA DE SAO JOAO");
        List<String> documentos_relator3 = Arrays.asList(
"Data: );

        List<String> convenio_relator1 = Arrays.asList("NENHUM REGISTRO ENCONTRADO");

        List<String> convenio_relator2 = Arrays.asList("NENHUM REGISTRO ENCONTRADO"
);

        List<String> convenio_relator3 = Arrays.asList("Data: 10/01/2011 - Convenente: MUNICIPIO DE SANTA JULIANA - Objeto: RECAPEAMENTO DE VIAS PÚBLICAS E CONSTRUÇÃO DE PASSEIOS NO MUNICIPIO",
"Data: 22/11/2012 - Convenete: MUNICIPIO DE CORIBE - Objeto: IMPLANTAÇÃO DA PRAÇA DA JUVENTUDE");

        emenda_relator relator1 = new emenda_relator("202081001490",autores_relator1, 2020,"AGRICULTURA", "IMPLANTAÇÃO DO PROJETO PÚBLICO DE IRRIGAÇÃO PONTAL","DESEN. REGIONAL, TERRITORIAL E URBANO", "PERNAMBUCO (UF)",3974422.50f, 8142967.79f, 3924468.67f,convenio_relator1,documento_relator1);
        emenda_relator relator2 = new emenda_relator("SEM INFORMAÇÃO",autores_relator2,2019,"EDUCAÇÃO","REESTRUTURAÇÃO DAS INSTITUIÇÕES FEDERAIS DE EDUCAÇÃO PROFISSIONAL, CIENTÍFICA E TECNOLOGICA","EDUCAÇÃO DE QUALIDADE PARA TODOS","PERNAMBUCO (UF)",0.00f,74652.00f,0.00f, convenio_relator2,documento_relator2);

        emenda_relator relator3 = new emenda_relator("SEM INFORMAÇÃO",autores_relator3,2016,"ASSISTÊNCIA SOCIAL","SERVIÇO DE PROTEÇÃO SOCIAL BÁSICA","CONSOLIDAÇÃO DO SISTEMA ÚNICO DE ASSISTÊNCIA SOCIAL (SUAS)","PERNAMBUCO (UF)",0.00f,9567800.00f,0.00f,convenio_relator3,documento_relator3);

        relator1.ImprimeInfo();
        relator2.ImprimeInfo();
        relator3.ImprimeInfo();

    }
}