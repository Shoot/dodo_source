package defpackage;

import ch.qos.logback.core.joran.action.Action;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: PreferenceDataStoreFactory.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010JN\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¨\u0006\u0011"}, d2 = {"Lwh8;", "", "Lng9;", "Lbi8;", "corruptionHandler", "", "Lwk2;", "migrations", "Lqx1;", Action.SCOPE_ATTRIBUTE, "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Lnl2;", "a", "<init>", "()V", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1})
/* renamed from: wh8  reason: default package */
/* loaded from: classes.dex */
public final class wh8 {
    public static final wh8 a = new wh8();

    /* compiled from: PreferenceDataStoreFactory.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/io/File;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: wh8$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<File> {
        final /* synthetic */ Function0<File> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function0<? extends File> function0) {
            super(0);
            this.a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final File invoke() {
            String i;
            File invoke = this.a.invoke();
            i = tu3.i(invoke);
            li8 li8Var = li8.a;
            if (z65.c(i, li8Var.f())) {
                return invoke;
            }
            throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: " + li8Var.f()).toString());
        }
    }

    private wh8() {
    }

    public final nl2<bi8> a(ng9<bi8> ng9Var, List<? extends wk2<bi8>> list, qx1 qx1Var, Function0<? extends File> function0) {
        z65.h(list, "migrations");
        z65.h(qx1Var, Action.SCOPE_ATTRIBUTE);
        z65.h(function0, "produceFile");
        return new th8(ol2.a.a(li8.a, ng9Var, list, qx1Var, new a(function0)));
    }
}
