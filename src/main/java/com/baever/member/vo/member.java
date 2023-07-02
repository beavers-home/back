package com.baever.member.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class member {

    private int idSeq;
    private String id;
    private String password;
    private String name;
    private int boxSeq;
    private String boxName;
    private String email;
    private String nickName;
    private String date;
}
