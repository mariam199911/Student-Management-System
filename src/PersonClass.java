public class PersonClass {

    //use getShape method to get object of type shape
    public Person getPerson(String person){
        if(person == null){
            return null;
        }
        if(person.equalsIgnoreCase("1")){
            return new Admin();

        } else if(person.equalsIgnoreCase("2")){
            return new Teacher();

        } else if(person.equalsIgnoreCase("3")){
            return new Student();
        }

        return null;
    }
}