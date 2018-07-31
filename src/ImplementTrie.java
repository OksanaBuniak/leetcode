public class ImplementTrie {

    public static class TrieNode {

        private TrieNode[] links;
        boolean isEnd;

        public TrieNode() {
            links = new TrieNode[26];
        }

        public void setEnd() {
            isEnd = true;
        }

        public boolean isEnd() {
            return isEnd;
        }

        public void putChar(char ch, TrieNode node) {
            links[ch - 'a'] = node;
        }

        public TrieNode getNode(char ch) {
            return links[ch - 'a'];
        }

        public boolean containsChar(char ch) {
            return links[ch - 'a'] != null;
        }
    }

    private TrieNode root;

    public ImplementTrie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char currChar = word.charAt(i);
            if (!current.containsChar(currChar)) {
                current.putChar(currChar, new TrieNode());
            }
            current = current.getNode(currChar);
        }
        current.setEnd();
    }

    private TrieNode searchPrefix(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char curLetter = word.charAt(i);
            if (node.containsChar(curLetter)) {
                node = node.getNode(curLetter);
            } else {
                return null;
            }
        }
        return node;
    }

    //Returns if the word is in the trie
    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return (node != null && node.isEnd());
    }


    public boolean startsWith(String prefix) {
        TrieNode node = searchPrefix(prefix);
        return (node != null);
    }

    public static void main(String[] args) {
        ImplementTrie obj = new ImplementTrie();
        String word = "leet";
        String word1 = "code";
        obj.insert(word);
        obj.insert(word1);
        boolean param_2 = obj.search(word);
        boolean param_3 = obj.startsWith("lee");
        System.out.println(param_2);
        System.out.println(param_3);
    }
}
