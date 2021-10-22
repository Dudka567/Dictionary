package MyPack;
public class Main {
    public static void main(String[] args){
        Dictionary dictionary = new Dictionary(10);
        dictionary.put("Настя","Девочка");
        dictionary.put("Даня1","Мальчик");
        dictionary.put("Даня2","Мальчик");
        dictionary.put("Даня3","Мальчик");
        dictionary.put("Даня4","Мальчик");
        dictionary.put("Даня5","Мальчик");
        dictionary.put("Даня6","Мальчик");
        dictionary.put("Даня7","Мальчик");
        dictionary.put("Даня8","Мальчик");
        dictionary.put("Даня9","Мальчик");
        dictionary.put("Даня10","Мальчик");
        dictionary.put("Даня11","Мальчик");
        System.out.println(dictionary.length());
        dictionary.remove("Даня11");
        System.out.println(dictionary.length());
        dictionary.put("Даня11","Мальчик");
        System.out.println(dictionary.length());
         dictionary.showKeys();
         System.out.println("Емкость словаря: "+dictionary.size());
        // dictionary.showValues();
        // dictionary.put("Настя","Девочка");
        // dictionary.showValues();
        // dictionary.getKey("Мальчик");
        // dictionary.getValue("Настя");
        // dictionary.getValue("пвпва");
    }
}
