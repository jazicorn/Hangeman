package Hangman;

import java.io.IOException;
import java.util.ArrayList;

public class Drawings {

    public Drawings() {


    }

    public String getDrawing(int step) {
        return switch (step) {
            case (0) -> getBase();
            case (1) -> getStep1();
            case (2) -> getStep2();
            case (3) -> getStep3();
            case (4) -> getStep4();
            case (5) -> getStep5();
            case (6) -> getStep6();
            default -> throw new IllegalStateException("Unexpected value: " + step);
        };
    }

    public void setDrawing(int step, String picture) {
        switch (step) {
            case (0) -> this.base = picture;
            case (1) -> this.step1 = picture;
            case (2) -> this.step2 = picture;
            case (3) -> this.step3 = picture;
            case (4) -> this.step4 = picture;
            case (5) -> this.step5 = picture;
            case (6) -> this.step6 = picture;
            default -> throw new IllegalStateException("Unexpected value: " + step);
        }
    }

    public ArrayList<String> getDrawingsList() {
        ArrayList<String> drawings = new ArrayList<>();
        for(int i = 0; i < 7; i++) {
            String draw = getDrawing(i);
            drawings.add(draw);
        }
        return drawings;
    }

    public void setDrawingsList(ArrayList<String> drawings) {
        for(int i = 0; i < drawings.size(); i++) {
            setDrawing(i, drawings.get(i));
        }
    }

    public void getAllDrawings() {
        System.out.println(getDrawingsList());
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
               \\ /
                |   |
                    
                    |
                    
                    = = =
            """);

    private String step5 = String.format("%s\n",
            """
                +---+
                
                O   |
               \\ /
                |   |
                 \\
                    |
                    
                    = = =
            """);

    private String step6 = String.format("%s\n",
            """
                +---+
                
                O   |
               \\ /
                |   |
               / \\
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

}
