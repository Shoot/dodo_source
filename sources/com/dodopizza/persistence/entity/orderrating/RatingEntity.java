package com.dodopizza.persistence.entity.orderrating;

import io.realm.k0;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RatingEntity.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b\u0012\b\b\u0002\u0010\"\u001a\u00020\u0011\u0012\b\b\u0002\u0010'\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0005\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010#\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&¨\u0006+"}, d2 = {"Lcom/dodopizza/persistence/entity/orderrating/RatingEntity;", "Lyi3;", "Lio/realm/n0;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "", "rating", "I", "getRating", "()I", "setRating", "(I)V", "", "binaryRatingPositive", "Ljava/lang/Boolean;", "getBinaryRatingPositive", "()Ljava/lang/Boolean;", "setBinaryRatingPositive", "(Ljava/lang/Boolean;)V", "comment", "getComment", "setComment", "Lio/realm/k0;", "tagsIds", "Lio/realm/k0;", "getTagsIds", "()Lio/realm/k0;", "setTagsIds", "(Lio/realm/k0;)V", "isEditable", "Z", "()Z", "setEditable", "(Z)V", "isSent", "setSent", "<init>", "(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/String;Lio/realm/k0;ZZ)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class RatingEntity extends n0 implements yi3, bhc {
    private Boolean binaryRatingPositive;
    private String comment;
    private String id;
    private boolean isEditable;
    private boolean isSent;
    private int rating;
    private k0<String> tagsIds;

    public RatingEntity() {
        this(null, 0, null, null, null, false, false, 127, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public Boolean getBinaryRatingPositive() {
        return realmGet$binaryRatingPositive();
    }

    public String getComment() {
        return realmGet$comment();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public int getRating() {
        return realmGet$rating();
    }

    public k0<String> getTagsIds() {
        return realmGet$tagsIds();
    }

    public boolean isEditable() {
        return realmGet$isEditable();
    }

    public boolean isSent() {
        return realmGet$isSent();
    }

    @Override // defpackage.bhc
    public Boolean realmGet$binaryRatingPositive() {
        return this.binaryRatingPositive;
    }

    @Override // defpackage.bhc
    public String realmGet$comment() {
        return this.comment;
    }

    @Override // defpackage.bhc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.bhc
    public boolean realmGet$isEditable() {
        return this.isEditable;
    }

    @Override // defpackage.bhc
    public boolean realmGet$isSent() {
        return this.isSent;
    }

    @Override // defpackage.bhc
    public int realmGet$rating() {
        return this.rating;
    }

    @Override // defpackage.bhc
    public k0 realmGet$tagsIds() {
        return this.tagsIds;
    }

    @Override // defpackage.bhc
    public void realmSet$binaryRatingPositive(Boolean bool) {
        this.binaryRatingPositive = bool;
    }

    @Override // defpackage.bhc
    public void realmSet$comment(String str) {
        this.comment = str;
    }

    @Override // defpackage.bhc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.bhc
    public void realmSet$isEditable(boolean z) {
        this.isEditable = z;
    }

    @Override // defpackage.bhc
    public void realmSet$isSent(boolean z) {
        this.isSent = z;
    }

    @Override // defpackage.bhc
    public void realmSet$rating(int i) {
        this.rating = i;
    }

    @Override // defpackage.bhc
    public void realmSet$tagsIds(k0 k0Var) {
        this.tagsIds = k0Var;
    }

    public void setBinaryRatingPositive(Boolean bool) {
        realmSet$binaryRatingPositive(bool);
    }

    public void setComment(String str) {
        z65.h(str, "<set-?>");
        realmSet$comment(str);
    }

    public void setEditable(boolean z) {
        realmSet$isEditable(z);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setRating(int i) {
        realmSet$rating(i);
    }

    public void setSent(boolean z) {
        realmSet$isSent(z);
    }

    public void setTagsIds(k0<String> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$tagsIds(k0Var);
    }

    public /* synthetic */ RatingEntity(String str, int i, Boolean bool, String str2, k0 k0Var, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) == 0 ? bool : null, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? new k0() : k0Var, (i2 & 32) != 0 ? true : z, (i2 & 64) != 0 ? false : z2);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public RatingEntity(String str, int i, Boolean bool, String str2, k0<String> k0Var, boolean z, boolean z2) {
        z65.h(str2, "comment");
        z65.h(k0Var, "tagsIds");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$id(str);
        realmSet$rating(i);
        realmSet$binaryRatingPositive(bool);
        realmSet$comment(str2);
        realmSet$tagsIds(k0Var);
        realmSet$isEditable(z);
        realmSet$isSent(z2);
    }
}
