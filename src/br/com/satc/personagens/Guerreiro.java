/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.personagens;

import java.util.Random;

/**
 *
 * @author Edutec
 */
public class Guerreiro extends Personagem{
    

    public void inicializar() {
        this.setHPInicial(100);
        this.setSpInicial(25);
    }
    
    public Guerreiro(String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte) {
        super("Guerreiro",3,1,2,1,1,1);
    }
    
    public void Skill1(Personagem alvo, Personagem Caster){
    //Nome : brutalidade
    alvo.ReceberDano((Caster.getAtaque()*2));
    //cooldown 3 rodadas
    Caster.GastoSp(20);
    }
    public void Skill2(int numdalvos, Personagem alvo1, Personagem alvo2,Personagem Caster){
    
    //Nome : Vorodah
        if (numdalvos==1) {
         alvo1.ReceberDano(Caster.getAtaque()+5);   
         Caster.GastoSp(30);
        }else{
         alvo1.ReceberDano(Caster.getAtaque()+5);
         alvo2.ReceberDano(Caster.getAtaque()+5);
         Caster.GastoSp(40);
        }
    
    }
    public void Skill3(Personagem Aliado1, Personagem Aliado2, Personagem Caster){
    //Nome : Parede de Aço
      Aliado1.setDefesa(getDefesa()+8);
      Aliado2.setDefesa(getDefesa()+8);
      Caster.setDefesa(getDefesa()+8);
      Caster.ReceberDano(40);
    //Duração: 3 Turnos
    //Cooldown: 5 Turnos  
    }

    @Override
    public void atacar(Personagem alvo, Personagem atacante) {
      alvo.ReceberDano(atacante.getAtaque());
              
    }

    @Override
    public boolean bloquear(Personagem bloqueador,Personagem atacante) {
        Boolean bloqueado=null;
        int rand = ((bloqueador.getSorte()+bloqueador.getAgilidade())-(atacante.getSorte()+atacante.getAgilidade()));
        
        Random gerador = new Random();
 
        int numero = gerador.nextInt(100);
 
        if (numero>rand) {
           bloqueado=false;
        }else{
            if(numero<=rand){
           bloqueado=true;
            }
        }
        return bloqueado;
    }
    
}
