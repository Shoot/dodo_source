package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: Loader.java */
/* renamed from: wr5  reason: default package */
/* loaded from: classes.dex */
public class wr5<D> {
    int a;
    a<D> b;
    Context c;
    boolean d = false;
    boolean e = false;
    boolean f = true;
    boolean g = false;
    boolean h = false;

    /* compiled from: Loader.java */
    /* renamed from: wr5$a */
    /* loaded from: classes.dex */
    public interface a<D> {
        void a(@NonNull wr5<D> wr5Var, D d);
    }

    public wr5(@NonNull Context context) {
        this.c = context.getApplicationContext();
    }

    public void a() {
        this.e = true;
        j();
    }

    public boolean b() {
        return k();
    }

    public void c() {
        this.h = false;
    }

    @NonNull
    public String d(D d) {
        StringBuilder sb = new StringBuilder(64);
        ko2.a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    public void f(D d) {
        a<D> aVar = this.b;
        if (aVar != null) {
            aVar.a(this, d);
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.a);
        printWriter.print(" mListener=");
        printWriter.println(this.b);
        if (this.d || this.g || this.h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.h);
        }
        if (this.e || this.f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.e);
            printWriter.print(" mReset=");
            printWriter.println(this.f);
        }
    }

    public void h() {
        m();
    }

    public boolean i() {
        return this.e;
    }

    protected boolean k() {
        throw null;
    }

    public void l() {
        if (this.d) {
            h();
        } else {
            this.g = true;
        }
    }

    protected void o() {
        throw null;
    }

    public void q(int i, @NonNull a<D> aVar) {
        if (this.b == null) {
            this.b = aVar;
            this.a = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void r() {
        n();
        this.f = true;
        this.d = false;
        this.e = false;
        this.g = false;
        this.h = false;
    }

    public void s() {
        if (this.h) {
            l();
        }
    }

    public final void t() {
        this.d = true;
        this.f = false;
        this.e = false;
        o();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        ko2.a(this, sb);
        sb.append(" id=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public void u() {
        this.d = false;
        p();
    }

    public void v(@NonNull a<D> aVar) {
        a<D> aVar2 = this.b;
        if (aVar2 != null) {
            if (aVar2 == aVar) {
                this.b = null;
                return;
            }
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        throw new IllegalStateException("No listener register");
    }

    public void e() {
    }

    protected void j() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void m() {
    }

    protected void n() {
    }

    protected void p() {
    }
}
