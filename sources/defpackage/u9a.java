package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SelectionController.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B$\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001d\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u0017\u0010\"\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Lu9a;", "Lxc9;", "", "a", com.huawei.hms.opendevice.c.a, "b", "Lbcb;", "textLayoutResult", Image.TYPE_HIGH, "Lom5;", MessageAttributes.COORDINATES, "g", "Ly73;", "drawScope", e.a, "Lpaa;", "Lpaa;", "selectionRegistrar", "Luc1;", "J", "backgroundSelectionColor", "Lnwa;", "Lnwa;", "params", "Lh9a;", DateTokenConverter.CONVERTER_KEY, "Lh9a;", "selectable", "", "selectableId", "Lsm6;", "f", "Lsm6;", "()Lsm6;", "modifier", "<init>", "(Lpaa;JLnwa;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: u9a  reason: default package */
/* loaded from: classes.dex */
public final class u9a implements xc9 {
    private final paa a;
    private final long b;
    private nwa c;
    private h9a d;
    private final long e;
    private final sm6 f;

    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lom5;", "a", "()Lom5;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: u9a$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<om5> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final om5 invoke() {
            return u9a.this.c.d();
        }
    }

    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbcb;", "a", "()Lbcb;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: u9a$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<bcb> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final bcb invoke() {
            return u9a.this.c.e();
        }
    }

    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lom5;", "a", "()Lom5;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: u9a$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<om5> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final om5 invoke() {
            return u9a.this.c.d();
        }
    }

    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbcb;", "a", "()Lbcb;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: u9a$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function0<bcb> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final bcb invoke() {
            return u9a.this.c.e();
        }
    }

    public /* synthetic */ u9a(paa paaVar, long j, nwa nwaVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(paaVar, j, nwaVar);
    }

    @Override // defpackage.xc9
    public void a() {
        this.d = this.a.f(new bq6(this.e, new c(), new d()));
    }

    @Override // defpackage.xc9
    public void b() {
        h9a h9aVar = this.d;
        if (h9aVar != null) {
            this.a.e(h9aVar);
            this.d = null;
        }
    }

    @Override // defpackage.xc9
    public void c() {
        h9a h9aVar = this.d;
        if (h9aVar != null) {
            this.a.e(h9aVar);
            this.d = null;
        }
    }

    public final void e(y73 y73Var) {
        z65.h(y73Var, "drawScope");
        s9a s9aVar = this.a.d().get(Long.valueOf(this.e));
        if (s9aVar == null) {
            return;
        }
        if (!s9aVar.b()) {
            s9aVar.c();
            throw null;
        } else {
            s9aVar.a();
            throw null;
        }
    }

    public final sm6 f() {
        return this.f;
    }

    public final void g(om5 om5Var) {
        z65.h(om5Var, MessageAttributes.COORDINATES);
        this.c = nwa.c(this.c, om5Var, null, 2, null);
    }

    public final void h(bcb bcbVar) {
        z65.h(bcbVar, "textLayoutResult");
        this.c = nwa.c(this.c, null, bcbVar, 1, null);
    }

    private u9a(paa paaVar, long j, nwa nwaVar) {
        sm6 c2;
        z65.h(paaVar, "selectionRegistrar");
        z65.h(nwaVar, "params");
        this.a = paaVar;
        this.b = j;
        this.c = nwaVar;
        long b2 = paaVar.b();
        this.e = b2;
        c2 = v9a.c(paaVar, b2, new a(), new b(), njb.a());
        this.f = r90.a(c2, paaVar);
    }

    public /* synthetic */ u9a(paa paaVar, long j, nwa nwaVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(paaVar, j, (i & 4) != 0 ? nwa.c.a() : nwaVar, null);
    }
}
