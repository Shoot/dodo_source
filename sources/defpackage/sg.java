package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.i34;
import defpackage.sk9;
import kotlin.Metadata;
/* compiled from: AndroidFontLoader.android.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000b\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lsg;", "Lac8;", "Lq24;", "font", "Landroid/graphics/Typeface;", DateTokenConverter.CONVERTER_KEY, "a", "(Lq24;Lcv1;)Ljava/lang/Object;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "cacheKey", "<init>", "(Landroid/content/Context;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: sg  reason: default package */
/* loaded from: classes.dex */
public final class sg implements ac8 {
    private final Context a;
    private final Object b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidFontLoader.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", l = {61, 62}, m = "awaitLoad")
    /* renamed from: sg$a */
    /* loaded from: classes.dex */
    public static final class a extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        a(cv1<? super a> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return sg.this.a(null, this);
        }
    }

    public sg(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @Override // defpackage.ac8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.q24 r7, defpackage.cv1<? super android.graphics.Typeface> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.sg.a
            if (r0 == 0) goto L13
            r0 = r8
            sg$a r0 = (defpackage.sg.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            sg$a r0 = new sg$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            java.lang.String r5 = "context"
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r7 = r0.b
            q24 r7 = (defpackage.q24) r7
            java.lang.Object r0 = r0.a
            sg r0 = (defpackage.sg) r0
            defpackage.vk9.b(r8)
            goto L63
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            defpackage.vk9.b(r8)
            return r8
        L42:
            defpackage.vk9.b(r8)
            boolean r8 = r7 instanceof defpackage.rg
            if (r8 != 0) goto L8c
            boolean r8 = r7 instanceof defpackage.xj9
            if (r8 == 0) goto L75
            r8 = r7
            xj9 r8 = (defpackage.xj9) r8
            android.content.Context r2 = r6.a
            defpackage.z65.g(r2, r5)
            r0.a = r6
            r0.b = r7
            r0.e = r3
            java.lang.Object r8 = defpackage.tg.b(r8, r2, r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            r0 = r6
        L63:
            android.graphics.Typeface r8 = (android.graphics.Typeface) r8
            xj9 r7 = (defpackage.xj9) r7
            u34 r7 = r7.e()
            android.content.Context r0 = r0.a
            defpackage.z65.g(r0, r5)
            android.graphics.Typeface r7 = defpackage.yc8.c(r8, r7, r0)
            return r7
        L75:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown font type: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L8c:
            rg r7 = (defpackage.rg) r7
            r7.d()
            android.content.Context r7 = r6.a
            defpackage.z65.g(r7, r5)
            r0.e = r4
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sg.a(q24, cv1):java.lang.Object");
    }

    @Override // defpackage.ac8
    public Object b() {
        return this.b;
    }

    @Override // defpackage.ac8
    /* renamed from: d */
    public Typeface c(q24 q24Var) {
        Object b;
        Typeface typeface;
        z65.h(q24Var, "font");
        Typeface typeface2 = null;
        if (!(q24Var instanceof rg)) {
            if (!(q24Var instanceof xj9)) {
                return null;
            }
            int a2 = q24Var.a();
            i34.a aVar = i34.a;
            if (i34.e(a2, aVar.b())) {
                Context context = this.a;
                z65.g(context, CoreConstants.CONTEXT_SCOPE_VALUE);
                typeface = tg.c((xj9) q24Var, context);
            } else if (i34.e(a2, aVar.c())) {
                try {
                    sk9.a aVar2 = sk9.b;
                    Context context2 = this.a;
                    z65.g(context2, CoreConstants.CONTEXT_SCOPE_VALUE);
                    b = sk9.b(tg.c((xj9) q24Var, context2));
                } catch (Throwable th) {
                    sk9.a aVar3 = sk9.b;
                    b = sk9.b(vk9.a(th));
                }
                if (!sk9.f(b)) {
                    typeface2 = b;
                }
                typeface = typeface2;
            } else if (i34.e(a2, aVar.a())) {
                throw new UnsupportedOperationException("Unsupported Async font load path");
            } else {
                throw new IllegalArgumentException("Unknown loading type " + ((Object) i34.g(q24Var.a())));
            }
            u34 e = ((xj9) q24Var).e();
            Context context3 = this.a;
            z65.g(context3, CoreConstants.CONTEXT_SCOPE_VALUE);
            return yc8.c(typeface, e, context3);
        }
        ((rg) q24Var).d();
        z65.g(this.a, CoreConstants.CONTEXT_SCOPE_VALUE);
        throw null;
    }
}
