package defpackage;

import java.util.Collection;
import kotlin.Metadata;
/* compiled from: DefaultShoppingItemSelector.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lvr2;", "", "", "Ltja;", "shoppingItems", "", "defaultSize", "a", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vr2  reason: default package */
/* loaded from: classes4.dex */
public interface vr2 {

    /* compiled from: DefaultShoppingItemSelector.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vr2$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ tja a(vr2 vr2Var, Collection collection, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    i = 2;
                }
                return vr2Var.a(collection, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDefaultShoppingItem");
        }
    }

    tja a(Collection<? extends tja> collection, int i);
}
