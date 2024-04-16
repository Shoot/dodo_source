package ru.dodopizza.backend.domain.geo;

import kotlin.Metadata;
/* compiled from: LocalityByCoordsDto.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/dodopizza/backend/domain/geo/LocalityByCoordsDto;", "", "localityId", "", "(Ljava/lang/String;)V", "getLocalityId", "()Ljava/lang/String;", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LocalityByCoordsDto {
    @uca("localityId")
    private final String localityId;

    public LocalityByCoordsDto(String str) {
        this.localityId = str;
    }

    public final String getLocalityId() {
        return this.localityId;
    }
}
