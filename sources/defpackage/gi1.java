package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ComboSlotsService.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&JV\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\u0014"}, d2 = {"Lgi1;", "", "", "menuItemId", "cartItemId", "", "takePreferredSlotProducts", "", "Lsi8;", "preferredSlotProducts", "Lfi1;", "a", "Lzi1;", "comboTemplateProduct", "", "selectedIds", "productIdsStopList", "hotAndReadyList", "Ldj1;", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: gi1  reason: default package */
/* loaded from: classes4.dex */
public interface gi1 {

    /* compiled from: ComboSlotsService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gi1$a */
    /* loaded from: classes4.dex */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ List a(gi1 gi1Var, String str, String str2, boolean z, List list, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    list = new ArrayList();
                }
                return gi1Var.a(str, str2, z, list);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getComboSlots");
        }
    }

    List<fi1> a(String str, String str2, boolean z, List<si8> list);

    List<dj1> b(zi1 zi1Var, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, boolean z, List<si8> list);
}
