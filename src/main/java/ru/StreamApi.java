package ru;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

    public static void train(){

        ArrayList<Devs> names = new ArrayList<>();
        Devs devs1 = new Devs("Nik", 1);
        devs1.getTasks().add(new Task("Задача 1",1));
        devs1.getTasks().add(new Task("Задача 2",2));
        devs1.getTasks().add(new Task("Задача 3",3));

        Devs devs2 = new Devs("Jane", 1);
        devs2.getTasks().add(new Task("Задача 1",1));
        devs2.getTasks().add(new Task("Задача 2",2));

        names.add(devs1);
        names.add(devs2);

        List<String> res = names.stream().filter(devs -> devs.getTasks().size() < 3).flatMap(devs -> Stream.of(String.format("Разработчик: %s, задачи: %d", devs.getName(), devs.getTasks().size()))).collect(Collectors.toList());
        System.err.println(res);
    }

    static class Devs{
        private String name;
        private ArrayList<Task> tasks = new ArrayList<>();
        private long id;

        public Devs(String name, long id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ArrayList<Task> getTasks() {
            return tasks;
        }

        public void setTasks(ArrayList<Task> tasks) {
            this.tasks = tasks;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Devs{" +
                    "name='" + name + '\'' +
                    ", tasks=" + tasks +
                    ", id=" + id +
                    '}';
        }
    }

    static class Task{
        private String title;
        private long id;

        public Task(String title, long id) {
            this.title = title;
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Task{" +
                    "title='" + title + '\'' +
                    ", id=" + id +
                    '}';
        }
    }
}
