package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MenuUpdater.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0002\n\u0007B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u0016\u0010\n\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0018\u0010\u0010\u001a\u00060\u000eR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0015"}, d2 = {"Ljh6;", "Lih6;", "", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "Lkotlin/Function0;", "updateAction", "b", "", "actualAction", "a", "Lxu8;", "Lxu8;", "queryHandler", "Ljh6$b;", "Ljh6$b;", "menuUpdateQuery", "Lkotlin/jvm/functions/Function0;", "<init>", "(Lxu8;)V", e.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jh6  reason: default package */
/* loaded from: classes4.dex */
public final class jh6 implements ih6 {
    public static final a e = new a(null);
    private static final long f = TimeUnit.MINUTES.toMillis(15);
    private final xu8 a;
    private final b b;
    private Function0<Unit> c;
    private Function0<Boolean> d;

    /* compiled from: MenuUpdater.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Ljh6$a;", "", "", "UPDATE_MENU_QUERY_ID", "I", "", "updatePeriod", "J", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jh6$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: MenuUpdater.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Ljh6$b;", "Luu8;", "", DateTokenConverter.CONVERTER_KEY, "", "a", "", "b", "", "id", "<init>", "(Ljh6;I)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jh6$b */
    /* loaded from: classes4.dex */
    private final class b extends uu8 {
        public b(int i) {
            super(i);
        }

        @Override // defpackage.uu8
        public void a() {
            jh6.this.c.invoke();
        }

        @Override // defpackage.uu8
        public long b() {
            return jh6.f;
        }

        @Override // defpackage.uu8
        public boolean d() {
            return ((Boolean) jh6.this.d.invoke()).booleanValue();
        }
    }

    /* compiled from: MenuUpdater.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jh6$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function0<Boolean> {
        public static final c a = new c();

        c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: MenuUpdater.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jh6$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function0<Unit> {
        public static final d a = new d();

        d() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }
    }

    public jh6(xu8 xu8Var) {
        z65.h(xu8Var, "queryHandler");
        this.a = xu8Var;
        b bVar = new b(4);
        xu8Var.d(bVar);
        this.b = bVar;
        this.c = d.a;
        this.d = c.a;
    }

    @Override // defpackage.ih6
    public void a(Function0<Boolean> function0) {
        z65.h(function0, "actualAction");
        this.d = function0;
    }

    @Override // defpackage.ih6
    public void b(Function0<Unit> function0) {
        z65.h(function0, "updateAction");
        this.c = function0;
    }

    @Override // defpackage.ih6
    public void c() {
        this.b.e(System.currentTimeMillis() + this.b.b());
    }

    @Override // defpackage.ih6
    public void d() {
        this.b.e(System.currentTimeMillis());
    }
}
