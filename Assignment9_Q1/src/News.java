
public class News {
    int NewsID;
    String NewsPostbyUser;
    String NewsCommentbyUser;
    String NewsComment;
public News(int newsID, String newsPostbyUser, String newsCommentbyUser, String newsComment) {
	
 this.NewsID = newsID;
 this.NewsPostbyUser = newsPostbyUser;
 this.NewsCommentbyUser = newsCommentbyUser;
 this.NewsComment = newsComment;
}
public int getNewsID() {
 return NewsID;
}
public void setNewsID(int newsID) {
 NewsID = newsID;
}
public String getNewsPostbyUser() {
 return NewsPostbyUser;
}
public void setNewsPostbyUser(String newsPostbyUser) {
 NewsPostbyUser = newsPostbyUser;
}
public String getNewsCommentbyUser() {
 return NewsCommentbyUser;
}
public void setNewsCommentbyUser(String newsCommentbyUser) {
 NewsCommentbyUser = newsCommentbyUser;
}
public String getNewsComment() {
 return NewsComment;
}
public void setNewsComment(String newsComment) {
 NewsComment = newsComment;
}
@Override
public String toString() {
 return "News [NewsID=" + NewsID + ", NewsPostbyUser=" + NewsPostbyUser + ", NewsCommentbyUser="
   + NewsCommentbyUser + ", NewsComment=" + NewsComment + "]";
}
	
	
    

}
