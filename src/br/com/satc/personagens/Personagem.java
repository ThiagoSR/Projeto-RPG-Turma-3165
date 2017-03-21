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
public abstract class Personagem implements IPersonagem {

    private String nome;
    private int nivel;
    private int velocidadeMovimento;
    private int experiencia;
    // --- Atributos Base --- //    
    private int forca; // Atq fisico e peso
    private int agilidade; // Vel atq e esquiv
    private int vitalidade; // hp e armadura base
    private int inteligencia;// dano magico, sp, defm
    private int destreza;//dano de arco, hit, vel atq/2, reduz castime
    private int sorte;//critico, esq
    //--- Atributos --- //
    private int hp;
    private int sp;
    private int defesa;
    private int defesaMagica;
    private int ataque;
    private int ataqueMagico;
    private int esquiva;
    private int esquivaSorte;
    private int critico;
    private int velocidadeAtaque;
    private int precisao;
    private int carga;
    // --- Multiplos --- //
    private int multiHP = 15;
    private int multiSP = 10;

    public Personagem(String nome, int forca, int agilidade,
            int vitalidade, int inteligencia,
            int destreza, int sorte) {
        this.setNome(nome);
        this.setForca(forca);
        this.setAgilidade(agilidade);
        this.setVitalidade(vitalidade);
        this.setInteligencia(inteligencia);
        this.setDestreza(destreza);
        this.setSorte(sorte);
    }

    public void inicializar() {
        this.setHp(this.getVitalidade());
        this.setSp(this.getInteligencia());
        this.setCarga(this.getForca());
        this.setCritico(this.getSorte());
        this.setDefesa(this.getVitalidade());
        this.setDefesaMagica(getInteligencia());
        this.setEsquiva(this.getAgilidade());
        this.setEsquivaSorte(this.getSorte());
        this.setPrecisao(this.getDestreza());
        this.setVelocidadeAtaque(this.getDestreza(), this.getAgilidade());
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the forca
     */
    public int getForca() {
        return forca;
    }

    /**
     * @param forca the forca to set
     */
    public void setForca(int forca) {
        this.forca = forca;
    }

    /**
     * @return the agilidade
     */
    public int getAgilidade() {
        return agilidade;
    }

    /**
     * @param agilidade the agilidade to set
     */
    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    /**
     * @return the vitalidade
     */
    public int getVitalidade() {
        return vitalidade;
    }

    /**
     * @param vitalidade the vitalidade to set
     */
    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }

    /**
     * @return the inteligencia
     */
    public int getInteligencia() {
        return inteligencia;
    }

    /**
     * @param inteligencia the inteligencia to set
     */
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    /**
     * @return the destreza
     */
    public int getDestreza() {
        return destreza;
    }

    /**
     * @param destreza the destreza to set
     */
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    /**
     * @return the sorte
     */
    public int getSorte() {
        return sorte;
    }

    /**
     * @param sorte the sorte to set
     */
    public void setSorte(int sorte) {
        this.sorte = sorte;
    }

    /**
     * @return the hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * @param hp the hp to set
     */
    public void setHp(int vitalidade) {
        this.hp += vitalidade * getMultiHP();
    }
    public void setHPInicial(int VidaIClasse) {
        this.hp=VidaIClasse;
    }
    public int getHpInicial() {
        return hp;
    }
    public void setSpInicial(int ManaIClasse) {
        this.sp=ManaIClasse;
    }
     public int getSpInicial() {
        return sp;
    }
    public void setHPAtualiza() {
        this.hp=this.getHp()-(this.getHp()-((this.getHpInicial()+(vitalidade*15))));
                }
    public void setSPAtualiza() {
        this.sp=this.getSp()-(this.getSp()-((this.getSpInicial()+(inteligencia*10))));
                }
    /**
     * @return the sp
     */
    public int getSp() {
        return sp;
    }

    /**
     * @param sp the sp to set
     */
    public void setSp(int inteligencia) {
        this.sp = inteligencia * getMultiSP();
    }

