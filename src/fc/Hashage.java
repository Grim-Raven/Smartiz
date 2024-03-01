package fc;

import java.nio.charset.StandardCharsets;

public class Hashage {

    /**
     * Hashage d'une chaîne de caractères en SHA-256
     * @param input la chaîne à hasher
     * @return la chaîne hashée en SHA-256
     */
    public static String sha256(String input) {
        try {
            // On utilise SHA-256 pour le hashage
            java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA-256");
            // On hash la chaîne de caractères
            byte[] hash = digest.digest(input.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder();
            // On convertit le hash en une chaîne de caractères
            for (byte b : hash) {
                // On convertit le byte en hexadécimal
                String hex = Integer.toHexString(0xff & b);
                // On ajoute un 0 devant si le nombre est inférieur à 16
                if (hex.length() == 1) hexString.append('0');
                // On ajoute le nombre hexadécimal à la chaîne de caractères
                hexString.append(hex);
            }
            // On retourne la chaîne de caractères hashée
            System.out.println(hexString.toString());
            return hexString.toString();
        } catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
