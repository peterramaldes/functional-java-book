import java.io.*;

public class FileWriterEAM {
  private final FileWriter writer;

  private FileWriterEAM(final String fileName) throws IOException {
    writer = new FileWriter(fileName);
  }

  public static void use(final String fileName, 
      final UseInstance<FileWriterEAM, IOException> block) throws IOException {

    final FileWriterEAM writerEAM = new FileWriterEAM(fileName);
    try {
      block.accept(writerEAM);
    } finally {
      writerEAM.close();
    }

  }

  private void close() throws IOException {
    System.out.println("close called automatically...");
    writer.close();
  }

  public void writeStuff(final String message) throws IOException {
    writer.write(message);
  }

}
