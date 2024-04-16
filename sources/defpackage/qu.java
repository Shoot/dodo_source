package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: AssistantMoodInteractor.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Lqu;", "", "Loz3;", "Lwu;", c.a, "Lju;", "mood", "", DateTokenConverter.CONVERTER_KEY, "Lfv;", "b", "Lmu;", "a", "Lmu;", "data", "Lfr6;", "Lfr6;", "selectedMoodFlow", "<init>", "(Lmu;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qu  reason: default package */
/* loaded from: classes2.dex */
public final class qu {
    private final mu a;
    private final fr6<ju> b;

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qu$a */
    /* loaded from: classes2.dex */
    public static final class a implements oz3<wu> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ qu b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: qu$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0491a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ qu b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "com.dodopizza.order.feature.assistant.mood.presentation.AssistantMoodInteractor$observeMoods$$inlined$map$1$2", f = "AssistantMoodInteractor.kt", l = {223}, m = "emit")
            /* renamed from: qu$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0492a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0492a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0491a.this.emit(null, this);
                }
            }

            public C0491a(pz3 pz3Var, qu quVar) {
                this.a = pz3Var;
                this.b = quVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r9, defpackage.cv1 r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof defpackage.qu.a.C0491a.C0492a
                    if (r0 == 0) goto L13
                    r0 = r10
                    qu$a$a$a r0 = (defpackage.qu.a.C0491a.C0492a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    qu$a$a$a r0 = new qu$a$a$a
                    r0.<init>(r10)
                L18:
                    java.lang.Object r10 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r10)
                    goto L7e
                L29:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L31:
                    defpackage.vk9.b(r10)
                    pz3 r10 = r8.a
                    ju r9 = (defpackage.ju) r9
                    qu r2 = r8.b
                    mu r2 = defpackage.qu.a(r2)
                    sv r2 = r2.a()
                    java.util.List r2 = r2.a()
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r5 = 10
                    int r5 = defpackage.ic1.w(r2, r5)
                    r4.<init>(r5)
                    java.util.Iterator r2 = r2.iterator()
                L57:
                    boolean r5 = r2.hasNext()
                    if (r5 == 0) goto L70
                    java.lang.Object r5 = r2.next()
                    ju r5 = (defpackage.ju) r5
                    su r6 = new su
                    boolean r7 = defpackage.z65.c(r5, r9)
                    r6.<init>(r5, r7)
                    r4.add(r6)
                    goto L57
                L70:
                    wu r9 = new wu
                    r9.<init>(r4)
                    r0.b = r3
                    java.lang.Object r9 = r10.emit(r9, r0)
                    if (r9 != r1) goto L7e
                    return r1
                L7e:
                    kotlin.Unit r9 = kotlin.Unit.a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qu.a.C0491a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public a(oz3 oz3Var, qu quVar) {
            this.a = oz3Var;
            this.b = quVar;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super wu> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new C0491a(pz3Var, this.b), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    public qu(mu muVar) {
        z65.h(muVar, "data");
        this.a = muVar;
        this.b = mua.a(null);
    }

    public final fv b() {
        ju value = this.b.getValue();
        if (value != null) {
            return new fv(this.a.C(), this.a.a(), value);
        }
        throw new IllegalStateException("Mood is not selected".toString());
    }

    public final oz3<wu> c() {
        return new a(this.b, this);
    }

    public final void d(ju juVar) {
        z65.h(juVar, "mood");
        this.b.setValue(juVar);
    }
}
