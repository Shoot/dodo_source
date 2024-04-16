package com.dodopizza.persistence.entity.cart;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PersonalPromoActionEntity.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\b\u0017\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bBA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/PersonalPromoActionEntity;", "Lio/realm/n0;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "", "status", "I", "getStatus", "()I", "setStatus", "(I)V", "description", "getDescription", "setDescription", "title", "getTitle", "setTitle", "errorMessage", "getErrorMessage", "setErrorMessage", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class PersonalPromoActionEntity extends n0 implements ufc {
    public static final Companion Companion = new Companion(null);
    public static final int DOES_NOT_EXIST = 3;
    public static final int STATUS_OK = 1;
    public static final int WRONG_CONDITIONS = 2;
    private String description;
    private String errorMessage;
    private String id;
    private int status;
    private String title;

    /* compiled from: PersonalPromoActionEntity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/PersonalPromoActionEntity$Companion;", "", "()V", "DOES_NOT_EXIST", "", "STATUS_OK", "WRONG_CONDITIONS", "persistence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PersonalPromoActionEntity() {
        this(null, 0, null, null, null, 31, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getDescription() {
        return realmGet$description();
    }

    public String getErrorMessage() {
        return realmGet$errorMessage();
    }

    public String getId() {
        return realmGet$id();
    }

    public int getStatus() {
        return realmGet$status();
    }

    public String getTitle() {
        return realmGet$title();
    }

    @Override // defpackage.ufc
    public String realmGet$description() {
        return this.description;
    }

    @Override // defpackage.ufc
    public String realmGet$errorMessage() {
        return this.errorMessage;
    }

    @Override // defpackage.ufc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.ufc
    public int realmGet$status() {
        return this.status;
    }

    @Override // defpackage.ufc
    public String realmGet$title() {
        return this.title;
    }

    @Override // defpackage.ufc
    public void realmSet$description(String str) {
        this.description = str;
    }

    @Override // defpackage.ufc
    public void realmSet$errorMessage(String str) {
        this.errorMessage = str;
    }

    @Override // defpackage.ufc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.ufc
    public void realmSet$status(int i) {
        this.status = i;
    }

    @Override // defpackage.ufc
    public void realmSet$title(String str) {
        this.title = str;
    }

    public void setDescription(String str) {
        realmSet$description(str);
    }

    public void setErrorMessage(String str) {
        realmSet$errorMessage(str);
    }

    public void setId(String str) {
        realmSet$id(str);
    }

    public void setStatus(int i) {
        realmSet$status(i);
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public /* synthetic */ PersonalPromoActionEntity(String str, int i, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public PersonalPromoActionEntity(String str, int i, String str2, String str3, String str4) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$id(str);
        realmSet$status(i);
        realmSet$description(str2);
        realmSet$title(str3);
        realmSet$errorMessage(str4);
    }
}
