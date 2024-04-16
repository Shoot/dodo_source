package com.dodopizza.persistence.entity.personalization;

import ch.qos.logback.core.joran.action.Action;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PersonalCategoryEntity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R$\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/dodopizza/persistence/entity/personalization/PersonalCategoryEntity;", "Lyi3;", "Lio/realm/n0;", "", "index", "I", "getIndex", "()I", "setIndex", "(I)V", "", "categoryId", "Ljava/lang/String;", "getCategoryId", "()Ljava/lang/String;", "setCategoryId", "(Ljava/lang/String;)V", Action.NAME_ATTRIBUTE, "getName", "setName", "id", "getId", "setId", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class PersonalCategoryEntity extends n0 implements yi3, khc {
    private String categoryId;
    private String id;
    private int index;
    private String name;

    public PersonalCategoryEntity() {
        this(0, null, null, 7, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getCategoryId() {
        return realmGet$categoryId();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public int getIndex() {
        return realmGet$index();
    }

    public String getName() {
        return realmGet$name();
    }

    @Override // defpackage.khc
    public String realmGet$categoryId() {
        return this.categoryId;
    }

    @Override // defpackage.khc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.khc
    public int realmGet$index() {
        return this.index;
    }

    @Override // defpackage.khc
    public String realmGet$name() {
        return this.name;
    }

    @Override // defpackage.khc
    public void realmSet$categoryId(String str) {
        this.categoryId = str;
    }

    @Override // defpackage.khc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.khc
    public void realmSet$index(int i) {
        this.index = i;
    }

    @Override // defpackage.khc
    public void realmSet$name(String str) {
        this.name = str;
    }

    public void setCategoryId(String str) {
        z65.h(str, "<set-?>");
        realmSet$categoryId(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setIndex(int i) {
        realmSet$index(i);
    }

    public void setName(String str) {
        z65.h(str, "<set-?>");
        realmSet$name(str);
    }

    public /* synthetic */ PersonalCategoryEntity(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public PersonalCategoryEntity(int i, String str, String str2) {
        z65.h(str, "categoryId");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$index(i);
        realmSet$categoryId(str);
        realmSet$name(str2);
    }
}
