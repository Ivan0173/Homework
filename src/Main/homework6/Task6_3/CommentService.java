package homework6.Task6_3;

import java.time.LocalDate;
import java.util.*;

public class CommentService {
    private List<Comment> commentList;

    CommentService(){
        this.commentList = new ArrayList<>();
    }
    CommentService(List<Comment> commentList){
        this.commentList = new ArrayList<>(commentList);
    }
    public List<Comment> getCommentList(){
        return commentList;
    }
    public void addComment(Comment comment){
        commentList.add(comment);
    }

    public Comment[] getSortModerationListComment(int page, int pageSize){
        Comment[] sortListComment = this.commentList.stream()
                .filter(e->e.getModeration())
                .sorted(Comparator.comparing(Comment::getDateCreation).reversed())
                .skip(page*pageSize)
                .limit(pageSize)
                        .toArray(Comment[]::new);
                return sortListComment;
    }
    public Comment[] getSortModerationListComment(){
        return this.getSortModerationListComment(0,Integer.MAX_VALUE);
    }
    public Comment[] getCommentOfAuthorSortByModeration(String nameAuthor, int page, int pageSize){
        Comment[] arrayComment = this.commentList.stream()
                .filter(e->e.getNameAuthor().equals(nameAuthor))
                .sorted(Comparator.comparing(Comment::getModeration))
                .skip(page*pageSize)
                .limit(pageSize)
                .toArray(Comment[]::new);
        return arrayComment;
    }

    public Comment[] getCommentOfAuthorSortByModeration(String nameAuthor){
        return this.getCommentOfAuthorSortByModeration(nameAuthor, 0, Integer.MAX_VALUE);
    }
    public Comment[] getCommentDate(LocalDate controlDate, int page, int pageSize){
        Comment[] arrayComment = this.commentList.stream()
                .filter(e->e.getDateCreation().compareTo(controlDate)>0)
                .distinct() // я не понимаю почему он не хочет работать, поэтому ниже написан костыль
                .toArray(Comment[]::new);
        //Начало костыля
        List<Comment> listComment = new ArrayList<>();
        listComment.add(arrayComment[0]);
        for (Comment comment: arrayComment){
            boolean dubl = false;
            for (Comment comment2: listComment) {
                if (comment.hashCode()==comment2.hashCode()) {
                   dubl=true;
                }
            }
            if(!dubl){
                listComment.add(comment);
            }
        }
        arrayComment = listComment.stream()
                .skip(page*pageSize)
                .limit(pageSize)
                .toArray(Comment[]::new);
        //Конец костыля
        return arrayComment;
    }
    public Comment[] getCommentDate(LocalDate controlDate){
        return this.getCommentDate(controlDate, 0,Integer.MAX_VALUE);
    }
}
