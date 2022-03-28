
public class DistanciaEdicao{
    public static void main(String[] args) {
        System.out.println(distanciaEdicao("ab", "abcd", 0, 0));
    }

    public static int distanciaEdicao(String inicialString, String finalString, int cursorInicial, int cursorFinal){
        if(cursorInicial == inicialString.length()){
            return finalString.length() - cursorFinal;
        }
        if(cursorFinal == finalString.length()){
            return inicialString.length() - cursorInicial;
        }
        if(inicialString.charAt(cursorInicial) == finalString.charAt(cursorFinal)){
            return distanciaEdicao(inicialString, finalString, cursorInicial+1, cursorFinal+1);
        }
        return Math.min(Math.min(distanciaEdicao(inicialString, finalString, cursorInicial, cursorFinal+1), distanciaEdicao(inicialString, finalString, cursorInicial+1, cursorFinal)), distanciaEdicao(inicialString, finalString, cursorInicial+1, cursorFinal+1)) + 1;
    }
}