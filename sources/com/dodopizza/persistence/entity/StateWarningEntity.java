package com.dodopizza.persistence.entity;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: StateWarningEntity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/dodopizza/persistence/entity/StateWarningEntity;", "Lyi3;", "Lio/realm/n0;", "", "code", "Ljava/lang/Integer;", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "", "description", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "id", "getId", "setId", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class StateWarningEntity extends n0 implements yi3, dfc {
    private Integer code;
    private String description;
    private String id;

    public StateWarningEntity() {
        this(null, null, 3, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public Integer getCode() {
        return realmGet$code();
    }

    public String getDescription() {
        return realmGet$description();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    @Override // defpackage.dfc
    public Integer realmGet$code() {
        return this.code;
    }

    @Override // defpackage.dfc
    public String realmGet$description() {
        return this.description;
    }

    @Override // defpackage.dfc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.dfc
    public void realmSet$code(Integer num) {
        this.code = num;
    }

    @Override // defpackage.dfc
    public void realmSet$description(String str) {
        this.description = str;
    }

    @Override // defpackage.dfc
    public void realmSet$id(String str) {
        this.id = str;
    }

    public void setCode(Integer num) {
        realmSet$code(num);
    }

    public void setDescription(String str) {
        realmSet$description(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public /* synthetic */ StateWarningEntity(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public StateWarningEntity(Integer num, String str) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$code(num);
        realmSet$description(str);
    }
}
