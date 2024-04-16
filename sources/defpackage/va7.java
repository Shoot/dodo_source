package defpackage;

import com.dodopizza.persistence.entity.BonusActionEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OperationBodyRequest.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001BÃ\u0001\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\bF\u0010GBÉ\u0001\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\bF\u0010HB·\u0001\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\bF\u0010IJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00158\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010!R\u001c\u0010.\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0012\u001a\u0004\b/\u0010\u0014R\u001c\u00100\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u0012\u001a\u0004\b1\u0010\u0014R\u001c\u00103\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001c\u00108\u001a\u0004\u0018\u0001078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001c\u0010=\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010B\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006J"}, d2 = {"Lva7;", "Lwa7;", "Let0;", "productList", "", "Lwl8;", "productListItems", "Lr42;", "customerAction", "Lr42;", "getCustomerAction", "()Lr42;", "", "pointOfContact", "Ljava/lang/String;", "getPointOfContact", "()Ljava/lang/String;", "addProductToList", "Lwl8;", "getAddProductToList", "()Lwl8;", "", "Ljava/lang/Object;", "getProductList$sdk_release", "()Ljava/lang/Object;", "segmentations", "Ljava/util/List;", "getSegmentations", "()Ljava/util/List;", "Lp52;", "customer", "Lp52;", "getCustomer", "()Lp52;", "Lhi7;", BonusActionEntity.ORDER, "Lhi7;", "getOrder", "()Lhi7;", "Lw23;", "discountCard", "Lw23;", "getDiscountCard", "()Lw23;", "referencedCustomer", "getReferencedCustomer", "removeProductFromList", "getRemoveProductFromList", "setProductCountInList", "getSetProductCountInList", "Lxp8;", "promoCode", "Lxp8;", "getPromoCode", "()Lxp8;", "Le0c;", "viewProductCategory", "Le0c;", "getViewProductCategory", "()Le0c;", "Lg0c;", "viewProductRequest", "Lg0c;", "getViewProductRequest", "()Lg0c;", "Lc99;", "recommendation", "Lc99;", "getRecommendation", "()Lc99;", "<init>", "(Lr42;Ljava/lang/String;Lwl8;Let0;Ljava/util/List;Lp52;Lhi7;Lw23;Lp52;Lwl8;Lwl8;Lxp8;Le0c;Lg0c;Lc99;)V", "(Lr42;Ljava/lang/String;Lwl8;Ljava/util/List;Lp52;Lhi7;Lw23;Lp52;Lwl8;Lwl8;Ljava/util/List;Lxp8;Le0c;Lg0c;Lc99;)V", "(Lr42;Ljava/lang/String;Lwl8;Ljava/util/List;Lp52;Lhi7;Lw23;Lp52;Lwl8;Lwl8;Lxp8;Le0c;Lg0c;Lc99;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: va7  reason: default package */
/* loaded from: classes.dex */
public class va7 extends wa7 {
    @uca("addProductToList")
    private final wl8 addProductToList;
    @uca("customer")
    private final p52 customer;
    @uca("customerAction")
    private final r42 customerAction;
    @uca("discountCard")
    private final w23 discountCard;
    @uca(BonusActionEntity.ORDER)
    private final hi7 order;
    @uca("pointOfContact")
    private final String pointOfContact;
    @uca("productList")
    private final Object productList;
    @uca("promoCode")
    private final xp8 promoCode;
    @uca("recommendation")
    private final c99 recommendation;
    @uca("referencedCustomer")
    private final p52 referencedCustomer;
    @uca("removeProductFromList")
    private final wl8 removeProductFromList;
    @uca("segmentations")
    private final List<Object> segmentations;
    @uca("setProductCountInList")
    private final wl8 setProductCountInList;
    @uca("viewProductCategory")
    private final e0c viewProductCategory;
    @uca("viewProduct")
    private final g0c viewProductRequest;

    public /* synthetic */ va7(r42 r42Var, String str, wl8 wl8Var, et0 et0Var, List list, p52 p52Var, hi7 hi7Var, w23 w23Var, p52 p52Var2, wl8 wl8Var2, wl8 wl8Var3, xp8 xp8Var, e0c e0cVar, g0c g0cVar, c99 c99Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : r42Var, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : wl8Var, (i & 8) != 0 ? null : et0Var, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : p52Var, (i & 64) != 0 ? null : hi7Var, (i & 128) != 0 ? null : w23Var, (i & 256) != 0 ? null : p52Var2, (i & 512) != 0 ? null : wl8Var2, (i & 1024) != 0 ? null : wl8Var3, (i & 2048) != 0 ? null : xp8Var, (i & 4096) != 0 ? null : e0cVar, (i & 8192) != 0 ? null : g0cVar, (i & 16384) == 0 ? c99Var : null);
    }

    public final wl8 getAddProductToList() {
        return this.addProductToList;
    }

    public final p52 getCustomer() {
        return this.customer;
    }

    public final r42 getCustomerAction() {
        return this.customerAction;
    }

    public final w23 getDiscountCard() {
        return this.discountCard;
    }

    public final hi7 getOrder() {
        return this.order;
    }

    public final String getPointOfContact() {
        return this.pointOfContact;
    }

    public final Object getProductList$sdk_release() {
        return this.productList;
    }

    public final xp8 getPromoCode() {
        return this.promoCode;
    }

    public final c99 getRecommendation() {
        return this.recommendation;
    }

    public final p52 getReferencedCustomer() {
        return this.referencedCustomer;
    }

    public final wl8 getRemoveProductFromList() {
        return this.removeProductFromList;
    }

    public final List<Object> getSegmentations() {
        return this.segmentations;
    }

    public final wl8 getSetProductCountInList() {
        return this.setProductCountInList;
    }

    public final e0c getViewProductCategory() {
        return this.viewProductCategory;
    }

    public final g0c getViewProductRequest() {
        return this.viewProductRequest;
    }

    public final et0 productList() {
        Object obj = this.productList;
        if (obj instanceof et0) {
            return (et0) obj;
        }
        return null;
    }

    public final List<wl8> productListItems() {
        List list;
        wl8 wl8Var;
        Object obj = this.productList;
        if (obj instanceof List) {
            list = (List) obj;
        } else {
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof wl8) {
                wl8Var = (wl8) obj2;
            } else {
                wl8Var = null;
            }
            if (wl8Var != null) {
                arrayList.add(wl8Var);
            }
        }
        return arrayList;
    }

    public va7(r42 r42Var, String str, wl8 wl8Var, et0 et0Var, List<Object> list, p52 p52Var, hi7 hi7Var, w23 w23Var, p52 p52Var2, wl8 wl8Var2, wl8 wl8Var3, xp8 xp8Var, e0c e0cVar, g0c g0cVar, c99 c99Var) {
        this.customerAction = r42Var;
        this.pointOfContact = str;
        this.addProductToList = wl8Var;
        this.productList = et0Var;
        this.segmentations = list;
        this.customer = p52Var;
        this.order = hi7Var;
        this.discountCard = w23Var;
        this.referencedCustomer = p52Var2;
        this.removeProductFromList = wl8Var2;
        this.setProductCountInList = wl8Var3;
        this.promoCode = xp8Var;
        this.viewProductCategory = e0cVar;
        this.viewProductRequest = g0cVar;
        this.recommendation = c99Var;
    }

    public /* synthetic */ va7(r42 r42Var, String str, wl8 wl8Var, List list, p52 p52Var, hi7 hi7Var, w23 w23Var, p52 p52Var2, wl8 wl8Var2, wl8 wl8Var3, List list2, xp8 xp8Var, e0c e0cVar, g0c g0cVar, c99 c99Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : r42Var, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : wl8Var, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : p52Var, (i & 32) != 0 ? null : hi7Var, (i & 64) != 0 ? null : w23Var, (i & 128) != 0 ? null : p52Var2, (i & 256) != 0 ? null : wl8Var2, (i & 512) != 0 ? null : wl8Var3, (i & 1024) != 0 ? null : list2, (i & 2048) != 0 ? null : xp8Var, (i & 4096) != 0 ? null : e0cVar, (i & 8192) != 0 ? null : g0cVar, (i & 16384) == 0 ? c99Var : null);
    }

    public va7(r42 r42Var, String str, wl8 wl8Var, List<Object> list, p52 p52Var, hi7 hi7Var, w23 w23Var, p52 p52Var2, wl8 wl8Var2, wl8 wl8Var3, List<? extends wl8> list2, xp8 xp8Var, e0c e0cVar, g0c g0cVar, c99 c99Var) {
        this.customerAction = r42Var;
        this.pointOfContact = str;
        this.addProductToList = wl8Var;
        this.productList = list2;
        this.segmentations = list;
        this.customer = p52Var;
        this.order = hi7Var;
        this.discountCard = w23Var;
        this.referencedCustomer = p52Var2;
        this.removeProductFromList = wl8Var2;
        this.setProductCountInList = wl8Var3;
        this.promoCode = xp8Var;
        this.viewProductCategory = e0cVar;
        this.viewProductRequest = g0cVar;
        this.recommendation = c99Var;
    }

    public /* synthetic */ va7(r42 r42Var, String str, wl8 wl8Var, List list, p52 p52Var, hi7 hi7Var, w23 w23Var, p52 p52Var2, wl8 wl8Var2, wl8 wl8Var3, xp8 xp8Var, e0c e0cVar, g0c g0cVar, c99 c99Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : r42Var, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : wl8Var, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : p52Var, (i & 32) != 0 ? null : hi7Var, (i & 64) != 0 ? null : w23Var, (i & 128) != 0 ? null : p52Var2, (i & 256) != 0 ? null : wl8Var2, (i & 512) != 0 ? null : wl8Var3, (i & 1024) != 0 ? null : xp8Var, (i & 2048) != 0 ? null : e0cVar, (i & 4096) != 0 ? null : g0cVar, (i & 8192) == 0 ? c99Var : null);
    }

    public va7(r42 r42Var, String str, wl8 wl8Var, List<Object> list, p52 p52Var, hi7 hi7Var, w23 w23Var, p52 p52Var2, wl8 wl8Var2, wl8 wl8Var3, xp8 xp8Var, e0c e0cVar, g0c g0cVar, c99 c99Var) {
        this.customerAction = r42Var;
        this.pointOfContact = str;
        this.addProductToList = wl8Var;
        this.productList = null;
        this.segmentations = list;
        this.customer = p52Var;
        this.order = hi7Var;
        this.discountCard = w23Var;
        this.referencedCustomer = p52Var2;
        this.removeProductFromList = wl8Var2;
        this.setProductCountInList = wl8Var3;
        this.promoCode = xp8Var;
        this.viewProductCategory = e0cVar;
        this.viewProductRequest = g0cVar;
        this.recommendation = c99Var;
    }
}
