package homework6.Task6_3;

import java.time.LocalDate;

public class Comment {
    private String nameAuthor;
    private LocalDate dateCreation;
    private boolean moderation;
    private String  textMessage;

    Comment(String nameAuthor,LocalDate dateCreation,boolean moderation,String textMessage){
        this.nameAuthor=nameAuthor;
        this.dateCreation=dateCreation;
        this.moderation=moderation;
        this.textMessage=textMessage;
    }
    public String getNameAuthor(){
        return this.nameAuthor;
    }
    public void setNameAuthor(String nameAuthor){
        this.nameAuthor=nameAuthor;
    }
    public LocalDate getDateCreation(){
        return this.dateCreation;
    }
    public void setDateCreation(LocalDate dateCreation){
        this.dateCreation=dateCreation;
    }
    public boolean getModeration(){
        return this.moderation;
    }
    public void setModeration(boolean moderation){
        this.moderation=moderation;
    }
    public String getTextMessage(){
        return this.textMessage;
    }
    public void setTextMessage(String textMessage){
        this.textMessage=textMessage;
    }


    public boolean equals(Comment obj) {
        return this==obj;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nameAuthor == null) ? 0 : nameAuthor.hashCode())
                + ((dateCreation == null) ? 0 : dateCreation.hashCode())
                + ((textMessage == null) ? 0 : textMessage.hashCode());
        return result;
    }
}
