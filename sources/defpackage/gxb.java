package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: VectorCompose.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\bH\u0014J \u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\u0014"}, d2 = {"Lgxb;", "Lw0;", "Luvb;", "Lni4;", Image.TYPE_MEDIUM, "", "index", "instance", "", "o", "n", "count", "a", "k", RemoteMessageConst.FROM, RemoteMessageConst.TO, c.a, "root", "<init>", "(Luvb;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: gxb  reason: default package */
/* loaded from: classes.dex */
public final class gxb extends w0<uvb> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxb(uvb uvbVar) {
        super(uvbVar);
        z65.h(uvbVar, "root");
    }

    private final ni4 m(uvb uvbVar) {
        if (uvbVar instanceof ni4) {
            return (ni4) uvbVar;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }

    @Override // defpackage.wp
    public void a(int i, int i2) {
        m(b()).j(i, i2);
    }

    @Override // defpackage.wp
    public void c(int i, int i2, int i3) {
        m(b()).i(i, i2, i3);
    }

    @Override // defpackage.w0
    protected void k() {
        ni4 m = m(j());
        m.j(0, m.f());
    }

    @Override // defpackage.wp
    /* renamed from: n */
    public void f(int i, uvb uvbVar) {
        z65.h(uvbVar, "instance");
    }

    @Override // defpackage.wp
    /* renamed from: o */
    public void d(int i, uvb uvbVar) {
        z65.h(uvbVar, "instance");
        m(b()).h(i, uvbVar);
    }
}
