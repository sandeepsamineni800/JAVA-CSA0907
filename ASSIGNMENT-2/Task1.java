public class task1 {
    public static void main(String[] args) {

        int tickets = 1000;
        int fields = 50;

        long start, end;

        // String
        start = System.nanoTime();

        for (int i = 0; i < tickets; i++) {
            String ticket = "";
            for (int j = 0; j < fields; j++) {
                ticket = ticket + "Field" + j + " ";
            }
        }

        end = System.nanoTime();
        long stringTime = end - start;

        // StringBuilder
        start = System.nanoTime();

        for (int i = 0; i < tickets; i++) {
            StringBuilder ticket = new StringBuilder();

            for (int j = 0; j < fields; j++) {
                ticket.append("Field").append(j).append(" ");
            }
        }

        end = System.nanoTime();
        long builderTime = end - start;

        // StringBuffer
        start = System.nanoTime();

        for (int i = 0; i < tickets; i++) {
            StringBuffer ticket = new StringBuffer();

            for (int j = 0; j < fields; j++) {
                ticket.append("Field").append(j).append(" ");
            }
        }

        end = System.nanoTime();
        long bufferTime = end - start;

        System.out.println("String Time: " + stringTime + " ns");
        System.out.println("StringBuilder Time: " + builderTime + " ns");
        System.out.println("StringBuffer Time: " + bufferTime + " ns");
    }
}

