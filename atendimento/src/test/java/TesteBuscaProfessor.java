import org.example.professor.BuscaProfessor;
import org.example.professor.Professor;
import org.example.professor.ProfessorService;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.Gson;
public class TesteBuscaProfessor {

    ProfessorService service;
    BuscaProfessor buscaProfessor;

    @Before
    public void setup() {
        //Criando o contexo do meu teste com o Mock (serviço mock)
        service = new MockProfessorService();
        buscaProfessor = new BuscaProfessor(service);
    }

    @Test
    public void testeBuscaProfessor1() {

        //Fiz a busca
        Professor professor1 = buscaProfessor.buscaProfessor("Marcelo");
        assertNotNull(professor1);
    }

    @Test
    public void testeBuscaProfessor2() {

        //Fiz a busca
        Professor professor2 = buscaProfessor.buscaProfessor("Chris");
        assertNotNull(professor2);
    }

    @Test
    public void testeBuscaProfessor3() {

        //Fiz a busca
        Professor professor3 = buscaProfessor.buscaProfessor("Renzo");
        assertNotNull(professor3);
    }

    @Test
    public void testeBuscaProfessor4() {

        //Fiz a busca
        Professor professor4 = buscaProfessor.buscaProfessor("Yvo");
        assertNotNull(professor4);
    }

    @Test
    public void testeBuscaProfessor5() {

        //Fiz a busca
        Professor professor5 = buscaProfessor.buscaProfessor("Soned");
        assertNotNull(professor5);
    }

    @Test
    public void testeSala2NoPredio1() {

        Professor professor = buscaProfessor.buscaProfessor("Marcelo");
        String predio = professor.getPredio(professor.getSala());
        assertEquals(predio, "1");
    }

    @Test
    public void testeSala9NoPredio2() {

        Professor professor = buscaProfessor.buscaProfessor("Chris");
        String predio = professor.getPredio(professor.getSala());
        assertEquals(predio, "2");
    }

    @Test
    public void testeSala7NoPredio2() {

        Professor professor = buscaProfessor.buscaProfessor("Renzo");
        String predio = professor.getPredio(professor.getSala());
        assertEquals(predio, "2");
    }

    @Test
    public void testeSala14NoPredio3() {

        Professor professor = buscaProfessor.buscaProfessor("Yvo");
        String predio = professor.getPredio(professor.getSala());
        assertEquals(predio, "3");
    }

    @Test
    public void testeSala28NoPredio6() {

        Professor professor = buscaProfessor.buscaProfessor("Soned");
        String predio = professor.getPredio(professor.getSala());
        assertEquals(predio, "6");
    }

    @Test
    public void testeBuscaProfessor7() {

        //Fiz a busca
        Professor professor7 = buscaProfessor.buscaProfessor("Cristiano Ronaldo");
        assertNotNull(professor7);
    }

    @Test
    public void testeBuscaProfessor10() {

        //Fiz a busca
        Professor professor10 = buscaProfessor.buscaProfessor("Paul Walker");
        assertNotNull(professor10);
    }

    @Test
    public void testeBuscaProfessor12() {

        //Fiz a busca
        Professor professor12 = buscaProfessor.buscaProfessor("Quentin Tarantino");
        assertNotNull(professor12);
    }

    @Test
    public void testeBuscaProfessor15() {

        //Fiz a busca
        Professor professor12 = buscaProfessor.buscaProfessor("John Wick");
        assertNotNull(professor12);
    }

    @Test
    public void testeBuscaProfessor50() {

        //Fiz a busca
        Professor professor50 = buscaProfessor.buscaProfessor("Brian O'Conner");
        assertNotNull(professor50);
    }


    @Test
    public void testeSala27NoPredio1() {

        Professor professor = buscaProfessor.buscaProfessor("Soned");
        String predio = professor.getPredio(professor.getSala());
        assertEquals(predio, "1");
    }

    @Test
    public void testeSala14NoPredio6() {

        Professor professor = buscaProfessor.buscaProfessor("Yvo");
        String predio = professor.getPredio(professor.getSala());
        assertEquals(predio, "6");
    }

    @Test
    public void testeSala7NoPredio4() {

        Professor professor = buscaProfessor.buscaProfessor("Renzo");
        String predio = professor.getPredio(professor.getSala());
        assertEquals(predio, "4");
    }

    @Test
    public void testeSala9NoPredio4() {

        Professor professor = buscaProfessor.buscaProfessor("Chris");
        String predio = professor.getPredio(professor.getSala());
        assertEquals(predio, "4");
    }

    @Test
    public void testeSala2NoPredio3() {

        Professor professor = buscaProfessor.buscaProfessor("Marcelo");
        String predio = professor.getPredio(professor.getSala());
        assertEquals(predio, "3");
    }

}
