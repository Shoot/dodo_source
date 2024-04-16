package com.dodopizza.persistence.entity.personalization;

import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MenuPersonalPriceInfoEntity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0019\b\u0017\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,BW\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0014\u0012\b\b\u0002\u0010$\u001a\u00020\u0003¢\u0006\u0004\b*\u0010+R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0015\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\"\u0010\u001e\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0005\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\tR\"\u0010!\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\"\u0010$\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0005\u001a\u0004\b%\u0010\u0007\"\u0004\b&\u0010\tR$\u0010'\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0005\u001a\u0004\b(\u0010\u0007\"\u0004\b)\u0010\t¨\u0006-"}, d2 = {"Lcom/dodopizza/persistence/entity/personalization/MenuPersonalPriceInfoEntity;", "Lyi3;", "Lio/realm/n0;", "", ShoppingInfoEntity.FIELD_PRODUCT_ID, "Ljava/lang/String;", "getProductId", "()Ljava/lang/String;", "setProductId", "(Ljava/lang/String;)V", "", "rawPrice", "D", "getRawPrice", "()D", "setRawPrice", "(D)V", "discountedPrice", "getDiscountedPrice", "setDiscountedPrice", "", "discount", "I", "getDiscount", "()I", "setDiscount", "(I)V", "discountMode", "getDiscountMode", "setDiscountMode", "endDateTimeUtc", "getEndDateTimeUtc", "setEndDateTimeUtc", "priority", "getPriority", "setPriority", "menuCategoryId", "getMenuCategoryId", "setMenuCategoryId", "id", "getId", "setId", "<init>", "(Ljava/lang/String;DDIILjava/lang/String;ILjava/lang/String;)V", "Companion", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class MenuPersonalPriceInfoEntity extends n0 implements yi3, jhc {
    public static final Companion Companion = new Companion(null);
    private int discount;
    private int discountMode;
    private double discountedPrice;
    private String endDateTimeUtc;
    private String id;
    private String menuCategoryId;
    private int priority;
    private String productId;
    private double rawPrice;

    /* compiled from: MenuPersonalPriceInfoEntity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\t"}, d2 = {"Lcom/dodopizza/persistence/entity/personalization/MenuPersonalPriceInfoEntity$Companion;", "", "()V", "personalPricesAreEqual", "", "c1", "", "Lcom/dodopizza/persistence/entity/personalization/MenuPersonalPriceInfoEntity;", "c2", "persistence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean personalPricesAreEqual(java.util.Collection<? extends com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity> r9, java.util.Collection<? extends com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity> r10) {
            /*
                r8 = this;
                java.lang.String r0 = "c1"
                defpackage.z65.h(r9, r0)
                java.lang.String r0 = "c2"
                defpackage.z65.h(r10, r0)
                int r0 = r9.size()
                int r1 = r10.size()
                r2 = 0
                if (r0 == r1) goto L16
                return r2
            L16:
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.Iterator r9 = r9.iterator()
            L1c:
                boolean r0 = r9.hasNext()
                if (r0 == 0) goto La3
                java.lang.Object r0 = r9.next()
                com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity r0 = (com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity) r0
                r1 = r10
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
            L2f:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L4b
                java.lang.Object r3 = r1.next()
                r4 = r3
                com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity r4 = (com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity) r4
                java.lang.String r5 = r0.getProductId()
                java.lang.String r4 = r4.getProductId()
                boolean r4 = defpackage.z65.c(r5, r4)
                if (r4 == 0) goto L2f
                goto L4c
            L4b:
                r3 = 0
            L4c:
                com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity r3 = (com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity) r3
                if (r3 == 0) goto La2
                double r4 = r0.getRawPrice()
                double r6 = r3.getRawPrice()
                int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r1 != 0) goto La2
                double r4 = r0.getDiscountedPrice()
                double r6 = r3.getDiscountedPrice()
                int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r1 != 0) goto La2
                int r1 = r0.getDiscount()
                int r4 = r3.getDiscount()
                if (r1 != r4) goto La2
                int r1 = r0.getDiscountMode()
                int r4 = r3.getDiscountMode()
                if (r1 != r4) goto La2
                java.lang.String r1 = r0.getEndDateTimeUtc()
                java.lang.String r4 = r3.getEndDateTimeUtc()
                boolean r1 = defpackage.z65.c(r1, r4)
                if (r1 == 0) goto La2
                int r1 = r0.getPriority()
                int r4 = r3.getPriority()
                if (r1 != r4) goto La2
                java.lang.String r0 = r0.getMenuCategoryId()
                java.lang.String r1 = r3.getMenuCategoryId()
                boolean r0 = defpackage.z65.c(r0, r1)
                if (r0 != 0) goto L1c
            La2:
                return r2
            La3:
                r9 = 1
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity.Companion.personalPricesAreEqual(java.util.Collection, java.util.Collection):boolean");
        }
    }

    public MenuPersonalPriceInfoEntity() {
        this(null, 0.0d, 0.0d, 0, 0, null, 0, null, 255, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public int getDiscount() {
        return realmGet$discount();
    }

    public int getDiscountMode() {
        return realmGet$discountMode();
    }

    public double getDiscountedPrice() {
        return realmGet$discountedPrice();
    }

    public String getEndDateTimeUtc() {
        return realmGet$endDateTimeUtc();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public String getMenuCategoryId() {
        return realmGet$menuCategoryId();
    }

    public int getPriority() {
        return realmGet$priority();
    }

    public String getProductId() {
        return realmGet$productId();
    }

    public double getRawPrice() {
        return realmGet$rawPrice();
    }

    @Override // defpackage.jhc
    public int realmGet$discount() {
        return this.discount;
    }

    @Override // defpackage.jhc
    public int realmGet$discountMode() {
        return this.discountMode;
    }

    @Override // defpackage.jhc
    public double realmGet$discountedPrice() {
        return this.discountedPrice;
    }

    @Override // defpackage.jhc
    public String realmGet$endDateTimeUtc() {
        return this.endDateTimeUtc;
    }

    @Override // defpackage.jhc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.jhc
    public String realmGet$menuCategoryId() {
        return this.menuCategoryId;
    }

    @Override // defpackage.jhc
    public int realmGet$priority() {
        return this.priority;
    }

    @Override // defpackage.jhc
    public String realmGet$productId() {
        return this.productId;
    }

    @Override // defpackage.jhc
    public double realmGet$rawPrice() {
        return this.rawPrice;
    }

    @Override // defpackage.jhc
    public void realmSet$discount(int i) {
        this.discount = i;
    }

    @Override // defpackage.jhc
    public void realmSet$discountMode(int i) {
        this.discountMode = i;
    }

    @Override // defpackage.jhc
    public void realmSet$discountedPrice(double d) {
        this.discountedPrice = d;
    }

    @Override // defpackage.jhc
    public void realmSet$endDateTimeUtc(String str) {
        this.endDateTimeUtc = str;
    }

    @Override // defpackage.jhc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.jhc
    public void realmSet$menuCategoryId(String str) {
        this.menuCategoryId = str;
    }

    @Override // defpackage.jhc
    public void realmSet$priority(int i) {
        this.priority = i;
    }

    @Override // defpackage.jhc
    public void realmSet$productId(String str) {
        this.productId = str;
    }

    @Override // defpackage.jhc
    public void realmSet$rawPrice(double d) {
        this.rawPrice = d;
    }

    public void setDiscount(int i) {
        realmSet$discount(i);
    }

    public void setDiscountMode(int i) {
        realmSet$discountMode(i);
    }

    public void setDiscountedPrice(double d) {
        realmSet$discountedPrice(d);
    }

    public void setEndDateTimeUtc(String str) {
        z65.h(str, "<set-?>");
        realmSet$endDateTimeUtc(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setMenuCategoryId(String str) {
        z65.h(str, "<set-?>");
        realmSet$menuCategoryId(str);
    }

    public void setPriority(int i) {
        realmSet$priority(i);
    }

    public void setProductId(String str) {
        z65.h(str, "<set-?>");
        realmSet$productId(str);
    }

    public void setRawPrice(double d) {
        realmSet$rawPrice(d);
    }

    public /* synthetic */ MenuPersonalPriceInfoEntity(String str, double d, double d2, int i, int i2, String str2, int i3, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0.0d : d, (i4 & 4) == 0 ? d2 : 0.0d, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? "" : str2, (i4 & 64) == 0 ? i3 : 0, (i4 & 128) == 0 ? str3 : "");
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public MenuPersonalPriceInfoEntity(String str, double d, double d2, int i, int i2, String str2, int i3, String str3) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(str2, "endDateTimeUtc");
        z65.h(str3, "menuCategoryId");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$productId(str);
        realmSet$rawPrice(d);
        realmSet$discountedPrice(d2);
        realmSet$discount(i);
        realmSet$discountMode(i2);
        realmSet$endDateTimeUtc(str2);
        realmSet$priority(i3);
        realmSet$menuCategoryId(str3);
    }
}
