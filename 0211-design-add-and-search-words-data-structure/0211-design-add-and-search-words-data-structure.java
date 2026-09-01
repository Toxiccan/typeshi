class WordDictionary {
    WordDictionary arr[] = new WordDictionary[26];
    boolean flag = false;

    public WordDictionary() {
        
    }
    
    public void addWord(String word) {
        WordDictionary curr = this;
        for(int i = 0;i < word.length();i++)
        {
            int index = word.charAt(i) - 'a';
            if(curr.arr[index] == null)
            {
                curr.arr[index] = new WordDictionary();
            }
            curr = curr.arr[index];
        }
        curr.flag = true;     
    }

    private boolean dfs(WordDictionary node,String word,int position)
    {
        if(position == word.length())
        {
            return node.flag;
        }
        char ch = word.charAt(position);

        if(ch == '.')
        {
            for(int i = 0;i < 26;i++)
            {
                if(node.arr[i] != null)
                {
                    if(dfs(node.arr[i],word,position + 1))
                    {
                        return true;
                    }
                }
            }
            return false;
        }

        int index = ch - 'a';
        if(node.arr[index] == null)
        {
            return false;
        }
        return dfs(node.arr[index],word,position + 1);
    }
    
    
    public boolean search(String word) {
        return dfs(this,word,0);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */