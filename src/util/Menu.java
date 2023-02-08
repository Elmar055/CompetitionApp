package util;

public enum Menu {
    REGISTER(1,"Register Contensant"),
    START(2,"Start"),
    LOGOUT(3,"Logout"),
    EXIT(4,"Exit");

    private int number;
    private String label;

    Menu(int number,String label){
        this.number = number;
        this.label = label;
    }

    @Override
    public String toString() {
        return number + " " + label;
    }
}
