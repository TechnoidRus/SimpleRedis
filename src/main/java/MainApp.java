import redis.clients.jedis.Jedis;

public class MainApp {

  public static void main(String[] args) {

    Jedis client = new Jedis("localhost", 6379);
    //задание 1
    Cites cites = new Cites(client);
    cites.start();
    //задние 2
    MeetingWebsiteLog log = new MeetingWebsiteLog(client);
    log.start();
  }
}

