package Task3;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class Server {
    private final String ip;
    private final String domains;

    public Server(String ip, String domains) {
        this.ip = ip;
        this.domains = domains;
    }

    public String getIp() {
        return ip;
    }

    public String getDomains() {
        return domains;
    }

    public String listening(Client client) throws InterruptedException {

        int randomNum = ThreadLocalRandom.current().nextInt(2, 6);

        for (int i = 0; i < randomNum; i++) {
            Thread.sleep(1000);
        }
        return "Status " + randomNum * 100 +" returned to " + client.getName()
                + " with priority " + client.getPriority() +". Time - "+ LocalDateTime.now().toString();
    }



}
