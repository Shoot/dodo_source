package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import im.threads.business.transport.MessageAttributes;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PointerInputEventProcessor.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\bR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\t\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lxd8;", "", "Lyd8;", "pointerInputEvent", "Lvf8;", "positionCalculator", "Lu65;", "b", "", "a", "", "Lvd8;", "Lxd8$a;", "Ljava/util/Map;", "previousPointerInputData", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: xd8  reason: default package */
/* loaded from: classes.dex */
final class xd8 {
    private final Map<vd8, a> a = new LinkedHashMap();

    /* compiled from: PointerInputEventProcessor.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B*\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0003\u0010\rR \u0010\u0014\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Lxd8$a;", "", "", "a", "J", c.a, "()J", "uptime", "Ls67;", "b", "positionOnScreen", "", "Z", "()Z", "down", "Lke8;", DateTokenConverter.CONVERTER_KEY, "I", "getType-T8wyACA", "()I", MessageAttributes.TYPE, "<init>", "(JJZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: xd8$a */
    /* loaded from: classes.dex */
    private static final class a {
        private final long a;
        private final long b;
        private final boolean c;
        private final int d;

        public /* synthetic */ a(long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, z, i);
        }

        public final boolean a() {
            return this.c;
        }

        public final long b() {
            return this.b;
        }

        public final long c() {
            return this.a;
        }

        private a(long j, long j2, boolean z, int i) {
            this.a = j;
            this.b = j2;
            this.c = z;
            this.d = i;
        }
    }

    public final void a() {
        this.a.clear();
    }

    public final u65 b(yd8 yd8Var, vf8 vf8Var) {
        long j;
        boolean a2;
        long h;
        z65.h(yd8Var, "pointerInputEvent");
        z65.h(vf8Var, "positionCalculator");
        LinkedHashMap linkedHashMap = new LinkedHashMap(yd8Var.b().size());
        List<zd8> b = yd8Var.b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            zd8 zd8Var = b.get(i);
            a aVar = this.a.get(vd8.a(zd8Var.c()));
            if (aVar == null) {
                j = zd8Var.j();
                h = zd8Var.e();
                a2 = false;
            } else {
                long c = aVar.c();
                j = c;
                a2 = aVar.a();
                h = vf8Var.h(aVar.b());
            }
            linkedHashMap.put(vd8.a(zd8Var.c()), new wd8(zd8Var.c(), zd8Var.j(), zd8Var.e(), zd8Var.a(), zd8Var.g(), j, h, a2, false, zd8Var.i(), (List) zd8Var.b(), zd8Var.h(), (DefaultConstructorMarker) null));
            if (zd8Var.a()) {
                this.a.put(vd8.a(zd8Var.c()), new a(zd8Var.j(), zd8Var.f(), zd8Var.a(), zd8Var.i(), null));
            } else {
                this.a.remove(vd8.a(zd8Var.c()));
            }
        }
        return new u65(linkedHashMap, yd8Var);
    }
}
