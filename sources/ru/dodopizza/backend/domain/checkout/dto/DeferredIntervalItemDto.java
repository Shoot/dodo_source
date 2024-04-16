package ru.dodopizza.backend.domain.checkout.dto;

import kotlin.Metadata;
/* compiled from: DeferredIntervalItemDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, d2 = {"Lru/dodopizza/backend/domain/checkout/dto/DeferredIntervalItemDto;", "", "title", "", "deferredTime", "comment", "Lru/dodopizza/backend/domain/checkout/dto/DeferredIntervalCommentDto;", "disabled", "", "suggested", "(Ljava/lang/String;Ljava/lang/String;Lru/dodopizza/backend/domain/checkout/dto/DeferredIntervalCommentDto;ZZ)V", "getComment", "()Lru/dodopizza/backend/domain/checkout/dto/DeferredIntervalCommentDto;", "getDeferredTime", "()Ljava/lang/String;", "getDisabled", "()Z", "getSuggested", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeferredIntervalItemDto {
    @uca("comment")
    private final DeferredIntervalCommentDto comment;
    @uca("deferredTime")
    private final String deferredTime;
    @uca("disabled")
    private final boolean disabled;
    @uca("suggested")
    private final boolean suggested;
    @uca("title")
    private final String title;

    public DeferredIntervalItemDto(String str, String str2, DeferredIntervalCommentDto deferredIntervalCommentDto, boolean z, boolean z2) {
        z65.h(str, "title");
        this.title = str;
        this.deferredTime = str2;
        this.comment = deferredIntervalCommentDto;
        this.disabled = z;
        this.suggested = z2;
    }

    public static /* synthetic */ DeferredIntervalItemDto copy$default(DeferredIntervalItemDto deferredIntervalItemDto, String str, String str2, DeferredIntervalCommentDto deferredIntervalCommentDto, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deferredIntervalItemDto.title;
        }
        if ((i & 2) != 0) {
            str2 = deferredIntervalItemDto.deferredTime;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            deferredIntervalCommentDto = deferredIntervalItemDto.comment;
        }
        DeferredIntervalCommentDto deferredIntervalCommentDto2 = deferredIntervalCommentDto;
        if ((i & 8) != 0) {
            z = deferredIntervalItemDto.disabled;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = deferredIntervalItemDto.suggested;
        }
        return deferredIntervalItemDto.copy(str, str3, deferredIntervalCommentDto2, z3, z2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.deferredTime;
    }

    public final DeferredIntervalCommentDto component3() {
        return this.comment;
    }

    public final boolean component4() {
        return this.disabled;
    }

    public final boolean component5() {
        return this.suggested;
    }

    public final DeferredIntervalItemDto copy(String str, String str2, DeferredIntervalCommentDto deferredIntervalCommentDto, boolean z, boolean z2) {
        z65.h(str, "title");
        return new DeferredIntervalItemDto(str, str2, deferredIntervalCommentDto, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeferredIntervalItemDto)) {
            return false;
        }
        DeferredIntervalItemDto deferredIntervalItemDto = (DeferredIntervalItemDto) obj;
        if (z65.c(this.title, deferredIntervalItemDto.title) && z65.c(this.deferredTime, deferredIntervalItemDto.deferredTime) && z65.c(this.comment, deferredIntervalItemDto.comment) && this.disabled == deferredIntervalItemDto.disabled && this.suggested == deferredIntervalItemDto.suggested) {
            return true;
        }
        return false;
    }

    public final DeferredIntervalCommentDto getComment() {
        return this.comment;
    }

    public final String getDeferredTime() {
        return this.deferredTime;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final boolean getSuggested() {
        return this.suggested;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.title.hashCode() * 31;
        String str = this.deferredTime;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        DeferredIntervalCommentDto deferredIntervalCommentDto = this.comment;
        if (deferredIntervalCommentDto != null) {
            i = deferredIntervalCommentDto.hashCode();
        }
        return ((((i2 + i) * 31) + a91.a(this.disabled)) * 31) + a91.a(this.suggested);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.deferredTime;
        DeferredIntervalCommentDto deferredIntervalCommentDto = this.comment;
        boolean z = this.disabled;
        boolean z2 = this.suggested;
        return "DeferredIntervalItemDto(title=" + str + ", deferredTime=" + str2 + ", comment=" + deferredIntervalCommentDto + ", disabled=" + z + ", suggested=" + z2 + ")";
    }
}
