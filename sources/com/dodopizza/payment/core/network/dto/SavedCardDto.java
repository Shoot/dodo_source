package com.dodopizza.payment.core.network.dto;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: SavedCardDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/dodopizza/payment/core/network/dto/SavedCardDto;", "", "id", "", Action.NAME_ATTRIBUTE, MessageAttributes.TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "payment-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SavedCardDto {
    private final String id;
    private final String name;
    private final String type;

    public SavedCardDto(String str, String str2, String str3) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, MessageAttributes.TYPE);
        this.id = str;
        this.name = str2;
        this.type = str3;
    }

    public static /* synthetic */ SavedCardDto copy$default(SavedCardDto savedCardDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savedCardDto.id;
        }
        if ((i & 2) != 0) {
            str2 = savedCardDto.name;
        }
        if ((i & 4) != 0) {
            str3 = savedCardDto.type;
        }
        return savedCardDto.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.type;
    }

    public final SavedCardDto copy(String str, String str2, String str3) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, MessageAttributes.TYPE);
        return new SavedCardDto(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedCardDto)) {
            return false;
        }
        SavedCardDto savedCardDto = (SavedCardDto) obj;
        if (z65.c(this.id, savedCardDto.id) && z65.c(this.name, savedCardDto.name) && z65.c(this.type, savedCardDto.type)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "SavedCardDto(id=" + this.id + ", name=" + this.name + ", type=" + this.type + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
