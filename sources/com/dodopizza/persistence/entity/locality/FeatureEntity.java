package com.dodopizza.persistence.entity.locality;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FeatureEntity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\tR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/dodopizza/persistence/entity/locality/FeatureEntity;", "Lyi3;", "Lio/realm/n0;", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "id", "getId", "setId", "<init>", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FeatureEntity extends n0 implements yi3, kgc {
    private String code;
    private String id;

    public FeatureEntity() {
        this(null, 1, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getCode() {
        return realmGet$code();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    @Override // defpackage.kgc
    public String realmGet$code() {
        return this.code;
    }

    @Override // defpackage.kgc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.kgc
    public void realmSet$code(String str) {
        this.code = str;
    }

    @Override // defpackage.kgc
    public void realmSet$id(String str) {
        this.id = str;
    }

    public void setCode(String str) {
        realmSet$code(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public /* synthetic */ FeatureEntity(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public FeatureEntity(String str) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$code(str);
    }
}
