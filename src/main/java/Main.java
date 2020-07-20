import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int opcionMenu = -1;
        String[] botones = { "Ver Gatos", "Salir"};

        do {
            // Menu Principal
            String opcion = (String) JOptionPane.showInputDialog(null, "Gatos Api", "Menu Principal", JOptionPane.INFORMATION_MESSAGE, null,botones,botones[0]);
            //se valida la opcion escogida
            for (int i = 0; i < botones.length; i++) {
                if (opcion.equals(botones[i])){
                    opcionMenu = i;
                }
            }
            switch (opcionMenu){
                case 0:
                    break;
                default:
                    break;
            }
        }while (opcionMenu != 1);
    }
}
