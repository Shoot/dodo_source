package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ranges.i;
import ru.dodopizza.backend.domain.menu.dto.SizeGroupDto;
import ru.dodopizza.backend.domain.menu.dto.SizeSchemeDto;
/* compiled from: SizeGroupResolver.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016R,\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\u0010"}, d2 = {"Lhna;", "Lgna;", "", "sizeSchemeId", "sizeId", "Lfna;", "a", "", "", "Ljava/util/Map;", "map", "", "Lru/dodopizza/backend/domain/menu/dto/SizeSchemeDto;", "sizeSchemeDtoList", "<init>", "(Ljava/util/List;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hna  reason: default package */
/* loaded from: classes4.dex */
public final class hna implements gna {
    private final Map<String, Map<Integer, fna>> a;

    public hna(List<SizeSchemeDto> list) {
        int w;
        int e;
        int e2;
        int w2;
        int e3;
        int e4;
        z65.h(list, "sizeSchemeDtoList");
        List<SizeSchemeDto> list2 = list;
        w = lc1.w(list2, 10);
        e = f86.e(w);
        e2 = i.e(e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (SizeSchemeDto sizeSchemeDto : list2) {
            String id = sizeSchemeDto.getId();
            List<SizeGroupDto> sizeGroups = sizeSchemeDto.getSizeGroups();
            w2 = lc1.w(sizeGroups, 10);
            e3 = f86.e(w2);
            e4 = i.e(e3, 16);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(e4);
            for (SizeGroupDto sizeGroupDto : sizeGroups) {
                linkedHashMap2.put(Integer.valueOf(sizeGroupDto.getSizeGroupId()), rw9.d(sizeGroupDto));
            }
            linkedHashMap.put(id, linkedHashMap2);
        }
        this.a = linkedHashMap;
    }

    @Override // defpackage.gna
    public fna a(String str, String str2) {
        Integer num;
        Map<Integer, fna> map;
        if (str2 != null) {
            num = k0b.k(str2);
        } else {
            num = null;
        }
        if (str == null || num == null || (map = this.a.get(str)) == null) {
            return null;
        }
        return map.get(num);
    }
}
