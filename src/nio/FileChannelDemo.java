package nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by hadoop on 17-2-21.
 * Java NIO FileChannel 示例演示
 */
public class FileChannelDemo {

    public static void main(String[] args) {

        RandomAccessFile aFile = null;
        int bytesRead;

        try {
            aFile = new RandomAccessFile("java_nio_data.txt", "rw");
            FileChannel fChannel = aFile.getChannel();

            ByteBuffer buf = ByteBuffer.allocate(100);
            System.out.println("FileSize: " + fChannel.size());
            bytesRead = fChannel.read(buf);
            while (bytesRead != -1) {
                System.out.println("Read " + bytesRead);
                buf.flip();
                while(buf.hasRemaining()){
                    System.out.print((char) buf.get());
                }
                buf.clear();
                bytesRead = fChannel.read(buf);
            }
            String newData = "New String to write to file..." +
                    System.currentTimeMillis() + "\n";
            buf.clear();
            buf.put(newData.getBytes());
            buf.flip();
            while (buf.hasRemaining()) {
                fChannel.write(buf);
            }

            aFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
