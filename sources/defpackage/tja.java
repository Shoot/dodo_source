package defpackage;

import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: ShoppingItem.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0019\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ltja;", "Lqja;", "Ljava/io/Serializable;", "Lfl8;", "T", "t0", "()Lfl8;", "Y", "product", "", "t", "()Ljava/lang/String;", ShoppingInfoEntity.FIELD_PRODUCT_ID, "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: tja  reason: default package */
/* loaded from: classes.dex */
public interface tja extends qja, Serializable {

    /* compiled from: ShoppingItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tja$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static String a(tja tjaVar) {
            return tjaVar.Y().getId();
        }

        public static <T extends fl8> T b(tja tjaVar) {
            T t = (T) tjaVar.Y();
            z65.f(t, "null cannot be cast to non-null type T of com.dodopizza.common.shopping.ShoppingItem.getTypedProduct");
            return t;
        }
    }

    fl8 Y();

    @Override // defpackage.qja
    String t();

    <T extends fl8> T t0();
}
