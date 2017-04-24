public class Reformatory {
    private int totalWeightsMeasured = 0;
    
    public int weight(Person person) {
        totalWeightsMeasured++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        int weight = person.getWeight() + 1; 
        person.setWeight(weight);
    }
    
    public int totalWeightsMeasured() {
        return totalWeightsMeasured;
    }

}
