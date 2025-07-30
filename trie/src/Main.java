public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("Muhammed");
        trie.insert("Ahmed");
        trie.insert("Yousef");
        System.out.println(trie.search("Yousef"));
        System.out.println(trie.search("Ah"));
        System.out.println(trie.startWith("Muha"));
        System.out.println(trie.startWith("med"));
    }
}