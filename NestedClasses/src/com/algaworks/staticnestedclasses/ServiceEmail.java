package com.algaworks.staticnestedclasses;



public class ServiceEmail {

    private static Status status = Status.ACTIVATED;


    public static enum Status{
        ACTIVATED, BLOCKED;
    }

    public void send(Message message){
        System.out.printf("Sending from %s to %s: %s%n",
                message.getSender(),message.getDestination(),message.getText());
    }

    public static String generateSignature(){
        return "\n -- \n AlgaWorks";
    }

    public static Status getStatus() {
        return status;
    }

    public static void setStatus(Status status) {
        ServiceEmail.status = status;
    }

    // Static nested classes
    public static class Message {


        private final String sender;
        private final String destination;
        private final String text;

        public Message(String sender, String destination, String text) {
            this.sender = sender;
            this.destination = destination;
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public String getDestination() {
            return destination;
        }

        public String getText() {
            return text + generateSignature();
        }
    }

}
