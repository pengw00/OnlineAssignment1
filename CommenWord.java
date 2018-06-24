import java.io.*;
import java.util.*;
public class Test {
    /*
    public static List<String> commonWords(String paragragh, List<String> banned){
        List<String> ans = new ArrayList();
        if(paragragh == null || paragragh.length() == 0) return ans;
        String[] words = paragragh.toLowerCase().split("\\W+");
        int max = Integer.MIN_VALUE;
        Map<String, Integer> map = new HashMap<>();
        for(String word: words){
            if(!banned.contains(word)){
                int frequent = map.getOrDefault(word,0) + 1;
                map.put(word, frequent);
                max = Math.max(max,frequent);
            }
        }
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue() == max)
            ans.add(entry.getKey());
        }
        return ans;
    }
    public static boolean isBanned(List<String> banned, String word){
        for(String w: banned){
            if(w.toLowerCase.equals(word)){
                return true;
            }
        }
        return false;
    }
    */
    
   public static void main(String args[]) {
      String literatureText = new String("jack and jil went $^^^ to the market to buy %$$ bread and cheese cheese is Jack favorite food, Jack like it very mucch in the Market he he he he he");
      String[] wordsToexclude = new String[] {"and", "He", "the", "to", "is"};
      List<String> coolStringList = Arrays.asList("and", "He", "the", "to", "is");
      String Str = new String("Welcome-to-Tutorialspoint.com");
      String[] words = literatureText.toLowerCase().split("\\W+");
      System.out.println(Arrays.asList(words)); 
      System.out.println(coolStringList);
      System.out.println(Arrays.toString(wordsToexclude));
      List<String> banned = new ArrayList<>();
      for(String word: coolStringList){
          banned.add(word.toLowerCase());
      }
      System.out.println(banned);
      List<String> ans = new ArrayList();
      int max = Integer.MIN_VALUE;
      Map<String,Integer> map = new HashMap<>();
        for(String word: words){
            if(!banned.contains(word)){
                int frequent = map.getOrDefault(word,0) + 1;
                map.put(word, frequent);
                max = Math.max(max,frequent);
            }
        }
        System.out.println(max);
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue() == max)
            ans.add(entry.getKey());
        }
        System.out.println(ans);
   }
}
