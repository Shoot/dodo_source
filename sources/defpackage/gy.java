package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.wob;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0006\u0010.\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b/\u00100J\u0013\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u0002*\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR+\u0010%\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lgy;", "Lcua;", "", "", "j", "(Lcv1;)Ljava/lang/Object;", "Lq24;", Image.TYPE_MEDIUM, "(Lq24;Lcv1;)Ljava/lang/Object;", "", "a", "Ljava/util/List;", "fontList", "Luob;", "b", "Luob;", "typefaceRequest", "Lly;", com.huawei.hms.opendevice.c.a, "Lly;", "asyncTypefaceCache", "Lkotlin/Function1;", "Lwob$b;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function1;", "onCompletion", "Lac8;", e.a, "Lac8;", "platformFontLoader", "<set-?>", "f", "Ler6;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "", "g", "Z", "i", "()Z", "setCacheable$ui_text_release", "(Z)V", "cacheable", "initialType", "<init>", "(Ljava/util/List;Ljava/lang/Object;Luob;Lly;Lkotlin/jvm/functions/Function1;Lac8;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: gy  reason: default package */
/* loaded from: classes.dex */
public final class gy implements cua<Object> {
    private final List<q24> a;
    private final uob b;
    private final ly c;
    private final Function1<wob.b, Unit> d;
    private final ac8 e;
    private final er6 f;
    private boolean g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {268, 281}, m = "load")
    /* renamed from: gy$a */
    /* loaded from: classes.dex */
    public static final class a extends ev1 {
        Object a;
        Object b;
        Object c;
        int d;
        int e;
        /* synthetic */ Object f;
        int h;

        a(cv1<? super a> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return gy.this.j(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {269}, m = "invokeSuspend")
    /* renamed from: gy$b */
    /* loaded from: classes.dex */
    public static final class b extends f3b implements Function1<cv1<? super Object>, Object> {
        int a;
        final /* synthetic */ q24 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q24 q24Var, cv1<? super b> cv1Var) {
            super(1, cv1Var);
            this.c = q24Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<Object> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                gy gyVar = gy.this;
                q24 q24Var = this.c;
                this.a = 1;
                obj = gyVar.m(q24Var, this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {300}, m = "loadWithTimeoutOrNull$ui_text_release")
    /* renamed from: gy$c */
    /* loaded from: classes.dex */
    public static final class c extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int d;

        c(cv1<? super c> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return gy.this.m(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", l = {301}, m = "invokeSuspend")
    /* renamed from: gy$d */
    /* loaded from: classes.dex */
    public static final class d extends f3b implements Function2<qx1, cv1<? super Object>, Object> {
        int a;
        final /* synthetic */ q24 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(q24 q24Var, cv1<? super d> cv1Var) {
            super(2, cv1Var);
            this.c = q24Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new d(this.c, cv1Var);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(qx1 qx1Var, cv1<Object> cv1Var) {
            return ((d) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                ac8 ac8Var = gy.this.e;
                q24 q24Var = this.c;
                this.a = 1;
                obj = ac8Var.a(q24Var, this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Object> cv1Var) {
            return invoke2(qx1Var, (cv1<Object>) cv1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gy(List<? extends q24> list, Object obj, uob uobVar, ly lyVar, Function1<? super wob.b, Unit> function1, ac8 ac8Var) {
        er6 c2;
        z65.h(list, "fontList");
        z65.h(obj, "initialType");
        z65.h(uobVar, "typefaceRequest");
        z65.h(lyVar, "asyncTypefaceCache");
        z65.h(function1, "onCompletion");
        z65.h(ac8Var, "platformFontLoader");
        this.a = list;
        this.b = uobVar;
        this.c = lyVar;
        this.d = function1;
        this.e = ac8Var;
        c2 = tpa.c(obj, null, 2, null);
        this.f = c2;
        this.g = true;
    }

    private void setValue(Object obj) {
        this.f.setValue(obj);
    }

    @Override // defpackage.cua
    public Object getValue() {
        return this.f.getValue();
    }

    public final boolean i() {
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb A[Catch: all -> 0x00ef, TRY_LEAVE, TryCatch #2 {all -> 0x00ef, blocks: (B:28:0x0075, B:30:0x008c, B:35:0x00bb, B:40:0x00f2), top: B:57:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2 A[Catch: all -> 0x00ef, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00ef, blocks: (B:28:0x0075, B:30:0x008c, B:35:0x00bb, B:40:0x00f2), top: B:57:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0105 -> B:44:0x0106). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x010a -> B:46:0x010c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.cv1<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gy.j(cv1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.q24 r7, defpackage.cv1<java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.gy.c
            if (r0 == 0) goto L13
            r0 = r8
            gy$c r0 = (defpackage.gy.c) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gy$c r0 = new gy$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.a
            q24 r7 = (defpackage.q24) r7
            defpackage.vk9.b(r8)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            goto L4f
        L2e:
            r8 = move-exception
            goto L51
        L30:
            r7 = move-exception
            goto L7d
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            defpackage.vk9.b(r8)
            gy$d r8 = new gy$d     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r8.<init>(r7, r4)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r0.a = r7     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r0.d = r3     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r8 = defpackage.zgb.d(r2, r8, r0)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            if (r8 != r1) goto L4f
            return r1
        L4f:
            r4 = r8
            goto L87
        L51:
            kotlin.coroutines.CoroutineContext r1 = r0.getContext()
            lx1$a r2 = defpackage.lx1.J
            kotlin.coroutines.CoroutineContext$Element r1 = r1.c(r2)
            lx1 r1 = (defpackage.lx1) r1
            if (r1 == 0) goto L87
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to load font "
            r3.append(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.N(r0, r2)
            goto L87
        L7d:
            kotlin.coroutines.CoroutineContext r8 = r0.getContext()
            boolean r8 = defpackage.q95.m(r8)
            if (r8 == 0) goto L88
        L87:
            return r4
        L88:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gy.m(q24, cv1):java.lang.Object");
    }
}
