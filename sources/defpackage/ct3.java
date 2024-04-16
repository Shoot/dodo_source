package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: FileContentRequestBody.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lct3;", "Lji9;", "Lqc6;", "contentType", "Leh0;", "sink", "", "writeTo", "", "contentLength", "Lbt3;", "a", "Lbt3;", "fileContent", "Ldt3;", "b", "Ldt3;", "fileContentWriter", "Lurb;", c.a, "Lurb;", "progressPublisher", "<init>", "(Lbt3;Ldt3;Lurb;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ct3  reason: default package */
/* loaded from: classes4.dex */
public final class ct3 extends ji9 {
    private final bt3 a;
    private final dt3 b;
    private final urb c;

    /* compiled from: FileContentRequestBody.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "uploaded", "<anonymous parameter 1>", "", "a", "(JJ)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ct3$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function2<Long, Long, Unit> {
        a() {
            super(2);
        }

        public final void a(long j, long j2) {
            ct3.this.c.b(j, ct3.this.a.a());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
            a(l.longValue(), l2.longValue());
            return Unit.a;
        }
    }

    public ct3(bt3 bt3Var, dt3 dt3Var, urb urbVar) {
        z65.h(bt3Var, "fileContent");
        z65.h(dt3Var, "fileContentWriter");
        z65.h(urbVar, "progressPublisher");
        this.a = bt3Var;
        this.b = dt3Var;
        this.c = urbVar;
    }

    @Override // defpackage.ji9
    public long contentLength() {
        return this.a.a();
    }

    @Override // defpackage.ji9
    public qc6 contentType() {
        return qc6.e.b(this.a.b());
    }

    @Override // defpackage.ji9
    public void writeTo(eh0 eh0Var) {
        z65.h(eh0Var, "sink");
        this.b.a(this.a, eh0Var.S1(), new a());
        this.c.a(this.a.a());
    }
}
