public class Tea extends Food{
    public String geCollor() {
        return collor;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }

    private String collor;
    public Tea(String filling) {
        super("Чай");
        this.collor = filling;
    }

    @Override
    public void consume() {
        System.out.println(  this.toString());
    }
    @Override
    public String toString(){
        return "Чай " + collor+" выпит";
    }
}