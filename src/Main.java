import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Angular");
        curso2.setDescricao("Descrição curso Angular");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJuca = new Dev();
        devJuca.setNome("Juca");
        devJuca.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos - Juca: " + devJuca.getConteudosInscritos());
        devJuca.progredir();
        devJuca.progredir();
        System.out.println("Conteúdos inscritos - Juca: " + devJuca.getConteudosInscritos());
        System.out.println("Conteúdos concluidos - Juca: " + devJuca.getConteudosConcluidos());
        System.out.println("XP: " + devJuca.calcularTotalXp());

        System.out.println("------------------------------");

        Dev devMarcio = new Dev();
        devMarcio.setNome("Marcio");
        devMarcio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos - Marcio: " + devMarcio.getConteudosInscritos());
        devMarcio.progredir();
        System.out.println("Conteúdos inscritos - Marcio: " + devMarcio.getConteudosInscritos());
        System.out.println("Conteúdos concluidos - Marcio: " + devMarcio.getConteudosConcluidos());
        System.out.println("XP: " + devMarcio.calcularTotalXp());
    }

}
