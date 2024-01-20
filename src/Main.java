import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Curso curso = new Curso();
    curso.setTitulo("Curso Java");
    curso.setDescricao("curso na dio");
    curso.setCargaHoraria(8);

    Curso curso1 = new Curso();
    curso1.setTitulo("Curso js");
    curso1.setDescricao("curso na dio");
    curso1.setCargaHoraria(4);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria de java");
    mentoria.setDescricao("mentoria de java na dio");
    mentoria.setData(LocalDate.now());

//    System.out.println(curso);
//    System.out.println(curso1);
//    System.out.println(mentoria);

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Backend Java Developer");
    bootcamp.setDescricao("Formação backend com ênfase em Java");
    bootcamp.getConteudos().add(curso);
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(mentoria);

    Dev devDave = new Dev();
    devDave.setNome("Davidson");
    devDave.inscreverBootcamp(bootcamp);
    devDave.progredir();
    devDave.progredir();
    devDave.progredir();
    System.out.println("Conteúdos inscritos davidson: " + devDave.getConteudosInscritos());
    System.out.println("Conteúdos concluidos davidson: " + devDave.getConteudosConcluidos());
    System.out.println("XP: " + devDave.calcularTotalXp());

    Dev devPacifico = new Dev();
    devPacifico.setNome("Pacifico");
    devPacifico.inscreverBootcamp(bootcamp);
    devPacifico.progredir();
    System.out.println("Conteúdos inscritos davidson: " + devPacifico.getConteudosInscritos());
    System.out.println("Conteúdos concluidos davidson: " + devPacifico.getConteudosConcluidos());
    System.out.println("XP: " + devPacifico.calcularTotalXp());
  }
}
