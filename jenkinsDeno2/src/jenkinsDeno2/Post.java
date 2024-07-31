package jenkinsDeno2;

import java.util.Date;

public class Post {
public static void main(String args[]) {
	int postId=101;
	String postname="JWT";
	String description="JWT is json web token";
	Date dateofposting;
	System.out.println(postId+" "+postname+" "+description+" "+new Date());
}
}