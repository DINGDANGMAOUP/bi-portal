package com.yinlu.bi.portal.core.Result;

import lombok.Data;

/**
 * @author dzhao1
 */
@Data
public class Result<T> {
  private int code;
  private String msg;
  private T data;
}
