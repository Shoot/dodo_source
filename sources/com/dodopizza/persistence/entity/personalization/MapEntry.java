package com.dodopizza.persistence.entity.personalization;

import ch.qos.logback.core.joran.action.Action;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: UpsellProductsEntity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/dodopizza/persistence/entity/personalization/MapEntry;", "Lio/realm/n0;", "", Action.KEY_ATTRIBUTE, "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "value", "getValue", "setValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class MapEntry extends n0 implements ihc {
    private String key;
    private String value;

    public MapEntry() {
        this(null, null, 3, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getKey() {
        return realmGet$key();
    }

    public String getValue() {
        return realmGet$value();
    }

    @Override // defpackage.ihc
    public String realmGet$key() {
        return this.key;
    }

    @Override // defpackage.ihc
    public String realmGet$value() {
        return this.value;
    }

    @Override // defpackage.ihc
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // defpackage.ihc
    public void realmSet$value(String str) {
        this.value = str;
    }

    public void setKey(String str) {
        realmSet$key(str);
    }

    public void setValue(String str) {
        realmSet$value(str);
    }

    public /* synthetic */ MapEntry(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public MapEntry(String str, String str2) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$key(str);
        realmSet$value(str2);
    }
}
