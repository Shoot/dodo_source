package com.dodopizza.persistence.entity.prizoteka;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PrizotekaLevelEntity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R$\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/dodopizza/persistence/entity/prizoteka/PrizotekaLevelEntity;", "Lyi3;", "Lio/realm/n0;", "", "minCartValue", "D", "getMinCartValue", "()D", "setMinCartValue", "(D)V", "", "progressDescription", "Ljava/lang/String;", "getProgressDescription", "()Ljava/lang/String;", "setProgressDescription", "(Ljava/lang/String;)V", "giftDescription", "getGiftDescription", "setGiftDescription", "id", "getId", "setId", "<init>", "(DLjava/lang/String;Ljava/lang/String;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class PrizotekaLevelEntity extends n0 implements yi3, ohc {
    private String giftDescription;
    private String id;
    private double minCartValue;
    private String progressDescription;

    public PrizotekaLevelEntity() {
        this(0.0d, null, null, 7, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getGiftDescription() {
        return realmGet$giftDescription();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public double getMinCartValue() {
        return realmGet$minCartValue();
    }

    public String getProgressDescription() {
        return realmGet$progressDescription();
    }

    @Override // defpackage.ohc
    public String realmGet$giftDescription() {
        return this.giftDescription;
    }

    @Override // defpackage.ohc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.ohc
    public double realmGet$minCartValue() {
        return this.minCartValue;
    }

    @Override // defpackage.ohc
    public String realmGet$progressDescription() {
        return this.progressDescription;
    }

    @Override // defpackage.ohc
    public void realmSet$giftDescription(String str) {
        this.giftDescription = str;
    }

    @Override // defpackage.ohc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.ohc
    public void realmSet$minCartValue(double d) {
        this.minCartValue = d;
    }

    @Override // defpackage.ohc
    public void realmSet$progressDescription(String str) {
        this.progressDescription = str;
    }

    public void setGiftDescription(String str) {
        z65.h(str, "<set-?>");
        realmSet$giftDescription(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setMinCartValue(double d) {
        realmSet$minCartValue(d);
    }

    public void setProgressDescription(String str) {
        z65.h(str, "<set-?>");
        realmSet$progressDescription(str);
    }

    public /* synthetic */ PrizotekaLevelEntity(double d, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public PrizotekaLevelEntity(double d, String str, String str2) {
        z65.h(str, "progressDescription");
        z65.h(str2, "giftDescription");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$minCartValue(d);
        realmSet$progressDescription(str);
        realmSet$giftDescription(str2);
    }
}
