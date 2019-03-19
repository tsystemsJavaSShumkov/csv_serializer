package com.tsystems.app;

import com.tsystems.csvutil.Reader;
import com.tsystems.csvutil.impl.CsvReader;
import com.tsystems.serializer.util.SerializerUtil;

import java.util.List;
import java.util.Map;

public class Main
{
  public static void main(String[] args)
  {
    final Reader reader=new CsvReader();
    final Map<Integer, List<String>> map=reader.readCsv("app/files/file.csv");
    for (final int i : map.keySet())
    {
      final Entity entity=new Entity();
      final List<String> strings=map.get(i);
      entity.setId(Integer.valueOf(strings.get(0)));
      entity.setName(strings.get(1));
      SerializerUtil.serialize(entity, i);
    }

  }
}
