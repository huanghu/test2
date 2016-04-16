package proxy.jdk;

public class ForumServiceImpl implements ForumService {

	@Override
	public void removeTopic(int topicId) {
		System.out.println("remove topic");
	}

	@Override
	public void removeForum(int forumId) {
		System.out.println("remove forum");
	}

}
