package com.dodopizza.persistence.entity.prizoteka;

import io.realm.k0;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PrizotekaEntity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0005\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/dodopizza/persistence/entity/prizoteka/PrizotekaEntity;", "Lyi3;", "Lio/realm/n0;", "", "title", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "subtitle", "getSubtitle", "setSubtitle", "legalDocumentUrl", "getLegalDocumentUrl", "setLegalDocumentUrl", "Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/prizoteka/PrizotekaLevelEntity;", "levels", "Lio/realm/k0;", "getLevels", "()Lio/realm/k0;", "setLevels", "(Lio/realm/k0;)V", "id", "getId", "setId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/realm/k0;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class PrizotekaEntity extends n0 implements yi3, nhc {
    private String id;
    private String legalDocumentUrl;
    private k0<PrizotekaLevelEntity> levels;
    private String subtitle;
    private String title;

    public PrizotekaEntity() {
        this(null, null, null, null, 15, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public String getLegalDocumentUrl() {
        return realmGet$legalDocumentUrl();
    }

    public k0<PrizotekaLevelEntity> getLevels() {
        return realmGet$levels();
    }

    public String getSubtitle() {
        return realmGet$subtitle();
    }

    public String getTitle() {
        return realmGet$title();
    }

    @Override // defpackage.nhc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.nhc
    public String realmGet$legalDocumentUrl() {
        return this.legalDocumentUrl;
    }

    @Override // defpackage.nhc
    public k0 realmGet$levels() {
        return this.levels;
    }

    @Override // defpackage.nhc
    public String realmGet$subtitle() {
        return this.subtitle;
    }

    @Override // defpackage.nhc
    public String realmGet$title() {
        return this.title;
    }

    @Override // defpackage.nhc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.nhc
    public void realmSet$legalDocumentUrl(String str) {
        this.legalDocumentUrl = str;
    }

    @Override // defpackage.nhc
    public void realmSet$levels(k0 k0Var) {
        this.levels = k0Var;
    }

    @Override // defpackage.nhc
    public void realmSet$subtitle(String str) {
        this.subtitle = str;
    }

    @Override // defpackage.nhc
    public void realmSet$title(String str) {
        this.title = str;
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setLegalDocumentUrl(String str) {
        z65.h(str, "<set-?>");
        realmSet$legalDocumentUrl(str);
    }

    public void setLevels(k0<PrizotekaLevelEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$levels(k0Var);
    }

    public void setSubtitle(String str) {
        z65.h(str, "<set-?>");
        realmSet$subtitle(str);
    }

    public void setTitle(String str) {
        z65.h(str, "<set-?>");
        realmSet$title(str);
    }

    public /* synthetic */ PrizotekaEntity(String str, String str2, String str3, k0 k0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? new k0() : k0Var);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public PrizotekaEntity(String str, String str2, String str3, k0<PrizotekaLevelEntity> k0Var) {
        z65.h(str, "title");
        z65.h(str2, "subtitle");
        z65.h(str3, "legalDocumentUrl");
        z65.h(k0Var, "levels");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$title(str);
        realmSet$subtitle(str2);
        realmSet$legalDocumentUrl(str3);
        realmSet$levels(k0Var);
    }
}
