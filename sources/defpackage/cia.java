package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: SharedTracesImpl.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\b\u001a\u00020\u00072*\u0010\u0006\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR&\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcia;", "Lbia;", "Lkotlin/Function1;", "", "", "Lqjb;", "action", "", c.a, "traceName", "b", "a", "Lvjb;", "Lvjb;", "traceFactory", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "traces", "<init>", "(Lvjb;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cia  reason: default package */
/* loaded from: classes4.dex */
public final class cia implements bia {
    private final vjb a;
    private final AtomicReference<Map<String, qjb>> b;

    /* compiled from: SharedTracesImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "Lqjb;", "map", "a", "(Ljava/util/Map;)Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: cia$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<Map<String, ? extends qjb>, Map<String, ? extends qjb>> {
        final /* synthetic */ String a;
        final /* synthetic */ qjb b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, qjb qjbVar) {
            super(1);
            this.a = str;
            this.b = qjbVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Map<String, qjb> invoke(Map<String, ? extends qjb> map) {
            Map<String, qjb> p;
            z65.h(map, "map");
            p = g86.p(map, lnb.a(this.a, this.b));
            return p;
        }
    }

    /* compiled from: SharedTracesImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "Lqjb;", "map", "a", "(Ljava/util/Map;)Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: cia$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<Map<String, ? extends qjb>, Map<String, ? extends qjb>> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Map<String, qjb> invoke(Map<String, ? extends qjb> map) {
            Map<String, qjb> l;
            z65.h(map, "map");
            l = g86.l(map, this.a);
            return l;
        }
    }

    public cia(vjb vjbVar) {
        Map h;
        z65.h(vjbVar, "traceFactory");
        this.a = vjbVar;
        h = g86.h();
        this.b = new AtomicReference<>(h);
    }

    private final void c(Function1<? super Map<String, ? extends qjb>, ? extends Map<String, ? extends qjb>> function1) {
        Map<String, qjb> map = this.b.get();
        while (true) {
            Map<String, qjb> map2 = map;
            if (!ho1.a(this.b, map2, function1.invoke(map2))) {
                map = this.b.get();
            } else {
                return;
            }
        }
    }

    @Override // defpackage.bia
    public void a(String str) {
        z65.h(str, "traceName");
        qjb qjbVar = this.b.get().get(str);
        if (qjbVar != null) {
            qjbVar.stop();
        }
        c(new b(str));
    }

    @Override // defpackage.bia
    public void b(String str) {
        z65.h(str, "traceName");
        qjb a2 = this.a.a(str);
        c(new a(str, a2));
        a2.start();
    }
}
