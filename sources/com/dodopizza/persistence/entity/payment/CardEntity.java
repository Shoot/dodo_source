package com.dodopizza.persistence.entity.payment;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CardEntity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\r\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR$\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR$\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/dodopizza/persistence/entity/payment/CardEntity;", "Lyi3;", "Lio/realm/n0;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "startPart", "getStartPart", "setStartPart", "endPart", "getEndPart", "setEndPart", "expiryMonth", "getExpiryMonth", "setExpiryMonth", "expiryYear", "getExpiryYear", "setExpiryYear", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class CardEntity extends n0 implements yi3, dhc {
    private String endPart;
    private String expiryMonth;
    private String expiryYear;
    private String id;
    private String startPart;

    public CardEntity() {
        this(null, null, null, null, null, 31, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getEndPart() {
        return realmGet$endPart();
    }

    public String getExpiryMonth() {
        return realmGet$expiryMonth();
    }

    public String getExpiryYear() {
        return realmGet$expiryYear();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public String getStartPart() {
        return realmGet$startPart();
    }

    @Override // defpackage.dhc
    public String realmGet$endPart() {
        return this.endPart;
    }

    @Override // defpackage.dhc
    public String realmGet$expiryMonth() {
        return this.expiryMonth;
    }

    @Override // defpackage.dhc
    public String realmGet$expiryYear() {
        return this.expiryYear;
    }

    @Override // defpackage.dhc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.dhc
    public String realmGet$startPart() {
        return this.startPart;
    }

    @Override // defpackage.dhc
    public void realmSet$endPart(String str) {
        this.endPart = str;
    }

    @Override // defpackage.dhc
    public void realmSet$expiryMonth(String str) {
        this.expiryMonth = str;
    }

    @Override // defpackage.dhc
    public void realmSet$expiryYear(String str) {
        this.expiryYear = str;
    }

    @Override // defpackage.dhc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.dhc
    public void realmSet$startPart(String str) {
        this.startPart = str;
    }

    public void setEndPart(String str) {
        realmSet$endPart(str);
    }

    public void setExpiryMonth(String str) {
        realmSet$expiryMonth(str);
    }

    public void setExpiryYear(String str) {
        realmSet$expiryYear(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setStartPart(String str) {
        realmSet$startPart(str);
    }

    public /* synthetic */ CardEntity(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public CardEntity(String str, String str2, String str3, String str4, String str5) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$id(str);
        realmSet$startPart(str2);
        realmSet$endPart(str3);
        realmSet$expiryMonth(str4);
        realmSet$expiryYear(str5);
    }
}
