package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: InAppSegmentationRepositoryImpl.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001e¢\u0006\u0004\b(\u0010)J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\b\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0012H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR(\u0010'\u001a\b\u0012\u0004\u0012\u00020!0\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lzy4;", "Lyy4;", "", com.huawei.hms.push.e.a, "(Lcv1;)Ljava/lang/Object;", "Lkotlin/Pair;", "", "product", "b", "(Lkotlin/Pair;Lcv1;)Ljava/lang/Object;", ShoppingInfoEntity.FIELD_PRODUCT_ID, "", "Ljm8;", "g", "Lq52;", "status", "a", com.huawei.hms.opendevice.c.a, "Lfm8;", "f", DateTokenConverter.CONVERTER_KEY, "", "Lr52;", Image.TYPE_HIGH, "Ldy4;", "Ldy4;", "inAppMapper", "Lcfa;", "Lcfa;", "sessionStorageManager", "Lwc4;", "Lwc4;", "gatewayManager", "Lfx4;", "Ljava/util/List;", "k", "()Ljava/util/List;", "i", "(Ljava/util/List;)V", "unShownInApps", "<init>", "(Ldy4;Lcfa;Lwc4;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zy4  reason: default package */
/* loaded from: classes.dex */
public final class zy4 implements yy4 {
    private final dy4 a;
    private final cfa b;
    private final wc4 c;
    private List<fx4> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppSegmentationRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mobile_sdk.inapp.data.repositories.InAppSegmentationRepositoryImpl", f = "InAppSegmentationRepositoryImpl.kt", l = {35, 36}, m = "fetchCustomerSegmentations")
    /* renamed from: zy4$a */
    /* loaded from: classes.dex */
    public static final class a extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int d;

        a(cv1<? super a> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return zy4.this.e(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppSegmentationRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mobile_sdk.inapp.data.repositories.InAppSegmentationRepositoryImpl", f = "InAppSegmentationRepositoryImpl.kt", l = {51, 57}, m = "fetchProductSegmentation")
    /* renamed from: zy4$b */
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
            return zy4.this.b(null, this);
        }
    }

    /* compiled from: InAppSegmentationRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq52;", "a", "()Lq52;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: zy4$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<q52> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final q52 invoke() {
            return zy4.this.b.a();
        }
    }

    /* compiled from: InAppSegmentationRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lr52;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: zy4$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function0<List<? extends r52>> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends r52> invoke() {
            List<? extends r52> l;
            List<r52> a;
            x3a c = zy4.this.b.c();
            if (c == null || (a = c.a()) == null) {
                l = kc1.l();
                return l;
            }
            return a;
        }
    }

    /* compiled from: InAppSegmentationRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lfm8;", "a", "()Lfm8;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: zy4$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function0<fm8> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final fm8 invoke() {
            return zy4.this.b.f();
        }
    }

    /* compiled from: InAppSegmentationRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljm8;", "a", "()Ljava/util/Set;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: zy4$f */
    /* loaded from: classes.dex */
    static final class f extends ej5 implements Function0<Set<? extends jm8>> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Set<jm8> invoke() {
            Set<jm8> e;
            Set<jm8> set = zy4.this.b.d().get(this.b);
            if (set == null) {
                e = sfa.e();
                return e;
            }
            return set;
        }
    }

    public zy4(dy4 dy4Var, cfa cfaVar, wc4 wc4Var) {
        z65.h(dy4Var, "inAppMapper");
        z65.h(cfaVar, "sessionStorageManager");
        z65.h(wc4Var, "gatewayManager");
        this.a = dy4Var;
        this.b = cfaVar;
        this.c = wc4Var;
        this.d = new ArrayList();
    }

    @Override // defpackage.yy4
    public void a(q52 q52Var) {
        z65.h(q52Var, "status");
        this.b.h(q52Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    @Override // defpackage.yy4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(kotlin.Pair<java.lang.String, java.lang.String> r7, defpackage.cv1<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.zy4.b
            if (r0 == 0) goto L13
            r0 = r8
            zy4$b r0 = (defpackage.zy4.b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            zy4$b r0 = new zy4$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.b
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r0 = r0.a
            zy4 r0 = (defpackage.zy4) r0
            defpackage.vk9.b(r8)
            goto L7b
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r7 = r0.b
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r2 = r0.a
            zy4 r2 = (defpackage.zy4) r2
            defpackage.vk9.b(r8)
            goto L5f
        L48:
            defpackage.vk9.b(r8)
            in2 r8 = defpackage.in2.a
            oz3 r8 = r8.n()
            r0.a = r6
            r0.b = r7
            r0.e = r4
            java.lang.Object r8 = defpackage.wz3.u(r8, r0)
            if (r8 != r1) goto L5e
            return r1
        L5e:
            r2 = r6
        L5f:
            cloud.mindbox.mobile_sdk.models.Configuration r8 = (cloud.mindbox.mobile_sdk.models.Configuration) r8
            dy4 r4 = r2.a
            java.util.List r5 = r2.k()
            gm8 r4 = r4.i(r7, r5)
            wc4 r5 = r2.c
            r0.a = r2
            r0.b = r7
            r0.e = r3
            java.lang.Object r8 = r5.k(r8, r4, r0)
            if (r8 != r1) goto L7a
            return r1
        L7a:
            r0 = r2
        L7b:
            im8 r8 = (defpackage.im8) r8
            cfa r1 = r0.b
            java.util.HashMap r1 = r1.d()
            java.lang.Object r2 = r7.d()
            cfa r3 = r0.b
            java.util.HashMap r3 = r3.d()
            java.lang.Object r7 = r7.d()
            java.lang.Object r7 = r3.get(r7)
            if (r7 != 0) goto La5
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            dy4 r3 = r0.a
            jm8 r8 = r3.j(r8)
            r7.add(r8)
        La5:
            r1.put(r2, r7)
            cfa r7 = r0.b
            fm8 r8 = defpackage.fm8.SEGMENTATION_FETCH_SUCCESS
            r7.l(r8)
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy4.b(kotlin.Pair, cv1):java.lang.Object");
    }

    @Override // defpackage.yy4
    public q52 c() {
        return (q52) yx5.a.b(q52.SEGMENTATION_FETCH_ERROR, new c());
    }

    @Override // defpackage.yy4
    public void d(fm8 fm8Var) {
        z65.h(fm8Var, "status");
        this.b.l(fm8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    @Override // defpackage.yy4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(defpackage.cv1<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.zy4.a
            if (r0 == 0) goto L13
            r0 = r8
            zy4$a r0 = (defpackage.zy4.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            zy4$a r0 = new zy4$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.a
            zy4 r0 = (defpackage.zy4) r0
            defpackage.vk9.b(r8)
            goto L91
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            java.lang.Object r2 = r0.a
            zy4 r2 = (defpackage.zy4) r2
            defpackage.vk9.b(r8)
            goto L77
        L40:
            defpackage.vk9.b(r8)
            java.util.List r8 = r7.k()
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L5e
            fk6 r8 = defpackage.fk6.a
            java.lang.String r0 = "No unshown inapps. Do not request segmentations"
            r8.d(r7, r0)
            cfa r8 = r7.b
            q52 r0 = defpackage.q52.SEGMENTATION_FETCH_ERROR
            r8.h(r0)
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L5e:
            fk6 r8 = defpackage.fk6.a
            java.lang.String r2 = "Request segmentations"
            r8.d(r7, r2)
            in2 r8 = defpackage.in2.a
            oz3 r8 = r8.n()
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = defpackage.wz3.u(r8, r0)
            if (r8 != r1) goto L76
            return r1
        L76:
            r2 = r7
        L77:
            cloud.mindbox.mobile_sdk.models.Configuration r8 = (cloud.mindbox.mobile_sdk.models.Configuration) r8
            wc4 r4 = r2.c
            dy4 r5 = r2.a
            java.util.List r6 = r2.k()
            v3a r5 = r5.e(r6)
            r0.a = r2
            r0.d = r3
            java.lang.Object r8 = r4.i(r8, r5, r0)
            if (r8 != r1) goto L90
            return r1
        L90:
            r0 = r2
        L91:
            w3a r8 = (defpackage.w3a) r8
            cfa r1 = r0.b
            dy4 r2 = r0.a
            x3a r8 = r2.k(r8)
            r1.j(r8)
            cfa r8 = r0.b
            q52 r0 = defpackage.q52.SEGMENTATION_FETCH_SUCCESS
            r8.h(r0)
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy4.e(cv1):java.lang.Object");
    }

    @Override // defpackage.yy4
    public fm8 f() {
        return (fm8) yx5.a.b(fm8.SEGMENTATION_FETCH_ERROR, new e());
    }

    @Override // defpackage.yy4
    public Set<jm8> g(String str) {
        Set e2;
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        yx5 yx5Var = yx5.a;
        e2 = sfa.e();
        return (Set) yx5Var.b(e2, new f(str));
    }

    @Override // defpackage.yy4
    public List<r52> h() {
        List l;
        yx5 yx5Var = yx5.a;
        l = kc1.l();
        return (List) yx5Var.b(l, new d());
    }

    @Override // defpackage.yy4
    public void i(List<fx4> list) {
        z65.h(list, "<set-?>");
        this.d = list;
    }

    public List<fx4> k() {
        return this.d;
    }
}
