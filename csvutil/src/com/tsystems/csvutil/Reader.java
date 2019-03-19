package com.tsystems.csvutil;

import java.util.List;
import java.util.Map;

public interface Reader
{
  Map<Integer, List<String>> readCsv(final String pathToFile);
}
