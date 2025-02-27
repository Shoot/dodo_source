package ru.dodopizza.backend.domain.country.dto;

import kotlin.Metadata;
/* compiled from: FeedbackDto.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lru/dodopizza/backend/domain/country/dto/FeedbackDto;", "", "()V", "email", "", "getEmail", "()Ljava/lang/String;", "phone", "getPhone", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FeedbackDto {
    @uca("email")
    private final String email;
    @uca("phone")
    private final String phone;

    public final String getEmail() {
        return this.email;
    }

    public final String getPhone() {
        return this.phone;
    }
}
