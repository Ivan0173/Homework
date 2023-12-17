package homework6.Task6_3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CommentServiceTest {
    CommentService commentService;

    @Test
    void getCommentList() {
    }

    @Test
    void addComment() {
    }

    @Test
    void getSortModerationListComment() {
        commentService = new CommentService();
        commentService.addComment(new Comment("Author2", LocalDate.of(2001, 12, 27), false, "astra"));
        commentService.addComment(new Comment("Author3", LocalDate.of(2001, 11, 23), true, "astra"));
        commentService.addComment(new Comment("Author1", LocalDate.of(2001, 10, 23), false, "astra"));
        commentService.addComment(new Comment("Author2", LocalDate.of(2001, 11, 22), true, "astra"));
        commentService.addComment(new Comment("Author1", LocalDate.of(2001, 12, 23), true, "astra"));

        Comment[] expectedArray = new Comment[3];
        expectedArray[0] = commentService.getCommentByIndex(4);
        expectedArray[1] = commentService.getCommentByIndex(1);
        expectedArray[2] = commentService.getCommentByIndex(3);

        Comment[] resultArray = commentService.getSortModerationListComment();
        for (int i = 0; i < resultArray.length; i++) {
            assertEquals(expectedArray[i], resultArray[i]);
        }
        //Постраничный вывод
        resultArray = commentService.getSortModerationListComment(0, 1);
        assertEquals(expectedArray[0], resultArray[0]);

        resultArray = commentService.getSortModerationListComment(1, 1);
        assertEquals(expectedArray[1], resultArray[0]);

        resultArray = commentService.getSortModerationListComment(2, 1);
        assertEquals(expectedArray[2], resultArray[0]);

        resultArray = commentService.getSortModerationListComment(3, 1);
        assertEquals(0, resultArray.length);
    }

    @Test
    void testGetSortModerationListComment() {
    }

    @Test
    void getCommentOfAuthorSortByModeration() {
        commentService = new CommentService();
        commentService.addComment(new Comment("Author2", LocalDate.of(2001, 12, 27), false, "astra"));
        commentService.addComment(new Comment("Author3", LocalDate.of(2001, 11, 23), true, "astra"));
        commentService.addComment(new Comment("Author1", LocalDate.of(2001, 10, 23), false, "astra"));
        commentService.addComment(new Comment("Author2", LocalDate.of(2001, 11, 22), true, "astra"));
        commentService.addComment(new Comment("Author1", LocalDate.of(2001, 12, 23), true, "astra"));

        Comment[] expectedArray = new Comment[2];
        expectedArray[0] = commentService.getCommentByIndex(2);
        expectedArray[1] = commentService.getCommentByIndex(4);

        Comment[] resultArray = commentService.getCommentOfAuthorSortByModeration("Author1");
        for (int i = 0; i < resultArray.length; i++) {
            assertEquals(expectedArray[i], resultArray[i]);
        }
    }

    @Test
    void testGetCommentOfAuthorSortByModeration() {
    }

    @Test
    void getCommentDate() {
        commentService = new CommentService();
        commentService.addComment(new Comment("Author2", LocalDate.of(2001, 12, 27), false, "astra"));
        commentService.addComment(new Comment("Author3", LocalDate.of(2001, 11, 23), true, "astra"));
        commentService.addComment(new Comment("Author2", LocalDate.of(2001, 11, 22), true, "astra"));
        commentService.addComment(new Comment("Author1", LocalDate.of(2001, 10, 23), false, "astra"));
        commentService.addComment(new Comment("Author1", LocalDate.of(2001, 12, 23), true, "astra"));
        commentService.addComment(new Comment("Author2", LocalDate.of(2001, 12, 27), false, "astra"));

        Comment[] expectedArray = new Comment[3];
        expectedArray[0] = commentService.getCommentByIndex(0);
        expectedArray[1] = commentService.getCommentByIndex(1);
        expectedArray[2] = commentService.getCommentByIndex(4);

        Comment[] resultArray = commentService.getCommentDate(LocalDate.of(2001, 11, 22));
        for (int i = 0; i < resultArray.length; i++) {
            assertEquals(expectedArray[i], resultArray[i]);
        }
    }

    @Test
    void testGetCommentDate() {
    }
}