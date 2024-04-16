package com.dodopizza.persistence.entity;

import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: BonusActionEntity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0016\b\u0017\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(Ba\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0013¢\u0006\u0004\b&\u0010'R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\r\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR$\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\"\u0010\u0014\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0005\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR$\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0005\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR\"\u0010 \u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R$\u0010#\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0005\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\t¨\u0006)"}, d2 = {"Lcom/dodopizza/persistence/entity/BonusActionEntity;", "Lyi3;", "Lio/realm/n0;", "", ShoppingInfoEntity.FIELD_EXTERNAL_ID, "Ljava/lang/String;", "getExternalId", "()Ljava/lang/String;", "setExternalId", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "description", "getDescription", "setDescription", "imageUrl", "getImageUrl", "setImageUrl", "", "actionType", "I", "getActionType", "()I", "setActionType", "(I)V", "actionValue", "getActionValue", "setActionValue", BonusActionEntity.PLACE_ID, "getPlaceId", "setPlaceId", BonusActionEntity.ORDER, "getOrder", "setOrder", "id", "getId", "setId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "Companion", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class BonusActionEntity extends n0 implements yi3, pec {
    public static final Companion Companion = new Companion(null);
    public static final String ORDER = "order";
    public static final String PLACE_ID = "placeId";
    private int actionType;
    private String actionValue;
    private String description;
    private String externalId;
    private String id;
    private String imageUrl;
    private int order;
    private String placeId;
    private String title;

    /* compiled from: BonusActionEntity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/dodopizza/persistence/entity/BonusActionEntity$Companion;", "", "()V", "ORDER", "", "PLACE_ID", "persistence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BonusActionEntity() {
        this(null, null, null, null, 0, null, null, 0, 255, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public int getActionType() {
        return realmGet$actionType();
    }

    public String getActionValue() {
        return realmGet$actionValue();
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

    public String getImageUrl() {
        return realmGet$imageUrl();
    }

    public int getOrder() {
        return realmGet$order();
    }

    public String getPlaceId() {
        return realmGet$placeId();
    }

    public String getTitle() {
        return realmGet$title();
    }

    @Override // defpackage.pec
    public int realmGet$actionType() {
        return this.actionType;
    }

    @Override // defpackage.pec
    public String realmGet$actionValue() {
        return this.actionValue;
    }

    @Override // defpackage.pec
    public String realmGet$description() {
        return this.description;
    }

    @Override // defpackage.pec
    public String realmGet$externalId() {
        return this.externalId;
    }

    @Override // defpackage.pec
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.pec
    public String realmGet$imageUrl() {
        return this.imageUrl;
    }

    @Override // defpackage.pec
    public int realmGet$order() {
        return this.order;
    }

    @Override // defpackage.pec
    public String realmGet$placeId() {
        return this.placeId;
    }

    @Override // defpackage.pec
    public String realmGet$title() {
        return this.title;
    }

    @Override // defpackage.pec
    public void realmSet$actionType(int i) {
        this.actionType = i;
    }

    @Override // defpackage.pec
    public void realmSet$actionValue(String str) {
        this.actionValue = str;
    }

    @Override // defpackage.pec
    public void realmSet$description(String str) {
        this.description = str;
    }

    @Override // defpackage.pec
    public void realmSet$externalId(String str) {
        this.externalId = str;
    }

    @Override // defpackage.pec
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.pec
    public void realmSet$imageUrl(String str) {
        this.imageUrl = str;
    }

    @Override // defpackage.pec
    public void realmSet$order(int i) {
        this.order = i;
    }

    @Override // defpackage.pec
    public void realmSet$placeId(String str) {
        this.placeId = str;
    }

    @Override // defpackage.pec
    public void realmSet$title(String str) {
        this.title = str;
    }

    public void setActionType(int i) {
        realmSet$actionType(i);
    }

    public void setActionValue(String str) {
        z65.h(str, "<set-?>");
        realmSet$actionValue(str);
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

    public void setImageUrl(String str) {
        realmSet$imageUrl(str);
    }

    public void setOrder(int i) {
        realmSet$order(i);
    }

    public void setPlaceId(String str) {
        realmSet$placeId(str);
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public /* synthetic */ BonusActionEntity(String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? "" : str5, (i3 & 64) == 0 ? str6 : null, (i3 & 128) == 0 ? i2 : 0);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public BonusActionEntity(String str, String str2, String str3, String str4, int i, String str5, String str6, int i2) {
        z65.h(str5, "actionValue");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$externalId(str);
        realmSet$title(str2);
        realmSet$description(str3);
        realmSet$imageUrl(str4);
        realmSet$actionType(i);
        realmSet$actionValue(str5);
        realmSet$placeId(str6);
        realmSet$order(i2);
    }
}
