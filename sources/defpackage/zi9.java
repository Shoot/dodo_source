package defpackage;

import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: PermissionImpl.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0006H\u0002¨\u0006\b"}, d2 = {"Lzi9;", "", "Lyi9;", "Ldy7;", "permission", CartQueueItemEntity.OPERATION_ADD, "", "not", "permissions_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: zi9  reason: default package */
/* loaded from: classes2.dex */
public interface zi9 {

    /* compiled from: PermissionImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: zi9$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private static yi9 a(zi9 zi9Var, yi9 yi9Var, dy7 dy7Var) {
            List<dy7> r0;
            r0 = sc1.r0(yi9Var.c(), dy7Var);
            return yi9Var.a(r0);
        }

        public static yi9 b(zi9 zi9Var, yi9 yi9Var, List<String> list) {
            z65.h(yi9Var, "$receiver");
            z65.h(list, "permissions");
            for (String str : list) {
                yi9Var = c(zi9Var, yi9Var, str);
            }
            return yi9Var;
        }

        private static yi9 c(zi9 zi9Var, yi9 yi9Var, String str) {
            List<dy7> arrayList = new ArrayList<>();
            for (Object obj : yi9Var.c()) {
                if (!z65.c(((dy7) obj).c(), str)) {
                    arrayList.add(obj);
                }
            }
            return yi9Var.a(arrayList);
        }

        public static yi9 d(zi9 zi9Var, yi9 yi9Var, String[] strArr, int[] iArr, Function1<? super String, ? extends ry7> function1) {
            z65.h(yi9Var, "$receiver");
            z65.h(strArr, "permissions");
            z65.h(iArr, "grantResults");
            z65.h(function1, "getPermissionStatus");
            for (String str : strArr) {
                yi9Var = a(zi9Var, yi9Var, new dy7(str, function1.invoke(str), true));
            }
            return yi9Var;
        }
    }
}
