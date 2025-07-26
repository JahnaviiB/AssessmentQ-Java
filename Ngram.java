import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 An n-gram, which is used in linguistics, refers to a contiguous sequence of N items(words) from a given sequence of text.

 Input: A list of sentences, integer N.
 Output: Frequency of all N-grams.
 Example:
 Suppose we have the following sentences:
 "the cow jumped over the moon"
 "the cow and the moon"

 The unique 2-grams would be:
 "the cow"
 "cow jumped"
 "jumped over"
 "over the"
 "the moon"
 "cow and"
 "and the"

 And we use N=2, then the expected result is:
 "the cow" ⇒ 2
 "cow jumped" ⇒ 1
 "jumped over" ⇒ 1
 "over the" ⇒ 1
 "the moon" ⇒ 2
 "cow and" ⇒ 1
 "and the" ⇒ 1
**/
public class Ngram {
    public static void main(String[] args){
        List<String> sentence = Arrays.asList("the cow jumped over the moon","the cow and the moon");
        int N = 2;
        System.out.println(getNgramFrequncies(sentence,2));
    }
    public static Map<String,Integer> getNgramFrequncies(List<String> sentences, int N){
        Map<String,Integer> nGramCounts = new LinkedHashMap<>();
        for(String sentence: sentences){
            String[] words = sentence.split("\\s+");
            if(words.length < N) continue;

            for(int i=0;i<= words.length-N;i++){
                StringBuilder nGram = new StringBuilder();
                for(int j=0;j<N;j++){
                    if(j>0) nGram.append(" ");
                    nGram.append(words[i+j]);
                }
                String nGramStr = nGram.toString();
                nGramCounts.put(nGramStr,nGramCounts.getOrDefault(nGramStr,0)+1);
            }
        }
        return nGramCounts;
    }
}
