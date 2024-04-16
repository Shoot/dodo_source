package ru.dodopizza.backend.domain.customer.dto;

import kotlin.Metadata;
/* compiled from: DeleteAddressRequestDto.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lru/dodopizza/backend/domain/customer/dto/DeleteAddressRequestDto;", "", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeleteAddressRequestDto {
    @uca("id")
    @mn3
    private String id;

    public DeleteAddressRequestDto(String str) {
        z65.h(str, "id");
        this.id = str;
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        z65.h(str, "<set-?>");
        this.id = str;
    }
}