    /**
     * @return the defesa
     */
    public int getDefesa() {
        return defesa;
    }

    /**
     * @param defesa the defesa to set
     */
    public void setDefesa(int vitalidade) {
        this.defesa = vitalidade;
    }

    /**
     * @return the defesaMagica
     */
    public int getDefesaMagica() {
        return defesaMagica;
    }

    /**
     * @param defesaMagica the defesaMagica to set
     */
    public void setDefesaMagica(int inteligencia) {
        this.defesaMagica = inteligencia;
    }

    /**
     * @return the ataque
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * @param ataque the ataque to set
     */
    public void setAtaque(int forca) {
        this.ataque = forca;
    }

    /**
     * @return the ataqueMagico
     */
    public int getAtaqueMagico() {
        return ataqueMagico;
    }

    /**
     * @param ataqueMagico the ataqueMagico to set
     */
    public void setAtaqueMagico(int inteligencia) {
        this.ataqueMagico = inteligencia;
    }

    /**
     * @return the esquiva
     */
    public int getEsquiva() {
        return esquiva;
    }

    /**
     * @param esquiva the esquiva to set
     */
    public void setEsquiva(int agilidade) {
        this.esquiva = agilidade;
    }

    /**
     * @return the esquivaSorte
     */
    public int getEsquivaSorte() {
        return esquivaSorte;
    }

    /**
     * @param esquivaSorte the esquivaSorte to set
     */
    public void setEsquivaSorte(int sorte) {
        this.esquivaSorte = sorte;
    }

    /**
     * @return the critico
     */
    public int getCritico() {
        return critico;
    }

    /**
     * @param critico the critico to set
     */
    public void setCritico(int sorte) {
        this.critico = sorte;
    }

    /**
     * @return the velocidadeAtaque
     */
    public int getVelocidadeAtaque() {
        return velocidadeAtaque;
    }

    /**
     * @param velocidadeAtaque the velocidadeAtaque to set
     */
    public void setVelocidadeAtaque(int destreza, int agilidade) {
        this.setVelocidadeAtaque(agilidade + (destreza / 2));
    }

    /**
     * @return the precisao
     */
    public int getPrecisao() {
        return precisao;
    }
    public void ReceberDano(int dano){
    this.hp-=dano;
    }
    public void GastoSp(int mana){
    this.sp-=mana;
    }
    

    /**
     * @param precisao the precisao to set
     */
    public void setPrecisao(int destreza) {
        this.precisao = destreza;
    }

    /**
     * @return the multiHP
     */
    public int getMultiHP() {
        return multiHP;
    }

    /**
     * @param multiHP the multiHP to set
     */
    public void setMultiHP(int multiHP) {
        this.multiHP = multiHP;
    }

    /**
     * @return the multiSP
     */
    public int getMultiSP() {
        return multiSP;
    }

    /**
     * @param multiSP the multiSP to set
     */
    public void setMultiSP(int multiSP) {
        this.multiSP = multiSP;
    }

    /**
     * @return the velocidadeMovimento
     */
    public int getVelocidadeMovimento() {
        return velocidadeMovimento;
    }

    /**
     * @param velocidadeMovimento the velocidadeMovimento to set
     */
    public void setVelocidadeMovimento(int velocidadeMovimento) {
        this.velocidadeMovimento = velocidadeMovimento;
    }

    /**
     * @return the carga
     */
    public int getCarga() {
        return carga;
    }

    /**
     * @param carga the carga to set
     */
    public void setCarga(int forca) {
        this.carga = forca * 2;
    }

    /**
     * @return the experiencia
     */
    public int getExperiencia() {
        return experiencia;
    }

    /**
     * @param experiencia the experiencia to set
     */
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    /**
     * @param velocidadeAtaque the velocidadeAtaque to set
     */
    public void setVelocidadeAtaque(int velocidadeAtaque) {
        this.velocidadeAtaque = velocidadeAtaque;
    }

    

}
