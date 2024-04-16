package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sm6;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: BringIntoView.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR(\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00058D@BX\u0084\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001a"}, d2 = {"Lwf0;", "Lsm6$c;", "Lan6;", "Lkm5;", "Lmo1;", "Lom5;", MessageAttributes.COORDINATES, "", Image.TYPE_MEDIUM, "Lyf0;", "n", "Lyf0;", "defaultParent", "<set-?>", "o", "Lom5;", "f1", "()Lom5;", "layoutCoordinates", "g1", "()Lyf0;", "localParent", "h1", "parent", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: wf0  reason: default package */
/* loaded from: classes.dex */
public abstract class wf0 extends sm6.c implements an6, km5, mo1 {
    private final yf0 n = eg0.b(this);
    private om5 o;

    private final yf0 g1() {
        return (yf0) E(xf0.a());
    }

    @Override // defpackage.an6
    public /* synthetic */ ym6 D() {
        return zm6.b(this);
    }

    @Override // defpackage.dn6
    public /* synthetic */ Object E(um6 um6Var) {
        return zm6.a(this, um6Var);
    }

    @Override // defpackage.km5
    public /* synthetic */ void b(long j) {
        jm5.a(this, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final om5 f1() {
        om5 om5Var = this.o;
        if (om5Var == null || !om5Var.p()) {
            return null;
        }
        return om5Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final yf0 h1() {
        yf0 g1 = g1();
        if (g1 == null) {
            return this.n;
        }
        return g1;
    }

    @Override // defpackage.km5
    public void m(om5 om5Var) {
        z65.h(om5Var, MessageAttributes.COORDINATES);
        this.o = om5Var;
    }
}
