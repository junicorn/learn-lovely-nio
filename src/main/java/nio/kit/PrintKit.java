package nio.kit;


import java.nio.CharBuffer;

public class PrintKit {

    /**
     * 打印缓存区数据，且不改变position
     *
     * @param buffer
     */
    public static void printBuffer(CharBuffer buffer) {
        for (int i = buffer.position(); i < buffer.limit(); i++) {
            System.out.print(buffer.get(i));
        }
        System.out.println("");
    }

}
