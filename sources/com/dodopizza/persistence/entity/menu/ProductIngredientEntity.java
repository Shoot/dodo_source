package com.dodopizza.persistence.entity.menu;

import ch.qos.logback.core.joran.action.Action;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ProductIngredientEntity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\"\u0010\u0011\u001a\u00020\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/dodopizza/persistence/entity/menu/ProductIngredientEntity;", "Lyi3;", "Lio/realm/n0;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "parentId", "getParentId", "setParentId", Action.NAME_ATTRIBUTE, "getName", "setName", "", "isRemovable", "Z", "()Z", "setRemovable", "(Z)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class ProductIngredientEntity extends n0 implements yi3, wgc {
    private String id;
    private boolean isRemovable;
    private String name;
    private String parentId;

    public ProductIngredientEntity() {
        this(null, null, null, false, 15, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public String getName() {
        return realmGet$name();
    }

    public String getParentId() {
        return realmGet$parentId();
    }

    public boolean isRemovable() {
        return realmGet$isRemovable();
    }

    @Override // defpackage.wgc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.wgc
    public boolean realmGet$isRemovable() {
        return this.isRemovable;
    }

    @Override // defpackage.wgc
    public String realmGet$name() {
        return this.name;
    }

    @Override // defpackage.wgc
    public String realmGet$parentId() {
        return this.parentId;
    }

    @Override // defpackage.wgc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.wgc
    public void realmSet$isRemovable(boolean z) {
        this.isRemovable = z;
    }

    @Override // defpackage.wgc
    public void realmSet$name(String str) {
        this.name = str;
    }

    @Override // defpackage.wgc
    public void realmSet$parentId(String str) {
        this.parentId = str;
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setName(String str) {
        z65.h(str, "<set-?>");
        realmSet$name(str);
    }

    public void setParentId(String str) {
        z65.h(str, "<set-?>");
        realmSet$parentId(str);
    }

    public void setRemovable(boolean z) {
        realmSet$isRemovable(z);
    }

    public /* synthetic */ ProductIngredientEntity(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public ProductIngredientEntity(String str, String str2, String str3, boolean z) {
        z65.h(str2, "parentId");
        z65.h(str3, Action.NAME_ATTRIBUTE);
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$id(str);
        realmSet$parentId(str2);
        realmSet$name(str3);
        realmSet$isRemovable(z);
    }
}
