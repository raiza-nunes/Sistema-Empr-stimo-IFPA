package br.edu.ifpa.laboratorio;

import br.edu.ifpa.laboratorio.dao.EmprestimoDAO;
import br.edu.ifpa.laboratorio.model.Aluno;
import br.edu.ifpa.laboratorio.model.Emprestimo;
import br.edu.ifpa.laboratorio.model.Equipamento;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Configuração visual do Relatório
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("   SISTEMA DE EMPRÉSTIMO-IFPA   ");
        System.out.println("Iniciando processo de registro de empréstimo...\n");

        // 1. Definição dos Dados (Simulando a Raiza pegando uma Webcam)
        Aluno aluno = new Aluno(1, "Raiza da Costa Nunes", "20260001");

        // Vamos testar com a Webcam (ID 5 na nossa lista simplificada)
        Equipamento equipamento = new Equipamento(5, "Webcam", true);

        // 2. Montagem do Objeto de Empréstimo
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setAluno(aluno);
        emprestimo.setEquipamento(equipamento);
        emprestimo.setDataEmprestimo(new Date());
        emprestimo.setStatus("ATIVO");

        // 3. Execução da Persistência no MySQL via DAO
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        emprestimoDAO.salvar(emprestimo);

        // 4. GUIA DE TUDO QUE FOI FEITO (Relatório Final)
        System.out.println("\n----------------------------------------------------");
        System.out.println("          GUIA DE RESUMO DA OPERAÇÃO                ");
        System.out.println("----------------------------------------------------");
        System.out.println("SOLICITANTE: " + aluno.getNome());
        System.out.println("MATRÍCULA:   " + aluno.getMatricula());
        System.out.println("EQUIPAMENTO: " + equipamento.getNome());
        System.out.println("DATA/HORA:   " + sdf.format(emprestimo.getDataEmprestimo()));
        System.out.println("STATUS INICIAL: Disponível");
        System.out.println("STATUS FINAL:   Emprestado (Indisponível no Banco)");
        System.out.println("SITUAÇÃO:    " + emprestimo.getStatus());
        System.out.println("----------------------------------------------------");
        System.out.println("Processo finalizado com sucesso no MySQL!");
    }
}