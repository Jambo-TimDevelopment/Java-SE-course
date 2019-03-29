public class Gender {
    private String gender;

    public Gender(String gender){
        if(gender == "MAN" || gender == "man" || gender == "Man"){
            this.gender = "MAN";
        }else if(gender == "WOMAN" || gender == "Woman" || gender == "woman"){
            this.gender = "WOMAN";
        }else {
            this.gender = null;
        }
    }

    public String getGender() {
        return gender;
    }

    public Gender(){this.gender = null;}
}