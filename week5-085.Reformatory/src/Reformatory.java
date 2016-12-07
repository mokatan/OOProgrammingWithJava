public class Reformatory {
    
    private int numberOfMeasures;

    public Reformatory() {
        this.numberOfMeasures = 0;
    }
    

    public int weight(Person person) {
        // return the weight of the person
        this.numberOfMeasures += 1;
        return person.getWeight();
    }
    
    public void feed(Person person){
        int kiloGram = person.getWeight();
        kiloGram += 1;
        person.setWeight(kiloGram);
    }
    
    public int totalWeightsMeasured(){
        return this.numberOfMeasures;
    }

}
