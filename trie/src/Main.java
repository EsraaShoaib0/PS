public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("Muhammed");
        trie.insert("Ahmed");
        trie.insert("Yousef");
        System.out.println(trie.search("Yousef"));//true
        System.out.println(trie.search("Ah"));//false
        System.out.println(trie.startWith("Muha"));//true
        System.out.println(trie.startWith("med"));//false
        System.out.println(trie.startWith("Yousef"));//true
    }
}