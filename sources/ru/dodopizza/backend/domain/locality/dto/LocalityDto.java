package ru.dodopizza.backend.domain.locality.dto;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.BonusActionEntity;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: LocalityDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0014"}, d2 = {"Lru/dodopizza/backend/domain/locality/dto/LocalityDto;", "", "id", "", MessageAttributes.UUID, Action.NAME_ATTRIBUTE, BonusActionEntity.ORDER, "", "isTop", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "()Z", "getName", "getOrder", "()I", "getUuid", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LocalityDto {
    @uca("id")
    private final String id;
    @uca("isTop")
    private final boolean isTop;
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca(BonusActionEntity.ORDER)
    private final int order;
    @uca("uuId")
    private final String uuid;

    public LocalityDto(String str, String str2, String str3, int i, boolean z) {
        z65.h(str, "id");
        z65.h(str2, MessageAttributes.UUID);
        z65.h(str3, Action.NAME_ATTRIBUTE);
        this.id = str;
        this.uuid = str2;
        this.name = str3;
        this.order = i;
        this.isTop = z;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getOrder() {
        return this.order;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final boolean isTop() {
        return this.isTop;
    }

    public static /* synthetic */ void getId$annotations() {
    }
}
