package com.hilaire.gestionstock.dto;

import com.hilaire.gestionstock.model.MvtStk;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Data
@Builder
public class MvtStkDto {

    private  Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;

    private ArticleDto article;

    public static MvtStkDto fromEntity(MvtStk mvtStk) {
        if (mvtStk == null){
            return null;
        }
        return MvtStkDto.builder()
                .id(mvtStk.getId())
                .dateMvt(mvtStk.getDateMvt())
                .quantite(mvtStk.getQuantite())

                .build();
    }

    public static MvtStk toEntity(MvtStkDto dto) {
        if (dto == null){
            return null;
        }
        MvtStk mvtStk = new MvtStk();
        mvtStk.setId(dto.getId());
        mvtStk.setDateMvt(dto.getDateMvt());
        mvtStk.setQuantite(dto.getQuantite());
        return mvtStk;
    }


}
