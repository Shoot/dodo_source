package defpackage;

import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lz61;", "Lm95;", "Ly61;", "", "cause", "", "R", "", Image.TYPE_HIGH, "La71;", e.a, "La71;", "childJob", "Ll95;", "getParent", "()Ll95;", "parent", "<init>", "(La71;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: z61  reason: default package */
/* loaded from: classes3.dex */
public final class z61 extends m95 implements y61 {
    public final a71 e;

    public z61(a71 a71Var) {
        this.e = a71Var;
    }

    @Override // defpackage.wl1
    public void R(Throwable th) {
        this.e.j0(S());
    }

    @Override // defpackage.y61
    public l95 getParent() {
        return S();
    }

    @Override // defpackage.y61
    public boolean h(Throwable th) {
        return S().Y(th);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        R(th);
        return Unit.a;
    }
}
