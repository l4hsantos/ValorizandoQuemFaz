import java.util.List;

public class emenda_relator {
    private String codigo;
    private List<String> autores;
    private int ano_emenda;
    private String area_atuacao;
			private String acao;
			private String programa;
    private String localidade;
    private float valor_liquidado;
    private float valor_pago;
    private float valor_empenho;
    private List<String> convenio;
    private List<String> documentos;


    public emenda_relator(String codigo, List<String> autores, int ano_emenda, String area_atuacao, String acao, String programa, String localidade, float valor_liquidado, float valor_pago, float valor_empenho, List<String> convenio, List<String> documentos) {
        this.codigo = codigo;
        this.autores = autores;
        this.ano_emenda = ano_emenda;
        this.area_atuacao = area_atuacao;
	this.acao = acao;
	this.programa = programa;
        this.localidade = localidade;
        this.valor_liquidado = valor_liquidado;
        this.valor_pago = valor_pago;
        this.valor_empenho = valor_empenho;
        this.convenio = convenio;
        this.documentos = documentos;

    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public List<String> getAutores() { return autores; }
    public void setAutores(List<String> autores) { this.autores = autores; }
    public int getAno_emenda() { return ano_emenda; }
    public void setAno_emenda(int ano_emenda) { this.ano_emenda = ano_emenda; }
    public String getArea_atuacao() { return area_atuacao; }
    public void setArea_atuacao(String area_atuacao) { this.area_atuacao = area_atuacao; }
			public String getAcao() { return acao; }
			public void setAcao(String acao) { this.acao = acao; }
			public String getPrograma() { return programa; }
			public void setPrograma(String programa) { this.programa = programa; }
    public String getLocalidade() { return localidade; }
    public void setLocalidade(String localidade) { this.localidade = localidade; }
    public float getValor_liquidado() { return valor_liquidado; }
    public void setValor_liquidado(float valor_liquidado) { this.valor_liquidado = valor_liquidado; }
    public float getValor_pago() { return valor_pago; }
    public void setValor_pago(float valor_pago) { this.valor_pago = valor_pago; }
    public float getValor_empenho() { return valor_empenho; }
    public void setValor_empenho(float valor_empenho) { this.valor_empenho = valor_empenho; }
    public float getValor_total() { return valor_liquidado + valor_pago + valor_empenho; }
    public List<String> getConvenio() { return convenio; }
    public void setConvenio(List<String> convenio) { this.convenio = convenio; }
    public List<String> getDocumentos() { return documentos; }
    public void setDocumentos(List<String> documentos) { this.documentos = documentos; }


    public void ImprimeInfo() {
        System.out.println("--- EMENDA DE RELATOR ---");
        System.out.println("Código: " + codigo);
        System.out.println("Autores: " + autores);
        System.out.println("Ano: " + ano_emenda);
        System.out.println("Área de atuação: " + area_atuacao);
						System.out.println("Ação: " + acao);
						System.out.println("Programa: " + programa);
        System.out.println("Localidade: " + localidade);
        System.out.println("Valor liquidado: R$" + valor_liquidado);
        System.out.println("Valor pago: R$" + valor_pago);
        System.out.println("Valor empenhado: R$" + valor_empenho);
        System.out.println("Valor total: R$" + getValor_total());
        System.out.println("Convênio: " + convenio);
        System.out.println("Documentos: " + documentos);

    }
}