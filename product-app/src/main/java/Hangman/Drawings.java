package Hangman;

public class Drawings {

    public Drawings(int step) {
        switch(step) {
            case (0) -> getBase();
            case (1) -> getStep1();
            case (2) -> getStep2();
            case (3) -> getStep3();
            case (4) -> getStep4();
            case (5) -> getStep5();
            case (6) -> getStep6();
        }
    }

    private String base = String.format("%s\n",
            """
                +---+
                
                    |
                    
                    |
                    
                    |
                    
                    = = =
            """);

    private String step1 = String.format("%s\n",
            """
                +---+
                
                O   |
                    
                    |
                    
                    |
                    
                    = = =
            """);

    private String step2 = String.format("%s\n",
            """
                    +---+
                    
                    O   |
                        
                    |   |
                        
                        |
                        
                        = = =
                """);


    private String step3 = String.format("%s\n",
            """
                +---+
                
                O   |
                  /
                |   |
                    
                    |
                    
                    = = =
            """);

    private String step4 = String.format("%s\n",
            """
                +---+
                
                O   |
              \\  /
                |   |
                    
                    |
                    
                    = = =
            """);

    private String step5 = String.format("%s\n",
            """
                +---+
                
                O   |
              \\  /
                |   |
                  \\
                    |
                    
                    = = =
            """);

    private String step6 = String.format("%s\n",
            """
                +---+
                
                O   |
              \\  /
                |   |
              //  \\
                    |
                    
                    = = =
            """);

    public String getBase() {
        return base;
    }
    public String getStep1() {
        return step1;
    }
    public String getStep2() {
        return step2;
    }
    public String getStep3() {
        return step3;
    }
    public String getStep4() {
        return step4;
    }
    public String getStep5() {
        return step5;
    }
    public String getStep6() {
        return step6;
    }

    public void setBase (String base) {
        this.base = base;
    }
    public void setStep1 (String step1) {
        this.step1 = step1;
    }
    public void setStep2 (String step2) {
        this.step2 = step2;
    }
    public void setStep3 (String step3) {
        this.step3 = step3;
    }
    public void setStep4 (String step4) {
        this.step4 = step4;
    }
    public void setStep5 (String step5) {
        this.step5 = step5;
    }
    public void setStep6 (String step6) {
        this.step6 = step6;
    }


}
