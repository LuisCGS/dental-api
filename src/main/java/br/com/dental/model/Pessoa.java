package br.com.dental.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.dental.model.enumeration.CorEnum;
import br.com.dental.model.enumeration.EstadoCivilEnum;
import br.com.dental.model.enumeration.SexoEnum;

public class Pessoa extends Generico{
	@NotNull(message="Por favor, informe a matrícula")
	private String matricula;
	
	@Size(min=3, message="Por favor, informe um nome de rua com mais de 2 caracteres!")
	private String nome;
	
	@NotNull(message="Por favor, informe a data de nascimento.")
	private Date dataNascimento;
	
	@NotNull(message="Por favor, informe o sexo.")
	private SexoEnum sexoEnum;
	
	@NotNull(message="Por favor, informe a cor.")
	private CorEnum corEnum;
	
	@NotNull(message="Por favor, informe o estado civil.")
	private EstadoCivilEnum estadoCivilEnum;
	
	@NotNull(message="Por favor, informe a profissão.")
	private String profissao;
	
	@NotNull(message="Por favor, informe o concílio ou a residência")
	private String residencia;
	
	@NotNull(message="Por favor, informe o documento de identificacao")
	private String documentoIdentificacao;
	
	@NotNull(message="Por favor, informe o campo eleitor")
	private Boolean eleitor;
	
	@NotNull(message="Por favor, informe a filiação, profissão e residência")
	private String filiacaoProfissaoResidencia;
	
	@NotNull(message="Por favor, informe o local de falecimento")
	private String localFalecimento;
	
	private String cartorioCasamento;
	private String nomeConjuge;
	private String declarante;
	private String observacoes;
	
	
	public Pessoa() {
		super();
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public SexoEnum getSexoEnum() {
		return sexoEnum;
	}
	public void setSexoEnum(SexoEnum sexoEnum) {
		this.sexoEnum = sexoEnum;
	}
	public CorEnum getCorEnum() {
		return corEnum;
	}
	public void setCorEnum(CorEnum corEnum) {
		this.corEnum = corEnum;
	}
	public EstadoCivilEnum getEstadoCivilEnum() {
		return estadoCivilEnum;
	}
	public void setEstadoCivilEnum(EstadoCivilEnum estadoCivilEnum) {
		this.estadoCivilEnum = estadoCivilEnum;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getResidencia() {
		return residencia;
	}
	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}
	public String getDocumentoIdentificacao() {
		return documentoIdentificacao;
	}
	public void setDocumentoIdentificacao(String documentoIdentificacao) {
		this.documentoIdentificacao = documentoIdentificacao;
	}
	public Boolean getEleitor() {
		return eleitor;
	}
	public void setEleitor(Boolean eleitor) {
		this.eleitor = eleitor;
	}
	public String getFiliacaoProfissaoResidencia() {
		return filiacaoProfissaoResidencia;
	}
	public void setFiliacaoProfissaoResidencia(String filiacaoProfissaoResidencia) {
		this.filiacaoProfissaoResidencia = filiacaoProfissaoResidencia;
	}
	public String getLocalFalecimento() {
		return localFalecimento;
	}
	public void setLocalFalecimento(String localFalecimento) {
		this.localFalecimento = localFalecimento;
	}
	public String getCartorioCasamento() {
		return cartorioCasamento;
	}
	public void setCartorioCasamento(String cartorioCasamento) {
		this.cartorioCasamento = cartorioCasamento;
	}
	public String getNomeConjuge() {
		return nomeConjuge;
	}
	public void setNomeConjuge(String nomeConjuge) {
		this.nomeConjuge = nomeConjuge;
	}
	public String getDeclarante() {
		return declarante;
	}
	public void setDeclarante(String declarante) {
		this.declarante = declarante;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
}
