public class AddAndSearchWord211 {

    public static class TrieNode {
        TrieNode[] nodes = new TrieNode[26];
        boolean isLeaf = false;
    }

    public static class WordDictionary {
        private TrieNode root;

        //Initialize your data structure here.
        public WordDictionary() {
            root = new TrieNode();
        }

        //Adds a word into the data structure.
        public void addWord(String word) {
            if (word == null) {
                return;
            }

            TrieNode current = root;
            for (int i = 0; i < word.length(); i++) {
                int letterIndex = word.charAt(i) - 'a';
                if (current.nodes[letterIndex] == null) {
                    current.nodes[letterIndex] = new TrieNode();
                }
                current = current.nodes[letterIndex];
            }
            current.isLeaf = true;
        }

        //Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
        public boolean search(String word) {
            return searchInNode(root, 0, word);
        }

        private boolean searchInNode(TrieNode current, int characterIndex, String word) {
            if (current == null) {
                return false;
            }
            if (characterIndex == word.length()) {
                return current.isLeaf;
            }

            if (word.charAt(characterIndex) == '.') {
                for (int i = 0; i < 26; i++) {
                    if (searchInNode(current.nodes[i], characterIndex + 1, word)) {
                        return true;
                    }
                }
                return false;
            }

            int letterIndex = word.charAt(characterIndex) - 'a';
            // moved to the first check
            //if (current.nodes[letterIndex] == null) {
            //    return false;
            //}
            return searchInNode(current.nodes[letterIndex], characterIndex + 1, word);
        }
    }

    public static void main(String[] args) {
        WordDictionary obj = new WordDictionary();
        obj.addWord("bad");
        obj.addWord("dad");
        obj.addWord("mad");
        System.out.println(obj.search("pad"));
        System.out.println(obj.search("bad"));
        System.out.println(obj.search(".ad"));
        System.out.println(obj.search("b.."));
        System.out.println(obj.search(".a."));
        System.out.println(obj.search("j.."));
        System.out.println(obj.search(".k."));
    }
}


/*
        public boolean search(String word) {
            TrieNode current = root;
            for (int i = 0; i < word.length(); i++) {
                int letterIndex = word.charAt(i) - 'a';
                if (current.nodes[letterIndex] == null) {
                    return false;
                }
                current = current.nodes[letterIndex];
            }
            return current.isLeaf;
        }
 */