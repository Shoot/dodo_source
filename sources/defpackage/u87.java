package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OnPositionedDispatcher.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0004R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lu87;", "", "Len5;", "layoutNode", "", "b", "", c.a, "node", DateTokenConverter.CONVERTER_KEY, "rootNode", e.a, "a", "Lgr6;", "Lgr6;", "layoutNodes", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: u87  reason: default package */
/* loaded from: classes.dex */
public final class u87 {
    public static final a b = new a(null);
    private final gr6<en5> a = new gr6<>(new en5[16], 0);

    /* compiled from: OnPositionedDispatcher.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lu87$a;", "", "<init>", "()V", "a", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: u87$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* compiled from: OnPositionedDispatcher.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lu87$a$a;", "Ljava/util/Comparator;", "Len5;", "Lkotlin/Comparator;", "a", "b", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: u87$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static final class C0684a implements Comparator<en5> {
            public static final C0684a a = new C0684a();

            private C0684a() {
            }

            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(en5 en5Var, en5 en5Var2) {
                z65.h(en5Var, "a");
                z65.h(en5Var2, "b");
                int j = z65.j(en5Var2.I(), en5Var.I());
                if (j != 0) {
                    return j;
                }
                return z65.j(en5Var.hashCode(), en5Var2.hashCode());
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void b(en5 en5Var) {
        en5Var.y();
        int i = 0;
        en5Var.l1(false);
        gr6<en5> o0 = en5Var.o0();
        int s = o0.s();
        if (s > 0) {
            en5[] r = o0.r();
            do {
                b(r[i]);
                i++;
            } while (i < s);
        }
    }

    public final void a() {
        this.a.D(a.C0684a.a);
        gr6<en5> gr6Var = this.a;
        int s = gr6Var.s();
        if (s > 0) {
            int i = s - 1;
            en5[] r = gr6Var.r();
            do {
                en5 en5Var = r[i];
                if (en5Var.d0()) {
                    b(en5Var);
                }
                i--;
            } while (i >= 0);
            this.a.k();
        }
        this.a.k();
    }

    public final boolean c() {
        return this.a.v();
    }

    public final void d(en5 en5Var) {
        z65.h(en5Var, "node");
        this.a.b(en5Var);
        en5Var.l1(true);
    }

    public final void e(en5 en5Var) {
        z65.h(en5Var, "rootNode");
        this.a.k();
        this.a.b(en5Var);
        en5Var.l1(true);
    }
}
