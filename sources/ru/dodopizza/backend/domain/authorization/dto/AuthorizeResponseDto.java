package ru.dodopizza.backend.domain.authorization.dto;

import kotlin.Metadata;
/* compiled from: AuthorizeResponseDto.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/dodopizza/backend/domain/authorization/dto/AuthorizeResponseDto;", "", "token", "", "resultCode", "", "isNew", "", "(Ljava/lang/String;IZ)V", "()Z", "getResultCode", "()I", "getToken", "()Ljava/lang/String;", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AuthorizeResponseDto {
    @uca("isNew")
    @mn3
    private final boolean isNew;
    @uca("errorCode")
    @mn3
    private final int resultCode;
    @uca("token")
    @mn3
    private final String token;

    public AuthorizeResponseDto(String str, int i, boolean z) {
        z65.h(str, "token");
        this.token = str;
        this.resultCode = i;
        this.isNew = z;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public final String getToken() {
        return this.token;
    }

    public final boolean isNew() {
        return this.isNew;
    }
}
