package com.google.i18n.phonenumbers;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;
/* compiled from: Phonemetadata.java */
/* loaded from: classes.dex */
public class c implements Externalizable {
    private boolean A;
    private boolean I;
    private boolean S4;
    private boolean U4;
    private boolean W4;
    private boolean Y;
    private boolean Y4;
    private boolean a;
    private boolean a5;
    private boolean c;
    private boolean c5;
    private boolean e;
    private boolean e5;
    private boolean g;
    private boolean g5;
    private boolean i;
    private boolean i5;
    private boolean k;
    private boolean k5;
    private boolean m;
    private boolean o;
    private boolean o5;
    private boolean q;
    private boolean q5;
    private boolean s;
    private boolean s5;
    private boolean u;
    private boolean w;
    private boolean y;
    private f58 b = null;
    private f58 d = null;
    private f58 f = null;
    private f58 h = null;
    private f58 j = null;
    private f58 l = null;
    private f58 n = null;
    private f58 p = null;
    private f58 r = null;
    private f58 t = null;
    private f58 v = null;
    private f58 x = null;
    private f58 z = null;
    private f58 B = null;
    private f58 X = null;
    private f58 Z = null;
    private f58 T4 = null;
    private String V4 = "";
    private int X4 = 0;
    private String Z4 = "";
    private String b5 = "";
    private String d5 = "";
    private String f5 = "";
    private String h5 = "";
    private String j5 = "";
    private boolean l5 = false;
    private List<d58> m5 = new ArrayList();
    private List<d58> n5 = new ArrayList();
    private boolean p5 = false;
    private String r5 = "";
    private boolean t5 = false;

    public static a N() {
        return new a();
    }

    public f58 E() {
        return this.x;
    }

    public c E0(f58 f58Var) {
        f58Var.getClass();
        this.i = true;
        this.j = f58Var;
        return this;
    }

    public c F0(boolean z) {
        this.k5 = true;
        this.l5 = z;
        return this;
    }

    public f58 G() {
        return this.p;
    }

    public boolean H() {
        return this.q5;
    }

    public c I0(f58 f58Var) {
        f58Var.getClass();
        this.k = true;
        this.l = f58Var;
        return this;
    }

    public c J0(f58 f58Var) {
        f58Var.getClass();
        this.y = true;
        this.z = f58Var;
        return this;
    }

    public boolean K() {
        return this.g5;
    }

    public c K0(f58 f58Var) {
        f58Var.getClass();
        this.Y = true;
        this.Z = f58Var;
        return this;
    }

    public boolean L() {
        return this.e5;
    }

    public c L0(f58 f58Var) {
        f58Var.getClass();
        this.A = true;
        this.B = f58Var;
        return this;
    }

    @Deprecated
    public int M() {
        return e();
    }

    public c M0(f58 f58Var) {
        f58Var.getClass();
        this.g = true;
        this.h = f58Var;
        return this;
    }

    public c N0(f58 f58Var) {
        f58Var.getClass();
        this.s = true;
        this.t = f58Var;
        return this;
    }

    public c O0(f58 f58Var) {
        f58Var.getClass();
        this.w = true;
        this.x = f58Var;
        return this;
    }

    @Deprecated
    public int P() {
        return m();
    }

    public c P0(f58 f58Var) {
        f58Var.getClass();
        this.o = true;
        this.p = f58Var;
        return this;
    }

    public c Q(f58 f58Var) {
        f58Var.getClass();
        this.I = true;
        this.X = f58Var;
        return this;
    }

    public c S(int i) {
        this.W4 = true;
        this.X4 = i;
        return this;
    }

    public c T(f58 f58Var) {
        f58Var.getClass();
        this.u = true;
        this.v = f58Var;
        return this;
    }

    public c W(f58 f58Var) {
        f58Var.getClass();
        this.c = true;
        this.d = f58Var;
        return this;
    }

    public c Z(f58 f58Var) {
        f58Var.getClass();
        this.a = true;
        this.b = f58Var;
        return this;
    }

    public int a() {
        return this.X4;
    }

    public f58 b() {
        return this.d;
    }

    public c b0(String str) {
        this.U4 = true;
        this.V4 = str;
        return this;
    }

