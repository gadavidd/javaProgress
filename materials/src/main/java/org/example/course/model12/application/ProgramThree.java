package materials.src.main.java.org.example.course.model12.application;

import materials.src.main.java.org.example.course.model12.entities.projectTwo.Comment;
import materials.src.main.java.org.example.course.model12.entities.projectTwo.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ProgramThree {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment comment1 = new Comment("Have a nice trip!");
        Comment comment2 = new Comment("Wow that's awesome");
        Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"),"Traveling to New Zealand!",
                 "I'm going to visit this wonderful country!", 12);

        post1.addComments(comment1);
        post1.addComments(comment2);

        System.out.println(post1);



        Comment comment3 = new Comment("Good night");
        Comment comment4 = new Comment("May the Force be with you");
        Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"),"Good night guys",
                "See you tomorrow", 5);

        post2.addComments(comment3);
        post2.addComments(comment4);

        System.out.println(post2);
    }
}
