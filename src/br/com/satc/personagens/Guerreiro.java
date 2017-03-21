/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.personagens;

/**
 *
 * @author Edutec
 */
public class Guerreiro extends Classe{

    public Guerreiro(String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte) {
        super(nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte);
        this.setNome("Guerreiro");
        this.setForca(3);
        this.setAgilidade(1);
        this.setVitalidade(2);
        this.setInteligencia(1);
        this.setDestreza(1);
        this.setSorte(1);
    }
   
    public void inicializar() {
        this.setHPInicial(100);
        this.setSpInicial(25);
    }   

    @Override
    public void atacar(Personagem alvo, Personagem atacante) {
      alvo.ReceberDano(atacante.getAtaque());  
    }
    
    public void Skill1(Personagem alvo, Classe Caster){
    //Nome : brutalidade
    alvo.ReceberDano((Caster.getAtaque()*2));
    Caster.GastoSp(20);
    }
    
    public void Skill2(int numdalvos, Personagem alvo1, Personagem alvo2,Classe Caster){
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
     public void Skill3(Classe Aliado1, Classe Aliado2, Classe Caster){
    //Nome : Parede de Aço
      Aliado1.setDefesa(getDefesa()+8);
      Aliado2.setDefesa(getDefesa()+8);
      Caster.setDefesa(getDefesa()+8);
      Caster.ReceberDano(40);
    }

    
}
