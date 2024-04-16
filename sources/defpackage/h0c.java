package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import cloud.mindbox.mobile_sdk.models.operation.Ids;
import com.google.gson.Gson;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.s6b;
import im.threads.business.transport.MessageAttributes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
/* compiled from: ViewProductSegmentNode.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\n\u0012\u0006\u0010!\u001a\u00020\n¢\u0006\u0004\b.\u0010/J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\nHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u001a\u0010\u0016\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010!\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0015R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010*\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b#\u0010)R\u001b\u0010-\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b\u001f\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Lh0c;", "Ldb7;", "Ls6b;", "data", "", "b", "(Ls6b;Lcv1;)Ljava/lang/Object;", "", "a", "", "", com.huawei.hms.opendevice.c.a, "(Lcv1;)Ljava/lang/Object;", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", MessageAttributes.TYPE, "Lwg5;", "Lwg5;", "getKind", "()Lwg5;", "kind", com.huawei.hms.push.e.a, "i", "segmentationExternalId", "f", "getSegmentExternalId", "segmentExternalId", "Lfm6;", "g", "Lbk6;", Image.TYPE_HIGH, "()Lfm6;", "mobileConfigRepository", "Lyy4;", "()Lyy4;", "inAppSegmentationRepository", "Lcom/google/gson/Gson;", "()Lcom/google/gson/Gson;", "gson", "<init>", "(Ljava/lang/String;Lwg5;Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: h0c  reason: default package */
/* loaded from: classes.dex */
public final class h0c extends db7 {
    static final /* synthetic */ je5<Object>[] j = {bc9.f(new ar8(h0c.class, "mobileConfigRepository", "getMobileConfigRepository()Lcloud/mindbox/mobile_sdk/inapp/domain/interfaces/repositories/MobileConfigRepository;", 0)), bc9.f(new ar8(h0c.class, "inAppSegmentationRepository", "getInAppSegmentationRepository()Lcloud/mindbox/mobile_sdk/inapp/domain/interfaces/repositories/InAppSegmentationRepository;", 0)), bc9.f(new ar8(h0c.class, "gson", "getGson()Lcom/google/gson/Gson;", 0))};
    private final String c;
    private final wg5 d;
    private final String e;
    private final String f;
    private final bk6 g;
    private final bk6 h;
    private final bk6 i;

