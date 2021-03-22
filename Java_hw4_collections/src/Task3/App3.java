package Task3;

import java.time.LocalDateTime;
import java.util.*;

public class App3 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alex", "Jhon", "Stepan", "Anton", "Anna", "German", "Julia");
        Map<Client, Date> clientsQueue = new TreeMap(Comparator.comparing(Client::getPriority).reversed().thenComparing(Client::getName));
        Server server = new Server("192.0.0.1", "mySite.com");

        Random rand = new Random();
        int i = 0;
        while (clientsQueue.size() < names.size()) {
            int prior = rand.nextInt(10);
            clientsQueue.put(new Client(names.get(i), prior), new Date());
            i++;
        }

        Map<Client, String> statistic = new TreeMap<>(Comparator.comparing(Client::getPriority).reversed().thenComparing(Client::getName));

        LocalDateTime requestTime;
        String res;
        System.out.println("***   Queue to " + server.getDomains() + ": " + server.getIp() + "   ***");
        for (Client client : clientsQueue.keySet()) {
            requestTime = LocalDateTime.now();
            res = "requested time - " + requestTime.toString();
            try {
                res += "\n" + server.listening(client);
                statistic.put(client, res);
                System.out.println("Client "+ client.getName() + ": requested time - " + requestTime.toString()+ "\n");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        statistic.forEach((key, value) -> System.out.println("Client " + key.getName() + ": " + value + "\n"));
    }
}
