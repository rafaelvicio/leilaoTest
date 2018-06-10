package com.leilao;

import com.leilao.Lance;
import com.leilao.Leilao;
import com.leilao.Usuario;
import com.leilao.Avaliador;

import org.junit.Assert;
import org.junit.Test;

public class AvaliadorTest {

    @Test
    public void deveEntenderLeilaoComApenasUmLance() {
        Usuario joao = new Usuario("Joao"); 
        Leilao leilao = new Leilao("Playstation 3 Novo");

        leilao.propoe(new Lance(joao, 1000.0));

        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        Assert.assertEquals(1000, leiloeiro.getMaiorLance(), 0.0001);
        Assert.assertEquals(1000, leiloeiro.getMenorLance(), 0.0001);
    }
}