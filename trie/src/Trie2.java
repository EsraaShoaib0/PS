import java.util.HashMap;
import java.util.Map;

public class Trie2 {
    class TrieNode {
        Map<Character, TrieNode> chidlren=new HashMap<>();
        boolean isLastChar = false;
    }
    private final TrieNode root;
    public Trie2() {
        root = new TrieNode();
    }


    public void insert(String word) {
        TrieNode currentNode=root;
        for(char c:word.toCharArray()) {
            currentNode=currentNode.chidlren.computeIfAbsent(c, k->new TrieNode());
        }
        currentNode.isLastChar=true;
    }
    public boolean search(String word) {
        TrieNode currentNode=root;
        for(char c:word.toCharArray()) {
            currentNode=currentNode.chidlren.get(c);
            if(currentNode==null) {
                return false;
            }
        }
        return currentNode.isLastChar;
    }
    public boolean startWith(String word) {
        TrieNode currentNode=root;
        for(char c:word.toCharArray()) {
            currentNode=currentNode.chidlren.get(c);
            if(currentNode==null) {
                return false;
            }
        }
        return true;
    }

}
