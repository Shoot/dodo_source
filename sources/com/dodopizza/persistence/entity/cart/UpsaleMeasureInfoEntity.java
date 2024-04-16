package com.dodopizza.persistence.entity.cart;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: UpsaleMeasureInfoEntity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/UpsaleMeasureInfoEntity;", "Lyi3;", "Lio/realm/n0;", "", "measure", "I", "getMeasure", "()I", "setMeasure", "(I)V", "", "value", "F", "getValue", "()F", "setValue", "(F)V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "<init>", "(IF)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class UpsaleMeasureInfoEntity extends n0 implements yi3, bgc {
    private String id;
    private int measure;
    private float value;

    public UpsaleMeasureInfoEntity() {
        this(0, 0.0f, 3, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public int getMeasure() {
        return realmGet$measure();
    }

    public float getValue() {
        return realmGet$value();
    }

    @Override // defpackage.bgc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.bgc
    public int realmGet$measure() {
        return this.measure;
    }

    @Override // defpackage.bgc
    public float realmGet$value() {
        return this.value;
    }

    @Override // defpackage.bgc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.bgc
    public void realmSet$measure(int i) {
        this.measure = i;
    }

    @Override // defpackage.bgc
    public void realmSet$value(float f) {
        this.value = f;
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setMeasure(int i) {
        realmSet$measure(i);
    }

    public void setValue(float f) {
        realmSet$value(f);
    }

    public /* synthetic */ UpsaleMeasureInfoEntity(int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public UpsaleMeasureInfoEntity(int i, float f) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$measure(i);
        realmSet$value(f);
    }
}
