package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.c66;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.country.dto.MapBoundsDto;
/* compiled from: CountryDtoConverter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002¨\u0006\u0006"}, d2 = {"Lru/dodopizza/backend/domain/country/dto/MapBoundsDto;", "Lc66;", c.a, "Lru/dodopizza/backend/domain/country/dto/MapBoundsDto$CoordinatesDto;", "Lc66$b;", "b", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: jy1  reason: default package */
/* loaded from: classes4.dex */
public final class jy1 {
    private static final c66.b b(MapBoundsDto.CoordinatesDto coordinatesDto) {
        return new c66.b(coordinatesDto.getLat(), coordinatesDto.getLon());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c66 c(MapBoundsDto mapBoundsDto) {
        return new c66(b(mapBoundsDto.getUpperLeftCorner()), b(mapBoundsDto.getLowerRightCorner()));
    }
}
