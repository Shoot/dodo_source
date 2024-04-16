package defpackage;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import defpackage.uxa;
import java.io.File;
import java.net.Proxy;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: DefaultConfigurationProvider.java */
/* renamed from: lp2  reason: default package */
/* loaded from: classes3.dex */
public class lp2 implements ir4 {
    private String E;
    protected File r;
    protected File s;
    protected long a = 20000;
    protected boolean b = false;
    protected boolean c = false;
    protected boolean d = false;
    protected boolean e = false;
    protected boolean f = true;
    protected String g = "osmdroid";
    protected String h = "User-Agent";
    private final Map<String, String> i = new HashMap();
    protected short j = 9;
    protected short k = 2;
    protected short l = 8;
    protected short m = 40;
    protected short n = 40;
    protected long o = 629145600;
    protected long p = 524288000;
    protected SimpleDateFormat q = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
    protected long t = 0;
    protected Long u = null;
    protected Proxy v = null;
    protected int w = 1000;
    protected int x = 500;
    protected boolean y = true;
    protected short z = 0;
    protected long A = 300000;
    protected int B = 20;
    protected long C = 500;
    protected boolean D = true;

    @Override // defpackage.ir4
    public boolean A() {
        return this.c;
    }

    @Override // defpackage.ir4
    public short B() {
        return this.z;
    }

    @Override // defpackage.ir4
    public void C(File file) {
        this.s = file;
    }

    @Override // defpackage.ir4
    public int D() {
        return this.x;
    }

    @Override // defpackage.ir4
    public long E() {
        return this.t;
    }

    @Override // defpackage.ir4
    public short F() {
        return this.l;
    }

    @Override // defpackage.ir4
    public Long G() {
        return this.u;
    }

    @Override // defpackage.ir4
    public boolean H() {
        return this.e;
    }

    public File I(Context context) {
        try {
            if (this.r == null) {
                uxa.a b = uxa.b(context);
                if (b != null) {
                    File file = new File(b.a, "osmdroid");
                    this.r = file;
                    file.mkdirs();
                } else if (!new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), "osmdroid").mkdirs()) {
                    Log.e("OsmDroid", "Directory not created");
                }
            }
        } catch (Exception e) {
            Log.d("OsmDroid", "Unable to create base path at " + this.r, e);
        }
        return this.r;
    }

    @Override // defpackage.ir4
    public boolean a() {
        return this.y;
    }

    @Override // defpackage.ir4
    public short b() {
        return this.m;
    }

    @Override // defpackage.ir4
    public short c() {
        return this.n;
    }

    @Override // defpackage.ir4
    public File d() {
        return s(null);
    }

    @Override // defpackage.ir4
    public long e() {
        return this.C;
    }

    @Override // defpackage.ir4
    public long f() {
        return this.o;
    }

    @Override // defpackage.ir4
    public int g() {
        return this.B;
    }

    @Override // defpackage.ir4
    public boolean h() {
        return this.d;
    }

    @Override // defpackage.ir4
    public Map<String, String> i() {
        return this.i;
    }

    @Override // defpackage.ir4
    public void j(File file) {
        this.r = file;
    }

    @Override // defpackage.ir4
    public SimpleDateFormat k() {
        return this.q;
    }

    @Override // defpackage.ir4
    public String l() {
        return this.h;
    }

    @Override // defpackage.ir4
    public String m() {
        return this.E;
    }

    @Override // defpackage.ir4
    public File n() {
        return I(null);
    }

    @Override // defpackage.ir4
    public String o() {
        return this.g;
    }

    @Override // defpackage.ir4
    public boolean p() {
        return this.f;
    }

    @Override // defpackage.ir4
    public short q() {
        return this.j;
    }

    @Override // defpackage.ir4
    public Proxy r() {
        return this.v;
    }

    @Override // defpackage.ir4
    public File s(Context context) {
        if (this.s == null) {
            this.s = new File(I(context), "tiles");
        }
        try {
            this.s.mkdirs();
        } catch (Exception e) {
            Log.d("OsmDroid", "Unable to create tile cache path at " + this.s, e);
        }
        return this.s;
    }

    @Override // defpackage.ir4
    public long t() {
        return this.p;
    }

    @Override // defpackage.ir4
    public short u() {
        return this.k;
    }

    @Override // defpackage.ir4
    public boolean v() {
        return this.b;
    }

    @Override // defpackage.ir4
    public int w() {
        return this.w;
    }

    @Override // defpackage.ir4
    public long x() {
        return this.A;
    }

    @Override // defpackage.ir4
    public void y(String str) {
        this.g = str;
    }

    @Override // defpackage.ir4
    public boolean z() {
        return this.D;
    }
}
