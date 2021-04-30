package com.yinlu.bi.portal.core.exception;

import lombok.Data;

/**
 * 系统异常
 * @author dzhao1
 */
@Data
public class SystemException extends RuntimeException{
  private static final long serialVersionUID = 1L;

  private String msg;
  private int code = 500;

}
