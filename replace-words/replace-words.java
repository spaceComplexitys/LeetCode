class TrieNode {

    // R links to node children
    private TrieNode[] links;

    private final int R = 26;

    private boolean isEnd;

    public TrieNode() {
        links = new TrieNode[R];
    }

    public boolean containsKey(char ch) {
        return links[ch -'a'] != null;
    }
    public TrieNode get(char ch) {
        return links[ch -'a'];
    }
    public void put(char ch, TrieNode node) {
        links[ch -'a'] = node;
    }
    public void setEnd() {
        isEnd = true;
    }
    public boolean isEnd() {
        return isEnd;
    }
}

class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Time complexity : O(m), where m is the key length.
    // Space complexity : O(m) space
    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (!node.containsKey(currentChar)) {
                node.put(currentChar, new TrieNode());
            }
            node = node.get(currentChar);
        }
        node.setEnd();

    }

    // search a prefix or whole key in trie and
    // returns the node where search ends
    private TrieNode searchPrefix(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char curLetter = word.charAt(i);
            if (node.containsKey(curLetter)) {
                node = node.get(curLetter);
            } else {
                return null;
            }
        }
        return node;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd();
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode node = searchPrefix(prefix);
        return node != null;
    }
}

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        // Seperate the sentence into a String array with spaces
        // if array[i] starts with any of dictionary elments, then replace array[i] with dictionary[some i]
        // stitch the String array back into a string

        String[] sentenceInArray = sentence.split(" ");
        sentence = "";
        for (int i = 0 ; i < sentenceInArray.length; i++) {
            for (int j = 0; j < dictionary.size(); j++) {
                if (sentenceInArray[i].startsWith(dictionary.get(j))) {
                    sentenceInArray[i] = dictionary.get(j);
                }
            }
        }

        sentence = "";
        for (String s : sentenceInArray) {
            sentence += s + " ";
        }

        sentence = sentence.trim();


        return sentence;
    }

}