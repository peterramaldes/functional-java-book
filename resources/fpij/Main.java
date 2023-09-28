public class Main {
  public static void main(String[] args) throws Exception {
    FileWriterEAM.use("eam.txt", writerEAM -> {
        writerEAM.writeStuff("foo");
        writerEAM.writeStuff("bar");
        writerEAM.writeStuff("baz");
    });
  }
}
