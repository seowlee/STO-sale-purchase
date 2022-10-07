package com.sto.sale.backstosale.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    private Long user_id;
    private Integer user_account;
    private String user_nm;


    public void update_user(Long user_id, Integer buyPrice) {
        this.user_id = user_id;
        this.user_account -= buyPrice;
    }
}
