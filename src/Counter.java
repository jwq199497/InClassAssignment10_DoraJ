public class Counter {


    public int getCount(String text, String toFind){

        int count = 0;
        char after = text.charAt(text.indexOf(toFind)+1);
        while(text.indexOf(toFind) != -1 && after != ' '){

            count++;
            text = text.substring(text.indexOf(toFind)+1);
            after = text.charAt(text.indexOf(toFind)+1);
        }

        return count;
    }

    public int getLinkCount(String text, String toFind){
        int count = 0;
        text = text.toLowerCase();
        while(text.indexOf(toFind)!= -1){
            count++;
            text = text.substring(text.indexOf(toFind)+1);
        }
        return count;
    }
}
