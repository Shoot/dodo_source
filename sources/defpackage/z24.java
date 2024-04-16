package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.w24;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FontFamilyResolver.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001a\u0012\b\b\u0002\u0010!\u001a\u00020\u001e\u0012\b\b\u0002\u0010%\u001a\u00020\"¢\u0006\u0004\b)\u0010*J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J=\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lz24;", "Lw24$b;", "Luob;", "typefaceRequest", "Lcua;", "", "g", "Lw24;", "fontFamily", "Lv34;", "fontWeight", "Lq34;", "fontStyle", "Lr34;", "fontSynthesis", "a", "(Lw24;Lv34;II)Lcua;", "Lac8;", "Lac8;", "f", "()Lac8;", "platformFontLoader", "Ljc8;", "b", "Ljc8;", "platformResolveInterceptor", "Lvob;", c.a, "Lvob;", "typefaceRequestCache", "Lg34;", DateTokenConverter.CONVERTER_KEY, "Lg34;", "fontListFontFamilyTypefaceAdapter", "Lzb8;", e.a, "Lzb8;", "platformFamilyTypefaceAdapter", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "createDefaultTypeface", "<init>", "(Lac8;Ljc8;Lvob;Lg34;Lzb8;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: z24  reason: default package */
/* loaded from: classes.dex */
public final class z24 implements w24.b {
    private final ac8 a;
    private final jc8 b;
    private final vob c;
    private final g34 d;
    private final zb8 e;
    private final Function1<uob, Object> f;

    /* compiled from: FontFamilyResolver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Luob;", "it", "", "a", "(Luob;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: z24$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<uob, Object> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(uob uobVar) {
            z65.h(uobVar, "it");
            return z24.this.g(uob.b(uobVar, null, null, 0, 0, null, 30, null)).getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontFamilyResolver.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "Lwob;", "", "onAsyncCompletion", "a", "(Lkotlin/jvm/functions/Function1;)Lwob;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: z24$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function1<Function1<? super wob, ? extends Unit>, wob> {
        final /* synthetic */ uob b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(uob uobVar) {
            super(1);
            this.b = uobVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final wob invoke(Function1<? super wob, Unit> function1) {
            z65.h(function1, "onAsyncCompletion");
            wob a = z24.this.d.a(this.b, z24.this.f(), function1, z24.this.f);
            if (a == null && (a = z24.this.e.a(this.b, z24.this.f(), function1, z24.this.f)) == null) {
                throw new IllegalStateException("Could not load font");
            }
            return a;
        }
    }

    public z24(ac8 ac8Var, jc8 jc8Var, vob vobVar, g34 g34Var, zb8 zb8Var) {
        z65.h(ac8Var, "platformFontLoader");
        z65.h(jc8Var, "platformResolveInterceptor");
        z65.h(vobVar, "typefaceRequestCache");
        z65.h(g34Var, "fontListFontFamilyTypefaceAdapter");
        z65.h(zb8Var, "platformFamilyTypefaceAdapter");
        this.a = ac8Var;
        this.b = jc8Var;
        this.c = vobVar;
        this.d = g34Var;
        this.e = zb8Var;
        this.f = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cua<Object> g(uob uobVar) {
        return this.c.c(uobVar, new b(uobVar));
    }

    @Override // defpackage.w24.b
    public cua<Object> a(w24 w24Var, v34 v34Var, int i, int i2) {
        z65.h(v34Var, "fontWeight");
        return g(new uob(this.b.b(w24Var), this.b.d(v34Var), this.b.a(i), this.b.c(i2), this.a.b(), null));
    }

    public final ac8 f() {
        return this.a;
    }

    public /* synthetic */ z24(ac8 ac8Var, jc8 jc8Var, vob vobVar, g34 g34Var, zb8 zb8Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ac8Var, (i & 2) != 0 ? jc8.a.a() : jc8Var, (i & 4) != 0 ? a34.b() : vobVar, (i & 8) != 0 ? new g34(a34.a(), null, 2, null) : g34Var, (i & 16) != 0 ? new zb8() : zb8Var);
    }
}
