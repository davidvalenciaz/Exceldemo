import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // crear libro
        Workbook libro = new XSSFWorkbook();


        //crear hojas
        Sheet hoja1 = libro.createSheet("Persona");


        //crear fila
        Row titulos = hoja1.createRow(0);
        Row informacion1 = hoja1.createRow(1);
        Row informacion2 = hoja1.createRow(2);

        //crear celda
        Cell nombre = titulos.createCell(0);
        Cell apellido = titulos.createCell(1);
        Cell ciudad = titulos.createCell(2);
        Cell edad = titulos.createCell(3);


        nombre.setCellValue("NOMBRE");
        edad.setCellValue("EDAD");
        ciudad.setCellValue("CIUDAD");
        edad.setCellValue("EDAD");
        apellido.setCellValue("APELLIDO");

        //celdas de informacion
        Cell nombreInfo1 = informacion1.createCell(0);
        Cell apellidoInfo1 = informacion1.createCell(1);
        Cell ciudadInfo1 = informacion1.createCell(2);
        Cell edadInfo1 = informacion1.createCell(3);

        Cell nombreInfo2 = informacion2.createCell(0);
        Cell apellidoInfo2 = informacion2.createCell(1);
        Cell ciudadInfo2 = informacion2.createCell(2);
        Cell edadInfo2 = informacion2.createCell(3);



        nombreInfo1.setCellValue("david");
        edadInfo1.setCellValue("33");
        ciudadInfo1.setCellValue("cucuta");
        apellidoInfo1.setCellValue("valencia");

        nombreInfo2.setCellValue("anna");
        edadInfo2.setCellValue("24");
        ciudadInfo2.setCellValue("armenia");
        apellidoInfo2.setCellValue("salgado");



        try {
            OutputStream output = new FileOutputStream("Practica excel.xlsx");
            libro.write(output);
        }
        catch (Exception e){
            e.printStackTrace();
        }





    }
}










