package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.is3;
import defpackage.us3;
import kotlin.Metadata;
/* compiled from: FieldPresenterBase.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u000f\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005B\u0007¢\u0006\u0004\b2\u00103J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\n\u001a\u00020\u0007J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0006\u0010\u000e\u001a\u00020\u0007J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016R$\u0010\u001c\u001a\u0004\u0018\u00018\u00008\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\tR\"\u0010\u0012\u001a\u00028\u00018\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010#R\"\u0010+\u001a\u00020%8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b\u001d\u0010(\"\u0004\b)\u0010*R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u0010\f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u00101¨\u00064"}, d2 = {"Lms3;", "Lus3;", "V", "Lis3;", "FI", "Lls3;", "view", "", "i", "(Lus3;)V", "k", "Lss3;", "fieldValue", "j", "p", "Li54;", "formContext", Image.TYPE_HIGH, "fieldInfo", e.a, "f", "n", "o", "a", "Lus3;", "l", "()Lus3;", "setFieldView", "fieldView", "b", "Lis3;", c.a, "()Lis3;", "q", "(Lis3;)V", "Lss3;", "_fieldValue", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "()Ljava/lang/String;", "r", "(Ljava/lang/String;)V", "rawFieldValue", "Li54;", Image.TYPE_MEDIUM, "()Li54;", "setFormContext", "(Li54;)V", "()Lss3;", "<init>", "()V", "formbuilder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ms3  reason: default package */
/* loaded from: classes.dex */
public abstract class ms3<V extends us3, FI extends is3> implements ls3 {
    private V a;
    public FI b;
    private ss3 c = ss3.c.a();
    private String d = "";
    private i54 e;

    @Override // defpackage.m54
    public String b() {
        return this.d;
    }

    @Override // defpackage.m54
    public FI c() {
        FI fi = this.b;
        if (fi != null) {
            return fi;
        }
        z65.z("fieldInfo");
        return null;
    }

    @Override // defpackage.m54
    public ss3 d() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ls3
    public void e(is3 is3Var) {
        z65.h(is3Var, "fieldInfo");
        q(is3Var);
    }

    @Override // defpackage.ls3
    public void f() {
        i54 i54Var = this.e;
        if (i54Var != null) {
            i54Var.a();
        }
    }

    @Override // defpackage.ls3
    public void h(i54 i54Var) {
        z65.h(i54Var, "formContext");
        this.e = i54Var;
    }

    public final void i(V v) {
        z65.h(v, "view");
        this.a = v;
        n();
    }

    public void j(ss3 ss3Var) {
        z65.h(ss3Var, "fieldValue");
        this.c = ss3Var;
        i54 i54Var = this.e;
        if (i54Var != null) {
            i54Var.d();
        }
    }

    public final void k() {
        this.a = null;
        o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final V l() {
        return this.a;
    }

    public final i54 m() {
        return this.e;
    }

    public final void p() {
        i54 i54Var = this.e;
        if (i54Var != null) {
            i54Var.b(c());
        }
    }

    public void q(FI fi) {
        z65.h(fi, "<set-?>");
        this.b = fi;
    }

    public void r(String str) {
        z65.h(str, "<set-?>");
        this.d = str;
    }

    public void n() {
    }

    public void o() {
    }
}
