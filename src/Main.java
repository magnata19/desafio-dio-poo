import br.com.dio.desafio.dominio.Curso;
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

    System.out.println(curso);
    System.out.println(curso1);
    System.out.println(mentoria);

  }
}
