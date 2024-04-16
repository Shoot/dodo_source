package com.dodopizza.persistence.entity.orderrating;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RatingPhotoEntity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\"\u0010\u0010\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\"\u0010\u0014\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/dodopizza/persistence/entity/orderrating/RatingPhotoEntity;", "Lyi3;", "Lio/realm/n0;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "orderId", "getOrderId", "setOrderId", "filePath", "getFilePath", "setFilePath", "compressedFilePath", "getCompressedFilePath", "setCompressedFilePath", "", "uploaded", "Z", "getUploaded", "()Z", "setUploaded", "(Z)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class RatingPhotoEntity extends n0 implements yi3, chc {
    private String compressedFilePath;
    private String filePath;
    private String id;
    private String orderId;
    private boolean uploaded;

    public RatingPhotoEntity() {
        this(null, null, null, null, false, 31, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getCompressedFilePath() {
        return realmGet$compressedFilePath();
    }

    public String getFilePath() {
        return realmGet$filePath();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public String getOrderId() {
        return realmGet$orderId();
    }

    public boolean getUploaded() {
        return realmGet$uploaded();
    }

    @Override // defpackage.chc
    public String realmGet$compressedFilePath() {
        return this.compressedFilePath;
    }

    @Override // defpackage.chc
    public String realmGet$filePath() {
        return this.filePath;
    }

    @Override // defpackage.chc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.chc
    public String realmGet$orderId() {
        return this.orderId;
    }

    @Override // defpackage.chc
    public boolean realmGet$uploaded() {
        return this.uploaded;
    }

    @Override // defpackage.chc
    public void realmSet$compressedFilePath(String str) {
        this.compressedFilePath = str;
    }

    @Override // defpackage.chc
    public void realmSet$filePath(String str) {
        this.filePath = str;
    }

    @Override // defpackage.chc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.chc
    public void realmSet$orderId(String str) {
        this.orderId = str;
    }

    @Override // defpackage.chc
    public void realmSet$uploaded(boolean z) {
        this.uploaded = z;
    }

    public void setCompressedFilePath(String str) {
        z65.h(str, "<set-?>");
        realmSet$compressedFilePath(str);
    }

    public void setFilePath(String str) {
        z65.h(str, "<set-?>");
        realmSet$filePath(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setOrderId(String str) {
        z65.h(str, "<set-?>");
        realmSet$orderId(str);
    }

    public void setUploaded(boolean z) {
        realmSet$uploaded(z);
    }

    public /* synthetic */ RatingPhotoEntity(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? false : z);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public RatingPhotoEntity(String str, String str2, String str3, String str4, boolean z) {
        z65.h(str2, "orderId");
        z65.h(str3, "filePath");
        z65.h(str4, "compressedFilePath");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$id(str);
        realmSet$orderId(str2);
        realmSet$filePath(str3);
        realmSet$compressedFilePath(str4);
        realmSet$uploaded(z);
    }
}
