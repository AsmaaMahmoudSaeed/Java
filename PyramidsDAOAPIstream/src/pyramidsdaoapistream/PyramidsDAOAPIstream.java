/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidsdaoapistream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 *
 * @author asmaa
 */
public class PyramidsDAOAPIstream{
    public static void main(String[] args) throws Exception {
        String path="pyramids.csv";

        DAO d = new DAO();

        ArrayList<Pyramid> pyramids_list=d.readCSV(path);
        //System.out.println(pyramids);

        ArrayList<Pyramid> sortedPyramids;
        sortedPyramids=pyramids_list.stream().filter(pyramid -> pyramid.getBase1()!=0).sorted((s1,s2)->s1.getBase1().compareTo(s2.getBase1())).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(sortedPyramids);
        Pyramid median_of_ByBase1;
      median_of_ByBase1=pyramids_list.stream().filter(pyramid -> pyramid.getBase1()!=0).sorted(Comparator.comparing(Pyramid::getBase1)).collect(Collectors.toCollection(ArrayList::new)).get((pyramids_list.size())/2-1);
        Pyramid lower_Quartile_of_Base1;
        System.out.println(62/4);
        lower_Quartile_of_Base1=pyramids_list.stream().filter(pyramid -> pyramid.getBase1()!=0).sorted(Comparator.comparing(Pyramid::getBase1)).collect(Collectors.toCollection(ArrayList::new)).get(pyramids_list.size()/4);
        Pyramid upper_quartile_of_ByBase1;
        upper_quartile_of_ByBase1=pyramids_list.stream().filter(pyramid -> pyramid.getBase1()!=0).sorted(Comparator.comparing(Pyramid::getBase1)).collect(Collectors.toCollection(ArrayList::new)).get(pyramids_list.size()*3/4);

        System.out.println("The median of Pyramid: "+median_of_ByBase1);
                System.out.println("Lower quartile pyramid: "+lower_Quartile_of_Base1);

        System.out.println("The Lower quartile pyramid: "+upper_quartile_of_ByBase1);

        double mean=sortedPyramids.stream().mapToDouble(pyramid->pyramid.getBase1()).average().orElseThrow(Exception::new);
        System.out.println("The average value of Base 1 is "+mean+"m");


    }
}
