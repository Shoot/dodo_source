package com.dodopizza.persistence.entity.locality;

import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.business.transport.MessageAttributes;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LegalInformationEntity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\"\u0010\u0011\u001a\u00020\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0005\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/dodopizza/persistence/entity/locality/LegalInformationEntity;", "Lyi3;", "Lio/realm/n0;", "", "title", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", RemoteMessageConst.Notification.URL, "getUrl", "setUrl", "text", "getText", "setText", "", MessageAttributes.TYPE, "I", "getType", "()I", "setType", "(I)V", "id", "getId", "setId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class LegalInformationEntity extends n0 implements yi3, lgc {
    private String id;
    private String text;
    private String title;
    private int type;
    private String url;

    public LegalInformationEntity() {
        this(null, null, null, 0, 15, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public String getText() {
        return realmGet$text();
    }

    public String getTitle() {
        return realmGet$title();
    }

    public int getType() {
        return realmGet$type();
    }

    public String getUrl() {
        return realmGet$url();
    }

    @Override // defpackage.lgc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.lgc
    public String realmGet$text() {
        return this.text;
    }

    @Override // defpackage.lgc
    public String realmGet$title() {
        return this.title;
    }

    @Override // defpackage.lgc
    public int realmGet$type() {
        return this.type;
    }

    @Override // defpackage.lgc
    public String realmGet$url() {
        return this.url;
    }

    @Override // defpackage.lgc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.lgc
    public void realmSet$text(String str) {
        this.text = str;
    }

    @Override // defpackage.lgc
    public void realmSet$title(String str) {
        this.title = str;
    }

    @Override // defpackage.lgc
    public void realmSet$type(int i) {
        this.type = i;
    }

    @Override // defpackage.lgc
    public void realmSet$url(String str) {
        this.url = str;
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setText(String str) {
        z65.h(str, "<set-?>");
        realmSet$text(str);
    }

    public void setTitle(String str) {
        z65.h(str, "<set-?>");
        realmSet$title(str);
    }

    public void setType(int i) {
        realmSet$type(i);
    }

    public void setUrl(String str) {
        z65.h(str, "<set-?>");
        realmSet$url(str);
    }

    public /* synthetic */ LegalInformationEntity(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? -1 : i);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public LegalInformationEntity(String str, String str2, String str3, int i) {
        z65.h(str, "title");
        z65.h(str2, RemoteMessageConst.Notification.URL);
        z65.h(str3, "text");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$title(str);
        realmSet$url(str2);
        realmSet$text(str3);
        realmSet$type(i);
    }
}
