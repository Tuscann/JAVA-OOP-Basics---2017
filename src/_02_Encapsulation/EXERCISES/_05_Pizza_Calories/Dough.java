package _02_Encapsulation.EXERCISES._05_Pizza_Calories;

public class Dough {
    private String flourtype;
    private String baingTechnique;
    private Double weiht;


    public Dough(String flourType, String bakingTechnique, Double weightInGrams) {
        this.setFlourtype(flourType);
        this.setBaingTechnique(bakingTechnique);
        this.setWeiht(weightInGrams);

    }

    private void setFlourtype(String flourtype) {
        this.flourtype = flourtype;
    }

    private void setBaingTechnique(String baingTechnique) {
        this.baingTechnique = baingTechnique;
    }

    private void setWeiht(Double weiht) {
        this.weiht = weiht;
    }
}
