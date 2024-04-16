package com.dodopizza.persistence.entity;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RealmInteger.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\b\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/dodopizza/persistence/entity/RealmInteger;", "Lio/realm/n0;", "", "other", "", "equals", "", "hashCode", "value", "I", "getValue", "()I", "setValue", "(I)V", "<init>", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class RealmInteger extends n0 implements zec {
    private int value;

    public RealmInteger() {
        this(0, 1, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public boolean equals(Object obj) {
        Integer valueOf;
        if (this == obj) {
            return true;
        }
        if (obj == null || !z65.c(getClass(), obj.getClass()) || !z65.c(obj.getClass(), Integer.TYPE)) {
            return false;
        }
        if (obj instanceof Integer) {
            valueOf = (Integer) obj;
        } else {
            valueOf = Integer.valueOf(((RealmInteger) obj).getValue());
        }
        if (getValue() == valueOf.intValue()) {
            return true;
        }
        return false;
    }

    public int getValue() {
        return realmGet$value();
    }

    public int hashCode() {
        return getValue();
    }

    @Override // defpackage.zec
    public int realmGet$value() {
        return this.value;
    }

    @Override // defpackage.zec
    public void realmSet$value(int i) {
        this.value = i;
    }

    public void setValue(int i) {
        realmSet$value(i);
    }

    public /* synthetic */ RealmInteger(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public RealmInteger(int i) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$value(i);
    }
}
