package ru.dodopizza.backend.domain.locality.dto;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LegalInformationDto.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bR \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lru/dodopizza/backend/domain/locality/dto/LegalInformationDto;", "", "typeId", "", "title", "", RemoteMessageConst.Notification.URL, "text", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getTitle", "getTypeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUrl", "setUrl", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LegalInformationDto {
    @uca("text")
    private String text;
    @uca("title")
    private final String title;
    @uca("typeId")
    private final Integer typeId;
    @uca(RemoteMessageConst.Notification.URL)
    private String url;

    public LegalInformationDto() {
        this(null, null, null, null, 15, null);
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getTypeId() {
        return this.typeId;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public LegalInformationDto(Integer num, String str, String str2, String str3) {
        this.typeId = num;
        this.title = str;
        this.url = str2;
        this.text = str3;
    }

    public /* synthetic */ LegalInformationDto(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
