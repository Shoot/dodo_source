package defpackage;

import kotlin.Metadata;
import ru.dodopizza.app.R;
/* compiled from: RatingCommentRouterImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\b¨\u0006\f"}, d2 = {"La69;", "Lz59;", "", "a", "Ly59;", "result", "b", "Lf63;", "Lf63;", "router", "<init>", "(Lf63;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: a69  reason: default package */
/* loaded from: classes4.dex */
public final class a69 implements z59 {
    private final f63 a;

    public a69(f63 f63Var) {
        z65.h(f63Var, "router");
        this.a = f63Var;
    }

    @Override // defpackage.z59
    public void a() {
        this.a.d();
    }

    @Override // defpackage.z59
    public void b(y59 y59Var) {
        z65.h(y59Var, "result");
        this.a.l(R.id.editing_comment_result, y59Var);
    }
}
