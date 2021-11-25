package domain;

public class Post {

    private String idPost;
    private String idAuthor;
    private String imageURL;
    private String text;
    private int data;
    private boolean bookmark;

    //Дополненые поля
    private String idOwner;
    private String createdBy;
    private String replyOwnerId;
    private String replyPostId;
    private boolean friendsOnly;
    private CommentsInfo commentsInfo;
    private Copyright copyright;
    private LikeInfo LikeInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private String postType;
    private PostSource postsource;
    private Geo geo;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private Donut donut;
    private String postponedId;

}
