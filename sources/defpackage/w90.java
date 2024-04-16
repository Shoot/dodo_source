package defpackage;

import androidx.annotation.NonNull;
/* compiled from: BatchingListUpdateCallback.java */
/* renamed from: w90  reason: default package */
/* loaded from: classes.dex */
public class w90 implements gr5 {
    final gr5 a;
    int b = 0;
    int c = -1;
    int d = -1;
    Object e = null;

    public w90(@NonNull gr5 gr5Var) {
        this.a = gr5Var;
    }

    public void a() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.a.onChanged(this.c, this.d, this.e);
                }
            } else {
                this.a.onRemoved(this.c, this.d);
            }
        } else {
            this.a.onInserted(this.c, this.d);
        }
        this.e = null;
        this.b = 0;
    }

    @Override // defpackage.gr5
    public void onChanged(int i, int i2, Object obj) {
        int i3;
        if (this.b == 3) {
            int i4 = this.c;
            int i5 = this.d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.e == obj) {
                this.c = Math.min(i, i4);
                this.d = Math.max(i5 + i4, i3) - this.c;
                return;
            }
        }
        a();
        this.c = i;
        this.d = i2;
        this.e = obj;
        this.b = 3;
    }

    @Override // defpackage.gr5
    public void onInserted(int i, int i2) {
        int i3;
        if (this.b == 1 && i >= (i3 = this.c)) {
            int i4 = this.d;
            if (i <= i3 + i4) {
                this.d = i4 + i2;
                this.c = Math.min(i, i3);
                return;
            }
        }
        a();
        this.c = i;
        this.d = i2;
        this.b = 1;
    }

    @Override // defpackage.gr5
    public void onMoved(int i, int i2) {
        a();
        this.a.onMoved(i, i2);
    }

    @Override // defpackage.gr5
    public void onRemoved(int i, int i2) {
        int i3;
        if (this.b == 2 && (i3 = this.c) >= i && i3 <= i + i2) {
            this.d += i2;
            this.c = i;
            return;
        }
        a();
        this.c = i;
        this.d = i2;
        this.b = 2;
    }
}
