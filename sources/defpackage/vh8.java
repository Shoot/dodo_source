package defpackage;

import android.content.Context;
import ch.qos.logback.core.joran.action.Action;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: PreferenceDataStoreDelegate.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a^\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00070\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n¨\u0006\u000f"}, d2 = {"", Action.NAME_ATTRIBUTE, "Lng9;", "Lbi8;", "corruptionHandler", "Lkotlin/Function1;", "Landroid/content/Context;", "", "Lwk2;", "produceMigrations", "Lqx1;", Action.SCOPE_ATTRIBUTE, "Lk79;", "Lnl2;", "a", "datastore-preferences_release"}, k = 2, mv = {1, 5, 1})
/* renamed from: vh8 */
/* loaded from: classes.dex */
public final class vh8 {

    /* compiled from: PreferenceDataStoreDelegate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/content/Context;", "it", "", "Lwk2;", "Lbi8;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: vh8$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function1<Context, List<? extends wk2<bi8>>> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<wk2<bi8>> invoke(Context context) {
            List<wk2<bi8>> l;
            z65.h(context, "it");
            l = kc1.l();
            return l;
        }
    }

    public static final k79<Context, nl2<bi8>> a(String str, ng9<bi8> ng9Var, Function1<? super Context, ? extends List<? extends wk2<bi8>>> function1, qx1 qx1Var) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(function1, "produceMigrations");
        z65.h(qx1Var, Action.SCOPE_ATTRIBUTE);
        return new yh8(str, ng9Var, function1, qx1Var);
    }

    public static /* synthetic */ k79 b(String str, ng9 ng9Var, Function1 function1, qx1 qx1Var, int i, Object obj) {
        if ((i & 2) != 0) {
            ng9Var = null;
        }
        if ((i & 4) != 0) {
            function1 = a.a;
        }
        if ((i & 8) != 0) {
            qx1Var = rx1.a(v33.b().P(k2b.b(null, 1, null)));
        }
        return a(str, ng9Var, function1, qx1Var);
    }
}
