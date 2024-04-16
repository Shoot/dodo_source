package com.dodopizza.persistence.entity.deliverylocation;

import ch.qos.logback.core.joran.action.Action;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AddressAdditionEntity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\r\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/dodopizza/persistence/entity/deliverylocation/AddressAdditionEntity;", "Lyi3;", "Lio/realm/n0;", "", Action.KEY_ATTRIBUTE, "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "value", "getValue", "setValue", "id", "getId", "setId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class AddressAdditionEntity extends n0 implements yi3, fgc {
    private String id;
    private String key;
    private String value;

    public AddressAdditionEntity() {
        this(null, null, 3, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public String getKey() {
        return realmGet$key();
    }

    public String getValue() {
        return realmGet$value();
    }

    @Override // defpackage.fgc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.fgc
    public String realmGet$key() {
        return this.key;
    }

    @Override // defpackage.fgc
    public String realmGet$value() {
        return this.value;
    }

    @Override // defpackage.fgc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.fgc
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // defpackage.fgc
    public void realmSet$value(String str) {
        this.value = str;
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setKey(String str) {
        z65.h(str, "<set-?>");
        realmSet$key(str);
    }

    public void setValue(String str) {
        realmSet$value(str);
    }

    public /* synthetic */ AddressAdditionEntity(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public AddressAdditionEntity(String str, String str2) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$key(str);
        realmSet$value(str2);
    }
}
