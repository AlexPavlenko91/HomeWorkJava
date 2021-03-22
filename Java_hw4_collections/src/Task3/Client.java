package Task3;

import java.util.Objects;

public class Client implements Comparable<Client> {
    private final String name;
    private final int priority;

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return priority == client.priority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority);
    }

    public Client(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Client o) {
        if (priority < o.priority) {
            return 0;
        } else if (priority > o.priority) {
            return -1;
        } else {
            return 1;
        }
    }
}
