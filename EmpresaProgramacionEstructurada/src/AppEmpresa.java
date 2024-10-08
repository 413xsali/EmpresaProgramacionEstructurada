import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AppEmpresa {
    public static void main(String[] args) throws Exception {
        double total = 0;
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<String> cargos = new ArrayList<String>();
        ArrayList<Double> salarios = new ArrayList<Double>();

        int cantidad = IntegerArgument.parseInt(JOptionPane.showInputDialog(:null, "Ingrese la cantidad de ampleados"));

        for(int emp = 0; emp < cantidad; emp++) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado");
            String cargo = JOptionPane.showInputDialog(null, "Ingrese el cargo del empleado");
            double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado"));
            
            //Almacenamiento de los datos en el Array list
            nombres.add(nombre);
            cargos.add(cargo);
            salarios.add(salario);

            //Numero de empleados
            System.out.println("El numero de empleados es: " + cantidad);

            //Nombres y salarios de los empleados son:
            System.out.println("Los nombres y salarios de los empleados son: ");
            for(int i = 0; emp < cantidad; i++) {
                System.out.println("Nombre: " + nombres.get(i) + " Salario: " + salarios.get(i));

            }

            //El total del dinero paragado por todos los empleados
            for(int i = 0; emp < cantidad; i++) {
                double total = total + salarios.get(i);
            }




        }
    }
}