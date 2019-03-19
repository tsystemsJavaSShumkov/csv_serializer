package com.tsystems.app;

import java.io.Serializable;

public class Entity implements Serializable
{
  private Integer id;
  private String name;

  public void setId(final Integer id)
  {
    this.id=id;
  }

  public void setName(final String name)
  {
    this.name=name;
  }
}
