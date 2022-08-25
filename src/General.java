public class General {
    public static void main(String[] args) {

        Server server = new Server();
        Client c1 = new Client("Inna", Priority.VIP);
        Client c2 = new Client("Egor", Priority.VIP);
        Client c3 = new Client("Ann", Priority.STANDARD);
        Client c4 = new Client("Ivan", Priority.LOW);
        Client c5 = new Client("Serg", Priority.STANDARD);
        Client c6 = new Client("Dan", Priority.LOW);
        Client c7 = new Client("Kate", Priority.STANDARD);
        Client c8 = new Client("Max", Priority.VIP);
        Client c9 = new Client("Nastya", Priority.STANDARD);

        server.addInQueue(c1);
        server.addInQueue(c2);
        server.addInQueue(c3);
        server.addInQueue(c4);
        server.addInQueue(c5);
        server.addInQueue(c6);
        server.addInQueue(c7);
        server.addInQueue(c8);
        server.addInQueue(c9);

        server.showQueue();
    }
}
