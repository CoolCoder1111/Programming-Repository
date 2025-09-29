class Fraction
{
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void Multiply(int numerator, int denominator)
    {
        this.numerator *= numerator;
        this.denominator *= denominator;
    }

    public void Multiply(int wholeNumber)
    {
        this.numerator *= wholeNumber;
    }

    public void Multiply(Fraction fraction)
    {
        this.numerator *= fraction.numerator;
        this.denominator *= fraction.denominator;
    }

    public void Divide(int numerator, int denominator)
    {
        this.numerator *= denominator;
        this.denominator *= numerator;
    }

    public void Divide(int wholeNumber)
    {
        this.denominator *= wholeNumber; 
    }

    public void Divide(Fraction fraction)
    {
        this.numerator *= fraction.denominator;
        this.denominator *= fraction.numerator;
    }

    public void Add(int numerator, int denominator)
    {
        int newDenominator;
        int newNumerator;
        
        newDenominator = this.denominator * denominator;
        newNumerator = (this.numerator * denominator) + (numerator * this.denominator);

        this.numerator = newNumerator;
        this.denominator = newDenominator;
    }

    public void Add(int wholeNumber)
    {
        this.numerator += wholeNumber * this.denominator;
    }

    public void Add(Fraction fraction)
    {
        int newDenominator;
        int newNumerator;
        
        newDenominator = this.denominator * fraction.denominator;
        newNumerator = (this.numerator * fraction.denominator) + (fraction.numerator * this.denominator);
        
        this.numerator = newNumerator;
        this.denominator = newDenominator;
    }

    public void Subtract(int numerator, int denominator)
    {
        int newDenominator;
        int newNumerator;

        newDenominator = this.denominator * denominator;
        newNumerator = (this.numerator * denominator) - (numerator * this.denominator);

        this.numerator = newNumerator;
        this.denominator = newDenominator;
    }

    public void Subtract(int wholeNumber)
    {
        this.numerator -= wholeNumber * this.denominator;
    }

    public void Subtract(Fraction fraction)
    {
        int newDenominator;
        int newNumerator;

        newDenominator = this.denominator * fraction.denominator;
        newNumerator = (this.numerator * fraction.denominator) - (fraction.numerator * this.denominator);

        this.numerator = newNumerator;
        this.denominator = newNumerator;
    }

    public string DisplayFraction()
    {
        string Fraction;

        Fraction = this.numerator.ToString() + "/" + this.denominator.ToString();

        return Fraction;
    }
}