    /* compiled from: ViewProductSegmentNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: h0c$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[wg5.values().length];
            try {
                iArr[wg5.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wg5.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewProductSegmentNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mobile_sdk.inapp.domain.models.ViewProductSegmentNode", f = "ViewProductSegmentNode.kt", l = {25}, m = "fetchTargetingInfo")
    /* renamed from: h0c$b */
    /* loaded from: classes.dex */
    public static final class b extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        b(cv1<? super b> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return h0c.this.b(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewProductSegmentNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mobile_sdk.inapp.domain.models.ViewProductSegmentNode", f = "ViewProductSegmentNode.kt", l = {59}, m = "getOperationsSet")
    /* renamed from: h0c$c */
    /* loaded from: classes.dex */
    public static final class c extends ev1 {
        /* synthetic */ Object a;
        int c;

        c(cv1<? super c> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return h0c.this.c(this);
        }
    }

    /* compiled from: ViewProductSegmentNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgo;", "Lcom/google/gson/Gson;", "a", "(Lgo;)Lcom/google/gson/Gson;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: h0c$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function1<go, Gson> {
        public static final d a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Gson invoke(go goVar) {
            z65.h(goVar, "$this$mindboxInject");
            return goVar.R0();
        }
    }

    /* compiled from: ViewProductSegmentNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgo;", "Lyy4;", "a", "(Lgo;)Lyy4;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: h0c$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function1<go, yy4> {
        public static final e a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final yy4 invoke(go goVar) {
            z65.h(goVar, "$this$mindboxInject");
            return goVar.W0();
        }
    }

    /* compiled from: ViewProductSegmentNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgo;", "Lfm6;", "a", "(Lgo;)Lfm6;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: h0c$f */
    /* loaded from: classes.dex */
    static final class f extends ej5 implements Function1<go, fm6> {
        public static final f a = new f();

        f() {
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
    public h0c(String str, wg5 wg5Var, String str2, String str3) {
        super(str);
        z65.h(str, MessageAttributes.TYPE);
        z65.h(wg5Var, "kind");
        z65.h(str2, "segmentationExternalId");
        z65.h(str3, "segmentExternalId");
        this.c = str;
        this.d = wg5Var;
        this.e = str2;
        this.f = str3;
        this.g = ck6.a(f.a);
        this.h = ck6.a(e.a);
        this.i = ck6.a(d.a);
    }

    private final Gson f() {
        return (Gson) this.i.a(this, j[2]);
    }

    private final yy4 g() {
        return (yy4) this.h.a(this, j[1]);
    }

    private final fm6 h() {
        return (fm6) this.g.a(this, j[0]);
    }

    @Override // defpackage.ct4
    public boolean a(s6b s6bVar) {
        va7 va7Var;
        g0c viewProductRequest;
        bm8 product;
        Ids ids;
        Map<String, String> ids2;
        Set<Map.Entry<String, String>> entrySet;
        Object a0;
        String str;
        Object obj;
        String a2;
        List<hm8> l;
        List<dm8> a3;
        Object b0;
        z65.h(s6bVar, "data");
        if ((s6bVar instanceof s6b.a) && (va7Var = (va7) f().k(((s6b.a) s6bVar).b(), va7.class)) != null && (viewProductRequest = va7Var.getViewProductRequest()) != null && (product = viewProductRequest.getProduct()) != null && (ids = product.getIds()) != null && (ids2 = ids.getIds()) != null && (entrySet = ids2.entrySet()) != null) {
            a0 = sc1.a0(entrySet);
            Map.Entry entry = (Map.Entry) a0;
            if (entry == null || (str = (String) entry.getValue()) == null) {
                return false;
            }
            ArrayList<hm8> arrayList = new ArrayList();
            for (jm8 jm8Var : g().g(str)) {
                if (jm8Var != null && (a3 = jm8Var.a()) != null) {
                    b0 = sc1.b0(a3);
                    dm8 dm8Var = (dm8) b0;
                    if (dm8Var != null && (l = dm8Var.a()) != null) {
                        pc1.C(arrayList, l);
                    }
                }
                l = kc1.l();
                pc1.C(arrayList, l);
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            int i = a.$EnumSwitchMapping$0[this.d.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (z65.c(((hm8) obj).b(), this.e)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    hm8 hm8Var = (hm8) obj;
                    if (hm8Var == null || (a2 = hm8Var.a()) == null || !(!z65.c(a2, this.f))) {
                        return false;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (arrayList.isEmpty()) {
                return false;
            } else {
                for (hm8 hm8Var2 : arrayList) {
                    if (!z65.c(hm8Var2.b(), this.e) || !z65.c(hm8Var2.a(), this.f)) {
                    }
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    @Override // defpackage.db7, defpackage.t6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.s6b r6, defpackage.cv1<? super kotlin.Unit> r7) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h0c.b(s6b, cv1):java.lang.Object");
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
            boolean r0 = r5 instanceof defpackage.h0c.c
            if (r0 == 0) goto L13
            r0 = r5
            h0c$c r0 = (defpackage.h0c.c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            h0c$c r0 = new h0c$c
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
            fm6 r5 = r4.h()
            r0.c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.util.Map r5 = (java.util.Map) r5
            ab7 r0 = defpackage.ab7.VIEW_PRODUCT
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h0c.c(cv1):java.lang.Object");
    }

    @Override // defpackage.smb
    public String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0c)) {
            return false;
        }
        h0c h0cVar = (h0c) obj;
        if (z65.c(this.c, h0cVar.c) && this.d == h0cVar.d && z65.c(this.e, h0cVar.e) && z65.c(this.f, h0cVar.f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String i() {
        return this.e;
    }

    public String toString() {
        return "ViewProductSegmentNode(type=" + this.c + ", kind=" + this.d + ", segmentationExternalId=" + this.e + ", segmentExternalId=" + this.f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
