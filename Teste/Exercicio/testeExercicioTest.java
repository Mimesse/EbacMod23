package Exercicio;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class testeExercicioTest {

    @Test
    public void testeExercicio () {
        Pessoas t = new Pessoas ();
        t.setSexo("F");

        Assert.assertEquals("F", t.getSexo());
    }
}