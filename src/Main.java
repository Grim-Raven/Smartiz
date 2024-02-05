import fc.DialogueBD;

public class Main {
    public static void main(String[] args) {
        DialogueBD dialogueBD = new DialogueBD();
        dialogueBD.connect();
        dialogueBD.requeteConnection(1111, "mdp");
    }
}