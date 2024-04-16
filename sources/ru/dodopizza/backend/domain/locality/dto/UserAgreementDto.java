package ru.dodopizza.backend.domain.locality.dto;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: UserAgreementDto.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0007\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/dodopizza/backend/domain/locality/dto/UserAgreementDto;", "", "title", "", RemoteMessageConst.Notification.URL, "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getUrl", "setUrl", "(Ljava/lang/String;)V", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserAgreementDto {
    @uca("title")
    private final String title;
    @uca(RemoteMessageConst.Notification.URL)
    private String url;

    public UserAgreementDto() {
        this(null, null, 3, null);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        z65.h(str, "<set-?>");
        this.url = str;
    }

    public UserAgreementDto(String str, String str2) {
        z65.h(str, "title");
        z65.h(str2, RemoteMessageConst.Notification.URL);
        this.title = str;
        this.url = str2;
    }

    public /* synthetic */ UserAgreementDto(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