    public f58 c() {
        return this.b;
    }

    public String d() {
        return this.Z4;
    }

    public int e() {
        return this.n5.size();
    }

    public c e0(String str) {
        this.Y4 = true;
        this.Z4 = str;
        return this;
    }

    public List<d58> f() {
        return this.n5;
    }

    public c f0(String str) {
        this.q5 = true;
        this.r5 = str;
        return this;
    }

    public String getId() {
        return this.V4;
    }

    public c h0(boolean z) {
        this.o5 = true;
        this.p5 = z;
        return this;
    }

    public String i() {
        return this.r5;
    }

    public f58 j() {
        return this.f;
    }

    public c j0(f58 f58Var) {
        f58Var.getClass();
        this.e = true;
        this.f = f58Var;
        return this;
    }

    public String k() {
        return this.h5;
    }

    public String l() {
        return this.j5;
    }

    public c l0(boolean z) {
        this.s5 = true;
        this.t5 = z;
        return this;
    }

    public int m() {
        return this.m5.size();
    }

    public c m0(String str) {
        this.c5 = true;
        this.d5 = str;
        return this;
    }

    public List<d58> n() {
        return this.m5;
    }

    public c n0(String str) {
        this.g5 = true;
        this.h5 = str;
        return this;
    }

    public f58 o() {
        return this.r;
    }

    public c o0(String str) {
        this.i5 = true;
        this.j5 = str;
        return this;
    }

    public c p0(f58 f58Var) {
        f58Var.getClass();
        this.S4 = true;
        this.T4 = f58Var;
        return this;
    }

    public f58 q() {
        return this.n;
    }

    public c q0(f58 f58Var) {
        f58Var.getClass();
        this.q = true;
        this.r = f58Var;
        return this;
    }

    public String r() {
        return this.f5;
    }

