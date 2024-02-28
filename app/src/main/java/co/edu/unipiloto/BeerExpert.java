package co.edu.unipiloto;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    List<String> getBrand(String spinner){
        List<String> brands = new ArrayList<String>();
        if(spinner.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }else{
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;

    }

}
