package defpackage;

import androidx.emoji2.text.e;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: EmojiCompatStatus.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\f"}, d2 = {"Lgq2;", "Lnf3;", "Lcua;", "", c.a, "a", "Lcua;", "loadState", "()Lcua;", "fontLoaded", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: gq2  reason: default package */
/* loaded from: classes.dex */
final class gq2 implements nf3 {
    private cua<Boolean> a;

    /* compiled from: EmojiCompatStatus.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0007"}, d2 = {"gq2$a", "Landroidx/emoji2/text/e$e;", "", "b", "", "throwable", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: gq2$a */
    /* loaded from: classes.dex */
    public static final class a extends e.AbstractC0033e {
        final /* synthetic */ er6<Boolean> a;
        final /* synthetic */ gq2 b;

        a(er6<Boolean> er6Var, gq2 gq2Var) {
            this.a = er6Var;
            this.b = gq2Var;
        }

        @Override // androidx.emoji2.text.e.AbstractC0033e
        public void a(Throwable th) {
            sw4 sw4Var;
            gq2 gq2Var = this.b;
            sw4Var = of3.a;
            gq2Var.a = sw4Var;
        }

        @Override // androidx.emoji2.text.e.AbstractC0033e
        public void b() {
            this.a.setValue(Boolean.TRUE);
            this.b.a = new sw4(true);
        }
    }

    public gq2() {
        cua<Boolean> cuaVar;
        if (e.h()) {
            cuaVar = c();
        } else {
            cuaVar = null;
        }
        this.a = cuaVar;
    }

    private final cua<Boolean> c() {
        er6 c;
        e b = e.b();
        z65.g(b, "get()");
        if (b.d() != 1) {
            c = tpa.c(Boolean.FALSE, null, 2, null);
            b.s(new a(c, this));
            return c;
        }
        return new sw4(true);
    }

    @Override // defpackage.nf3
    public cua<Boolean> a() {
        sw4 sw4Var;
        cua<Boolean> cuaVar = this.a;
        if (cuaVar != null) {
            z65.e(cuaVar);
            return cuaVar;
        } else if (!e.h()) {
            sw4Var = of3.a;
            return sw4Var;
        } else {
            cua<Boolean> c = c();
            this.a = c;
            z65.e(c);
            return c;
        }
    }
}