    public c r0(f58 f58Var) {
        f58Var.getClass();
        this.m = true;
        this.n = f58Var;
        return this;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            f58 f58Var = new f58();
            f58Var.readExternal(objectInput);
            Z(f58Var);
        }
        if (objectInput.readBoolean()) {
            f58 f58Var2 = new f58();
            f58Var2.readExternal(objectInput);
            W(f58Var2);
        }
        if (objectInput.readBoolean()) {
            f58 f58Var3 = new f58();
            f58Var3.readExternal(objectInput);
            j0(f58Var3);
        }
        if (objectInput.readBoolean()) {
            f58 f58Var4 = new f58();
            f58Var4.readExternal(objectInput);
            M0(f58Var4);
        }
        if (objectInput.readBoolean()) {
            f58 f58Var5 = new f58();
            f58Var5.readExternal(objectInput);
            E0(f58Var5);
        }
        if (objectInput.readBoolean()) {
            f58 f58Var6 = new f58();
            f58Var6.readExternal(objectInput);
            I0(f58Var6);
        }
        if (objectInput.readBoolean()) {
            f58 f58Var7 = new f58();
            f58Var7.readExternal(objectInput);
            r0(f58Var7);
        }
        if (objectInput.readBoolean()) {
            f58 f58Var8 = new f58();
            f58Var8.readExternal(objectInput);
            P0(f58Var8);
        }
        if (objectInput.readBoolean()) {
            f58 f58Var9 = new f58();
            f58Var9.readExternal(objectInput);
            q0(f58Var9);
        }
        if (objectInput.readBoolean()) {
            f58 f58Var10 = new f58();
            f58Var10.readExternal(objectInput);
            N0(f58Var10);
        }
        if (objectInput.readBoolean()) {
            f58 f58Var11 = new f58();
            f58Var11.readExternal(objectInput);
            T(f58Var11);
        }
        if (objectInput.readBoolean()) {
            f58 f58Var12 = new f58();
            f58Var12.readExternal(objectInput);
            O0(f58Var12);
        }
        if (objectInput.readBoolean()) {
            f58 f58Var13 = new f58();
            f58Var13.readExternal(objectInput);
            J0(f58Var13);
        }
        if (objectInput.readBoolean()) {
            f58 f58Var14 = new f58();
            f58Var14.readExternal(objectInput);
            L0(f58Var14);
        }
        if (objectInput.readBoolean()) {
            f58 f58Var15 = new f58();
            f58Var15.readExternal(objectInput);
            Q(f58Var15);
        }
        if (objectInput.readBoolean()) {
            f58 f58Var16 = new f58();
            f58Var16.readExternal(objectInput);
            K0(f58Var16);
        }
        if (objectInput.readBoolean()) {
            f58 f58Var17 = new f58();
            f58Var17.readExternal(objectInput);
            p0(f58Var17);
        }
        b0(objectInput.readUTF());
        S(objectInput.readInt());
        e0(objectInput.readUTF());
        if (objectInput.readBoolean()) {
            z0(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            m0(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            x0(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            n0(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            o0(objectInput.readUTF());
        }
        F0(objectInput.readBoolean());
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            d58 d58Var = new d58();
            d58Var.readExternal(objectInput);
            this.m5.add(d58Var);
        }
        int readInt2 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            d58 d58Var2 = new d58();
            d58Var2.readExternal(objectInput);
            this.n5.add(d58Var2);
        }
        h0(objectInput.readBoolean());
        if (objectInput.readBoolean()) {
            f0(objectInput.readUTF());
        }
        l0(objectInput.readBoolean());
    }

    public f58 s() {
        return this.j;
    }

    public boolean u() {
        return this.l5;
    }

    public f58 w() {
        return this.l;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.a);
        if (this.a) {
            this.b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.c);
        if (this.c) {
            this.d.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.e);
        if (this.e) {
            this.f.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.g);
        if (this.g) {
            this.h.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.i);
        if (this.i) {
            this.j.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.k);
        if (this.k) {
            this.l.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.m);
        if (this.m) {
            this.n.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.o);
        if (this.o) {
            this.p.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.q);
        if (this.q) {
            this.r.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.s);
        if (this.s) {
            this.t.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.u);
        if (this.u) {
            this.v.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.w);
        if (this.w) {
            this.x.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.y);
        if (this.y) {
            this.z.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A);
        if (this.A) {
            this.B.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.I);
        if (this.I) {
            this.X.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.Y);
        if (this.Y) {
            this.Z.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.S4);
        if (this.S4) {
            this.T4.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.V4);
        objectOutput.writeInt(this.X4);
        objectOutput.writeUTF(this.Z4);
        objectOutput.writeBoolean(this.a5);
        if (this.a5) {
            objectOutput.writeUTF(this.b5);
        }
        objectOutput.writeBoolean(this.c5);
        if (this.c5) {
            objectOutput.writeUTF(this.d5);
        }
        objectOutput.writeBoolean(this.e5);
        if (this.e5) {
            objectOutput.writeUTF(this.f5);
        }
        objectOutput.writeBoolean(this.g5);
        if (this.g5) {
            objectOutput.writeUTF(this.h5);
        }
        objectOutput.writeBoolean(this.i5);
        if (this.i5) {
            objectOutput.writeUTF(this.j5);
        }
        objectOutput.writeBoolean(this.l5);
        int P = P();
        objectOutput.writeInt(P);
        for (int i = 0; i < P; i++) {
            this.m5.get(i).writeExternal(objectOutput);
        }
        int M = M();
        objectOutput.writeInt(M);
        for (int i2 = 0; i2 < M; i2++) {
            this.n5.get(i2).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.p5);
        objectOutput.writeBoolean(this.q5);
        if (this.q5) {
            objectOutput.writeUTF(this.r5);
        }
        objectOutput.writeBoolean(this.t5);
    }

    public f58 x() {
        return this.h;
    }

    public c x0(String str) {
        this.e5 = true;
        this.f5 = str;
        return this;
    }

    public f58 y() {
        return this.t;
    }

    public c z0(String str) {
        this.a5 = true;
        this.b5 = str;
        return this;
    }

    /* compiled from: Phonemetadata.java */
    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // com.google.i18n.phonenumbers.c
        /* renamed from: R0 */
        public a b0(String str) {
            super.b0(str);
            return this;
        }

        @Override // com.google.i18n.phonenumbers.c
        /* renamed from: S0 */
        public a e0(String str) {
            super.e0(str);
            return this;
        }

        public c Q0() {
            return this;
        }
    }
}
