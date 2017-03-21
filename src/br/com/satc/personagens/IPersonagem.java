/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.personagens;

/**
 *
 * @author Markson
 */
public interface IPersonagem {
    public void atacar(Personagem alvo, Personagem atacante);
    public boolean bloquear(Personagem bloqueador,Personagem atacante);
    
       
}
