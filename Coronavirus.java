public class Coronavirus{
    private float infeccio;
    private float mortaldat;
    Coronavirus(float x, float y)
    {
        infeccio=xx; mortaldat=yy; 
    }

    Coronavirus(){
        //Constructor vuit
    }

    Coronavirus(const Coronavirus& F); // Constructor de còpia
    Coronavirus::Coronavirus(const Coronavirus$ F) {
        infeccio = F.infeccion;
        mortaldat = F.mortaldat;
    }

    public String toString(){
        return "infecció = " + infeccio + "mortaldat = " + mortaldat;
    }

    public boolean equals(){
        return infeccio==mortaldat;
    }

    public void getInfeccio(){
        return infeccio;
    }
    public void getMortaldat(){
        return mortaldat;
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