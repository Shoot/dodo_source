package com.dodopizza.ospayments.model;

import kotlin.Metadata;
/* compiled from: CreateTokenResponseDto.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/dodopizza/ospayments/model/CreateTokenResponseDto;", "", "tokenType", "", "state", "token", "created", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreated", "()Ljava/lang/String;", "getState", "getToken", "getTokenType", "ospayments_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CreateTokenResponseDto {
    @uca("created")
    private final String created;
    @uca("state")
    private final String state;
    @uca("token")
    private final String token;
    @uca("token_type")
    private final String tokenType;

    public CreateTokenResponseDto(String str, String str2, String str3, String str4) {
        z65.h(str, "tokenType");
        z65.h(str2, "state");
        z65.h(str3, "token");
        z65.h(str4, "created");
        this.tokenType = str;
        this.state = str2;
        this.token = str3;
        this.created = str4;
    }

    public final String getCreated() {
        return this.created;
    }

    public final String getState() {
        return this.state;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getTokenType() {
        return this.tokenType;
    }
}
