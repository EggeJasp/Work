public class RocketSnowman
{
    public static final int LAYERS = 3;

    public static void dashes() {
        for (int i = 0; i < (LAYERS+1)*2+1; i++) {
            System.out.print("-");
        }
    }
    public static void percentageTunnel() {
        dashes();
        System.out.print("| %");
        for (int i = 0; i < 4; i++) {
            System.out.print(" ");
        }
        System.out.print("% |" );
        dashes();
        System.out.println();
    }
    public static void silo() {
        percentageTunnel();
        for (int i = 0; i < LAYERS+1; i++) {
            System.out.print(" o");
        }
        System.out.print(" | %");
        for (int i = 0; i < 4; i++) {
            System.out.print(" ");
        }
        System.out.print("% | ");
        for (int i = 0; i < LAYERS+1; i++) {
            System.out.print("o ");
        }
        System.out.println();
        percentageTunnel();
    }
    public static void drawSteps() {
        for (int i = 0; i < LAYERS; i++) {
            for (int j = 0; j < (LAYERS+1)-i; j++) {
                System.out.print("~^");
            }
            System.out.print("~/");
            for (int j = 0; j < 8+4*i; j++) {
                System.out.print("-");
            }
            System.out.print("\\~");
            for (int j = 0; j < (LAYERS+1)-i; j++) {
                System.out.print("^~");
            }
            System.out.println();
            for (int j = 0; j < (LAYERS+1)-i; j++) {
                System.out.print("^~");
            }
            System.out.print("/");
            for (int j = 0; j < 10+4*i; j++) {
                System.out.print("-");
            }
            System.out.print("\\");
            for (int j = 0; j < (LAYERS+1)-i; j++) {
                    System.out.print("~^");
            }
            System.out.println();
            for (int j = 0; j < (LAYERS+1)*2-(2*i); j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int j = 0; j < 10+4*i; j++) {
                System.out.print("=");
            }
            System.out.print("|");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (LAYERS+1)*2+(5-i); j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 0; j < i; j++) {
                System.out.print("/\\");
            }
            System.out.println("\\");
        }
        silo();
        drawSteps();
        System.out.print("   /");
        for (int i = 0; i < 12+4*(LAYERS-1); i++){
                System.out.print(" ");
        }
        System.out.print("\\");
        System.out.println();
        System.out.print("  /  ");
        for (int i = 0; i < 10+4*(LAYERS-1); i++){
                System.out.print("=");
        }
        System.out.print("  \\");
        System.out.println();
        System.out.print(" /  / ");
        for (int i = 0; i < 8+4*(LAYERS-1); i++){
            System.out.print("\"");
        }
        System.out.print(" \\  \\");
        System.out.println();
        System.out.print("|  | ");
        for (int i = 0; i < 10+4*(LAYERS-1); i++){
            System.out.print("\"");
        }
        System.out.print(" |  |");
        System.out.println();
        System.out.print(" \\  \\ ");
        for (int i = 0; i < 8+4*(LAYERS-1); i++){
            System.out.print("\"");
        }
        System.out.print(" /  /");
        System.out.println();
        System.out.print("  \\  ");
        for (int i = 0; i < 10+4*(LAYERS-1); i++) {
            System.out.print("=");
        }
        System.out.print("  /");
        System.out.println();
        System.out.print("   \\");
        for (int i = 0; i < 12+4*(LAYERS-1); i++) {
            System.out.print("_");
        }
        System.out.println("/");
    }
}
