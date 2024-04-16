package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.DoughTypeEntity;
import com.dodopizza.persistence.entity.menu.SizeGroupEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.menu.dto.DoughTypeDto;
import ru.dodopizza.backend.domain.menu.dto.SizeGroupDto;
/* compiled from: schemestransform.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002\u001a\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\t\u001a\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006\u001a\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000e¨\u0006\u0011"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/SizeGroupDto;", "sizeGroupDto", "Lfna;", DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/backend/domain/menu/dto/DoughTypeDto;", "dto", "Lw63;", "a", "sizeGroup", "Lcom/dodopizza/persistence/entity/menu/SizeGroupEntity;", "f", "entity", e.a, "doughType", "Lcom/dodopizza/persistence/entity/menu/DoughTypeEntity;", c.a, "b", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: rw9  reason: default package */
/* loaded from: classes4.dex */
public final class rw9 {
    public static final w63 a(DoughTypeDto doughTypeDto) {
        z65.h(doughTypeDto, "dto");
        return new w63(doughTypeDto.getDoughTypeId(), doughTypeDto.getName(), doughTypeDto.getShortName());
    }

    public static final w63 b(DoughTypeEntity doughTypeEntity) {
        z65.h(doughTypeEntity, "entity");
        return new w63(doughTypeEntity.getDoughId(), doughTypeEntity.getName(), doughTypeEntity.getShortName());
    }

    public static final DoughTypeEntity c(w63 w63Var) {
        z65.h(w63Var, "doughType");
        return new DoughTypeEntity(w63Var.d(), w63Var.e(), w63Var.f());
    }

    public static final fna d(SizeGroupDto sizeGroupDto) {
        z65.h(sizeGroupDto, "sizeGroupDto");
        return new fna(sizeGroupDto.getSizeGroupId(), sizeGroupDto.getName(), sizeGroupDto.getShortName());
    }

    public static final fna e(SizeGroupEntity sizeGroupEntity) {
        z65.h(sizeGroupEntity, "entity");
        return new fna(sizeGroupEntity.getSizeGroupId(), sizeGroupEntity.getName(), sizeGroupEntity.getShortName());
    }

    public static final SizeGroupEntity f(fna fnaVar) {
        z65.h(fnaVar, "sizeGroup");
        return new SizeGroupEntity(fnaVar.d(), fnaVar.e(), fnaVar.f());
    }
}
