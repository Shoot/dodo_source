package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.action.ActionConst;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.d90;
import java.math.BigInteger;
import java.net.ProtocolException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: Adapters.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\tJm\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00020\u00022\u001a\u0010\u0010\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e\"\u0006\u0012\u0002\b\u00030\u000f2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u00112\u0016\u0010\u0014\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010\u001a\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00190\u000f2\u001a\u0010\u0018\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e\"\u0006\u0012\u0002\b\u00030\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f2\u001a\u0010\u001c\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000f0\u0011Ji\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f2<\b\u0002\u0010\u0018\u001a\u001e\u0012\u001a\b\u0001\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u00190\u000e\"\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u00192\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\"\u0010#R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00158\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b)\u0010'R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\u00158\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b,\u0010'R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020.0\u00158\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b/\u0010'R\u001d\u00104\u001a\b\u0012\u0004\u0012\u0002010\u00158\u0006¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b3\u0010'R\u001f\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050\u00158\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b6\u0010'R\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b8\u0010'R\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006¢\u0006\f\n\u0004\b:\u0010%\u001a\u0004\b;\u0010'R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006¢\u0006\f\n\u0004\b=\u0010%\u001a\u0004\b>\u0010'R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b=\u0010'R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\bA\u0010'R\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0006¢\u0006\f\n\u0004\b6\u0010%\u001a\u0004\b:\u0010'R\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020D0\u000f8\u0006¢\u0006\f\n\u0004\b8\u0010E\u001a\u0004\b2\u0010FR8\u0010I\u001a&\u0012\"\u0012 \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001e\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f0\u00190\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010H¨\u0006L"}, d2 = {"Ln6;", "", "", "string", "", "t", "(Ljava/lang/String;)J", "date", com.huawei.hms.push.e.a, "(J)Ljava/lang/String;", Image.TYPE_SMALL, DateTokenConverter.CONVERTER_KEY, "T", Action.NAME_ATTRIBUTE, "", "Lm03;", "members", "Lkotlin/Function1;", "", "decompose", "construct", "Ld90;", "u", "(Ljava/lang/String;[Lm03;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ld90;", "choices", "Lkotlin/Pair;", com.huawei.hms.opendevice.c.a, "([Lm03;)Lm03;", "chooser", "v", "Lod5;", "", "isOptional", "optionalValue", "a", "([Lkotlin/Pair;ZLjava/lang/Object;)Lm03;", "b", "Ld90;", Image.TYPE_HIGH, "()Ld90;", "BOOLEAN", "l", "INTEGER_AS_LONG", "Ljava/math/BigInteger;", "k", "INTEGER_AS_BIG_INTEGER", "Lpb0;", "g", "BIT_STRING", "Llk0;", "f", "o", "OCTET_STRING", "", Image.TYPE_MEDIUM, ActionConst.NULL, "n", "OBJECT_IDENTIFIER", "i", "r", "UTF8_STRING", "j", "p", "PRINTABLE_STRING", "IA5_STRING", "q", "UTC_TIME", "GENERALIZED_TIME", "Lwl;", "Lm03;", "()Lm03;", "ANY_VALUE", "Ljava/util/List;", "defaultAnyChoices", "<init>", "()V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
/* renamed from: n6 */
/* loaded from: classes3.dex */
public final class n6 {
    public static final n6 a = new n6();
    private static final d90<Boolean> b;
    private static final d90<Long> c;
    private static final d90<BigInteger> d;
    private static final d90<pb0> e;
    private static final d90<lk0> f;
    private static final d90<Unit> g;
    private static final d90<String> h;
    private static final d90<String> i;
    private static final d90<String> j;
    private static final d90<String> k;
    private static final d90<Long> l;
    private static final d90<Long> m;
    private static final m03<wl> n;
    private static final List<Pair<od5<? extends Object>, m03<? extends Object>>> o;

    /* compiled from: Adapters.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"n6$a", "Lm03;", "Lwl;", "Ln03;", "header", "", "b", "Lo03;", "reader", "f", "Lp03;", "writer", "value", "", "g", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n6$a */
    /* loaded from: classes3.dex */
    public static final class a implements m03<wl> {

        /* compiled from: Adapters.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Leh0;", "it", "", "a", "(Leh0;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: n6$a$a */
        /* loaded from: classes3.dex */
        public static final class C0450a extends ej5 implements Function1<eh0, Unit> {
            final /* synthetic */ p03 a;
            final /* synthetic */ wl b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0450a(p03 p03Var, wl wlVar) {
                super(1);
                this.a = p03Var;
                this.b = wlVar;
            }

            public final void a(eh0 eh0Var) {
                z65.h(eh0Var, "it");
                this.a.l(this.b.a());
                this.a.b(this.b.b());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(eh0 eh0Var) {
                a(eh0Var);
                return Unit.a;
            }
        }

        a() {
        }

        @Override // defpackage.m03
        public boolean b(n03 n03Var) {
            z65.h(n03Var, "header");
            return true;
        }

        @Override // defpackage.m03
        public /* synthetic */ d90<wl> c(int i, long j, Boolean bool) {
            return l03.e(this, i, j, bool);
        }

        @Override // defpackage.m03
        public /* synthetic */ d90<List<wl>> d(String str, int i, long j) {
            return l03.a(this, str, i, j);
        }

        @Override // defpackage.m03
        /* renamed from: f */
        public wl a(o03 o03Var) {
            n03 n03Var;
            long j;
            boolean z;
            long j2;
            List list;
            List list2;
            List list3;
            long i;
            z65.h(o03Var, "reader");
            if (o03Var.l()) {
                n03Var = o03Var.g;
                z65.e(n03Var);
                o03Var.g = null;
                j = o03Var.c;
                z = o03Var.f;
                if (n03Var.b() != -1) {
                    i = o03Var.i();
                    j2 = i + n03Var.b();
                } else {
                    j2 = -1;
                }
                if (j == -1 || j2 <= j) {
                    o03Var.c = j2;
                    o03Var.f = n03Var.a();
                    list = o03Var.e;
                    list.add("ANY");
                    try {
                        return new wl(n03Var.d(), n03Var.c(), n03Var.a(), n03Var.b(), o03Var.u());
                    } finally {
                        o03Var.g = null;
                        o03Var.c = j;
                        o03Var.f = z;
                        list2 = o03Var.e;
                        list3 = o03Var.e;
                        list2.remove(list3.size() - 1);
                    }
                }
                throw new ProtocolException("enclosed object too large");
            }
            throw new ProtocolException("expected a value");
        }

        @Override // defpackage.m03
        /* renamed from: g */
        public void e(p03 p03Var, wl wlVar) {
            z65.h(p03Var, "writer");
            z65.h(wlVar, "value");
            p03Var.f("ANY", wlVar.d(), wlVar.c(), new C0450a(p03Var, wlVar));
        }
    }

    /* compiled from: Adapters.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"n6$b", "Ld90$a;", "Lpb0;", "Lo03;", "reader", com.huawei.hms.opendevice.c.a, "Lp03;", "writer", "value", "", DateTokenConverter.CONVERTER_KEY, "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n6$b */
    /* loaded from: classes3.dex */
    public static final class b implements d90.a<pb0> {
        b() {
        }

        @Override // defpackage.d90.a
        /* renamed from: c */
        public pb0 b(o03 o03Var) {
            z65.h(o03Var, "reader");
            return o03Var.o();
        }

        @Override // defpackage.d90.a
        /* renamed from: d */
        public void a(p03 p03Var, pb0 pb0Var) {
            z65.h(p03Var, "writer");
            z65.h(pb0Var, "value");
            p03Var.h(pb0Var);
        }
    }

    /* compiled from: Adapters.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"n6$c", "Ld90$a;", "", "Lo03;", "reader", com.huawei.hms.opendevice.c.a, "(Lo03;)Ljava/lang/Boolean;", "Lp03;", "writer", "value", "", DateTokenConverter.CONVERTER_KEY, "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n6$c */
    /* loaded from: classes3.dex */
    public static final class c implements d90.a<Boolean> {
        c() {
        }

        @Override // defpackage.d90.a
        public /* bridge */ /* synthetic */ void a(p03 p03Var, Boolean bool) {
            d(p03Var, bool.booleanValue());
        }

        @Override // defpackage.d90.a
        /* renamed from: c */
        public Boolean b(o03 o03Var) {
            z65.h(o03Var, "reader");
            return Boolean.valueOf(o03Var.p());
        }

        public void d(p03 p03Var, boolean z) {
            z65.h(p03Var, "writer");
            p03Var.i(z);
        }
    }

    /* compiled from: Adapters.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"n6$d", "Ld90$a;", "", "Lo03;", "reader", com.huawei.hms.opendevice.c.a, "(Lo03;)Ljava/lang/Long;", "Lp03;", "writer", "value", "", DateTokenConverter.CONVERTER_KEY, "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n6$d */
    /* loaded from: classes3.dex */
    public static final class d implements d90.a<Long> {
        d() {
        }

        @Override // defpackage.d90.a
        public /* bridge */ /* synthetic */ void a(p03 p03Var, Long l) {
            d(p03Var, l.longValue());
        }

        @Override // defpackage.d90.a
        /* renamed from: c */
        public Long b(o03 o03Var) {
            z65.h(o03Var, "reader");
            return Long.valueOf(n6.a.s(o03Var.v()));
        }

        public void d(p03 p03Var, long j) {
            z65.h(p03Var, "writer");
            p03Var.m(n6.a.d(j));
        }
    }

    /* compiled from: Adapters.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"n6$e", "Ld90$a;", "", "Lo03;", "reader", com.huawei.hms.opendevice.c.a, "Lp03;", "writer", "value", "", DateTokenConverter.CONVERTER_KEY, "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n6$e */
    /* loaded from: classes3.dex */
    public static final class e implements d90.a<String> {
        e() {
        }

        @Override // defpackage.d90.a
        /* renamed from: c */
        public String b(o03 o03Var) {
            z65.h(o03Var, "reader");
            return o03Var.v();
        }

        @Override // defpackage.d90.a
        /* renamed from: d */
        public void a(p03 p03Var, String str) {
            z65.h(p03Var, "writer");
            z65.h(str, "value");
            p03Var.m(str);
        }
    }

    /* compiled from: Adapters.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"n6$f", "Ld90$a;", "Ljava/math/BigInteger;", "Lo03;", "reader", com.huawei.hms.opendevice.c.a, "Lp03;", "writer", "value", "", DateTokenConverter.CONVERTER_KEY, "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n6$f */
    /* loaded from: classes3.dex */
    public static final class f implements d90.a<BigInteger> {
        f() {
        }

        @Override // defpackage.d90.a
        /* renamed from: c */
        public BigInteger b(o03 o03Var) {
            z65.h(o03Var, "reader");
            return o03Var.n();
        }

        @Override // defpackage.d90.a
        /* renamed from: d */
        public void a(p03 p03Var, BigInteger bigInteger) {
            z65.h(p03Var, "writer");
            z65.h(bigInteger, "value");
            p03Var.g(bigInteger);
        }
    }

    /* compiled from: Adapters.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"n6$g", "Ld90$a;", "", "Lo03;", "reader", com.huawei.hms.opendevice.c.a, "(Lo03;)Ljava/lang/Long;", "Lp03;", "writer", "value", "", DateTokenConverter.CONVERTER_KEY, "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n6$g */
    /* loaded from: classes3.dex */
    public static final class g implements d90.a<Long> {
        g() {
        }

        @Override // defpackage.d90.a
        public /* bridge */ /* synthetic */ void a(p03 p03Var, Long l) {
            d(p03Var, l.longValue());
        }

        @Override // defpackage.d90.a
        /* renamed from: c */
        public Long b(o03 o03Var) {
            z65.h(o03Var, "reader");
            return Long.valueOf(o03Var.r());
        }

        public void d(p03 p03Var, long j) {
            z65.h(p03Var, "writer");
            p03Var.j(j);
        }
    }

    /* compiled from: Adapters.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"n6$h", "Ld90$a;", "", "Lo03;", "reader", com.huawei.hms.opendevice.c.a, "(Lo03;)Lkotlin/Unit;", "Lp03;", "writer", "value", DateTokenConverter.CONVERTER_KEY, "(Lp03;Lkotlin/Unit;)V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n6$h */
    /* loaded from: classes3.dex */
    public static final class h implements d90.a<Unit> {
        h() {
        }

        @Override // defpackage.d90.a
        /* renamed from: c */
        public Unit b(o03 o03Var) {
            z65.h(o03Var, "reader");
            return null;
        }

        @Override // defpackage.d90.a
        /* renamed from: d */
        public void a(p03 p03Var, Unit unit) {
            z65.h(p03Var, "writer");
        }
    }

    /* compiled from: Adapters.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"n6$i", "Ld90$a;", "", "Lo03;", "reader", com.huawei.hms.opendevice.c.a, "Lp03;", "writer", "value", "", DateTokenConverter.CONVERTER_KEY, "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n6$i */
    /* loaded from: classes3.dex */
    public static final class i implements d90.a<String> {
        i() {
        }

        @Override // defpackage.d90.a
        /* renamed from: c */
        public String b(o03 o03Var) {
            z65.h(o03Var, "reader");
            return o03Var.s();
        }

        @Override // defpackage.d90.a
        /* renamed from: d */
        public void a(p03 p03Var, String str) {
            z65.h(p03Var, "writer");
            z65.h(str, "value");
            p03Var.k(str);
        }
    }

    /* compiled from: Adapters.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"n6$j", "Ld90$a;", "Llk0;", "Lo03;", "reader", com.huawei.hms.opendevice.c.a, "Lp03;", "writer", "value", "", DateTokenConverter.CONVERTER_KEY, "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n6$j */
    /* loaded from: classes3.dex */
    public static final class j implements d90.a<lk0> {
        j() {
        }

        @Override // defpackage.d90.a
        /* renamed from: c */
        public lk0 b(o03 o03Var) {
            z65.h(o03Var, "reader");
            return o03Var.t();
        }

        @Override // defpackage.d90.a
        /* renamed from: d */
        public void a(p03 p03Var, lk0 lk0Var) {
            z65.h(p03Var, "writer");
            z65.h(lk0Var, "value");
            p03Var.l(lk0Var);
        }
    }

    /* compiled from: Adapters.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"n6$k", "Ld90$a;", "", "Lo03;", "reader", com.huawei.hms.opendevice.c.a, "Lp03;", "writer", "value", "", DateTokenConverter.CONVERTER_KEY, "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n6$k */
    /* loaded from: classes3.dex */
    public static final class k implements d90.a<String> {
        k() {
        }

        @Override // defpackage.d90.a
        /* renamed from: c */
        public String b(o03 o03Var) {
            z65.h(o03Var, "reader");
            return o03Var.v();
        }

        @Override // defpackage.d90.a
        /* renamed from: d */
        public void a(p03 p03Var, String str) {
            z65.h(p03Var, "writer");
            z65.h(str, "value");
            p03Var.m(str);
        }
    }

    /* compiled from: Adapters.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"n6$l", "Ld90$a;", "", "Lo03;", "reader", com.huawei.hms.opendevice.c.a, "(Lo03;)Ljava/lang/Long;", "Lp03;", "writer", "value", "", DateTokenConverter.CONVERTER_KEY, "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n6$l */
    /* loaded from: classes3.dex */
    public static final class l implements d90.a<Long> {
        l() {
        }

        @Override // defpackage.d90.a
        public /* bridge */ /* synthetic */ void a(p03 p03Var, Long l) {
            d(p03Var, l.longValue());
        }

        @Override // defpackage.d90.a
        /* renamed from: c */
        public Long b(o03 o03Var) {
            z65.h(o03Var, "reader");
            return Long.valueOf(n6.a.t(o03Var.v()));
        }

        public void d(p03 p03Var, long j) {
            z65.h(p03Var, "writer");
            p03Var.m(n6.a.e(j));
        }
    }

    /* compiled from: Adapters.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"n6$m", "Ld90$a;", "", "Lo03;", "reader", com.huawei.hms.opendevice.c.a, "Lp03;", "writer", "value", "", DateTokenConverter.CONVERTER_KEY, "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n6$m */
    /* loaded from: classes3.dex */
    public static final class m implements d90.a<String> {
        m() {
        }

        @Override // defpackage.d90.a
        /* renamed from: c */
        public String b(o03 o03Var) {
            z65.h(o03Var, "reader");
            return o03Var.v();
        }

        @Override // defpackage.d90.a
        /* renamed from: d */
        public void a(p03 p03Var, String str) {
            z65.h(p03Var, "writer");
            z65.h(str, "value");
            p03Var.m(str);
        }
    }

    /* compiled from: Adapters.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000f"}, d2 = {"n6$n", "Lm03;", "", "Ln03;", "header", "", "b", "Lp03;", "writer", "value", "", com.huawei.hms.push.e.a, "Lo03;", "reader", "a", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n6$n */
    /* loaded from: classes3.dex */
    public static final class n implements m03<Object> {
        final /* synthetic */ boolean a;
        final /* synthetic */ Object b;
        final /* synthetic */ Pair<od5<?>, m03<?>>[] c;

        /* JADX WARN: Multi-variable type inference failed */
        n(boolean z, Object obj, Pair<? extends od5<?>, ? extends m03<?>>[] pairArr) {
            this.a = z;
            this.b = obj;
            this.c = pairArr;
        }

        @Override // defpackage.m03
        public Object a(o03 o03Var) {
            z65.h(o03Var, "reader");
            if (this.a && !o03Var.l()) {
                return this.b;
            }
            n03 m = o03Var.m();
            if (m != null) {
                for (Pair<od5<?>, m03<?>> pair : this.c) {
                    m03<?> b = pair.b();
                    if (b.b(m)) {
                        return b.a(o03Var);
                    }
                }
                throw new ProtocolException("expected any but was " + m + " at " + o03Var);
            }
            throw new ProtocolException("expected a value at " + o03Var);
        }

        @Override // defpackage.m03
        public boolean b(n03 n03Var) {
            z65.h(n03Var, "header");
            return true;
        }

        @Override // defpackage.m03
        public /* synthetic */ d90<Object> c(int i, long j, Boolean bool) {
            return l03.e(this, i, j, bool);
        }

        @Override // defpackage.m03
        public /* synthetic */ d90<List<Object>> d(String str, int i, long j) {
            return l03.a(this, str, i, j);
        }

        @Override // defpackage.m03
        public void e(p03 p03Var, Object obj) {
            Pair<od5<?>, m03<?>>[] pairArr;
            z65.h(p03Var, "writer");
            if (!this.a || !z65.c(obj, this.b)) {
                for (Pair<od5<?>, m03<?>> pair : this.c) {
                    od5<?> a = pair.a();
                    m03<?> b = pair.b();
                    if (a.a(obj) || (obj == null && z65.c(a, bc9.b(Unit.class)))) {
                        z65.f(b, "null cannot be cast to non-null type okhttp3.tls.internal.der.DerAdapter<kotlin.Any?>");
                        b.e(p03Var, obj);
                        return;
                    }
                }
            }
        }
    }

    /* compiled from: Adapters.kt */
    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\"\u0010\n\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J*\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\r\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016¨\u0006\u0012"}, d2 = {"n6$o", "Lm03;", "Lkotlin/Pair;", "", "Ln03;", "header", "", "b", "Lo03;", "reader", "f", "Lp03;", "writer", "value", "", "g", "", "toString", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n6$o */
    /* loaded from: classes3.dex */
    public static final class o implements m03<Pair<? extends m03<?>, ? extends Object>> {
        final /* synthetic */ m03<?>[] a;

        o(m03<?>[] m03VarArr) {
            this.a = m03VarArr;
        }

        @Override // defpackage.m03
        public boolean b(n03 n03Var) {
            z65.h(n03Var, "header");
            return true;
        }

        @Override // defpackage.m03
        public /* synthetic */ d90<Pair<? extends m03<?>, ? extends Object>> c(int i, long j, Boolean bool) {
            return l03.e(this, i, j, bool);
        }

        @Override // defpackage.m03
        public /* synthetic */ d90<List<Pair<? extends m03<?>, ? extends Object>>> d(String str, int i, long j) {
            return l03.a(this, str, i, j);
        }

        @Override // defpackage.m03
        /* renamed from: f */
        public Pair<m03<?>, Object> a(o03 o03Var) {
            m03<?> m03Var;
            z65.h(o03Var, "reader");
            n03 m = o03Var.m();
            if (m != null) {
                m03<?>[] m03VarArr = this.a;
                int length = m03VarArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        m03Var = m03VarArr[i];
                        if (m03Var.b(m)) {
                            break;
                        }
                        i++;
                    } else {
                        m03Var = null;
                        break;
                    }
                }
                if (m03Var != null) {
                    return lnb.a(m03Var, m03Var.a(o03Var));
                }
                throw new ProtocolException("expected a matching choice but was " + m + " at " + o03Var);
            }
            throw new ProtocolException("expected a value at " + o03Var);
        }

        @Override // defpackage.m03
        /* renamed from: g */
        public void e(p03 p03Var, Pair<? extends m03<?>, ? extends Object> pair) {
            z65.h(p03Var, "writer");
            z65.h(pair, "value");
            m03<?> a = pair.a();
            Object b = pair.b();
            z65.f(a, "null cannot be cast to non-null type okhttp3.tls.internal.der.DerAdapter<kotlin.Any?>");
            a.e(p03Var, b);
        }

        public String toString() {
            String O;
            O = yr.O(this.a, " OR ", null, null, 0, null, null, 62, null);
            return O;
        }
    }

    /* compiled from: Adapters.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"n6$p", "Ld90$a;", "Lo03;", "reader", "b", "(Lo03;)Ljava/lang/Object;", "Lp03;", "writer", "value", "", "a", "(Lp03;Ljava/lang/Object;)V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n6$p */
    /* loaded from: classes3.dex */
    public static final class p<T> implements d90.a<T> {
        final /* synthetic */ m03<?>[] a;
        final /* synthetic */ Function1<List<?>, T> b;
        final /* synthetic */ Function1<T, List<?>> c;

        /* compiled from: Adapters.kt */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: n6$p$a */
        /* loaded from: classes3.dex */
        static final class a extends ej5 implements Function0<T> {
            final /* synthetic */ m03<?>[] a;
            final /* synthetic */ o03 b;
            final /* synthetic */ Function1<List<?>, T> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(m03<?>[] m03VarArr, o03 o03Var, Function1<? super List<?>, ? extends T> function1) {
                super(0);
                this.a = m03VarArr;
                this.b = o03Var;
                this.c = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                ArrayList arrayList = new ArrayList();
                while (true) {
                    int size = arrayList.size();
                    m03<?>[] m03VarArr = this.a;
                    if (size >= m03VarArr.length) {
                        break;
                    }
                    arrayList.add(m03VarArr[arrayList.size()].a(this.b));
                }
                if (!this.b.l()) {
                    return this.c.invoke(arrayList);
                }
                throw new ProtocolException("unexpected " + this.b.m() + " at " + this.b);
            }
        }

        /* compiled from: Adapters.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: n6$p$b */
        /* loaded from: classes3.dex */
        static final class b extends ej5 implements Function0<Unit> {
            final /* synthetic */ List<?> a;
            final /* synthetic */ m03<?>[] b;
            final /* synthetic */ p03 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(List<?> list, m03<?>[] m03VarArr, p03 p03Var) {
                super(0);
                this.a = list;
                this.b = m03VarArr;
                this.c = p03Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                int size = this.a.size();
                for (int i = 0; i < size; i++) {
                    m03<?> m03Var = this.b[i];
                    z65.f(m03Var, "null cannot be cast to non-null type okhttp3.tls.internal.der.DerAdapter<kotlin.Any?>");
                    m03Var.e(this.c, this.a.get(i));
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        p(m03<?>[] m03VarArr, Function1<? super List<?>, ? extends T> function1, Function1<? super T, ? extends List<?>> function12) {
            this.a = m03VarArr;
            this.b = function1;
            this.c = function12;
        }

        @Override // defpackage.d90.a
        public void a(p03 p03Var, T t) {
            z65.h(p03Var, "writer");
            p03Var.e(new b(this.c.invoke(t), this.a, p03Var));
        }

        @Override // defpackage.d90.a
        public T b(o03 o03Var) {
            z65.h(o03Var, "reader");
            return (T) o03Var.y(new a(this.a, o03Var, this.b));
        }
    }

    /* compiled from: Adapters.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000f"}, d2 = {"n6$q", "Lm03;", "", "Ln03;", "header", "", "b", "Lp03;", "writer", "value", "", com.huawei.hms.push.e.a, "Lo03;", "reader", "a", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n6$q */
    /* loaded from: classes3.dex */
    public static final class q implements m03<Object> {
        final /* synthetic */ Function1<Object, m03<?>> a;

        /* JADX WARN: Multi-variable type inference failed */
        q(Function1<Object, ? extends m03<?>> function1) {
            this.a = function1;
        }

        @Override // defpackage.m03
        public Object a(o03 o03Var) {
            z65.h(o03Var, "reader");
            m03<?> invoke = this.a.invoke(o03Var.k());
            if (invoke != null) {
                return invoke.a(o03Var);
            }
            return o03Var.u();
        }

        @Override // defpackage.m03
        public boolean b(n03 n03Var) {
            z65.h(n03Var, "header");
            return true;
        }

        @Override // defpackage.m03
        public /* synthetic */ d90<Object> c(int i, long j, Boolean bool) {
            return l03.e(this, i, j, bool);
        }

        @Override // defpackage.m03
        public /* synthetic */ d90<List<Object>> d(String str, int i, long j) {
            return l03.a(this, str, i, j);
        }

        @Override // defpackage.m03
        public void e(p03 p03Var, Object obj) {
            z65.h(p03Var, "writer");
            m03<?> invoke = this.a.invoke(p03Var.a());
            if (invoke != null) {
                invoke.e(p03Var, obj);
                return;
            }
            z65.f(obj, "null cannot be cast to non-null type okio.ByteString");
            p03Var.l((lk0) obj);
        }
    }

    static {
        List<Pair<od5<? extends Object>, m03<? extends Object>>> o2;
        d90<Boolean> d90Var = new d90<>("BOOLEAN", 0, 1L, new c(), false, null, false, 112, null);
        b = d90Var;
        c = new d90<>("INTEGER", 0, 2L, new g(), false, null, false, 112, null);
        d90<BigInteger> d90Var2 = new d90<>("INTEGER", 0, 2L, new f(), false, null, false, 112, null);
        d = d90Var2;
        d90<pb0> d90Var3 = new d90<>("BIT STRING", 0, 3L, new b(), false, null, false, 112, null);
        e = d90Var3;
        d90<lk0> d90Var4 = new d90<>("OCTET STRING", 0, 4L, new j(), false, null, false, 112, null);
        f = d90Var4;
        d90<Unit> d90Var5 = new d90<>(ActionConst.NULL, 0, 5L, new h(), false, null, false, 112, null);
        g = d90Var5;
        d90<String> d90Var6 = new d90<>("OBJECT IDENTIFIER", 0, 6L, new i(), false, null, false, 112, null);
        h = d90Var6;
        d90<String> d90Var7 = new d90<>("UTF8", 0, 12L, new m(), false, null, false, 112, null);
        i = d90Var7;
        d90<String> d90Var8 = new d90<>("PRINTABLE STRING", 0, 19L, new k(), false, null, false, 112, null);
        j = d90Var8;
        d90<String> d90Var9 = new d90<>("IA5 STRING", 0, 22L, new e(), false, null, false, 112, null);
        k = d90Var9;
        d90<Long> d90Var10 = new d90<>("UTC TIME", 0, 23L, new l(), false, null, false, 112, null);
        l = d90Var10;
        d90<Long> d90Var11 = new d90<>("GENERALIZED TIME", 0, 24L, new d(), false, null, false, 112, null);
        m = d90Var11;
        a aVar = new a();
        n = aVar;
        o2 = kc1.o(lnb.a(bc9.b(Boolean.TYPE), d90Var), lnb.a(bc9.b(BigInteger.class), d90Var2), lnb.a(bc9.b(pb0.class), d90Var3), lnb.a(bc9.b(lk0.class), d90Var4), lnb.a(bc9.b(Unit.class), d90Var5), lnb.a(bc9.b(Void.class), d90Var6), lnb.a(bc9.b(Void.class), d90Var7), lnb.a(bc9.b(String.class), d90Var8), lnb.a(bc9.b(Void.class), d90Var9), lnb.a(bc9.b(Void.class), d90Var10), lnb.a(bc9.b(Long.TYPE), d90Var11), lnb.a(bc9.b(wl.class), aVar));
        o = o2;
    }

    private n6() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ m03 b(n6 n6Var, Pair[] pairArr, boolean z, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            pairArr = (Pair[]) o.toArray(new Pair[0]);
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return n6Var.a(pairArr, z, obj);
    }

    public final m03<Object> a(Pair<? extends od5<?>, ? extends m03<?>>[] pairArr, boolean z, Object obj) {
        z65.h(pairArr, "choices");
        return new n(z, obj, pairArr);
    }

    public final m03<Pair<m03<?>, Object>> c(m03<?>... m03VarArr) {
        z65.h(m03VarArr, "choices");
        return new o(m03VarArr);
    }

    public final String d(long j2) {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        String format = simpleDateFormat.format(Long.valueOf(j2));
        z65.g(format, "format(...)");
        return format;
    }

    public final String e(long j2) {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.set2DigitYearStart(new Date(-631152000000L));
        String format = simpleDateFormat.format(Long.valueOf(j2));
        z65.g(format, "format(...)");
        return format;
    }

    public final m03<wl> f() {
        return n;
    }

    public final d90<pb0> g() {
        return e;
    }

    public final d90<Boolean> h() {
        return b;
    }

    public final d90<Long> i() {
        return m;
    }

    public final d90<String> j() {
        return k;
    }

    public final d90<BigInteger> k() {
        return d;
    }

    public final d90<Long> l() {
        return c;
    }

    public final d90<Unit> m() {
        return g;
    }

    public final d90<String> n() {
        return h;
    }

    public final d90<lk0> o() {
        return f;
    }

    public final d90<String> p() {
        return j;
    }

    public final d90<Long> q() {
        return l;
    }

    public final d90<String> r() {
        return i;
    }

    public final long s(String str) {
        z65.h(str, "string");
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        try {
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            throw new ProtocolException("Failed to parse GeneralizedTime " + str);
        }
    }

    public final long t(String str) {
        z65.h(str, "string");
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.set2DigitYearStart(new Date(-631152000000L));
        try {
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            throw new ProtocolException("Failed to parse UTCTime " + str);
        }
    }

    public final <T> d90<T> u(String str, m03<?>[] m03VarArr, Function1<? super T, ? extends List<?>> function1, Function1<? super List<?>, ? extends T> function12) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(m03VarArr, "members");
        z65.h(function1, "decompose");
        z65.h(function12, "construct");
        return new d90<>(str, 0, 16L, new p(m03VarArr, function12, function1), false, null, false, 112, null);
    }

    public final m03<Object> v(Function1<Object, ? extends m03<?>> function1) {
        z65.h(function1, "chooser");
        return new q(function1);
    }
}
