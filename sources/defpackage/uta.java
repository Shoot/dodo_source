package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: SharingStarted.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Luta;", "Lhia;", "Lkua;", "", "subscriptionCount", "Loz3;", "Lfia;", "a", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: uta  reason: default package */
/* loaded from: classes3.dex */
final class uta implements hia {

    /* compiled from: SharingStarted.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "Lfia;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @nn2(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {155}, m = "invokeSuspend")
    /* renamed from: uta$a */
    /* loaded from: classes3.dex */
    static final class a extends f3b implements Function2<pz3<? super fia>, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ kua<Integer> c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SharingStarted.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "count", "", "b", "(ILcv1;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: uta$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0692a<T> implements pz3 {
            final /* synthetic */ aa9 a;
            final /* synthetic */ pz3<fia> b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SharingStarted.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @nn2(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {158}, m = "emit")
            /* renamed from: uta$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0693a extends ev1 {
                /* synthetic */ Object a;
                final /* synthetic */ C0692a<T> b;
                int c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0693a(C0692a<? super T> c0692a, cv1<? super C0693a> cv1Var) {
                    super(cv1Var);
                    this.b = c0692a;
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.c |= Integer.MIN_VALUE;
                    return this.b.b(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0692a(aa9 aa9Var, pz3<? super fia> pz3Var) {
                this.a = aa9Var;
                this.b = pz3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(int r5, defpackage.cv1<? super kotlin.Unit> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof defpackage.uta.a.C0692a.C0693a
                    if (r0 == 0) goto L13
                    r0 = r6
                    uta$a$a$a r0 = (defpackage.uta.a.C0692a.C0693a) r0
                    int r1 = r0.c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.c = r1
                    goto L18
                L13:
                    uta$a$a$a r0 = new uta$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    if (r5 <= 0) goto L4e
                    aa9 r5 = r4.a
                    boolean r6 = r5.a
                    if (r6 != 0) goto L4e
                    r5.a = r3
                    pz3<fia> r5 = r4.b
                    fia r6 = defpackage.fia.START
                    r0.c = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                L4e:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.uta.a.C0692a.b(int, cv1):java.lang.Object");
            }

            @Override // defpackage.pz3
            public /* bridge */ /* synthetic */ Object emit(Object obj, cv1 cv1Var) {
                return b(((Number) obj).intValue(), cv1Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kua<Integer> kuaVar, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = kuaVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(this.c, cv1Var);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super fia> pz3Var, cv1<? super Unit> cv1Var) {
            return ((a) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vk9.b(obj);
            } else {
                vk9.b(obj);
                aa9 aa9Var = new aa9();
                kua<Integer> kuaVar = this.c;
                C0692a c0692a = new C0692a(aa9Var, (pz3) this.b);
                this.a = 1;
                if (kuaVar.collect(c0692a, this) == d) {
                    return d;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // defpackage.hia
    public oz3<fia> a(kua<Integer> kuaVar) {
        return wz3.z(new a(kuaVar, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
