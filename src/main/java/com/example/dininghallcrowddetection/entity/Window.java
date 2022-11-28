package com.example.dininghallcrowddetection.entity;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author xic
 * @since 2022-11-12
 */
@Getter
@Setter
  public class Window implements Serializable {

    private static final long serialVersionUID = 1L;

      private Integer id;

    private String name;

    private Integer number;

    private Integer pid;

    private Boolean isOpen;


}
