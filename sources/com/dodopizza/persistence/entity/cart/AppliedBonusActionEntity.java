package com.dodopizza.persistence.entity.cart;

import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AppliedBonusActionEntity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\r\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR$\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/AppliedBonusActionEntity;", "Lyi3;", "Lio/realm/n0;", "", ShoppingInfoEntity.FIELD_EXTERNAL_ID, "Ljava/lang/String;", "getExternalId", "()Ljava/lang/String;", "setExternalId", "(Ljava/lang/String;)V", "description", "getDescription", "setDescription", "title", "getTitle", "setTitle", "id", "getId", "setId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class AppliedBonusActionEntity extends n0 implements yi3, ifc {
    private String description;
    private String externalId;
    private String id;
    private String title;

    public AppliedBonusActionEntity() {
        this(null, null, null, 7, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getDescription() {
        return realmGet$description();
    }

    public String getExternalId() {
        return realmGet$externalId();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public String getTitle() {
        return realmGet$title();
    }

    @Override // defpackage.ifc
    public String realmGet$description() {
        return this.description;
    }

    @Override // defpackage.ifc
    public String realmGet$externalId() {
        return this.externalId;
    }

    @Override // defpackage.ifc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.ifc
    public String realmGet$title() {
        return this.title;
    }

    @Override // defpackage.ifc
    public void realmSet$description(String str) {
        this.description = str;
    }

    @Override // defpackage.ifc
    public void realmSet$externalId(String str) {
        this.externalId = str;
    }

    @Override // defpackage.ifc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.ifc
    public void realmSet$title(String str) {
        this.title = str;
    }

    public void setDescription(String str) {
        realmSet$description(str);
    }

    public void setExternalId(String str) {
        realmSet$externalId(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public /* synthetic */ AppliedBonusActionEntity(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public AppliedBonusActionEntity(String str, String str2, String str3) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$externalId(str);
        realmSet$description(str2);
        realmSet$title(str3);
    }
}
