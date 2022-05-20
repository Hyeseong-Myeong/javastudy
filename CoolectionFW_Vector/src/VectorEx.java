import java.util.*;

public class VectorEx {
    public static void main(String[] args) {
        List<Board> list = new Vector<Board>();

        list.add(new Board("S1", "content1", "user1"));
        list.add(new Board("S2", "content2", "user2"));
        list.add(new Board("S3", "constent3", "user3"));

        list.remove(1);
        for(int i =0; i < list.size(); i++){
            Board board = list.get(i);
            System.out.println(board.subject + "\t"+ board.content + "\t" + board.writer);
        }
    }
}
