
public class Vehicle {


    String Brand;
    //Getter
    public String getBrand() {
        return Brand;
    }
     //Setter
     public void setBrand(String A) {
        this.Brand = A;
    }

    String Color;
    // Getter
    public String getColor() {
        return Color;
    }
    // Setter
    public void setColor(String A) {
        this.Color = A;
    }


    int MaxSpeed;
    // Getter
    public int getMaxSpeed() {
        return MaxSpeed;
    }
    // Setter
    public void setMaxSpeed(int A) {
        this.MaxSpeed = A;
    }


    double ZeroToSixty;
    // Getter
    public double getZeroToSixty() {
        return ZeroToSixty;
    }
    // Setter
    public void setZeroToSixty(double A) {
        this.ZeroToSixty = A;
    }


    int Seats;
    // Getter
    public int getSeats() {
        return Seats;
    }
    // Setter
    public void setSeats(int A) {
        this.Seats = A;
    }


/* Seeking advice on correct way to set an array.

    public void setOptions(String...input)
    {
    }
    public String[] getOptions()
    {
        return (String[]) Options;
    }
    private Object Options;
*/




    void Horn(){
        System.out.println("BEEP!");

    }


}







