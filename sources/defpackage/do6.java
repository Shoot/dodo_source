package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: MonitoringInteractorImpl.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Ldo6;", "Lco6;", "", "a", "Lfm6;", "Lfm6;", "mobileConfigRepository", "Lio6;", "b", "Lio6;", "monitoringRepository", "Lbx5;", c.a, "Lbx5;", "logResponseDataManager", "Lvw5;", DateTokenConverter.CONVERTER_KEY, "Lvw5;", "logRequestDataManager", "<init>", "(Lfm6;Lio6;Lbx5;Lvw5;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: do6  reason: default package */
/* loaded from: classes.dex */
public final class do6 implements co6 {
    private final fm6 a;
    private final io6 b;
    private final bx5 c;
    private final vw5 d;

    /* compiled from: MonitoringInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "cloud.mindbox.mobile_sdk.monitoring.MonitoringInteractorImpl$processLogs$1", f = "MonitoringInteractorImpl.kt", l = {24, 25, 26, 36, 56}, m = "invokeSuspend")
    /* renamed from: do6$a */
    /* loaded from: classes.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        Object f;
        Object g;
        int h;
        private /* synthetic */ Object i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MonitoringInteractorImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "cloud.mindbox.mobile_sdk.monitoring.MonitoringInteractorImpl$processLogs$1$3$1", f = "MonitoringInteractorImpl.kt", l = {38}, m = "invokeSuspend")
        /* renamed from: do6$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0288a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;
            final /* synthetic */ do6 b;
            final /* synthetic */ List<ax5> c;
            final /* synthetic */ ax5 d;
            final /* synthetic */ ax5 e;
            final /* synthetic */ uw5 f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0288a(do6 do6Var, List<ax5> list, ax5 ax5Var, ax5 ax5Var2, uw5 uw5Var, cv1<? super C0288a> cv1Var) {
                super(2, cv1Var);
                this.b = do6Var;
                this.c = list;
                this.d = ax5Var;
                this.e = ax5Var2;
                this.f = uw5Var;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new C0288a(this.b, this.c, this.d, this.e, this.f, cv1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return ((C0288a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                    io6 io6Var = this.b.b;
                    String a = this.b.c.a(this.c, this.d, this.e, this.f.b(), this.f.d());
                    String c = this.f.c();
                    List<ax5> b = this.b.c.b(this.c, this.d, this.e, this.f.b(), this.f.d());
                    this.a = 1;
                    if (io6Var.d(a, c, b, this) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }
        }

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(cv1Var);
            aVar.i = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00c5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0117 A[LOOP:1: B:34:0x0111->B:36:0x0117, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0199  */
        /* JADX WARN: Type inference failed for: r2v22, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v16, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0172 -> B:44:0x0175). Please submit an issue!!! */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instructions count: 442
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.do6.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public do6(fm6 fm6Var, io6 io6Var, bx5 bx5Var, vw5 vw5Var) {
        z65.h(fm6Var, "mobileConfigRepository");
        z65.h(io6Var, "monitoringRepository");
        z65.h(bx5Var, "logResponseDataManager");
        z65.h(vw5Var, "logRequestDataManager");
        this.a = fm6Var;
        this.b = io6Var;
        this.c = bx5Var;
        this.d = vw5Var;
    }

    @Override // defpackage.co6
    public void a() {
        sh0.d(fk6.a.h(), null, null, new a(null), 3, null);
    }
}
