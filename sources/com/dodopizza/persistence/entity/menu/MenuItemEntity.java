package com.dodopizza.persistence.entity.menu;

import ch.qos.logback.core.joran.action.Action;
import im.threads.business.transport.MessageAttributes;
import io.realm.k0;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MenuItemEntity.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001RBá\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&\u0012\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020'0&\u0012\b\b\u0002\u00102\u001a\u000201\u0012\b\b\u0002\u00107\u001a\u00020\u0003\u0012\b\b\u0002\u0010:\u001a\u00020\u0003\u0012\b\b\u0002\u0010=\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00030&\u0012\b\b\u0002\u0010C\u001a\u000201\u0012\u000e\b\u0002\u0010F\u001a\b\u0012\u0004\u0012\u00020E0&\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010I¢\u0006\u0004\bP\u0010QR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\"\u0010\u0010\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\"\u0010\u0013\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\"\u0010\u0016\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0005\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\"\u0010\u0019\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0005\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\"\u0010\u001c\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0005\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\"\u0010 \u001a\u00020\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R(\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u0010.\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\"\u00102\u001a\u0002018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b2\u00104\"\u0004\b5\u00106R\"\u00107\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b7\u0010\u0005\u001a\u0004\b8\u0010\u0007\"\u0004\b9\u0010\tR\"\u0010:\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010\u0005\u001a\u0004\b;\u0010\u0007\"\u0004\b<\u0010\tR\"\u0010=\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b=\u0010\u0005\u001a\u0004\b>\u0010\u0007\"\u0004\b?\u0010\tR(\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00030&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b@\u0010)\u001a\u0004\bA\u0010+\"\u0004\bB\u0010-R\"\u0010C\u001a\u0002018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bC\u00103\u001a\u0004\bC\u00104\"\u0004\bD\u00106R(\u0010F\u001a\b\u0012\u0004\u0012\u00020E0&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bF\u0010)\u001a\u0004\bG\u0010+\"\u0004\bH\u0010-R$\u0010J\u001a\u0004\u0018\u00010I8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O¨\u0006S"}, d2 = {"Lcom/dodopizza/persistence/entity/menu/MenuItemEntity;", "Lyi3;", "Lio/realm/n0;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "forwardCompatibilityId", "getForwardCompatibilityId", "setForwardCompatibilityId", MessageAttributes.TYPE, "getType", "setType", "category", "getCategory", "setCategory", Action.NAME_ATTRIBUTE, "getName", "setName", "description", "getDescription", "setDescription", "compositeDescription", "getCompositeDescription", "setCompositeDescription", "imageUrl", "getImageUrl", "setImageUrl", "", "priority", "I", "getPriority", "()I", "setPriority", "(I)V", "Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/menu/ShoppingInfoEntity;", "shoppingInfo", "Lio/realm/k0;", "getShoppingInfo", "()Lio/realm/k0;", "setShoppingInfo", "(Lio/realm/k0;)V", "customShoppingItems", "getCustomShoppingItems", "setCustomShoppingItems", "", "isEnabled", "Z", "()Z", "setEnabled", "(Z)V", "sizeMeasure", "getSizeMeasure", "setSizeMeasure", "sizeValue", "getSizeValue", "setSizeValue", "menuCategoryId", "getMenuCategoryId", "setMenuCategoryId", "subMenuCategoryIds", "getSubMenuCategoryIds", "setSubMenuCategoryIds", "isPizza", "setPizza", "Lcom/dodopizza/persistence/entity/menu/PromoActionEntity;", "promoActions", "getPromoActions", "setPromoActions", "Lcom/dodopizza/persistence/entity/menu/PersonalPriceEntity;", "personalPrice", "Lcom/dodopizza/persistence/entity/menu/PersonalPriceEntity;", "getPersonalPrice", "()Lcom/dodopizza/persistence/entity/menu/PersonalPriceEntity;", "setPersonalPrice", "(Lcom/dodopizza/persistence/entity/menu/PersonalPriceEntity;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILio/realm/k0;Lio/realm/k0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/realm/k0;ZLio/realm/k0;Lcom/dodopizza/persistence/entity/menu/PersonalPriceEntity;)V", "Companion", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class MenuItemEntity extends n0 implements yi3, tgc {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_ASSISTANT = "assistant";
    public static final String TYPE_COMBO_TEMPLATE = "combo_template";
    public static final String TYPE_CUSTOM = "custom";
    public static final String TYPE_SIMPLE = "simple";
    public static final String TYPE_VARIABLE = "variable";
    private String category;
    private String compositeDescription;
    private k0<ShoppingInfoEntity> customShoppingItems;
    private String description;
    private String forwardCompatibilityId;
    private String id;
    private String imageUrl;
    private boolean isEnabled;
    private boolean isPizza;
    private String menuCategoryId;
    private String name;
    private PersonalPriceEntity personalPrice;
    private int priority;
    private k0<PromoActionEntity> promoActions;
    private k0<ShoppingInfoEntity> shoppingInfo;
    private String sizeMeasure;
    private String sizeValue;
    private k0<String> subMenuCategoryIds;
    private String type;

    /* compiled from: MenuItemEntity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/dodopizza/persistence/entity/menu/MenuItemEntity$Companion;", "", "()V", "TYPE_ASSISTANT", "", "TYPE_COMBO_TEMPLATE", "TYPE_CUSTOM", "TYPE_SIMPLE", "TYPE_VARIABLE", "persistence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MenuItemEntity() {
        this(null, null, null, null, null, null, null, null, 0, null, null, false, null, null, null, null, false, null, null, 524287, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getCategory() {
        return realmGet$category();
    }

    public String getCompositeDescription() {
        return realmGet$compositeDescription();
    }

    public k0<ShoppingInfoEntity> getCustomShoppingItems() {
        return realmGet$customShoppingItems();
    }

    public String getDescription() {
        return realmGet$description();
    }

    public String getForwardCompatibilityId() {
        return realmGet$forwardCompatibilityId();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public String getImageUrl() {
        return realmGet$imageUrl();
    }

    public String getMenuCategoryId() {
        return realmGet$menuCategoryId();
    }

    public String getName() {
        return realmGet$name();
    }

    public PersonalPriceEntity getPersonalPrice() {
        return realmGet$personalPrice();
    }

    public int getPriority() {
        return realmGet$priority();
    }

    public k0<PromoActionEntity> getPromoActions() {
        return realmGet$promoActions();
    }

    public k0<ShoppingInfoEntity> getShoppingInfo() {
        return realmGet$shoppingInfo();
    }

    public String getSizeMeasure() {
        return realmGet$sizeMeasure();
    }

    public String getSizeValue() {
        return realmGet$sizeValue();
    }

    public k0<String> getSubMenuCategoryIds() {
        return realmGet$subMenuCategoryIds();
    }

    public String getType() {
        return realmGet$type();
    }

    public boolean isEnabled() {
        return realmGet$isEnabled();
    }

    public boolean isPizza() {
        return realmGet$isPizza();
    }

    @Override // defpackage.tgc
    public String realmGet$category() {
        return this.category;
    }

    @Override // defpackage.tgc
    public String realmGet$compositeDescription() {
        return this.compositeDescription;
    }

    @Override // defpackage.tgc
    public k0 realmGet$customShoppingItems() {
        return this.customShoppingItems;
    }

    @Override // defpackage.tgc
    public String realmGet$description() {
        return this.description;
    }

    @Override // defpackage.tgc
    public String realmGet$forwardCompatibilityId() {
        return this.forwardCompatibilityId;
    }

    @Override // defpackage.tgc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.tgc
    public String realmGet$imageUrl() {
        return this.imageUrl;
    }

    @Override // defpackage.tgc
    public boolean realmGet$isEnabled() {
        return this.isEnabled;
    }

    @Override // defpackage.tgc
    public boolean realmGet$isPizza() {
        return this.isPizza;
    }

    @Override // defpackage.tgc
    public String realmGet$menuCategoryId() {
        return this.menuCategoryId;
    }

    @Override // defpackage.tgc
    public String realmGet$name() {
        return this.name;
    }

    @Override // defpackage.tgc
    public PersonalPriceEntity realmGet$personalPrice() {
        return this.personalPrice;
    }

    @Override // defpackage.tgc
    public int realmGet$priority() {
        return this.priority;
    }

    @Override // defpackage.tgc
    public k0 realmGet$promoActions() {
        return this.promoActions;
    }

    @Override // defpackage.tgc
    public k0 realmGet$shoppingInfo() {
        return this.shoppingInfo;
    }

    @Override // defpackage.tgc
    public String realmGet$sizeMeasure() {
        return this.sizeMeasure;
    }

    @Override // defpackage.tgc
    public String realmGet$sizeValue() {
        return this.sizeValue;
    }

    @Override // defpackage.tgc
    public k0 realmGet$subMenuCategoryIds() {
        return this.subMenuCategoryIds;
    }

    @Override // defpackage.tgc
    public String realmGet$type() {
        return this.type;
    }

    @Override // defpackage.tgc
    public void realmSet$category(String str) {
        this.category = str;
    }

    @Override // defpackage.tgc
    public void realmSet$compositeDescription(String str) {
        this.compositeDescription = str;
    }

    @Override // defpackage.tgc
    public void realmSet$customShoppingItems(k0 k0Var) {
        this.customShoppingItems = k0Var;
    }

    @Override // defpackage.tgc
    public void realmSet$description(String str) {
        this.description = str;
    }

    @Override // defpackage.tgc
    public void realmSet$forwardCompatibilityId(String str) {
        this.forwardCompatibilityId = str;
    }

    @Override // defpackage.tgc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.tgc
    public void realmSet$imageUrl(String str) {
        this.imageUrl = str;
    }

    @Override // defpackage.tgc
    public void realmSet$isEnabled(boolean z) {
        this.isEnabled = z;
    }

    @Override // defpackage.tgc
    public void realmSet$isPizza(boolean z) {
        this.isPizza = z;
    }

    @Override // defpackage.tgc
    public void realmSet$menuCategoryId(String str) {
        this.menuCategoryId = str;
    }

    @Override // defpackage.tgc
    public void realmSet$name(String str) {
        this.name = str;
    }

    @Override // defpackage.tgc
    public void realmSet$personalPrice(PersonalPriceEntity personalPriceEntity) {
        this.personalPrice = personalPriceEntity;
    }

    @Override // defpackage.tgc
    public void realmSet$priority(int i) {
        this.priority = i;
    }

    @Override // defpackage.tgc
    public void realmSet$promoActions(k0 k0Var) {
        this.promoActions = k0Var;
    }

    @Override // defpackage.tgc
    public void realmSet$shoppingInfo(k0 k0Var) {
        this.shoppingInfo = k0Var;
    }

    @Override // defpackage.tgc
    public void realmSet$sizeMeasure(String str) {
        this.sizeMeasure = str;
    }

    @Override // defpackage.tgc
    public void realmSet$sizeValue(String str) {
        this.sizeValue = str;
    }

    @Override // defpackage.tgc
    public void realmSet$subMenuCategoryIds(k0 k0Var) {
        this.subMenuCategoryIds = k0Var;
    }

    @Override // defpackage.tgc
    public void realmSet$type(String str) {
        this.type = str;
    }

    public void setCategory(String str) {
        z65.h(str, "<set-?>");
        realmSet$category(str);
    }

    public void setCompositeDescription(String str) {
        z65.h(str, "<set-?>");
        realmSet$compositeDescription(str);
    }

    public void setCustomShoppingItems(k0<ShoppingInfoEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$customShoppingItems(k0Var);
    }

    public void setDescription(String str) {
        z65.h(str, "<set-?>");
        realmSet$description(str);
    }

    public void setEnabled(boolean z) {
        realmSet$isEnabled(z);
    }

    public void setForwardCompatibilityId(String str) {
        z65.h(str, "<set-?>");
        realmSet$forwardCompatibilityId(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setImageUrl(String str) {
        z65.h(str, "<set-?>");
        realmSet$imageUrl(str);
    }

    public void setMenuCategoryId(String str) {
        z65.h(str, "<set-?>");
        realmSet$menuCategoryId(str);
    }

    public void setName(String str) {
        z65.h(str, "<set-?>");
        realmSet$name(str);
    }

    public void setPersonalPrice(PersonalPriceEntity personalPriceEntity) {
        realmSet$personalPrice(personalPriceEntity);
    }

    public void setPizza(boolean z) {
        realmSet$isPizza(z);
    }

    public void setPriority(int i) {
        realmSet$priority(i);
    }

    public void setPromoActions(k0<PromoActionEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$promoActions(k0Var);
    }

    public void setShoppingInfo(k0<ShoppingInfoEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$shoppingInfo(k0Var);
    }

    public void setSizeMeasure(String str) {
        z65.h(str, "<set-?>");
        realmSet$sizeMeasure(str);
    }

    public void setSizeValue(String str) {
        z65.h(str, "<set-?>");
        realmSet$sizeValue(str);
    }

    public void setSubMenuCategoryIds(k0<String> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$subMenuCategoryIds(k0Var);
    }

    public void setType(String str) {
        z65.h(str, "<set-?>");
        realmSet$type(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MenuItemEntity(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, int r29, io.realm.k0 r30, io.realm.k0 r31, boolean r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, io.realm.k0 r36, boolean r37, io.realm.k0 r38, com.dodopizza.persistence.entity.menu.PersonalPriceEntity r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.persistence.entity.menu.MenuItemEntity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, io.realm.k0, io.realm.k0, boolean, java.lang.String, java.lang.String, java.lang.String, io.realm.k0, boolean, io.realm.k0, com.dodopizza.persistence.entity.menu.PersonalPriceEntity, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public MenuItemEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, k0<ShoppingInfoEntity> k0Var, k0<ShoppingInfoEntity> k0Var2, boolean z, String str9, String str10, String str11, k0<String> k0Var3, boolean z2, k0<PromoActionEntity> k0Var4, PersonalPriceEntity personalPriceEntity) {
        z65.h(str2, "forwardCompatibilityId");
        z65.h(str3, MessageAttributes.TYPE);
        z65.h(str4, "category");
        z65.h(str5, Action.NAME_ATTRIBUTE);
        z65.h(str6, "description");
        z65.h(str7, "compositeDescription");
        z65.h(str8, "imageUrl");
        z65.h(k0Var, "shoppingInfo");
        z65.h(k0Var2, "customShoppingItems");
        z65.h(str9, "sizeMeasure");
        z65.h(str10, "sizeValue");
        z65.h(str11, "menuCategoryId");
        z65.h(k0Var3, "subMenuCategoryIds");
        z65.h(k0Var4, "promoActions");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$id(str);
        realmSet$forwardCompatibilityId(str2);
        realmSet$type(str3);
        realmSet$category(str4);
        realmSet$name(str5);
        realmSet$description(str6);
        realmSet$compositeDescription(str7);
        realmSet$imageUrl(str8);
        realmSet$priority(i);
        realmSet$shoppingInfo(k0Var);
        realmSet$customShoppingItems(k0Var2);
        realmSet$isEnabled(z);
        realmSet$sizeMeasure(str9);
        realmSet$sizeValue(str10);
        realmSet$menuCategoryId(str11);
        realmSet$subMenuCategoryIds(k0Var3);
        realmSet$isPizza(z2);
        realmSet$promoActions(k0Var4);
        realmSet$personalPrice(personalPriceEntity);
    }
}
