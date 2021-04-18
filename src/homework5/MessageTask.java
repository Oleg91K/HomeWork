package homework5;



import java.util.*;

public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритела
        //  Ответ в консоль
        //LOW.MEDIUM.HIGH.URGENT
        int[]counts=new int[Message.MessagePriority.values().length];
        for (Message message : messageList) {
            counts[message.getPriority().ordinal()]++;
        }


    }

    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
        //hashMap<код сообщения,количество сообщенийю
        HashMap<Integer,Integer> countMap = new HashMap<>();
        for (Message message : messageList) {
            if(countMap.containsKey(message.getCode())) {
                countMap.put(message.getCode(), countMap.get(message.getCode()) + 1);
            }else{
                countMap.put(message.getCode(),1);
            }
        }
        /*
        for (Message message : messageList) {
        int code=message.getCode();
            if(countMap.containsKey(CODE)) {
                countMap.put(CODE), countMap.get(CODE) + 1);
            }else{
                countMap.put(CODE,1);
         */
        /*HashMap<Integer,Integer> countMap2 = new HashMap<>();
        for (Message message : messageList) {
        int code=message.getCode();
        countMap2.put(code.countMap2.getOrDefault(code,0)+1);
        if(countMap2.containsKey(code)) {
            countMap2.put(code, countMap2.get(code) + 1);
        }else{
            countMap2.put(code,1);
            */
        }


    public static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
        System.out.println(new HashSet<>(messageList).size());
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        return null;
    }

    public static List<Message> copyEach(List<Message> messageList, Message.MessagePriority priority) {
        // TODO: создать коллекцию и передать в нее ссылки на каждое сообщение с заданным приоритетом
        //  метод должен вернуть новую коллекцию
        return new ArrayList<>(new LinkedHashSet<>(messageList));//LinkedHashSet
    }

    public static List<Message> copyOther(List<Message> messageList, Message.MessagePriority priority) {
        // TODO: создать коллекцию и передать в нее ссылки на все сообщения, кроме тех, которые имеют заданный приоритет
        //  метод должен вернуть новую коллекцию
        return null;
    }

    public static void main(String[] args) {
        List<Message> messages = Message.MessageGenerator.generate(34);
        System.out.println(messages);
        // вызов методов
    }
}