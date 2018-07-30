public class Dog {

    private VaccinationRecord _rec;
    private String _name;
    private String _id;
    private String _breed;

    public Dog(String name, String id, String breed){
        _name = name;
        _id = id;
        _breed = breed;
    }

    public void bark(String args)
    {
        System.out.println(_name + " " + args);
    }


    public void register(VaccinationRecord rec){
        _rec = rec;
    }

}