package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OtherAnalytics.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lz81;", "Ldc;", "Lqc;", "a", "", "I", "getPosition", "()I", "position", "<init>", "(I)V", "b", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: z81  reason: default package */
/* loaded from: classes4.dex */
public final class z81 implements dc {
    public static final a b = new a(null);
    private final int a;

    /* compiled from: OtherAnalytics.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lz81$a;", "", "Lo98;", "result", "Ldc;", c.a, "Lw43;", "a", "b", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: z81$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* compiled from: OtherAnalytics.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: z81$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0759a extends ej5 implements Function1<bc, bc> {
            final /* synthetic */ w43 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0759a(w43 w43Var) {
                super(1);
                this.a = w43Var;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final bc invoke(bc bcVar) {
                z65.h(bcVar, "$this$eventProducer");
                return bc.e(bcVar, "result", this.a.getValue(), false, 4, null);
            }
        }

        /* compiled from: OtherAnalytics.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: z81$a$b */
        /* loaded from: classes4.dex */
        static final class b extends ej5 implements Function1<bc, bc> {
            final /* synthetic */ o98 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(o98 o98Var) {
                super(1);
                this.a = o98Var;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final bc invoke(bc bcVar) {
                z65.h(bcVar, "$this$eventProducer");
                return bc.e(bcVar, "result", Boolean.valueOf(this.a.i()), false, 4, null);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dc a(w43 w43Var) {
            z65.h(w43Var, "result");
            return ec.a("distance_to_delivery_address_validation_click", new C0759a(w43Var));
        }

        public final dc b() {
            return ec.b("distance_to_delivery_address_validation_shown", null, 2, null);
        }

        public final dc c(o98 o98Var) {
            z65.h(o98Var, "result");
            return ec.a("select_nearby_rest", new b(o98Var));
        }
    }

    public z81(int i) {
        this.a = i;
    }

    @Override // defpackage.dc
    public qc a() {
        return bc.e(new bc("click_on_pizzeria"), "position", Integer.valueOf(this.a), false, 4, null).a();
    }
}
