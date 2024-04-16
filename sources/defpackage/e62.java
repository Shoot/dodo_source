package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: customizationtransforms.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0004"}, d2 = {"Lyf7;", "", "b", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: e62  reason: default package */
/* loaded from: classes4.dex */
public final class e62 {

    /* compiled from: customizationtransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcg7;", "ingredient", "", "a", "(Lcg7;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: e62$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<cg7, CharSequence> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(cg7 cg7Var) {
            z65.h(cg7Var, "ingredient");
            return qhb.a(cg7Var.a());
        }
    }

    /* compiled from: customizationtransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldg7;", "topping", "", "a", "(Ldg7;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: e62$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<dg7, CharSequence> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(dg7 dg7Var) {
            z65.h(dg7Var, "topping");
            return qhb.a(dg7Var.a());
        }
    }

    public static final String a(yf7 yf7Var) {
        String i0;
        z65.h(yf7Var, "<this>");
        i0 = sc1.i0(yf7Var.d().d(), null, null, null, 0, null, a.a, 31, null);
        return i0;
    }

    public static final String b(yf7 yf7Var) {
        String i0;
        z65.h(yf7Var, "<this>");
        i0 = sc1.i0(yf7Var.d().b(), null, null, null, 0, null, b.a, 31, null);
        return i0;
    }
}
