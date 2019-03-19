package com.tsystems.csvutil.impl;

import com.tsystems.csvutil.Reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CsvReader implements Reader
{
  @Override public Map<Integer, List<String>> readCsv(final String pathToFile)
  {
    final Path path =Paths.get(pathToFile);
    final Map<Integer, List<String>> map=new HashMap<>();
    try(BufferedReader reader=Files.newBufferedReader(path))
    {
      String line;
      int i=0;
      while ((line = reader.readLine()) != null)
      {
        final String[] split=line.split(":");
        map.put(i++, Arrays.asList(split));
      }
    }
    catch (IOException e)
    {
      throw new RuntimeException(e);
    }
    return map;
  }
}
