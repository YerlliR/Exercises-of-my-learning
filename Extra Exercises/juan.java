public class SegmentationExample {
    public static void main(String[] args) {
        String numeroBinario = "110110101011"; // Tu número binario aquí

        separarEnSegmentosConsecutivos(numeroBinario);
    }

    private static void separarEnSegmentosConsecutivos(String numeroBinario) {
        char[] digitos = numeroBinario.toCharArray();

        for (int i = 0; i < digitos.length; i++) {
            StringBuilder segmento = new StringBuilder();

            while (i < digitos.length && digitos[i] == '1') {
                segmento.append(digitos[i]);
                i++;
            }

            if (segmento.length() > 0) {
                System.out.println(segmento);
            }
        }
    }
}