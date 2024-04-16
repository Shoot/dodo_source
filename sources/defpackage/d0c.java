package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.gson.Gson;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: ViewProductCategoryNode.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\t\u0010\n\u001a\u00020\u0007HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0013\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010$\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001d\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Ld0c;", "Ldb7;", "Ls6b;", "data", "", "a", "", "", com.huawei.hms.opendevice.c.a, "(Lcv1;)Ljava/lang/Object;", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", MessageAttributes.TYPE, "Lyg5;", "Lyg5;", "getKind", "()Lyg5;", "kind", e.a, "getValue", "value", "Lfm6;", "f", "Lbk6;", "g", "()Lfm6;", "mobileConfigRepository", "Lcom/google/gson/Gson;", "()Lcom/google/gson/Gson;", "gson", "<init>", "(Ljava/lang/String;Lyg5;Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: d0c  reason: default package */
/* loaded from: classes.dex */
public final class d0c extends db7 {
    static final /* synthetic */ je5<Object>[] h = {bc9.f(new ar8(d0c.class, "mobileConfigRepository", "getMobileConfigRepository()Lcloud/mindbox/mobile_sdk/inapp/domain/interfaces/repositories/MobileConfigRepository;", 0)), bc9.f(new ar8(d0c.class, "gson", "getGson()Lcom/google/gson/Gson;", 0))};
    private final String c;
    private final yg5 d;
    private final String e;
    private final bk6 f;
    private final bk6 g;

    /* compiled from: ViewProductCategoryNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d0c$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[yg5.values().length];
            try {
                iArr[yg5.SUBSTRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yg5.NOT_SUBSTRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yg5.STARTS_WITH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[yg5.ENDS_WITH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewProductCategoryNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mobile_sdk.inapp.domain.models.ViewProductCategoryNode", f = "ViewProductCategoryNode.kt", l = {42}, m = "getOperationsSet")
    /* renamed from: d0c$b */
    /* loaded from: classes.dex */
    public static final class b extends ev1 {
        /* synthetic */ Object a;
        int c;

        b(cv1<? super b> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return d0c.this.c(this);
        }
    }

    /* compiled from: ViewProductCategoryNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgo;", "Lcom/google/gson/Gson;", "a", "(Lgo;)Lcom/google/gson/Gson;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: d0c$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<go, Gson> {
        public static final c a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Gson invoke(go goVar) {
            z65.h(goVar, "$this$mindboxInject");
            return goVar.R0();
        }
    }

    /* compiled from: ViewProductCategoryNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgo;", "Lfm6;", "a", "(Lgo;)Lfm6;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: d0c$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function1<go, fm6> {
        public static final d a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final fm6 invoke(go goVar) {
            z65.h(goVar, "$this$mindboxInject");
            return goVar.V0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0c(String str, yg5 yg5Var, String str2) {
        super(str);
        z65.h(str, MessageAttributes.TYPE);
        z65.h(yg5Var, "kind");
        z65.h(str2, "value");
        this.c = str;
        this.d = yg5Var;
        this.e = str2;
        this.f = ck6.a(d.a);
        this.g = ck6.a(c.a);
    }

    private final Gson f() {
        return (Gson) this.g.a(this, h[1]);
    }

    private final fm6 g() {
        return (fm6) this.f.a(this, h[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
        r5 = defpackage.sc1.W(r5);
     */
    @Override // defpackage.ct4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(defpackage.s6b r5) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d0c.a(s6b):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    @Override // defpackage.t6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(defpackage.cv1<? super java.util.Set<java.lang.String>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.d0c.b
            if (r0 == 0) goto L13
            r0 = r5
            d0c$b r0 = (defpackage.d0c.b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            d0c$b r0 = new d0c$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.vk9.b(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.vk9.b(r5)
            fm6 r5 = r4.g()
            r0.c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.util.Map r5 = (java.util.Map) r5
            ab7 r0 = defpackage.ab7.VIEW_CATEGORY
            java.lang.Object r5 = r5.get(r0)
            fb7 r5 = (defpackage.fb7) r5
            if (r5 == 0) goto L52
            java.lang.String r5 = r5.f()
            goto L53
        L52:
            r5 = 0
        L53:
            if (r5 == 0) goto L5b
            java.util.Set r5 = defpackage.qfa.d(r5)
            if (r5 != 0) goto L5f
        L5b:
            java.util.Set r5 = defpackage.qfa.e()
        L5f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d0c.c(cv1):java.lang.Object");
    }

    @Override // defpackage.smb
    public String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0c)) {
            return false;
        }
        d0c d0cVar = (d0c) obj;
        if (z65.c(this.c, d0cVar.c) && this.d == d0cVar.d && z65.c(this.e, d0cVar.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "ViewProductCategoryNode(type=" + this.c + ", kind=" + this.d + ", value=" + this.e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
