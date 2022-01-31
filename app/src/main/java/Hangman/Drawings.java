package Hangman;

public class Drawings {

    public Drawings(int step) {
        switch(step) {
            case (0) -> getBase();
            case (1) -> getStep1();
        }
    }

    String getBase() {
        String base;
        base = String.format("%s\n",
                """
                    +---+
                    
                        |
                        
                        |
                        
                        |
                        
                        = = =
                """);

        return base;
    }

    String getStep1() {
        String step1;

        step1 = String.format("%s\n",
                """
                    +---+
                    
                    O   |
                        
                        |
                        
                        |
                        
                        = = =
                """);

    }

    static void step2() {
        String step2;

        step2 = String.format("%s\n",
                """
                    +---+
                    
                    O   |
                        
                    |   |
                        
                        |
                        
                        = = =
                """);

    }
    static void step3() {
        String step3;

        step3 = String.format("%s\n",
                """
                step 3
                """);

    }
    static void step4() {
        String step4;

        step4 = String.format("%s\n",
                """
                step 4
                """);

    }
    static void step5() {
        String step5;

        step5 = String.format("%s\n",
                """
                step 5
                """);

    }

}
