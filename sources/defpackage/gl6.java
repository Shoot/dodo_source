package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.android.volley.Request;
import com.android.volley.e;
import com.android.volley.f;
import com.huawei.hms.push.e;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: MindboxServiceGenerator.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lgl6;", "", "", "f", "(Lcv1;)Ljava/lang/Object;", "Lrk6;", "request", "g", "Lsza;", e.a, "(Lsza;)V", DateTokenConverter.CONVERTER_KEY, "(Lrk6;)V", "Lcom/android/volley/e;", "a", "Lcom/android/volley/e;", "requestQueue", "<init>", "(Lcom/android/volley/e;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: gl6  reason: default package */
/* loaded from: classes.dex */
public final class gl6 {
    private final com.android.volley.e a;

    /* compiled from: MindboxServiceGenerator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll95;", "a", "()Ll95;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: gl6$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<l95> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MindboxServiceGenerator.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "cloud.mindbox.mobile_sdk.network.MindboxServiceGenerator$1$1", f = "MindboxServiceGenerator.kt", l = {20}, m = "invokeSuspend")
        /* renamed from: gl6$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0328a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;
            final /* synthetic */ gl6 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0328a(gl6 gl6Var, cv1<? super C0328a> cv1Var) {
                super(2, cv1Var);
                this.b = gl6Var;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new C0328a(this.b, cv1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return ((C0328a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                    gl6 gl6Var = this.b;
                    this.a = 1;
                    if (gl6Var.f(this) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }
        }

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final l95 invoke() {
            l95 d;
            f.b = sj6.a.a().f();
            d = sh0.d(mj6.a.K(), null, null, new C0328a(gl6.this, null), 3, null);
            return d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxServiceGenerator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: gl6$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ rk6 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(rk6 rk6Var) {
            super(0);
            this.b = rk6Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            com.android.volley.e eVar = gl6.this.a;
            rk6 rk6Var = this.b;
            gl6 gl6Var = gl6.this;
            eVar.a(rk6Var);
            gl6Var.g(rk6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxServiceGenerator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: gl6$c */
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function1<Throwable, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MindboxServiceGenerator.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/android/volley/Request;", "kotlin.jvm.PlatformType", "it", "", "a", "(Lcom/android/volley/Request;)Z"}, k = 3, mv = {1, 8, 0})
        /* renamed from: gl6$c$a */
        /* loaded from: classes.dex */
        public static final class a implements e.b {
            public static final a a = new a();

            a() {
            }

            @Override // com.android.volley.e.b
            public final boolean a(Request<?> request) {
                return true;
            }
        }

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            gl6.this.a.c(a.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxServiceGenerator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: gl6$d */
    /* loaded from: classes.dex */
    public static final class d extends ej5 implements Function0<Unit> {
        final /* synthetic */ rk6 a;
        final /* synthetic */ gl6 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(rk6 rk6Var, gl6 gl6Var) {
            super(0);
            this.a = rk6Var;
            this.b = gl6Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            String i0;
            StringBuilder sb = new StringBuilder();
            sb.append("---> Method: " + this.a.getMethodType() + ' ' + this.a.getFullUrl());
            z65.g(sb, "append(value)");
            sb.append('\n');
            z65.g(sb, "append('\\n')");
            Map<String, String> headers = this.a.getHeaders();
            ArrayList arrayList = new ArrayList(headers.size());
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                arrayList.add(entry.getKey() + ": " + entry.getValue());
            }
            String property = System.getProperty("line.separator");
            if (property == null) {
                property = "\n";
            }
            i0 = sc1.i0(arrayList, property, null, null, 0, null, null, 62, null);
            sb.append(i0);
            z65.g(sb, "append(value)");
            sb.append('\n');
            z65.g(sb, "append('\\n')");
            sb.append(String.valueOf(this.a.getJsonRequest()));
            z65.g(sb, "append(value)");
            sb.append('\n');
            z65.g(sb, "append('\\n')");
            sb.append("---> End of request");
            gl6 gl6Var = this.b;
            String sb2 = sb.toString();
            z65.g(sb2, "builder.toString()");
            gk6.a(gl6Var, sb2);
        }
    }

    public gl6(com.android.volley.e eVar) {
        z65.h(eVar, "requestQueue");
        this.a = eVar;
        yx5.a.d(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(cv1<? super Unit> cv1Var) {
        cv1 c2;
        Object d2;
        Object d3;
        c2 = b75.c(cv1Var);
        gn0 gn0Var = new gn0(c2, 1);
        gn0Var.w();
        gn0Var.u(new c());
        Object s = gn0Var.s();
        d2 = c75.d();
        if (s == d2) {
            io2.c(cv1Var);
        }
        d3 = c75.d();
        if (s == d3) {
            return s;
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(rk6 rk6Var) {
        yx5.a.d(new d(rk6Var, this));
    }

    public final void d(rk6 rk6Var) {
        z65.h(rk6Var, "request");
        yx5.a.d(new b(rk6Var));
    }

    public final void e(sza szaVar) {
        z65.h(szaVar, "request");
        this.a.a(szaVar);
    }
}
