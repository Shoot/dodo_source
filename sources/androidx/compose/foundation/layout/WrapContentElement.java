package androidx.compose.foundation.layout;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gb;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BD\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\u0006\u0010!\u001a\u00020\u001eø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R)\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00148\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "Lfn6;", "Landroidx/compose/foundation/layout/f;", "t", "node", "", "u", "", "other", "", "equals", "", "hashCode", "Lt23;", com.huawei.hms.opendevice.c.a, "Lt23;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, DateTokenConverter.CONVERTER_KEY, "Z", "unbounded", "Lkotlin/Function2;", "Lw55;", "Lqm5;", "Ls55;", com.huawei.hms.push.e.a, "Lkotlin/jvm/functions/Function2;", "alignmentCallback", "f", "Ljava/lang/Object;", "align", "", "g", "Ljava/lang/String;", "inspectorName", "<init>", "(Lt23;ZLkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/String;)V", Image.TYPE_HIGH, "a", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WrapContentElement extends fn6<f> {
    public static final a h = new a(null);
    private final t23 c;
    private final boolean d;
    private final Function2<w55, qm5, s55> e;
    private final Object f;
    private final String g;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement$a;", "", "Lgb$b;", "align", "", "unbounded", "Landroidx/compose/foundation/layout/WrapContentElement;", com.huawei.hms.opendevice.c.a, "Lgb$c;", "a", "Lgb;", "b", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Size.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lw55;", "size", "Lqm5;", "<anonymous parameter 1>", "Ls55;", "a", "(JLqm5;)J"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0015a extends ej5 implements Function2<w55, qm5, s55> {
            final /* synthetic */ gb.c a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0015a(gb.c cVar) {
                super(2);
                this.a = cVar;
            }

            public final long a(long j, qm5 qm5Var) {
                z65.h(qm5Var, "<anonymous parameter 1>");
                return t55.a(0, this.a.a(0, w55.f(j)));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ s55 invoke(w55 w55Var, qm5 qm5Var) {
                return s55.b(a(w55Var.j(), qm5Var));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Size.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lw55;", "size", "Lqm5;", "layoutDirection", "Ls55;", "a", "(JLqm5;)J"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes.dex */
        public static final class b extends ej5 implements Function2<w55, qm5, s55> {
            final /* synthetic */ gb a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(gb gbVar) {
                super(2);
                this.a = gbVar;
            }

            public final long a(long j, qm5 qm5Var) {
                z65.h(qm5Var, "layoutDirection");
                return this.a.a(w55.b.a(), j, qm5Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ s55 invoke(w55 w55Var, qm5 qm5Var) {
                return s55.b(a(w55Var.j(), qm5Var));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Size.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lw55;", "size", "Lqm5;", "layoutDirection", "Ls55;", "a", "(JLqm5;)J"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes.dex */
        public static final class c extends ej5 implements Function2<w55, qm5, s55> {
            final /* synthetic */ gb.b a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(gb.b bVar) {
                super(2);
                this.a = bVar;
            }

            public final long a(long j, qm5 qm5Var) {
                z65.h(qm5Var, "layoutDirection");
                return t55.a(this.a.a(0, w55.g(j), qm5Var), 0);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ s55 invoke(w55 w55Var, qm5 qm5Var) {
                return s55.b(a(w55Var.j(), qm5Var));
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WrapContentElement a(gb.c cVar, boolean z) {
            z65.h(cVar, "align");
            return new WrapContentElement(t23.Vertical, z, new C0015a(cVar), cVar, "wrapContentHeight");
        }

        public final WrapContentElement b(gb gbVar, boolean z) {
            z65.h(gbVar, "align");
            return new WrapContentElement(t23.Both, z, new b(gbVar), gbVar, "wrapContentSize");
        }

        public final WrapContentElement c(gb.b bVar, boolean z) {
            z65.h(bVar, "align");
            return new WrapContentElement(t23.Horizontal, z, new c(bVar), bVar, "wrapContentWidth");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(t23 t23Var, boolean z, Function2<? super w55, ? super qm5, s55> function2, Object obj, String str) {
        z65.h(t23Var, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
        z65.h(function2, "alignmentCallback");
        z65.h(obj, "align");
        z65.h(str, "inspectorName");
        this.c = t23Var;
        this.d = z;
        this.e = function2;
        this.f = obj;
        this.g = str;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!z65.c(WrapContentElement.class, cls)) {
            return false;
        }
        z65.f(obj, "null cannot be cast to non-null type androidx.compose.foundation.layout.WrapContentElement");
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        if (this.c == wrapContentElement.c && this.d == wrapContentElement.d && z65.c(this.f, wrapContentElement.f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.c.hashCode() * 31) + a91.a(this.d)) * 31) + this.f.hashCode();
    }

    @Override // defpackage.fn6
    /* renamed from: t */
    public f o() {
        return new f(this.c, this.d, this.e);
    }

    @Override // defpackage.fn6
    /* renamed from: u */
    public void s(f fVar) {
        z65.h(fVar, "node");
        fVar.h1(this.c);
        fVar.i1(this.d);
        fVar.g1(this.e);
    }
}
