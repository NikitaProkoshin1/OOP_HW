package Model;

public interface Variables {
    public String Result(String expression);
    public void setX(double x);
    public void setY(double y);

    double Sum ( double x , double y );

    double Sub ( double x , double y );

    double Mult ( double x , double y );

    double Div ( double x , double y );

    double Pow ( double x , double y );

    double Sqrt ( double x );
}