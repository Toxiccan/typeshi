class Trie {
    Trie links[] = new Trie[26];
    boolean flag = false;

    public Trie() {
    }
    
    public void insert(String word) {
        Trie curr = this;
        for(int i = 0;i < word.length();i++)
        {
            int index = word.charAt(i) - 'a';
            if(curr.links[index] == null)
            {
                curr.links[index] = new Trie();
            }
            curr = curr.links[index];
        }
        curr.flag = true;
    }
    
    public boolean search(String word) {
        Trie curr = this;
        for(int i = 0;i < word.length();i++)
        {
            int index = word.charAt(i) - 'a';
            if(curr.links[index] == null)
            {
                return false;
            }
            curr = curr.links[index];
        }
        return curr.flag;
    }
    
    public boolean startsWith(String prefix) {
        Trie curr = this;
        for(int i = 0;i < prefix.length();i++)
        {
            int index = prefix.charAt(i) - 'a';
            if(curr.links[index] == null)
            {
                return false;
            }
            curr = curr.links[index];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */