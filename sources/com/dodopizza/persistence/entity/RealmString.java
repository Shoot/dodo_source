package com.dodopizza.persistence.entity;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RealmString.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\t\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/dodopizza/persistence/entity/RealmString;", "Lio/realm/n0;", "", "other", "", "equals", "", "hashCode", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "<init>", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class RealmString extends n0 implements afc {
    private String value;

    public RealmString() {
        this(null, 1, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public boolean equals(Object obj) {
        String value;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!z65.c(getClass(), obj.getClass()) && !z65.c(obj.getClass(), String.class)) {
            return false;
        }
        if (obj instanceof String) {
            value = (String) obj;
        } else {
            value = ((RealmString) obj).getValue();
        }
        return z65.c(getValue(), value);
    }

    public String getValue() {
        return realmGet$value();
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    @Override // defpackage.afc
    public String realmGet$value() {
        return this.value;
    }

    @Override // defpackage.afc
    public void realmSet$value(String str) {
        this.value = str;
    }

    public void setValue(String str) {
        z65.h(str, "<set-?>");
        realmSet$value(str);
    }

    public /* synthetic */ RealmString(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public RealmString(String str) {
        z65.h(str, "value");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$value(str);
    }
}
