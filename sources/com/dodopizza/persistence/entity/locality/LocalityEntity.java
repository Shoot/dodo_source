package com.dodopizza.persistence.entity.locality;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import im.threads.business.transport.MessageAttributes;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LocalityEntity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\b\u0016\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%BO\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b#\u0010$R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\"\u0010\u0010\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\"\u0010\u0013\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\"\u0010\u0017\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/dodopizza/persistence/entity/locality/LocalityEntity;", "Lyi3;", "Lio/realm/n0;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", ShoppingInfoEntity.FIELD_EXTERNAL_ID, "getExternalId", "setExternalId", MessageAttributes.UUID, "getUuid", "setUuid", Action.NAME_ATTRIBUTE, "getName", "setName", LocalityEntity.FIELD_COUNTRY_CODE, "getCountryCode", "setCountryCode", "", BonusActionEntity.ORDER, "I", "getOrder", "()I", "setOrder", "(I)V", "", "isTop", "Z", "()Z", "setTop", "(Z)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "Companion", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class LocalityEntity extends n0 implements yi3, mgc {
    public static final Companion Companion = new Companion(null);
    public static final String FIELD_COUNTRY_CODE = "countryCode";
    private String countryCode;
    private String externalId;
    private String id;
    private boolean isTop;
    private String name;
    private int order;
    private String uuid;

    /* compiled from: LocalityEntity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dodopizza/persistence/entity/locality/LocalityEntity$Companion;", "", "()V", "FIELD_COUNTRY_CODE", "", "persistence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LocalityEntity() {
        this(null, null, null, null, null, 0, false, 127, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getCountryCode() {
        return realmGet$countryCode();
    }

    public String getExternalId() {
        return realmGet$externalId();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public String getName() {
        return realmGet$name();
    }

    public int getOrder() {
        return realmGet$order();
    }

    public String getUuid() {
        return realmGet$uuid();
    }

    public boolean isTop() {
        return realmGet$isTop();
    }

    @Override // defpackage.mgc
    public String realmGet$countryCode() {
        return this.countryCode;
    }

    @Override // defpackage.mgc
    public String realmGet$externalId() {
        return this.externalId;
    }

    @Override // defpackage.mgc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.mgc
    public boolean realmGet$isTop() {
        return this.isTop;
    }

    @Override // defpackage.mgc
    public String realmGet$name() {
        return this.name;
    }

    @Override // defpackage.mgc
    public int realmGet$order() {
        return this.order;
    }

    @Override // defpackage.mgc
    public String realmGet$uuid() {
        return this.uuid;
    }

    @Override // defpackage.mgc
    public void realmSet$countryCode(String str) {
        this.countryCode = str;
    }

    @Override // defpackage.mgc
    public void realmSet$externalId(String str) {
        this.externalId = str;
    }

    @Override // defpackage.mgc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.mgc
    public void realmSet$isTop(boolean z) {
        this.isTop = z;
    }

    @Override // defpackage.mgc
    public void realmSet$name(String str) {
        this.name = str;
    }

    @Override // defpackage.mgc
    public void realmSet$order(int i) {
        this.order = i;
    }

    @Override // defpackage.mgc
    public void realmSet$uuid(String str) {
        this.uuid = str;
    }

    public void setCountryCode(String str) {
        z65.h(str, "<set-?>");
        realmSet$countryCode(str);
    }

    public void setExternalId(String str) {
        z65.h(str, "<set-?>");
        realmSet$externalId(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setName(String str) {
        z65.h(str, "<set-?>");
        realmSet$name(str);
    }

    public void setOrder(int i) {
        realmSet$order(i);
    }

    public void setTop(boolean z) {
        realmSet$isTop(z);
    }

    public void setUuid(String str) {
        z65.h(str, "<set-?>");
        realmSet$uuid(str);
    }

    public /* synthetic */ LocalityEntity(String str, String str2, String str3, String str4, String str5, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) == 0 ? str5 : "", (i2 & 32) != 0 ? -1 : i, (i2 & 64) != 0 ? false : z);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public LocalityEntity(String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        z65.h(str2, ShoppingInfoEntity.FIELD_EXTERNAL_ID);
        z65.h(str3, MessageAttributes.UUID);
        z65.h(str4, Action.NAME_ATTRIBUTE);
        z65.h(str5, FIELD_COUNTRY_CODE);
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$id(str);
        realmSet$externalId(str2);
        realmSet$uuid(str3);
        realmSet$name(str4);
        realmSet$countryCode(str5);
        realmSet$order(i);
        realmSet$isTop(z);
    }
}
