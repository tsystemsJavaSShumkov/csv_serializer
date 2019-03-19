package com.tsystems.serializer.util;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class SerializerUtil
{
  private SerializerUtil()
  {
    throw new AssertionError();
  }

  public static void serialize(final Serializable entity, final int i)
  {
    try (OutputStream outputStream=Files.newOutputStream(Paths.get("app/files/save_" + i + ".ser"));
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream))
    {
      objectOutputStream.writeObject(entity);
    }
    catch (IOException e)
    {
      throw new RuntimeException(e);
    }
  }
}
