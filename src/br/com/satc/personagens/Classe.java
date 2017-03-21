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
public abstract class Classe extends Personagem {
    
    private int hpt;
    private int spt;
    public Classe(String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte) {
        super(nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte);
    }
    public void setHPInicial(int VidaIClasse) {
        hpt=VidaIClasse;
        this.setHp(VidaIClasse);
    }
    public int getHpInicial() {
        return hpt;
    }
    public void setSpInicial(int ManaIClasse) {
        spt=ManaIClasse;
        this.setSp(ManaIClasse);
    }
     public int getSpInicial() {
        return spt;
    }
    public void setHPAtualiza() {
        this.setHp(this.getHp()-(this.getHp()-((this.getHpInicial()+(this.getVitalidade()*15)))));
                }
    public void setSPAtualiza() {
        this.setSp(this.getSp()-(this.getSp()-((this.getSpInicial()+(this.getInteligencia()*10)))));
                }
    public void GastoSp(int mana){
    this.setSp(getSp()-mana);
    }
    
}
