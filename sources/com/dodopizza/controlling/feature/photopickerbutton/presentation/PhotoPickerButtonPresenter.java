package com.dodopizza.controlling.feature.photopickerbutton.presentation;

import com.dodopizza.feature.imagepicker.presentation.a;
import com.dodopizza.presentation.presenters.BasePresenter2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.PresenterScopeKt;
/* compiled from: PhotoPickerButtonPresenter.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0004\u001a\u00020\u0003R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/dodopizza/controlling/feature/photopickerbutton/presentation/PhotoPickerButtonPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter2;", "Lo58;", "", "r", "Lf63;", "b", "Lf63;", "router", "<init>", "(Lf63;)V", com.huawei.hms.opendevice.c.a, "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PhotoPickerButtonPresenter extends BasePresenter2<o58> {
    public static final b c = new b(null);
    private static final int d = zx8.v;
    private final f63 b;

    /* compiled from: PhotoPickerButtonPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/feature/imagepicker/presentation/a$a;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.photopickerbutton.presentation.PhotoPickerButtonPresenter$1", f = "PhotoPickerButtonPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends f3b implements Function2<a.C0121a, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(cv1Var);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(a.C0121a c0121a, cv1<? super Unit> cv1Var) {
            return ((a) create(c0121a, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((o58) PhotoPickerButtonPresenter.this.getViewState()).m8(((a.C0121a) this.b).a());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PhotoPickerButtonPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/controlling/feature/photopickerbutton/presentation/PhotoPickerButtonPresenter$b;", "", "", "PICK_IMAGE_CODE", "I", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class c implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "com.dodopizza.controlling.feature.photopickerbutton.presentation.PhotoPickerButtonPresenter$special$$inlined$resultsFlowOf$1$2", f = "PhotoPickerButtonPresenter.kt", l = {224}, m = "emit")
            /* renamed from: com.dodopizza.controlling.feature.photopickerbutton.presentation.PhotoPickerButtonPresenter$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0120a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0120a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
                this.a = pz3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.dodopizza.controlling.feature.photopickerbutton.presentation.PhotoPickerButtonPresenter.c.a.C0120a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.dodopizza.controlling.feature.photopickerbutton.presentation.PhotoPickerButtonPresenter$c$a$a r0 = (com.dodopizza.controlling.feature.photopickerbutton.presentation.PhotoPickerButtonPresenter.c.a.C0120a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    com.dodopizza.controlling.feature.photopickerbutton.presentation.PhotoPickerButtonPresenter$c$a$a r0 = new com.dodopizza.controlling.feature.photopickerbutton.presentation.PhotoPickerButtonPresenter$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    boolean r2 = r5 instanceof com.dodopizza.feature.imagepicker.presentation.a.C0121a
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.controlling.feature.photopickerbutton.presentation.PhotoPickerButtonPresenter.c.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public c(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super Object> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    public PhotoPickerButtonPresenter(f63 f63Var) {
        z65.h(f63Var, "router");
        this.b = f63Var;
        wz3.C(wz3.F(new c(f63Var.k(d)), new a(null)), PresenterScopeKt.getPresenterScope(this));
    }

    public final void r() {
        this.b.n(hv4.a(new dv4(d, ck1.z)));
    }
}
