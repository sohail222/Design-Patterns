package BuilderPattern;


public abstract class CD implements Packing{  
    @Override
    public abstract String pack();  
}  
package BuilderPattern;

public class CDBuilder { 
    
    public CDType buildSonyCD(){   
        CDType cds=new CDType();  
        cds.addItem(new Sony());  
        return cds;  
    }  
    
    public CDType buildSamsungCD(){  
        CDType cds=new CDType();  
        cds.addItem(new Samsung());  
        return cds;  
    }  
}
package BuilderPattern;

import java.util.ArrayList;  
import java.util.List;  
public class CDType {  
    private List<Packing> items=new ArrayList<Packing>();  
    
    public void addItem(Packing packs) {    
           items.add(packs);  
    }  
    
    public void getCost(){  
        for (Packing packs : items) {  
            packs.price();  
        }   
    }  
    
    public void showItems(){  
     for (Packing packing : items){  
        System.out.print("CD name : "+packing.pack());  
        System.out.println(", Price : "+packing.price());  
     }       
   }     
}
package BuilderPattern;


public abstract class Company extends CD{  
   @Override
   public abstract int price();  
}  
package BuilderPattern;

import BuilderPattern.CDBuilder;
import BuilderPattern.CDType;

public class NewPatterns {

    public static void main(String[] args) {
        CDBuilder cdBuilder=new CDBuilder();  
        CDType cdType1=cdBuilder.buildSonyCD();  
        cdType1.showItems();  

        CDType cdType2=cdBuilder.buildSamsungCD();  
        cdType2.showItems();  
    }
    
}
package BuilderPattern;

public interface Packing {  
    public String pack();  
    public int price();  
}  
package BuilderPattern;


public class Samsung extends Company {  
    @Override  
    public int price(){   
        return 15;  
    }  
    @Override  
    public String pack(){  
        return "Samsung CD";  
    }         
}
package BuilderPattern;


public class Sony extends Company{  
    @Override  
    public int price(){   
        return 20;  
    }  
    @Override  
    public String pack(){  
        return "Sony CD";  
    }         
}

