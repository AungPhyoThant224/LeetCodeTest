import java.util.ArrayList;
import java.util.List;

public class WordSearch {
    public static void search(){
        char[][] board = {{'a'}};
        String word = "ab";
        
        List<List<Integer>> store = new ArrayList<>();
        for(int i = 0; i < word.length(); i++){
            for(int j = 0; j < board.length; j++){
                for(int k = 0; k < board[j].length; k++){
                    if(word.charAt(i) == board[j][k]){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(j);
                        temp.add(k);
                        if(word.length() == 1 && board.length == 1){
                            store.add(i, temp);
                        }
                        if( i < word.length() - 1 && i >= 0){
                            if(j > 0 && j < board.length - 1){
                                if(word.charAt(i+1) == board[j+1][k]){
                                    if(!store.contains(temp)){
                                        store.add(temp);

                                        if(i == word.length() - 2){
                                            List<Integer> temp1 = new ArrayList<>();
                                            temp1.add(j+1);
                                            temp1.add(k);
                                            if(!store.contains(temp1)){
                                                store.add(temp1);
                                            }
                                        }
                                    }
                                }
                                if(word.charAt(i+1) == board[j-1][k]){
                                    if(!store.contains(temp)){
                                        store.add(temp);
                                        if(i == word.length() - 2){
                                            List<Integer> temp1 = new ArrayList<>();
                                            temp1.add(j-1);
                                            temp1.add(k);
                                            if(!store.contains(temp1)){
                                                store.add(temp1);
                                            }
                                        }
                                        j--;
                                    }
                                }
                            }
                            if(j == 0){
                                if(word.charAt(i+1) == board[j+1][k]){
                                    if(!store.contains(temp)){
                                        store.add(temp);
                                        if(i == word.length() - 2){
                                            List<Integer> temp1 = new ArrayList<>();
                                            temp1.add(j+1);
                                            temp1.add(k);
                                            if(!store.contains(temp1)){
                                                store.add(temp1);
                                            }
                                        }
                                    }
                                }
                            }
                            if(j == board.length - 1){
                                if(word.charAt(i+1) == board[j-1][k]){
                                    if(!store.contains(temp)){
                                        store.add(temp);
                                        if(i == word.length() - 2){
                                            List<Integer> temp1 = new ArrayList<>();
                                            temp1.add(j-1);
                                            temp1.add(k);
                                            if(!store.contains(temp1)){
                                                store.add(temp1);
                                            }
                                        }
                                        j--;
                                    }
                                }
                            }
                            if(k > 0 && k < board[j].length - 1){
                                if(word.charAt(i+1) == board[j][k+1]){
                                    if(!store.contains(temp)){
                                        store.add(temp);
                                        if(i == word.length() - 2){
                                            List<Integer> temp1 = new ArrayList<>();
                                            temp1.add(j);
                                            temp1.add(k+1);
                                            if(!store.contains(temp1)){
                                                store.add(temp1);
                                            }
                                        }
                                    }
                                }
                                if(word.charAt(i+1) == board[j][k-1]){
                                    if(!store.contains(temp)){
                                        store.add(temp);
                                        if(i == word.length() - 2){
                                            List<Integer> temp1 = new ArrayList<>();
                                            temp1.add(j);
                                            temp1.add(k-1);
                                            if(!store.contains(temp1)){
                                                store.add(temp1);
                                            }
                                        }
                                        k--;
                                    }
                                }
                            }
                            if(k == 0){
                                if(word.charAt(i+1) == board[j][k+1]){
                                    if(!store.contains(temp)){
                                        store.add(temp);
                                        if(i == word.length() - 2){
                                            List<Integer> temp1 = new ArrayList<>();
                                            temp1.add(j);
                                            temp1.add(k+1);
                                            if(!store.contains(temp1)){
                                                store.add(temp1);
                                            }
                                        }
                                    }
                                }
                            }
                            if(k == board[j].length){
                                if(word.charAt(i+1) == board[j][k-1]){
                                    if(!store.contains(temp)){
                                        store.add(temp);
                                        if(i == word.length() - 2){
                                            List<Integer> temp1 = new ArrayList<>();
                                            temp1.add(j);
                                            temp1.add(k-1);
                                            if(!store.contains(temp1)){
                                                store.add(temp1);
                                            }
                                        }
                                        k--;
                                    }
                                }
                            }
                        }
                        
                    }
                }
            }
        }
        System.out.println(store);

        System.out.println(word.length() == store.size());
    
    }
}
