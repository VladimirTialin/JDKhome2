package org.jdk.home2;

public class DeveloperFull implements FullStack{

    @Override
    public void createServer() {
        System.out.println("Сделал сервер");
    }

    @Override
    public void createFront() {
        System.out.println("Создал сайт");
    }

    @Override
    public void developGUI() {
        System.out.println("Создал графический интерфейс пользователя");
    }
}
