package homework6.Task6_3;

import java.time.LocalDate;

public class CommentServiceMain {
    public static void main(String[] args) {
        CommentService commentService = new CommentService();
        commentService.addComment(new Comment("Author2", LocalDate.of(2001, 12, 27), true, "astra"));
        commentService.addComment(new Comment("Author3", LocalDate.of(2001, 11, 23), true, "astra"));
        commentService.addComment(new Comment("Author1", LocalDate.of(2001, 10, 23), false, "astra"));
        commentService.addComment(new Comment("Author2", LocalDate.of(2001, 11, 22), true, "astra"));
        commentService.addComment(new Comment("Author1", LocalDate.of(2001, 12, 23), true, "astra"));

        Comment[] commentList = commentService.getCommentDate(LocalDate.of(2001, 11, 22), 0, 4);
        for (Comment comment : commentList) {
            System.out.println(comment.getNameAuthor() + " " + comment.getDateCreation().toString() + " " + comment.getModeration() + " " + comment.getTextMessage() + " " + comment.hashCode());
        }

    }
}
