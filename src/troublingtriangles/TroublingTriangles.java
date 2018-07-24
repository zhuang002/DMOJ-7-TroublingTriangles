/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package troublingtriangles;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class TroublingTriangles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[][] coord=new double[3][2];
        int n=sc.nextInt();
        for (int i=0;i<n;i++) {
            for (int j=0;j<3;j++) {
                coord[j][0]=sc.nextDouble();
                coord[j][1]=sc.nextDouble();
            }
            double[] lengths=edgeLength(coord);
            System.out.printf("%.2f %.2f",area(lengths),perimeter(lengths));
        }
    }

    private static double area(double[] lengths) {
        double p=perimeter(lengths)/2.0;
        return sqrt(p*(p-lengths[0])*(p-lengths[1])*(p-lengths[2]));
    }

    private static double perimeter(double[] lengths) {
        return lengths[0]+lengths[1]+lengths[2];
    }

    private static double[] edgeLength(double[][] coord) {
        double[] lengths=new double[3];
        lengths[0]=sqrt((coord[0][0]-coord[1][0])*(coord[0][0]-coord[1][0])+(coord[0][1]-coord[1][1])*(coord[0][1]-coord[1][1]));
        lengths[1]=sqrt((coord[1][0]-coord[2][0])*(coord[1][0]-coord[2][0])+(coord[1][1]-coord[2][1])*(coord[1][1]-coord[2][1]));
        lengths[2]=sqrt((coord[2][0]-coord[0][0])*(coord[2][0]-coord[0][0])+(coord[2][1]-coord[0][1])*(coord[2][1]-coord[0][1]));
        return lengths;
    }
    
}
