public class Main3 {


    public static void main(String[] args) {

        /*// BYTEBUFFER *****************
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.put((byte) 10);
        buffer.put((byte) 20);
        // buffer.flip();
        //  buffer.clear();
        buffer.put((byte) 30);
        buffer.put((byte) 40);
        buffer.put((byte) 50);
        System.out.println(Arrays.toString(buffer.array()));*/

        /*// CHARBUFFER
        CharBuffer buffer = CharBuffer.allocate(1000);
        buffer.put('O');
        buffer.put('l');
        buffer.put('a');
        buffer.flip();
        // Using Stream
        *//*buffer.chars()
                .forEach(value -> System.out.print(((char) value)));*//*
        System.out.println(buffer);*/

        /*// Convert ByteBuffer to CharBuffer
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 108);
        byteBuffer.put((byte) -61);
        byteBuffer.put((byte) -95);
        byteBuffer.flip();
        Charset charset = StandardCharsets.UTF_8;
        CharBuffer charBuffer = charset.decode(byteBuffer);
        System.out.println(charBuffer);*/

        /*// Convert CharBuffer to ByteBuffer
        CharBuffer charBuffer = CharBuffer.allocate(1000);
        charBuffer.put('o');
        charBuffer.put('l');
        charBuffer.put('á');
        charBuffer.flip();
        System.out.println(charBuffer);
        ByteBuffer byteBuffer = StandardCharsets.UTF_8.encode(charBuffer);
        System.out.println(Arrays.toString(byteBuffer.array()));*/



    }


}
