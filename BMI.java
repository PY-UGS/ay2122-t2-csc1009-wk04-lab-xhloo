public class BMI 
{
    private int weightPound;
    private int heightInches;
    public static final double POUNDTOKG = 0.45359237;
    public static final double INCHESTOMETERS = 0.0254;

    // Default constructor
    BMI()
    {
        this(146, 70);
    }

    public BMI(int weightPound, int heightInches)
    {
        this.weightPound = weightPound;
        this.heightInches = heightInches;
    }

    public int getweightPound()
    {
        return weightPound;
    }

    public int getheightInches()
    {
        return heightInches;
    }

    public void setweightPound(int weightPound)
    {
        this.weightPound = weightPound;
    }

    public void setheightInches(int heightInches)
    {
        this.heightInches = heightInches;
    }
    
    public double getBMI()
    {
        double weightinKG = weightPound * POUNDTOKG;
        double heightinM = heightInches * INCHESTOMETERS;
        double fBMI = weightinKG / (heightinM * heightinM);
        return fBMI;  
    }

    public String getInterpretation()
    {
        if(getBMI() < 18.5)
            return "Underweight";
        else if(getBMI() < 25.0)
            return "Normal";
        else if(getBMI() < 30)
            return "Overweight";
        else 
            return "Obese";
    }
}
