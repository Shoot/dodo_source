package ru.dodopizza.backend.domain.locality.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LocalityIdDto.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/dodopizza/backend/domain/locality/dto/LocalityIdDto;", "", "localityId", "", "(Ljava/lang/String;)V", "getLocalityId", "()Ljava/lang/String;", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LocalityIdDto {
    @uca("localityId")
    private final String localityId;

    public LocalityIdDto() {
        this(null, 1, null);
    }

    public final String getLocalityId() {
        return this.localityId;
    }

    public LocalityIdDto(String str) {
        z65.h(str, "localityId");
        this.localityId = str;
    }

    public /* synthetic */ LocalityIdDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
