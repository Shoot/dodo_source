package com.dodopizza.persistence.entity;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DynamicDeliveryEntity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/dodopizza/persistence/entity/ClientDeliveryFeeLevelEntity;", "Lyi3;", "Lio/realm/n0;", "", "min", "D", "getMin", "()D", "setMin", "(D)V", "max", "getMax", "setMax", "fee", "getFee", "setFee", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "<init>", "(DDD)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class ClientDeliveryFeeLevelEntity extends n0 implements yi3, rec {
    private double fee;
    private String id;
    private double max;
    private double min;

    public ClientDeliveryFeeLevelEntity() {
        this(0.0d, 0.0d, 0.0d, 7, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public double getFee() {
        return realmGet$fee();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public double getMax() {
        return realmGet$max();
    }

    public double getMin() {
        return realmGet$min();
    }

    @Override // defpackage.rec
    public double realmGet$fee() {
        return this.fee;
    }

    @Override // defpackage.rec
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.rec
    public double realmGet$max() {
        return this.max;
    }

    @Override // defpackage.rec
    public double realmGet$min() {
        return this.min;
    }

    @Override // defpackage.rec
    public void realmSet$fee(double d) {
        this.fee = d;
    }

    @Override // defpackage.rec
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.rec
    public void realmSet$max(double d) {
        this.max = d;
    }

    @Override // defpackage.rec
    public void realmSet$min(double d) {
        this.min = d;
    }

    public void setFee(double d) {
        realmSet$fee(d);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setMax(double d) {
        realmSet$max(d);
    }

    public void setMin(double d) {
        realmSet$min(d);
    }

    public /* synthetic */ ClientDeliveryFeeLevelEntity(double d, double d2, double d3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public ClientDeliveryFeeLevelEntity(double d, double d2, double d3) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$min(d);
        realmSet$max(d2);
        realmSet$fee(d3);
    }
}
