public class Coronavirus{
    private float infeccio;
    private float mortaldat;
    Coronavirus(float x, float y)
    {
        infeccio=x; mortaldat=y; 
    }

    Coronavirus(){
        //Constructor vuit
    }

    Coronavirus(Coronavirus F) { //Constructor de copia
        infeccio = F.infeccio;
        mortaldat = F.mortaldat;
    }

    public String toString(){
        return "infecciÃ³ = " + infeccio + "mortaldat = " + mortaldat;
    }

    public boolean equals(){
        return infeccio==mortaldat;
    }

    public float getInfeccio(){
        return this.infeccio;
    }
    public float getMortaldat(){
        return this.mortaldat;
    }
    public void setInfeccio(float infeccio){
        this.infeccio = infeccio;
    }
    public void setMortaldat(float mortaldat){
        this.mortaldat = mortaldat;
    }

    public String funcio(){
        return "";
    }




}    
class Covid19 extends Coronavirus{
    private float diesDeQuarentena;
    Covid19(float x, float y, float diesDeQuarentena)
    {
    super(x, y);
    this.diesDeQuarentena = diesDeQuarentena;
    }

    Covid19(){
        //Constructor vuit
    }

    Covid19(Covid19 F) { //Constructor de copia
        super(F.getInfeccio(), F.getMortaldat());
        diesDeQuarentena = F.diesDeQuarentena;
    }
}