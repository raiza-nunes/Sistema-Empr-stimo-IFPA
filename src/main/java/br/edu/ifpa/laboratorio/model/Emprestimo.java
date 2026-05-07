package br.edu.ifpa.laboratorio.model;

import java.util.Date;

public class Emprestimo {
    private int id;
    private Aluno aluno;
    private Equipamento equipamento;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private String status;

    public Emprestimo() {}

    public Emprestimo(int id, Aluno aluno, Equipamento equipamento, Date dataEmprestimo, Date dataDevolucao, String status) {
        this.id = id;
        this.aluno = aluno;
        this.equipamento = equipamento;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }

    public Equipamento getEquipamento() { return equipamento; }
    public void setEquipamento(Equipamento equipamento) { this.equipamento = equipamento; }

    public Date getDataEmprestimo() { return dataEmprestimo; }
    public void setDataEmprestimo(Date dataEmprestimo) { this.dataEmprestimo = dataEmprestimo; }

    public Date getDataDevolucao() { return dataDevolucao; }
    public void setDataDevolucao(Date dataDevolucao) { this.dataDevolucao = dataDevolucao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
