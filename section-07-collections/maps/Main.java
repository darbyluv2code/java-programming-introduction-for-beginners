package collections.maps;


import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> stateAbbreviations = new HashMap<>();

        stateAbbreviations.put("California", "CA");
        stateAbbreviations.put("New York", "NY");
        stateAbbreviations.put("Ohio", "OH");
        stateAbbreviations.put("Texas", "TX");

        System.out.println(stateAbbreviations.get("New York"));
        System.out.println(stateAbbreviations.containsKey("Washington"));
        System.out.println(stateAbbreviations.containsValue("OH"));

        /**/

        stateAbbreviations.putIfAbsent("Ohio", "OH");
        stateAbbreviations.putIfAbsent("Washington", "WA");

        System.out.println(stateAbbreviations);

        System.out.println(stateAbbreviations.size());

        /**/

        stateAbbreviations.remove("New York");
        stateAbbreviations.put("Maryland", "MY");
        System.out.println(stateAbbreviations);
        stateAbbreviations.replace("Maryland", "MD");
        System.out.println(stateAbbreviations);

        /**/

        stateAbbreviations.clear();
        System.out.println(stateAbbreviations.isEmpty());
    }
}
