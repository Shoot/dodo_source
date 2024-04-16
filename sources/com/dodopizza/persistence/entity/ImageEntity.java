package com.dodopizza.persistence.entity;

import com.huawei.hms.push.constant.RemoteMessageConst;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ImageEntity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/dodopizza/persistence/entity/ImageEntity;", "Lyi3;", "Lio/realm/n0;", "", "size", "I", "getSize", "()I", "setSize", "(I)V", "", RemoteMessageConst.Notification.URL, "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "id", "getId", "setId", "<init>", "(ILjava/lang/String;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class ImageEntity extends n0 implements yi3, uec {
    private String id;
    private int size;
    private String url;

    public ImageEntity() {
        this(0, null, 3, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public int getSize() {
        return realmGet$size();
    }

    public String getUrl() {
        return realmGet$url();
    }

    @Override // defpackage.uec
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.uec
    public int realmGet$size() {
        return this.size;
    }

    @Override // defpackage.uec
    public String realmGet$url() {
        return this.url;
    }

    @Override // defpackage.uec
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.uec
    public void realmSet$size(int i) {
        this.size = i;
    }

    @Override // defpackage.uec
    public void realmSet$url(String str) {
        this.url = str;
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setSize(int i) {
        realmSet$size(i);
    }

    public void setUrl(String str) {
        z65.h(str, "<set-?>");
        realmSet$url(str);
    }

    public /* synthetic */ ImageEntity(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public ImageEntity(int i, String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$size(i);
        realmSet$url(str);
    }
}
