import java.util.*;
public class raj{
    public static class trienode{
        trienode children[];
        boolean isterminal;
      trienode()
      {
        children =new trienode[26];
        isterminal=false;
      }
    }
static class trie{
    trienode root;
    trie()
    {
       root=new trienode();
    }
    public void insert(String word)
    {
        trienode current=root;
        int index=word.charAt(0)-'a';
      for(int i=0;i<word.length();i++)
      {
          if(current.children[index]==null)
          {
             current.children[index]=new trienode();
          }
          current=current.children[index];
      }
      current.isterminal=true;
    }
    public boolean search(String word)
    {
           trienode current =root;
           int index=word.charAt(0)-'a';
        for(int i=0;i<word.length();i++)
        {
              if(current.children[index]==null)
              {
                 return false;
              }
              current=current.children[index];
        }
        return (current!=null && current.isterminal);
    }

boolean isEmpty(trienode root)
{
       for(int i=0;i<26;i++)
        if(root.children[i]!=null)
        {
            return false;
        }
    return true;   
}

}
public static void main(String[]args){
    trie t = new trie();
    t.insert("hello");
    t.insert("world");

    System.out.println(t.search("hello"));
    System.out.println(t.search("wrd"));

   
}
}