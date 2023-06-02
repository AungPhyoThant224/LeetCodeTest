public class FilePath {
    public void path(){
        String path = "/.aa/..hidden";
        String newPath = "";
        String restorePath = "";
        for(int i = 0; i < path.length(); i++){
            if(i == 0){
                newPath += '/';
            }
            else{
                if(path.charAt(i) == '/' && newPath.charAt(newPath.length() - 1) == '/'){
                    continue;
                }
                else if(path.charAt(i) == '.'){
                    if(path.charAt(i - 1) == '.'){
                        if(i < path.length() - 6){
                            String temp = path.substring(i+1, i+7);
                            if(temp.equals("hidden")){
                                newPath += "..hidden";
                                i += 7;
                                continue;
                            }
                        }
                        if(i < path.length() -1 ){
                            if(path.charAt(i + 1) == '.'){
                                newPath += "...";
                                i += 2;
                            }else{
                                restorePath = newPath;
                                newPath = "/";
                            }
                        }
                        else{
                            restorePath = newPath;
                            newPath = "/";
                        }
                    }
                    if(i < path.length() - 6){
                        String temp = path.substring(i+1, i+7);
                        if(temp.equals("hidden")){
                            newPath += ".hidden";
                            i += 7;
                            continue;
                        }
                    }
                    if(i < path.length()-1){
                        if(path.charAt(i + 1) != '.' && path.charAt(i+1) != '/'){
                            newPath += "." + path.charAt(i + 1);
                            i++;
                        }
                    }
                    continue;
                }
                else{
                    newPath += path.charAt(i);
                }
            }
        }

        if(newPath.length() == 1 && restorePath != ""){
            if(restorePath.length() > 2){
                newPath = restorePath.substring(0, restorePath.length() - 2);
            }else{
                newPath = restorePath;
            }
        }
        if(newPath.charAt(newPath.length() - 1) == '/' && newPath.length() > 1){
            newPath = newPath.substring(0, newPath.length() - 1);
        }
        System.out.println(newPath);
    }
}
