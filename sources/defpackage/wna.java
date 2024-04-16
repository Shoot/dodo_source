package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\"\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\bJ\u0010KJ\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\nJ\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0015JW\u0010!\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u0006\u0010\u001d\u001a\u00020\b2\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\n0\u001ej\b\u0012\u0004\u0012\u00020\n`\u001fH\u0000¢\u0006\u0004\b!\u0010\"JO\u0010#\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u0006\u0010\u001d\u001a\u00020\b2\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\n0\u001ej\b\u0012\u0004\u0012\u00020\n`\u001fH\u0000¢\u0006\u0004\b#\u0010$J\u0006\u0010%\u001a\u00020\u000eJ!\u0010(\u001a\u0004\u0018\u00010\u001b2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0000¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030*H\u0096\u0002R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R$\u0010\u0019\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R4\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R$\u0010\u001d\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b9\u00104R\u0016\u0010;\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00102R$\u0010\u0016\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u000e8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\"\u0010C\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u00102\u001a\u0004\b@\u00104\"\u0004\bA\u0010BR2\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\n0\u001ej\b\u0012\u0004\u0012\u00020\n`\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010?¨\u0006L"}, d2 = {"Lwna;", "Lfo1;", "", "Lgo1;", "Lvna;", "D", "Lzna;", "E", "", "index", "Lrd;", DateTokenConverter.CONVERTER_KEY, "anchor", "g", "", "F", "groupIndex", "C", "reader", "", Image.TYPE_HIGH, "(Lvna;)V", "writer", "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "k", "(Lzna;[II[Ljava/lang/Object;ILjava/util/ArrayList;)V", "G", "([II[Ljava/lang/Object;ILjava/util/ArrayList;)V", "p", "group", "slotIndex", "H", "(II)Ljava/lang/Object;", "", "iterator", "<set-?>", "a", "[I", "u", "()[I", "b", "I", "v", "()I", c.a, "[Ljava/lang/Object;", "x", "()[Ljava/lang/Object;", "z", e.a, "readers", "f", "Z", "B", "()Z", "A", "setVersion$runtime_release", "(I)V", "version", "Ljava/util/ArrayList;", "t", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "isEmpty", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: wna  reason: default package */
/* loaded from: classes.dex */
public final class wna implements fo1, Iterable<go1>, be5 {
    private int b;
    private int d;
    private int e;
    private boolean f;
    private int g;
    private int[] a = new int[0];
    private Object[] c = new Object[0];
    private ArrayList<rd> h = new ArrayList<>();

    public final int A() {
        return this.g;
    }

    public final boolean B() {
        return this.f;
    }

    public final boolean C(int i, rd rdVar) {
        boolean z;
        z65.h(rdVar, "anchor");
        if (!this.f) {
            if (i >= 0 && i < this.b) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (F(rdVar)) {
                    int g = yna.g(this.a, i) + i;
                    int a = rdVar.a();
                    if (i <= a && a < g) {
                        return true;
                    }
                }
                return false;
            }
            tn1.w("Invalid group index".toString());
            throw new KotlinNothingValueException();
        }
        tn1.w("Writer is active".toString());
        throw new KotlinNothingValueException();
    }

    public final vna D() {
        if (!this.f) {
            this.e++;
            return new vna(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }

    public final zna E() {
        boolean z;
        if (!this.f) {
            if (this.e <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f = true;
                this.g++;
                return new zna(this);
            }
            tn1.w("Cannot start a writer when a reader is pending".toString());
            throw new KotlinNothingValueException();
        }
        tn1.w("Cannot start a writer when another writer is pending".toString());
        throw new KotlinNothingValueException();
    }

    public final boolean F(rd rdVar) {
        int s;
        z65.h(rdVar, "anchor");
        if (rdVar.b() && (s = yna.s(this.h, rdVar.a(), this.b)) >= 0 && z65.c(this.h.get(s), rdVar)) {
            return true;
        }
        return false;
    }

    public final void G(int[] iArr, int i, Object[] objArr, int i2, ArrayList<rd> arrayList) {
        z65.h(iArr, "groups");
        z65.h(objArr, "slots");
        z65.h(arrayList, "anchors");
        this.a = iArr;
        this.b = i;
        this.c = objArr;
        this.d = i2;
        this.h = arrayList;
    }

    public final Object H(int i, int i2) {
        int length;
        int t = yna.t(this.a, i);
        int i3 = i + 1;
        if (i3 < this.b) {
            length = yna.e(this.a, i3);
        } else {
            length = this.c.length;
        }
        int i4 = length - t;
        if (i2 >= 0 && i2 < i4) {
            return this.c[t + i2];
        }
        return qn1.a.a();
    }

    public final rd d(int i) {
        int i2;
        if (!this.f) {
            if (i >= 0 && i < (i2 = this.b)) {
                ArrayList<rd> arrayList = this.h;
                int s = yna.s(arrayList, i, i2);
                if (s < 0) {
                    rd rdVar = new rd(i);
                    arrayList.add(-(s + 1), rdVar);
                    return rdVar;
                }
                rd rdVar2 = arrayList.get(s);
                z65.g(rdVar2, "get(location)");
                return rdVar2;
            }
            throw new IllegalArgumentException("Parameter index is out of range".toString());
        }
        tn1.w("use active SlotWriter to create an anchor location instead ".toString());
        throw new KotlinNothingValueException();
    }

    public final int g(rd rdVar) {
        z65.h(rdVar, "anchor");
        if (!this.f) {
            if (rdVar.b()) {
                return rdVar.a();
            }
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
        tn1.w("Use active SlotWriter to determine anchor location instead".toString());
        throw new KotlinNothingValueException();
    }

    public final void h(vna vnaVar) {
        boolean z;
        z65.h(vnaVar, "reader");
        if (vnaVar.u() == this && this.e > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.e--;
        } else {
            tn1.w("Unexpected reader close()".toString());
            throw new KotlinNothingValueException();
        }
    }

    public boolean isEmpty() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<go1> iterator() {
        return new pi4(this, 0, this.b);
    }

    public final void k(zna znaVar, int[] iArr, int i, Object[] objArr, int i2, ArrayList<rd> arrayList) {
        z65.h(znaVar, "writer");
        z65.h(iArr, "groups");
        z65.h(objArr, "slots");
        z65.h(arrayList, "anchors");
        if (znaVar.Y() == this && this.f) {
            this.f = false;
            G(iArr, i, objArr, i2, arrayList);
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }

    public final boolean p() {
        if (this.b <= 0 || !yna.c(this.a, 0)) {
            return false;
        }
        return true;
    }

    public final ArrayList<rd> t() {
        return this.h;
    }

    public final int[] u() {
        return this.a;
    }

    public final int v() {
        return this.b;
    }

    public final Object[] x() {
        return this.c;
    }

    public final int z() {
        return this.d;
    }
}
