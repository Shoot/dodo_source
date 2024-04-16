package defpackage;

import android.app.Activity;
import android.content.Context;
import ch.qos.logback.core.joran.action.Action;
import defpackage.py7;
import kotlin.Metadata;
/* compiled from: PermissionChecker.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\r"}, d2 = {"Ley7;", "Lpy7;", "Landroid/app/Activity;", "activity", "", "permission", "Lry7;", "Pb", "", "Te", "isDeniedForever", "P2", "a", "permissions_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: ey7  reason: default package */
/* loaded from: classes2.dex */
public interface ey7 extends py7 {
    public static final a P2 = a.a;

    /* compiled from: PermissionChecker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ley7$a;", "Ley7;", "<init>", "()V", "permissions_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ey7$a */
    /* loaded from: classes2.dex */
    public static final class a implements ey7 {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        @Override // defpackage.ey7
        public ry7 Pb(Activity activity, String str) {
            return b.a(this, activity, str);
        }

        @Override // defpackage.py7
        public boolean Rg(Context context, String str) {
            return b.d(this, context, str);
        }

        @Override // defpackage.ey7
        public boolean Te(Activity activity, String str) {
            return b.c(this, activity, str);
        }

        @Override // defpackage.py7
        public boolean vc(Context context, String str) {
            return b.e(this, context, str);
        }
    }

    /* compiled from: PermissionChecker.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ey7$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public static ry7 a(ey7 ey7Var, Activity activity, String str) {
            z65.h(activity, "activity");
            z65.h(str, "permission");
            if (ey7Var.Te(activity, str)) {
                return ry7.GRANTED;
            }
            if (!ey7Var.vc(activity, str)) {
                return ry7.NOT_ASKED;
            }
            if (b(ey7Var, activity, str)) {
                return ry7.DENIED_FOREVER;
            }
            return ry7.DENIED;
        }

        private static boolean b(ey7 ey7Var, Activity activity, String str) {
            if (ey7Var.vc(activity, str) && !l5.w(activity, str) && !ey7Var.Rg(activity, str)) {
                return true;
            }
            return false;
        }

        public static boolean c(ey7 ey7Var, Activity activity, String str) {
            z65.h(activity, "activity");
            z65.h(str, "permission");
            if (iu1.a(activity, str) == 0) {
                return true;
            }
            return false;
        }

        public static boolean d(ey7 ey7Var, Context context, String str) {
            z65.h(context, "$receiver");
            z65.h(str, Action.KEY_ATTRIBUTE);
            return py7.a.a(ey7Var, context, str);
        }

        public static boolean e(ey7 ey7Var, Context context, String str) {
            z65.h(context, "$receiver");
            z65.h(str, Action.KEY_ATTRIBUTE);
            return py7.a.b(ey7Var, context, str);
        }
    }

    ry7 Pb(Activity activity, String str);

    boolean Te(Activity activity, String str);
}
